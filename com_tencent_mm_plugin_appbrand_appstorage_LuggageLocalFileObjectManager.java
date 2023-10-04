package com.tencent.mm.plugin.appbrand.appstorage;

import android.net.Uri;
import android.system.ErrnoException;
import com.tencent.mm.plugin.appbrand.utils.h2;
import com.tencent.mm.sdk.platformtools.FilePathGenerator;
import com.tencent.mm.sdk.platformtools.FilesCopy;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.platformtools.Util;
import com.tencent.mm.sdk.system.MimeTypeUtil;
import com.tencent.mm.vfs.f0;
import com.tencent.mm.vfs.g2;
import com.tencent.mm.vfs.m1;
import com.tencent.mm.vfs.o1;
import com.tencent.mm.vfs.q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
/* loaded from: classes6.dex */
public final class LuggageLocalFileObjectManager {

    /* renamed from: e  reason: collision with root package name */
    public static final o1 f50170e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final r0 f50171f = new c();

    /* renamed from: a  reason: collision with root package name */
    public final String f50172a;

    /* renamed from: b  reason: collision with root package name */
    public final String f50173b;

    /* renamed from: c  reason: collision with root package name */
    public final String f50174c;

    /* renamed from: d  reason: collision with root package name */
    public final Collection<d> f50175d;

    /* loaded from: classes6.dex */
    public class a implements o1 {
        @Override // com.tencent.mm.vfs.o1
        public boolean accept(m1 m1Var) {
            return LuggageLocalFileObjectManager.g(m1Var, "store_", true);
        }
    }

    /* loaded from: classes6.dex */
    public class b implements o1 {
        public b() {
        }

        @Override // com.tencent.mm.vfs.o1
        public boolean accept(m1 m1Var) {
            return LuggageLocalFileObjectManager.this.h(m1Var, true);
        }
    }

    /* loaded from: classes6.dex */
    public class c extends r0 {
        public String toString() {
            return "AppBrandLocalMediaObject::Nil";
        }
    }

    /* loaded from: classes6.dex */
    public interface d {
        op3.j a(String str, String str2);

        r0 b(String str);

        r0 c(r0 r0Var);

        r0 d(String str);
    }

    /* loaded from: classes6.dex */
    public final class e implements d {
        public e(a aVar) {
        }

        @Override // com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.d
        public op3.j a(String str, String str2) {
            String str3;
            String str4;
            if (Util.isNullOrNil(str2)) {
                LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                o1 o1Var = LuggageLocalFileObjectManager.f50170e;
                luggageLocalFileObjectManager.getClass();
                str2 = "unknown";
            }
            try {
                String format = String.format(Locale.US, "%d|%s", Long.valueOf(LuggageLocalFileObjectManager.b(LuggageLocalFileObjectManager.this, str)), str2);
                try {
                    Log.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "hy: attach media obj: %s", format);
                    LuggageLocalFileObjectManager luggageLocalFileObjectManager2 = LuggageLocalFileObjectManager.this;
                    String str5 = luggageLocalFileObjectManager2.f50173b;
                    luggageLocalFileObjectManager2.getClass();
                    str3 = Util.encodeHexString(new h2().d(format.getBytes(), str5.getBytes()));
                } catch (Exception e15) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e15, "attachMediaObject, enc exp = ", new Object[0]);
                    str3 = null;
                }
                if (Util.isNullOrNil(str3)) {
                    return null;
                }
                String str6 = "tmp_" + str3;
                String str7 = LuggageLocalFileObjectManager.this.f() + str6;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LuggageLocalFileObjectManager.this.f50174c);
                sb4.append(str6);
                if (Util.isNullOrNil(str2)) {
                    str4 = "";
                } else {
                    str4 = '.' + str2;
                }
                sb4.append(str4);
                String sb5 = sb4.toString();
                Log.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", sb5, str7);
                return op3.j.d(sb5, str7, str2);
            } catch (Exception e16) {
                Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", Util.stackTraceToString(e16));
                return null;
            }
        }

        @Override // com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.d
        public r0 b(String str) {
            String str2;
            String[] split;
            String str3 = "";
            String replaceFirst = str.replaceFirst("store_", "").replaceFirst("tmp_", "");
            try {
                LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                str2 = LuggageLocalFileObjectManager.a(luggageLocalFileObjectManager, replaceFirst, luggageLocalFileObjectManager.f50173b);
            } catch (Exception e15) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e15, "retrieveMediaObjectByRealFileName, dec exp = ", new Object[0]);
                str2 = null;
            }
            if (Util.isNullOrNil(str2) || (split = str2.split("\\|")) == null || split.length != 2) {
                return null;
            }
            String str4 = split[1];
            StringBuilder sb4 = new StringBuilder();
            sb4.append(LuggageLocalFileObjectManager.this.f50174c);
            sb4.append(str);
            if (!Util.isNullOrNil(str4)) {
                str3 = "." + str4;
            }
            sb4.append(str3);
            String sb5 = sb4.toString();
            r0 r0Var = new r0();
            r0Var.f50300d = sb5;
            r0Var.f50301e = LuggageLocalFileObjectManager.this.f() + str;
            r0Var.f50302f = str.startsWith("store_");
            m1 m1Var = new m1(r0Var.f50301e);
            r0Var.f50304h = m1Var.q();
            r0Var.f50303g = m1Var.r();
            return r0Var;
        }

        @Override // com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.d
        public r0 c(r0 r0Var) {
            com.tencent.mm.vfs.b0 q15;
            if (r0Var == null) {
                return null;
            }
            String replaceFirst = r0Var.f50301e.replaceFirst("tmp_", "store_");
            try {
                if (a0.a(r0Var.f50301e, replaceFirst)) {
                    r0 r0Var2 = new r0();
                    r0Var2.f50301e = replaceFirst;
                    r0Var2.f50300d = r0Var.f50300d.replaceFirst("tmp_", "store_");
                    r0Var2.f50303g = r0Var.f50303g;
                    Uri n15 = g2.n(r0Var2.f50301e);
                    String path = n15.getPath();
                    if (path != null) {
                        String k15 = g2.k(path, false, false);
                        if (!n15.getPath().equals(k15)) {
                            n15 = n15.buildUpon().path(k15).build();
                        }
                    }
                    f0.h l15 = f0.i.f148071a.l(n15, null);
                    long j15 = 0;
                    if (l15.a() && (q15 = l15.f148068a.q(l15.f148069b)) != null) {
                        j15 = q15.f147956e;
                    }
                    r0Var2.f50304h = j15;
                    r0Var2.f50302f = true;
                    return r0Var2;
                }
            } catch (ErrnoException e15) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e15, "FileMove error", new Object[0]);
            }
            return null;
        }

        @Override // com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.d
        public r0 d(String str) {
            String str2 = null;
            if (str.startsWith("store_") || str.startsWith("tmp_")) {
                String c15 = s24.b.c(str);
                String replaceFirst = str.replaceFirst("store_", "").replaceFirst("tmp_", "");
                if (!Util.isNullOrNil(c15)) {
                    replaceFirst = replaceFirst.replaceFirst("\\." + c15, "");
                }
                if (Util.isNullOrNil(replaceFirst)) {
                    return LuggageLocalFileObjectManager.f50171f;
                }
                try {
                    LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                    str2 = LuggageLocalFileObjectManager.a(luggageLocalFileObjectManager, replaceFirst, luggageLocalFileObjectManager.f50173b);
                } catch (Exception e15) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e15, "retrieveMediaObject, decrypt exp ", new Object[0]);
                }
                if (Util.isNullOrNil(str2)) {
                    Log.d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
                    return LuggageLocalFileObjectManager.f50171f;
                }
                String[] split = str2.split("\\|");
                if (split == null || split.length != 2) {
                    return LuggageLocalFileObjectManager.f50171f;
                }
                String str3 = str.startsWith("store_") ? "store_" : "tmp_";
                StringBuilder sb4 = new StringBuilder();
                LuggageLocalFileObjectManager luggageLocalFileObjectManager2 = LuggageLocalFileObjectManager.this;
                o1 o1Var = LuggageLocalFileObjectManager.f50170e;
                sb4.append(luggageLocalFileObjectManager2.f());
                sb4.append(str3);
                sb4.append(replaceFirst);
                String sb5 = sb4.toString();
                long j15 = Util.getLong(split[0], 0L);
                String str4 = split[1];
                if (str4.equalsIgnoreCase(c15)) {
                    try {
                        long b15 = LuggageLocalFileObjectManager.b(LuggageLocalFileObjectManager.this, sb5);
                        if (j15 != b15) {
                            Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s)", Long.valueOf(b15), Long.valueOf(j15), str);
                            return LuggageLocalFileObjectManager.f50171f;
                        }
                        r0 r0Var = new r0();
                        r0Var.f50300d = LuggageLocalFileObjectManager.this.f50174c + str;
                        r0Var.f50301e = sb5;
                        MimeTypeUtil.getMimeTypeByFileExt(str4);
                        r0Var.f50302f = str3.equalsIgnoreCase("store_");
                        m1 m1Var = new m1(r0Var.f50301e);
                        r0Var.f50304h = m1Var.q();
                        r0Var.f50303g = m1Var.r();
                        return r0Var;
                    } catch (IOException e16) {
                        Log.e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", Util.stackTraceToString(e16));
                        return LuggageLocalFileObjectManager.f50171f;
                    }
                }
                return LuggageLocalFileObjectManager.f50171f;
            }
            return null;
        }

        public String toString() {
            return "V2MediaObjectInfoHandler";
        }
    }

    public LuggageLocalFileObjectManager(String str, String str2, String str3) {
        this.f50172a = new m1(str).i() + "/";
        this.f50173b = str2;
        this.f50174c = str3;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new e(null));
        this.f50175d = Collections.unmodifiableCollection(linkedList);
    }

    public static String a(LuggageLocalFileObjectManager luggageLocalFileObjectManager, String str, String str2) {
        luggageLocalFileObjectManager.getClass();
        byte[] b15 = new h2().b(Util.decodeHexString(str), str2.getBytes());
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return new String(b15);
    }

    public static long b(LuggageLocalFileObjectManager luggageLocalFileObjectManager, String str) {
        luggageLocalFileObjectManager.getClass();
        InputStream E = q1.E(str);
        CheckedInputStream checkedInputStream = new CheckedInputStream(E, new Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        Util.qualityClose(checkedInputStream);
        Util.qualityClose(E);
        return value;
    }

    public static boolean g(m1 m1Var, String str, boolean z15) {
        return (!z15 || m1Var.g()) && !m1Var.o() && !Util.isNullOrNil(m1Var.getName()) && m1Var.getName().startsWith(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (com.tencent.mm.plugin.appbrand.appstorage.a0.a(r10, r11) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r0 c(String str, String str2, boolean z15) {
        if (q1.k(str)) {
            String c15 = s24.b.c(str);
            if (!Util.isNullOrNil(c15)) {
                str2 = c15;
            }
            Iterator<d> it = this.f50175d.iterator();
            op3.j jVar = null;
            while (it.hasNext() && (jVar = it.next().a(str, str2)) == null) {
            }
            boolean z16 = true;
            if (jVar == null || jVar.g() < 2) {
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(jVar == null ? -1 : jVar.g());
                Log.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "attachCast, no handler return correct info, attach.size = %d", objArr);
                return null;
            }
            try {
                r0 r0Var = (r0) r0.class.newInstance();
                r0Var.f50300d = (String) jVar.a(0);
                MimeTypeUtil.getMimeTypeByFileExt(str2);
                String str3 = (String) jVar.a(1);
                r0Var.f50301e = str3;
                if (Util.isNullOrNil(str3)) {
                    Log.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "attachCast appId %s, Null Or Nil fileFullPath");
                    return null;
                }
                if (Util.isNullOrNil(str2)) {
                    str2 = "unknown";
                }
                Util.nullAs((String) jVar.a(3), str2);
                String str4 = r0Var.f50301e;
                if (z15) {
                    try {
                    } catch (ErrnoException e15) {
                        Log.printErrStackTrace("MicroMsg.AppBrand.LuggageLocalFileObjectManager", e15, "", new Object[0]);
                    }
                }
                if (z15 || !FilesCopy.copyFile(str, str4)) {
                    z16 = false;
                }
                if (z16) {
                    m1 m1Var = new m1(r0Var.f50301e);
                    r0Var.f50303g = m1Var.r();
                    r0Var.f50304h = m1Var.q();
                    return r0Var;
                }
                return null;
            } catch (Exception e16) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LuggageLocalFileObjectManager", e16, "", new Object[0]);
                return null;
            }
        }
        return null;
    }

    public r0 d(String str) {
        r0 r0Var = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Iterator<d> it = this.f50175d.iterator();
        while (it.hasNext() && (r0Var = it.next().b(str)) == null) {
        }
        return r0Var;
    }

    public r0 e(String str) {
        if (Util.isNullOrNil(str) || !str.startsWith(this.f50174c)) {
            Log.e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, invalid args, localId(%s)", str);
            return null;
        }
        String substring = str.substring(this.f50174c.length());
        Iterator<d> it = this.f50175d.iterator();
        r0 r0Var = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d next = it.next();
            r0 d15 = next.d(substring);
            if (d15 != null) {
                Log.i("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, handled by %s, result = %s", next.toString(), d15);
                r0Var = d15;
                break;
            }
            r0Var = d15;
        }
        if (f50171f == r0Var) {
            return null;
        }
        return r0Var;
    }

    public final String f() {
        FilePathGenerator.checkMkdir(this.f50172a);
        try {
            new m1(this.f50172a, FilePathGenerator.NO_MEDIA_FILENAME).e();
        } catch (Exception unused) {
        }
        return this.f50172a;
    }

    public String genMediaFilePath(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f() + str;
    }

    public boolean h(m1 m1Var, boolean z15) {
        Uri n15 = g2.n(f());
        String path = n15.getPath();
        if (path != null) {
            String k15 = g2.k(path, false, false);
            if (!n15.getPath().equals(k15)) {
                n15 = n15.buildUpon().path(k15).build();
            }
        }
        return n15.equals(new m1(m1Var.k()).f148133d) && g(m1Var, "store_", z15);
    }

    public List<r0> i() {
        m1[] j15 = j();
        if (j15 == null || j15.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (m1 m1Var : j15) {
            r0 d15 = d(m1Var.getName());
            if (d15 != null) {
                linkedList.add(d15);
            }
        }
        return linkedList;
    }

    public m1[] j() {
        m1 m1Var = new m1(f());
        if (m1Var.g() && m1Var.o()) {
            return m1Var.v(new b());
        }
        return null;
    }
}
