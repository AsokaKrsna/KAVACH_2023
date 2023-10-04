package com.tencent.mm.message;

import android.content.Context;
import android.util.Pair;
import com.tencent.mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.mm.sdk.crash.CrashReportFactory;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.platformtools.SemiXml;
import com.tencent.mm.sdk.platformtools.Util;
import com.tencent.mm.sdk.platformtools.XmlParser;
import com.tencent.mm.sdk.storage.IAutoDBItem;
import com.tencent.mm.storage.z1;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import wl.b;
import xh.f0;
/* loaded from: classes5.dex */
public class l extends f0 {
    public static IAutoDBItem.MAutoDBInfo A = f0.initAutoDBInfo(l.class);

    /* loaded from: classes5.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        BUSINESS_MY_LIFE_AROUND,
        /* JADX INFO: Fake field, exist only in values array */
        BUSINESS_OTHER,
        /* JADX INFO: Fake field, exist only in values array */
        BUSINESS_MAX;

        public static String a(int i15, String str, Context context) {
            String str2;
            if (b(i15) && !Util.isNullOrNil(str)) {
                int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
                Log.d("MicroMsg.AppMessage", "id: %d.", Integer.valueOf(identifier));
                if (identifier > 0) {
                    str2 = context.getResources().getString(identifier);
                    Log.d("MicroMsg.AppMessage", "txt: %s.", str2);
                    return str2;
                }
            }
            str2 = "";
            Log.d("MicroMsg.AppMessage", "txt: %s.", str2);
            return str2;
        }

        public static boolean b(int i15) {
            return i15 >= 0 && i15 < 2;
        }
    }

    /* loaded from: classes5.dex */
    public static class b extends g {
        public static final sg.g<Integer, b> J2 = new o90.d(100);
        public String A;
        public int A0;
        public List<String> A1;
        public int A2;
        public int B;
        public int B0;
        public List<String> B1;
        public String B2;
        public String C;
        public String C0;
        public String D;
        public String D0;
        public int D1;
        public int E;
        public String E0;
        public String E1;
        public String F;
        public String F0;
        public String F1;
        public String G;
        public int G0;
        public String G1;
        public Map<String, String> G2;
        public int H;
        public String H1;
        public String H2;
        public String I;
        public String I0;
        public String I1;
        public String I2;
        public String J;
        public String J0;
        public int J1;
        public String K;
        public int K0;
        public String K1;
        public int L;
        public int L0;
        public String L1;
        public String M;
        public int M1;
        public int N;
        public String N1;
        public int O;
        public int O0;
        public String O1;
        public int P;
        public String P0;
        public String P1;
        public int Q;
        public String Q0;
        public String Q1;
        public String R;
        public String R0;
        public int R1;
        public String S;
        public String S0;
        public String S1;
        public String T;
        public int T0;
        public String T1;
        public String U;
        public int U0;
        public String U1;
        public String V;
        public String V0;
        public Map<String, String> V1;
        public String W;
        public String W0;
        public String W1;
        public String X;
        public String X0;
        public int Y;
        public String Y0;
        public int Z;
        public String Z0;

        /* renamed from: a0  reason: collision with root package name */
        public int f43655a0;

        /* renamed from: a1  reason: collision with root package name */
        public String f43656a1;

        /* renamed from: b  reason: collision with root package name */
        public a f43658b;

        /* renamed from: b0  reason: collision with root package name */
        public String f43659b0;

        /* renamed from: b1  reason: collision with root package name */
        public String f43660b1;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, String> f43662c;

        /* renamed from: c0  reason: collision with root package name */
        public String f43663c0;

        /* renamed from: c1  reason: collision with root package name */
        public int f43664c1;

        /* renamed from: d  reason: collision with root package name */
        public String f43666d;

        /* renamed from: d0  reason: collision with root package name */
        public int f43667d0;

        /* renamed from: d1  reason: collision with root package name */
        public String f43668d1;

        /* renamed from: e  reason: collision with root package name */
        public int f43670e;

        /* renamed from: e0  reason: collision with root package name */
        public String f43671e0;

        /* renamed from: e1  reason: collision with root package name */
        public String f43672e1;

        /* renamed from: e2  reason: collision with root package name */
        public String f43673e2;

        /* renamed from: f  reason: collision with root package name */
        public String f43674f;

        /* renamed from: f0  reason: collision with root package name */
        public String f43675f0;

        /* renamed from: f1  reason: collision with root package name */
        public String f43676f1;

        /* renamed from: f2  reason: collision with root package name */
        public String f43677f2;

        /* renamed from: g  reason: collision with root package name */
        public String f43678g;

        /* renamed from: g0  reason: collision with root package name */
        public int f43679g0;

        /* renamed from: g1  reason: collision with root package name */
        public String f43680g1;

        /* renamed from: g2  reason: collision with root package name */
        public String f43681g2;

        /* renamed from: h  reason: collision with root package name */
        public String f43682h;

        /* renamed from: h0  reason: collision with root package name */
        public String f43683h0;

        /* renamed from: h1  reason: collision with root package name */
        public String f43684h1;

        /* renamed from: h2  reason: collision with root package name */
        public int f43685h2;

        /* renamed from: i  reason: collision with root package name */
        public int f43686i;

        /* renamed from: i0  reason: collision with root package name */
        public String f43687i0;

        /* renamed from: i1  reason: collision with root package name */
        public String f43688i1;

        /* renamed from: i2  reason: collision with root package name */
        public String f43689i2;

        /* renamed from: j  reason: collision with root package name */
        public String f43690j;

        /* renamed from: j0  reason: collision with root package name */
        public int f43691j0;

        /* renamed from: j1  reason: collision with root package name */
        public String f43692j1;

        /* renamed from: j2  reason: collision with root package name */
        public String f43693j2;

        /* renamed from: k  reason: collision with root package name */
        public String f43694k;

        /* renamed from: k0  reason: collision with root package name */
        public String f43695k0;

        /* renamed from: k1  reason: collision with root package name */
        public String f43696k1;

        /* renamed from: k2  reason: collision with root package name */
        public String f43697k2;

        /* renamed from: l  reason: collision with root package name */
        public int f43698l;

        /* renamed from: l0  reason: collision with root package name */
        public String f43699l0;

        /* renamed from: l1  reason: collision with root package name */
        public String f43700l1;

        /* renamed from: m  reason: collision with root package name */
        public String f43702m;

        /* renamed from: m0  reason: collision with root package name */
        public String f43703m0;

        /* renamed from: m1  reason: collision with root package name */
        public String f43704m1;

        /* renamed from: m2  reason: collision with root package name */
        public String f43705m2;

        /* renamed from: n  reason: collision with root package name */
        public String f43706n;

        /* renamed from: n0  reason: collision with root package name */
        public String f43707n0;

        /* renamed from: n1  reason: collision with root package name */
        public String f43708n1;

        /* renamed from: n2  reason: collision with root package name */
        public int f43709n2;

        /* renamed from: o  reason: collision with root package name */
        public String f43710o;

        /* renamed from: o0  reason: collision with root package name */
        public String f43711o0;

        /* renamed from: o1  reason: collision with root package name */
        public String f43712o1;

        /* renamed from: o2  reason: collision with root package name */
        public String f43713o2;

        /* renamed from: p  reason: collision with root package name */
        public String f43714p;

        /* renamed from: p0  reason: collision with root package name */
        public String f43715p0;

        /* renamed from: p1  reason: collision with root package name */
        public int f43716p1;

        /* renamed from: p2  reason: collision with root package name */
        public String f43717p2;

        /* renamed from: q  reason: collision with root package name */
        public String f43718q;

        /* renamed from: q0  reason: collision with root package name */
        public String f43719q0;

        /* renamed from: q1  reason: collision with root package name */
        public String f43720q1;

        /* renamed from: q2  reason: collision with root package name */
        public int f43721q2;

        /* renamed from: r  reason: collision with root package name */
        public int f43722r;

        /* renamed from: r0  reason: collision with root package name */
        public String f43723r0;

        /* renamed from: r1  reason: collision with root package name */
        public String f43724r1;

        /* renamed from: r2  reason: collision with root package name */
        public String f43725r2;

        /* renamed from: s  reason: collision with root package name */
        public String f43726s;

        /* renamed from: s0  reason: collision with root package name */
        public String f43727s0;

        /* renamed from: s1  reason: collision with root package name */
        public String f43728s1;

        /* renamed from: s2  reason: collision with root package name */
        public String f43729s2;

        /* renamed from: t  reason: collision with root package name */
        public int f43730t;

        /* renamed from: t0  reason: collision with root package name */
        public String f43731t0;

        /* renamed from: t1  reason: collision with root package name */
        public int f43732t1;

        /* renamed from: t2  reason: collision with root package name */
        public String f43733t2;

        /* renamed from: u  reason: collision with root package name */
        public int f43734u;

        /* renamed from: u0  reason: collision with root package name */
        public String f43735u0;

        /* renamed from: v  reason: collision with root package name */
        public String f43738v;

        /* renamed from: v0  reason: collision with root package name */
        public String f43739v0;

        /* renamed from: w  reason: collision with root package name */
        public String f43742w;

        /* renamed from: w0  reason: collision with root package name */
        public String f43743w0;

        /* renamed from: w1  reason: collision with root package name */
        public String f43744w1;

        /* renamed from: w2  reason: collision with root package name */
        public MsgQuoteItem f43745w2;

        /* renamed from: x  reason: collision with root package name */
        public String f43746x;

        /* renamed from: x0  reason: collision with root package name */
        public String f43747x0;

        /* renamed from: x1  reason: collision with root package name */
        public int f43748x1;

        /* renamed from: x2  reason: collision with root package name */
        public String f43749x2;

        /* renamed from: y  reason: collision with root package name */
        public String f43750y;

        /* renamed from: y0  reason: collision with root package name */
        public String f43751y0;

        /* renamed from: y1  reason: collision with root package name */
        public String f43752y1;

        /* renamed from: y2  reason: collision with root package name */
        public String f43753y2;

        /* renamed from: z  reason: collision with root package name */
        public String f43754z;

        /* renamed from: z0  reason: collision with root package name */
        public int f43755z0;

        /* renamed from: z1  reason: collision with root package name */
        public String f43756z1;

        /* renamed from: z2  reason: collision with root package name */
        public int f43757z2;
        public String H0 = "";
        public String M0 = "";
        public String N0 = "";

        /* renamed from: u1  reason: collision with root package name */
        public boolean f43736u1 = false;

        /* renamed from: v1  reason: collision with root package name */
        public int f43740v1 = 0;
        public boolean C1 = false;
        public int X1 = 0;
        public String Y1 = "";
        public String Z1 = "";

        /* renamed from: a2  reason: collision with root package name */
        public String f43657a2 = "";

        /* renamed from: b2  reason: collision with root package name */
        public String f43661b2 = "";

        /* renamed from: c2  reason: collision with root package name */
        public String f43665c2 = "";

        /* renamed from: d2  reason: collision with root package name */
        public String f43669d2 = "";

        /* renamed from: l2  reason: collision with root package name */
        public int f43701l2 = 2;

        /* renamed from: u2  reason: collision with root package name */
        public int f43737u2 = 0;

        /* renamed from: v2  reason: collision with root package name */
        public Pair<String, String> f43741v2 = new Pair<>("", "");
        public String C2 = "";
        public int D2 = 0;
        public int E2 = 0;
        public final HashMap<Class<? extends g>, g> F2 = new HashMap<>();

        /* loaded from: classes5.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public String f43758a;

            /* renamed from: b  reason: collision with root package name */
            public int f43759b;

            /* renamed from: c  reason: collision with root package name */
            public int f43760c;

            /* renamed from: d  reason: collision with root package name */
            public String f43761d;

            /* renamed from: e  reason: collision with root package name */
            public int f43762e;

            /* renamed from: f  reason: collision with root package name */
            public String f43763f;

            /* renamed from: g  reason: collision with root package name */
            public int f43764g;
        }

        public static String g(String str) {
            return "<![CDATA[" + str + "]]>";
        }

        public static b i(b bVar) {
            return bVar == null ? new b() : bVar.a();
        }

        public static String r(b bVar, String str, gi.d dVar, int i15, int i16) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<appmsg appid=\"" + Util.escapeStringForXml(bVar.f43666d) + "\" sdkver=\"" + bVar.f43670e + "\">");
            bVar.c(sb4, bVar, str, dVar, i15, i16);
            g b15 = c.b(bVar.f43686i);
            if (b15 != null) {
                b15.c(sb4, bVar, str, dVar, i15, i16);
            }
            sb4.append("</appmsg>");
            if (2 == bVar.H) {
                sb4.append("<ShakePageResult>");
                sb4.append(bVar.I);
                sb4.append("</ShakePageResult>");
            }
            return sb4.toString();
        }

        public static String s(b bVar, String str, gi.d dVar) {
            Log.i("MicroMsg.AppMessage", "summersafecdn makeLocalContent aesKey[%s], filemd5[%s]", Util.secPrint(bVar.R), bVar.f43726s);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<msg>");
            int i15 = bVar.Q;
            if (i15 == 0 || bVar.P == 0) {
                Log.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb 0");
                sb4.append(r(bVar, str, dVar, 0, 0));
            } else {
                Log.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb[%d, %d]", Integer.valueOf(i15), Integer.valueOf(bVar.P));
                sb4.append(r(bVar, str, dVar, bVar.Q, bVar.P));
            }
            sb4.append("</msg>");
            return sb4.toString();
        }

        public static final b t(String str) {
            return u(str, null);
        }

        public static final b u(String str, String str2) {
            g[] gVarArr;
            if (Util.isNullOrNil(str)) {
                return null;
            }
            int indexOf = str.indexOf(60);
            String substring = indexOf > 0 ? str.substring(indexOf) : str;
            int hashCode = substring.hashCode();
            b bVar = (b) ((q90.d) J2).get(Integer.valueOf(hashCode));
            if (bVar != null) {
                return bVar;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Map<String, String> decode = !Util.isNullOrNil(str2) ? SemiXml.decode(str2) : null;
            if (decode == null) {
                decode = XmlParser.parseXml(substring, "msg", null);
            }
            if (decode == null) {
                Log.e("MicroMsg.AppMessage", "parse msg failed");
                return null;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            b bVar2 = new b();
            bVar2.G2 = decode;
            bVar2.H2 = str;
            bVar2.I2 = substring;
            try {
                bVar2.d(decode, bVar2);
                for (nr3.b<? extends g> bVar3 : c.f43765a) {
                    g gVar = bVar3.get();
                    if (gVar != null) {
                        gVar.d(decode, bVar2);
                        bVar2.f(gVar);
                    }
                }
                b.a aVar = (b.a) wl.b.f(d.class);
                b.a.C3939b c3939b = new b.a.C3939b(aVar, aVar.f296484d.all().iterator());
                while (c3939b.hasNext()) {
                    for (g gVar2 : ((d) ((wl.i) c3939b.next()).get()).get()) {
                        gVar2.d(decode, bVar2);
                        bVar2.f(gVar2);
                    }
                }
                g b15 = c.b(bVar2.f43686i);
                if (b15 != null) {
                    b15.d(decode, bVar2);
                    bVar2.f(b15);
                }
                ((q90.d) J2).c(Integer.valueOf(hashCode), bVar2);
                Log.d("MicroMsg.AppMessage", "parseContent, time:%d, %d, %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(Util.nullAsNil(str2).hashCode()));
                return bVar2;
            } catch (Exception e15) {
                Log.e("MicroMsg.AppMessage", "parse amessage xml failed");
                Log.e("MicroMsg.AppMessage", "exception:%s", Util.stackTraceToString(e15));
                return null;
            }
        }

        public static b v(int i15, String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            int indexOf = str.indexOf(60);
            if (indexOf > 0) {
                str = str.substring(indexOf);
            }
            int hashCode = ("parse" + i15 + "_" + str).hashCode();
            sg.g<Integer, b> gVar = J2;
            b bVar = (b) ((q90.d) gVar).get(Integer.valueOf(hashCode));
            if (bVar != null) {
                return bVar;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", null);
            if (parseXml == null) {
                Log.e("MicroMsg.AppMessage", "parseImg failed");
                return null;
            }
            b bVar2 = new b();
            bVar2.f43686i = i15;
            bVar2.f43666d = parseXml.get(".msg.appinfo.appid");
            bVar2.E = Util.getInt(parseXml.get(".msg.appinfo.version"), 0);
            bVar2.F = parseXml.get(".msg.appinfo.appname");
            bVar2.V = parseXml.get(".msg.appinfo.mediatagname");
            bVar2.X = parseXml.get(".msg.appinfo.messageext");
            bVar2.W = parseXml.get(".msg.appinfo.messageaction");
            ((q90.d) gVar).c(Integer.valueOf(hashCode), bVar2);
            return bVar2;
        }

        @Override // com.tencent.mm.message.g
        public void c(StringBuilder sb4, b bVar, String str, gi.d dVar, int i15, int i16) {
            g[] gVarArr;
            int i17;
            for (nr3.b bVar2 : c.f43765a) {
                g gVar = (g) bVar2.get();
                if (gVar != null) {
                    g w15 = bVar.w(gVar.getClass());
                    if (w15 != null) {
                        gVar = w15;
                    }
                    gVar.e(sb4, bVar, str, dVar, i15, i16);
                }
            }
            Iterator it = ((b.a.C3938a) ((b.a) wl.b.f(d.class)).all()).iterator();
            while (it.hasNext()) {
                g[] gVarArr2 = ((d) ((wl.i) it.next()).get()).get();
                int length = gVarArr2.length;
                int i18 = 0;
                while (i18 < length) {
                    g gVar2 = gVarArr2[i18];
                    if (gVar2 == null) {
                        i17 = length;
                    } else {
                        g w16 = bVar.w(gVar2.getClass());
                        if (w16 != null) {
                            gVar2 = w16;
                        }
                        i17 = length;
                        gVar2.e(sb4, bVar, str, dVar, i15, i16);
                    }
                    i18++;
                    length = i17;
                }
            }
            sb4.append("<title>" + Util.escapeStringForXml(bVar.f43674f) + "</title>");
            sb4.append("<des>" + Util.escapeStringForXml(bVar.f43678g) + "</des>");
            sb4.append("<username>" + Util.escapeStringForXml(bVar.f43695k0) + "</username>");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<action>");
            sb5.append(Util.isNullOrNil(bVar.f43682h) ? "view" : Util.escapeStringForXml(bVar.f43682h));
            sb5.append("</action>");
            sb4.append(sb5.toString());
            sb4.append("<type>" + bVar.f43686i + "</type>");
            sb4.append("<showtype>");
            sb4.append(bVar.H);
            sb4.append("</showtype>");
            sb4.append("<content>" + Util.escapeStringForXml(bVar.f43702m) + "</content>");
            sb4.append("<url>" + Util.escapeStringForXml(bVar.f43690j) + "</url>");
            sb4.append("<lowurl>" + Util.escapeStringForXml(bVar.f43694k) + "</lowurl>");
            sb4.append("<forwardflag>" + bVar.E2 + "</forwardflag>");
            sb4.append("<dataurl>" + Util.escapeStringForXml(bVar.T) + "</dataurl>");
            sb4.append("<lowdataurl>" + Util.escapeStringForXml(bVar.U) + "</lowdataurl>");
            sb4.append("<contentattr>");
            sb4.append(bVar.f43734u);
            sb4.append("</contentattr>");
            if (!Util.isNullOrNil(bVar.f43753y2)) {
                sb4.append("<syncrecordctx>");
                sb4.append("<![CDATA[");
                sb4.append(bVar.f43753y2);
                sb4.append("]]>");
                sb4.append("</syncrecordctx>");
            }
            sb4.append("<streamvideo>");
            sb4.append("<streamvideourl>");
            sb4.append(Util.escapeStringForXml(bVar.W1));
            sb4.append("</streamvideourl>");
            sb4.append("<streamvideototaltime>");
            sb4.append(bVar.X1);
            sb4.append("</streamvideototaltime>");
            sb4.append("<streamvideotitle>");
            sb4.append(Util.escapeStringForXml(bVar.Y1));
            sb4.append("</streamvideotitle>");
            sb4.append("<streamvideowording>");
            sb4.append(Util.escapeStringForXml(bVar.Z1));
            sb4.append("</streamvideowording>");
            sb4.append("<streamvideoweburl>");
            sb4.append(Util.escapeStringForXml(bVar.f43657a2));
            sb4.append("</streamvideoweburl>");
            sb4.append("<streamvideothumburl>");
            sb4.append(Util.escapeStringForXml(bVar.f43661b2));
            sb4.append("</streamvideothumburl>");
            sb4.append("<streamvideoaduxinfo>");
            sb4.append(Util.escapeStringForXml(bVar.f43665c2));
            sb4.append("</streamvideoaduxinfo>");
            sb4.append("<streamvideopublishid>");
            sb4.append(Util.escapeStringForXml(bVar.f43669d2));
            sb4.append("</streamvideopublishid>");
            sb4.append("</streamvideo>");
            sb4.append(String.format("<canvasPageItem><canvasPageXml><![CDATA[%s]]></canvasPageXml></canvasPageItem>", bVar.C2));
            int i19 = bVar.f43686i;
            if (i19 == 10) {
                sb4.append("<productitem type=\"" + bVar.f43655a0 + "\">");
                sb4.append("<productinfo>" + Util.escapeStringForXml(bVar.f43659b0) + "</productinfo>");
                sb4.append("</productitem>");
            } else if (i19 == 13) {
                sb4.append("<mallproductitem type=\"" + bVar.f43679g0 + "\">");
                sb4.append("<mallproductinfo>" + Util.escapeStringForXml(bVar.f43683h0) + "</mallproductinfo>");
                sb4.append("</mallproductitem>");
            } else if (i19 != 16) {
                if (i19 != 24) {
                    if (i19 == 57) {
                        sb4.append("<refermsg>");
                        if (bVar.f43745w2 != null) {
                            sb4.append("<type>");
                            sb4.append(bVar.f43745w2.f94401d);
                            sb4.append("</type>");
                            sb4.append("<svrid>");
                            sb4.append(bVar.f43745w2.f94402e);
                            sb4.append("</svrid>");
                            sb4.append("<fromusr>");
                            sb4.append(bVar.f43745w2.f94403f);
                            sb4.append("</fromusr>");
                            sb4.append("<chatusr>");
                            sb4.append(bVar.f43745w2.f94404g);
                            sb4.append("</chatusr>");
                            sb4.append("<displayname>");
                            sb4.append(Util.escapeStringForXml(bVar.f43745w2.f94405h));
                            sb4.append("</displayname>");
                            sb4.append("<msgsource>");
                            sb4.append(Util.escapeStringForXml(bVar.f43745w2.f94406i));
                            sb4.append("</msgsource>");
                            sb4.append("<content>");
                            sb4.append(Util.escapeStringForXml(bVar.f43745w2.f94407j));
                            sb4.append("</content>");
                        }
                        sb4.append("</refermsg>");
                    } else if (i19 == 68 || i19 == 101) {
                        sb4.append("<liteapp>");
                        sb4.append("<id>");
                        sb4.append(bVar.f43725r2);
                        sb4.append("</id>");
                        sb4.append("<path>");
                        sb4.append(Util.escapeStringForXml(bVar.f43729s2));
                        sb4.append("</path>");
                        sb4.append("<query>");
                        sb4.append(Util.escapeStringForXml(bVar.f43733t2));
                        sb4.append("</query>");
                        if (bVar.f43737u2 > 0) {
                            sb4.append("<source>");
                            sb4.append(bVar.f43737u2);
                            sb4.append("</source>");
                        }
                        sb4.append("</liteapp>");
                    } else {
                        if (i19 != 2011) {
                            if (i19 != 19) {
                                if (i19 == 20) {
                                    sb4.append("<tvinfo>" + Util.escapeStringForXml(bVar.f43671e0) + "</tvinfo>");
                                } else if (i19 != 2000) {
                                    if (i19 == 2001) {
                                        sb4.append("<wcpayinfo>");
                                        sb4.append("<iconurl>" + Util.escapeStringForXml(bVar.f43680g1) + "</iconurl>");
                                        sb4.append("<scenetext>" + Util.escapeStringForXml(bVar.f43700l1) + "</scenetext>");
                                        sb4.append("<url>" + Util.escapeStringForXml(bVar.f43676f1) + "</url>");
                                        sb4.append("<receivertitle>" + Util.escapeStringForXml(bVar.f43684h1) + "</receivertitle>");
                                        sb4.append("<sendertitle>" + Util.escapeStringForXml(bVar.f43688i1) + "</sendertitle>");
                                        sb4.append("<receiverdes>" + Util.escapeStringForXml(bVar.f43696k1) + "</receiverdes>");
                                        sb4.append("<senderdes>" + Util.escapeStringForXml(bVar.f43692j1) + "</senderdes>");
                                        sb4.append("<templateid>" + Util.escapeStringForXml(bVar.f43704m1) + "</templateid>");
                                        sb4.append("<sceneid>" + Util.escapeStringForXml(bVar.f43708n1) + "</sceneid>");
                                        sb4.append("<nativeurl>" + Util.escapeStringForXml(bVar.f43712o1) + "</nativeurl>");
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("<innertype>");
                                        sb6.append(Util.escapeStringForXml(bVar.H + ""));
                                        sb6.append("</innertype>");
                                        sb4.append(sb6.toString());
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("<localtype>");
                                        sb7.append(Util.escapeStringForXml(bVar.f43716p1 + ""));
                                        sb7.append("</localtype>");
                                        sb4.append(sb7.toString());
                                        sb4.append("<paymsgid>" + Util.escapeStringForXml(bVar.f43720q1) + "</paymsgid>");
                                        sb4.append("<imageid>" + Util.escapeStringForXml(bVar.f43724r1) + "</imageid>");
                                        sb4.append("<imageaeskey>" + Util.escapeStringForXml(bVar.f43728s1) + "</imageaeskey>");
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("<imagelength>");
                                        sb8.append(Util.escapeStringForXml(bVar.f43732t1 + ""));
                                        sb8.append("</imagelength>");
                                        sb4.append(sb8.toString());
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append("<droptips>");
                                        sb9.append(Util.escapeStringForXml(bVar.f43740v1 + ""));
                                        sb9.append("</droptips>");
                                        sb4.append(sb9.toString());
                                        sb4.append("</wcpayinfo>");
                                    }
                                }
                            }
                        }
                        sb4.append("<wcpayinfo>");
                        sb4.append("<paysubtype>" + bVar.G0 + "</paysubtype>");
                        sb4.append("<feedesc>" + bVar.H0 + "</feedesc>");
                        sb4.append("<transcationid>" + bVar.I0 + "</transcationid>");
                        sb4.append("<transferid>" + bVar.J0 + "</transferid>");
                        sb4.append("<invalidtime>" + bVar.K0 + "</invalidtime>");
                        sb4.append("<pay_memo>" + bVar.T1 + "</pay_memo>");
                        sb4.append("<payer_username>" + bVar.M0 + "</payer_username>");
                        sb4.append("<receiver_username>" + bVar.N0 + "</receiver_username>");
                        sb4.append("</wcpayinfo>");
                    }
                }
                sb4.append("<recorditem>" + Util.escapeStringForXml(bVar.f43675f0) + "</recorditem>");
            } else {
                sb4.append("<carditem>" + bVar.R0 + "</carditem>");
            }
            sb4.append("<appattach>");
            if (dVar == null || (Util.isNullOrNil(str) && i15 == 0 && i16 == 0)) {
                sb4.append("<totallen>" + bVar.f43698l + "</totallen>");
                sb4.append("<attachid>" + Util.escapeStringForXml(bVar.f43710o) + "</attachid>");
                sb4.append("<cdnattachurl>" + Util.escapeStringForXml(bVar.J) + "</cdnattachurl>");
                sb4.append("<emoticonmd5>" + Util.escapeStringForXml(bVar.f43714p) + "</emoticonmd5>");
                sb4.append("<aeskey>" + Util.escapeStringForXml(bVar.R) + "</aeskey>");
                if (i15 != 0 && i16 != 0) {
                    sb4.append("<thumbheight>" + i16 + "</thumbheight>");
                    sb4.append("<thumbwidth>" + i15 + "</thumbwidth>");
                }
            } else {
                sb4.append("<attachid>" + Util.escapeStringForXml(str) + "</attachid>");
                if (dVar.field_fileLength > 0 && !Util.isNullOrNil(dVar.field_fileId)) {
                    sb4.append("<cdnattachurl>" + Util.escapeStringForXml(dVar.field_fileId) + "</cdnattachurl>");
                    int i25 = bVar.f43686i;
                    if (i25 == 19 || i25 == 24 || i25 == 4 || i25 == 3 || i25 == 7 || i25 == 27 || i25 == 97 || i25 == 26) {
                        Log.i("MicroMsg.AppMessage", "summersafecdn content.type[%d], len[%d] but not set", Integer.valueOf(i25), Long.valueOf(dVar.field_fileLength));
                    } else {
                        sb4.append("<totallen>" + dVar.field_fileLength + "</totallen>");
                    }
                }
                if (bVar.f43686i == 8 && (dVar.field_fileLength > 0 || bVar.f43698l > 0)) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("<totallen>");
                    long j15 = dVar.field_fileLength;
                    if (j15 <= 0) {
                        j15 = bVar.f43698l;
                    }
                    sb10.append(j15);
                    sb10.append("</totallen>");
                    sb4.append(sb10.toString());
                }
                if (dVar.field_thumbimgLength > 0) {
                    sb4.append("<cdnthumburl>" + Util.escapeStringForXml(dVar.field_fileId) + "</cdnthumburl>");
                    if (!Util.isNullOrNil(dVar.field_thumbfilemd5)) {
                        sb4.append("<cdnthumbmd5>" + dVar.field_thumbfilemd5 + "</cdnthumbmd5>");
                    }
                    sb4.append("<cdnthumblength>" + dVar.field_thumbimgLength + "</cdnthumblength>");
                    sb4.append("<cdnthumbheight>" + i16 + "</cdnthumbheight>");
                    sb4.append("<cdnthumbwidth>" + i15 + "</cdnthumbwidth>");
                    sb4.append("<cdnthumbaeskey>" + dVar.field_aesKey + "</cdnthumbaeskey>");
                } else if (bVar.f43686i == 8) {
                    sb4.append("<cdnthumburl>" + bVar.K + "</cdnthumburl>");
                    sb4.append("<cdnthumblength>" + bVar.L + "</cdnthumblength>");
                    sb4.append("<cdnthumbheight>" + i16 + "</cdnthumbheight>");
                    sb4.append("<cdnthumbwidth>" + i15 + "</cdnthumbwidth>");
                    sb4.append("<cdnthumbaeskey>" + bVar.S + "</cdnthumbaeskey>");
                }
                if (!Util.isNullOrNil(bVar.f43714p)) {
                    sb4.append("<emoticonmd5>" + Util.escapeStringForXml(bVar.f43714p) + "</emoticonmd5>");
                }
                sb4.append("<aeskey>" + Util.escapeStringForXml(dVar.field_aesKey) + "</aeskey>");
                sb4.append("<encryver>1</encryver>");
            }
            sb4.append("<fileext>" + Util.escapeStringForXml(bVar.f43706n) + "</fileext>");
            sb4.append("<islargefilemsg>" + bVar.f43730t + "</islargefilemsg>");
            t90.b bVar3 = (t90.b) bVar.w(t90.b.class);
            if (bVar3 != null && bVar.f43686i == 6 && bVar3.g() != 0 && !Util.isNullOrNil(bVar3.f())) {
                sb4.append("<overwrite_newmsgid>" + bVar3.g() + "</overwrite_newmsgid>");
                sb4.append("<fileuploadtoken>" + g(bVar3.f()) + "</fileuploadtoken>");
            }
            sb4.append("</appattach>");
            if (bVar.f43686i != 53) {
                sb4.append("<extinfo>" + Util.escapeStringForXml(bVar.f43718q) + "</extinfo>");
            } else if (((String) bVar.f43741v2.second).contains("solitaire_info")) {
                sb4.append("<extinfo>");
                sb4.append((String) bVar.f43741v2.second);
                sb4.append("</extinfo>");
            } else {
                sb4.append("<extinfo><solitaire_info><![CDATA[");
                sb4.append((String) bVar.f43741v2.second);
                sb4.append("]]></solitaire_info></extinfo>");
            }
            sb4.append("<androidsource>" + bVar.f43722r + "</androidsource>");
            if (!Util.isNullOrNil(bVar.f43738v)) {
                sb4.append("<sourceusername>" + Util.escapeStringForXml(bVar.f43738v) + "</sourceusername>");
                sb4.append("<sourcedisplayname>" + Util.escapeStringForXml(bVar.f43742w) + "</sourcedisplayname>");
                sb4.append("<commenturl>" + Util.escapeStringForXml(bVar.f43746x) + "</commenturl>");
            }
            sb4.append("<thumburl>" + Util.escapeStringForXml(bVar.f43750y) + "</thumburl>");
            sb4.append("<mediatagname>" + Util.escapeStringForXml(bVar.V) + "</mediatagname>");
            sb4.append("<messageaction>" + g(Util.escapeStringForXml(bVar.W)) + "</messageaction>");
            sb4.append("<messageext>" + g(Util.escapeStringForXml(bVar.X)) + "</messageext>");
            sb4.append("<emoticongift>");
            sb4.append("<packageflag>" + bVar.f43667d0 + "</packageflag>");
            sb4.append("<packageid>" + Util.escapeStringForXml(bVar.f43663c0) + "</packageid>");
            sb4.append("</emoticongift>");
            sb4.append("<emoticonshared>");
            sb4.append("<packageflag>" + bVar.f43691j0 + "</packageflag>");
            sb4.append("<packageid>" + Util.escapeStringForXml(bVar.f43687i0) + "</packageid>");
            sb4.append("</emoticonshared>");
            sb4.append("<designershared>");
            sb4.append("<designeruin>" + bVar.J1 + "</designeruin>");
            sb4.append("<designername>" + bVar.K1 + "</designername>");
            sb4.append("<designerrediretcturl>" + bVar.L1 + "</designerrediretcturl>");
            sb4.append("</designershared>");
            sb4.append("<emotionpageshared>");
            sb4.append("<tid>" + bVar.M1 + "</tid>");
            sb4.append("<title>" + bVar.N1 + "</title>");
            sb4.append("<desc>" + bVar.O1 + "</desc>");
            sb4.append("<iconUrl>" + bVar.P1 + "</iconUrl>");
            sb4.append("<secondUrl>" + bVar.Q1 + "</secondUrl>");
            sb4.append("<pageType>" + bVar.R1 + "</pageType>");
            sb4.append("<setKey>" + bVar.S1 + "</setKey>");
            sb4.append("</emotionpageshared>");
            sb4.append("<webviewshared>");
            sb4.append("<shareUrlOriginal>" + Util.escapeStringForXml(bVar.E1) + "</shareUrlOriginal>");
            sb4.append("<shareUrlOpen>" + Util.escapeStringForXml(bVar.F1) + "</shareUrlOpen>");
            sb4.append("<jsAppId>" + Util.escapeStringForXml(bVar.G1) + "</jsAppId>");
            sb4.append("<publisherId>" + Util.escapeStringForXml(bVar.H1) + "</publisherId>");
            sb4.append("<publisherReqId>" + Util.escapeStringForXml(bVar.I1) + "</publisherReqId>");
            sb4.append("</webviewshared>");
            sb4.append("<template_id>" + Util.escapeStringForXml(bVar.F0) + "</template_id>");
            Log.i("MicroMsg.AppMessage", "summerbig makecontent content md5[%s]", bVar.f43726s);
            sb4.append("<md5>" + Util.escapeStringForXml(bVar.f43726s) + "</md5>");
            for (nr3.b bVar4 : c.f43765a) {
                g gVar3 = (g) bVar4.get();
                if (gVar3 != null) {
                    g w17 = bVar.w(gVar3.getClass());
                    if (w17 != null) {
                        gVar3 = w17;
                    }
                    gVar3.c(sb4, bVar, str, dVar, i15, i16);
                }
            }
            Iterator it4 = ((b.a.C3938a) ((b.a) wl.b.f(d.class)).all()).iterator();
            while (it4.hasNext()) {
                for (g gVar4 : ((d) ((wl.i) it4.next()).get()).get()) {
                    if (gVar4 != null) {
                        g w18 = bVar.w(gVar4.getClass());
                        if (w18 != null) {
                            gVar4 = w18;
                        }
                        gVar4.c(sb4, bVar, str, dVar, i15, i16);
                    }
                }
            }
        }

        @Override // com.tencent.mm.message.g
        public void d(Map<String, String> map, b bVar) {
            String[] split;
            String[] split2;
            int i15;
            try {
                this.f43662c = map;
                this.f43666d = map.get(".msg.appmsg.$appid");
                this.f43670e = Util.getInt(map.get(".msg.appmsg.$sdkver"), 0);
                this.f43674f = Util.escapeDirTraversal(map.get(".msg.appmsg.title"));
                this.f43678g = map.get(".msg.appmsg.des");
                this.f43695k0 = map.get(".msg.appmsg.username");
                this.f43682h = map.get(".msg.appmsg.action");
                this.f43686i = Util.getInt(map.get(".msg.appmsg.type"), 0);
                this.f43702m = map.get(".msg.appmsg.content");
                this.f43690j = map.get(".msg.appmsg.url");
                this.f43694k = map.get(".msg.appmsg.lowurl");
                this.E2 = Util.getInt(map.get(".msg.appmsg.forwardflag"), 0);
                this.f43754z = map.get(".msg.appmsg.appattach.tpurl");
                this.A = map.get(".msg.appmsg.appattach.tpthumburl");
                this.B = Util.getInt(map.get(".msg.appmsg.appattach.tpthumblength"), 0);
                Util.getInt(map.get(".msg.appmsg.appattach.tpthumbheight"), 0);
                Util.getInt(map.get(".msg.appmsg.appattach.tpthumbwidth"), 0);
                map.get(".msg.appmsg.appattach.tpthumbmd5");
                this.C = map.get(".msg.appmsg.appattach.tpauthkey");
                this.D = map.get(".msg.appmsg.appattach.tpthumbaeskey");
                this.T = map.get(".msg.appmsg.dataurl");
                this.U = map.get(".msg.appmsg.lowdataurl");
                this.f43698l = Util.getInt(map.get(".msg.appmsg.appattach.totallen"), 0);
                this.f43710o = map.get(".msg.appmsg.appattach.attachid");
                if (!Util.isNullOrNil(this.f43754z)) {
                    this.f43710o = this.f43754z;
                }
                this.f43706n = Util.escapeDirTraversal(map.get(".msg.appmsg.appattach.fileext"));
                this.f43714p = map.get(".msg.appmsg.appattach.emoticonmd5");
                this.f43718q = map.get(".msg.appmsg.extinfo");
                this.f43741v2 = new Pair<>("", map.get(".msg.appmsg.extinfo.solitaire_info"));
                this.f43749x2 = Util.nullAs(map.get(".msg.appmsg.laninfo"), "");
                this.f43722r = Util.getInt(map.get(".msg.appmsg.androidsource"), 0);
                this.f43738v = map.get(".msg.appmsg.sourceusername");
                this.f43742w = map.get(".msg.appmsg.sourcedisplayname");
                this.f43746x = map.get(".msg.commenturl");
                this.f43750y = map.get(".msg.appmsg.thumburl");
                this.V = map.get(".msg.appmsg.mediatagname");
                this.W = map.get(".msg.appmsg.messageaction");
                this.X = map.get(".msg.appmsg.messageext");
                this.E = Util.getInt(map.get(".msg.appinfo.version"), 0);
                this.F = map.get(".msg.appinfo.appname");
                this.G = map.get(".msg.fromusername");
                this.J = map.get(".msg.appmsg.appattach.cdnattachurl");
                this.K = map.get(".msg.appmsg.appattach.cdnthumburl");
                this.L = Util.getInt(map.get(".msg.appmsg.appattach.cdnthumblength"), 0);
                this.M = map.get(".msg.appmsg.appattach.cdnthumbmd5");
                this.N = Util.getInt(map.get(".msg.appmsg.appattach.cdnthumbheight"), 0);
                this.O = Util.getInt(map.get(".msg.appmsg.appattach.cdnthumbwidth"), 0);
                this.P = Util.getInt(map.get(".msg.appmsg.appattach.thumbheight"), 0);
                this.Q = Util.getInt(map.get(".msg.appmsg.appattach.thumbwidth"), 0);
                this.R = map.get(".msg.appmsg.appattach.aeskey");
                Util.getInt(map.get(".msg.appmsg.appattach.encryver"), 1);
                this.S = map.get(".msg.appmsg.appattach.cdnthumbaeskey");
                int i16 = Util.getInt(map.get(".msg.appmsg.appattach.islargefilemsg"), 0);
                this.f43730t = i16;
                if (i16 == 0 && (i15 = this.f43698l) > 26214400) {
                    this.f43730t = 1;
                    Log.i("MicroMsg.AppMessage", "summerbig content.attachlen[%d] set largefilemsg 1", Integer.valueOf(i15));
                }
                this.f43655a0 = Util.getInt(map.get(".msg.appmsg.productitem.$type"), 0);
                this.f43659b0 = map.get(".msg.appmsg.productitem.productinfo");
                this.f43667d0 = Util.getInt(map.get(".msg.appmsg.emoticongift.packageflag"), 0);
                this.f43663c0 = map.get(".msg.appmsg.emoticongift.packageid");
                this.f43687i0 = map.get(".msg.appmsg.emoticonshared.packageid");
                this.f43691j0 = Util.getInt(map.get(".msg.appmsg.emoticonshared.packageflag"), 0);
                this.f43671e0 = map.get(".msg.appmsg.tvinfo");
                this.f43675f0 = map.get(".msg.appmsg.recorditem");
                this.E1 = map.get(".msg.appmsg.webviewshared.shareUrlOriginal");
                this.F1 = map.get(".msg.appmsg.webviewshared.shareUrlOpen");
                this.G1 = map.get(".msg.appmsg.webviewshared.jsAppId");
                this.H1 = map.get(".msg.appmsg.webviewshared.publisherId");
                this.I1 = map.get(".msg.appmsg.webviewshared.publisherReqId");
                this.J1 = sg.q.b(map.get(".msg.appmsg.designershared.designeruin"));
                this.K1 = map.get(".msg.appmsg.designershared.designername");
                this.L1 = map.get(".msg.appmsg.designershared.designerrediretcturl");
                this.M1 = Util.safeParseInt(map.get(".msg.appmsg.emotionpageshared.tid"));
                this.N1 = map.get(".msg.appmsg.emotionpageshared.title");
                this.O1 = map.get(".msg.appmsg.emotionpageshared.desc");
                this.P1 = map.get(".msg.appmsg.emotionpageshared.iconUrl");
                this.Q1 = Util.nullAs(map.get(".msg.appmsg.emotionpageshared.secondUrl"), "");
                this.R1 = Util.safeParseInt(map.get(".msg.appmsg.emotionpageshared.pageType"));
                this.S1 = map.get(".msg.appmsg.emotionpageshared.setKey");
                this.W1 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideourl"), "");
                this.X1 = Util.safeParseInt(map.get(".msg.appmsg.streamvideo.streamvideototaltime"));
                this.Y1 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideotitle"), "");
                this.Z1 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideowording"), "");
                this.f43657a2 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideoweburl"), "");
                this.f43661b2 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideothumburl"), "");
                this.f43665c2 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideoaduxinfo"), "");
                this.f43669d2 = Util.nullAs(map.get(".msg.appmsg.streamvideo.streamvideopublishid"), "");
                this.C2 = Util.nullAs(map.get(".msg.appmsg.canvasPageItem.canvasPageXml"), "");
                if (map.containsKey(".msg.appmsg.gamelife")) {
                    HashMap hashMap = new HashMap(4);
                    this.V1 = hashMap;
                    hashMap.put(Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording.$lang")), Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording")));
                    this.V1.put(Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording1.$lang")), Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording1")));
                    this.V1.put(Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording2.$lang")), Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording2")));
                    this.V1.put(Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording3.$lang")), Util.nullAsNil(map.get(".msg.appmsg.gamelife.digest.wording3")));
                }
                this.f43677f2 = map.get(".msg.appmsg.weappinfo.username");
                this.f43673e2 = map.get(".msg.appmsg.weappinfo.pagepath");
                this.f43681g2 = map.get(".msg.appmsg.weappinfo.appid");
                this.A2 = Util.getInt(map.get(".msg.appmsg.weappinfo.version"), 0);
                this.f43685h2 = Util.getInt(map.get(".msg.appmsg.weappinfo.type"), 0);
                this.f43757z2 = Util.getInt(map.get(".msg.appmsg.weappinfo.pkginfo.type"), 0);
                this.f43689i2 = map.get(".msg.appmsg.weappinfo.pkginfo.md5");
                this.B2 = map.get(".msg.appmsg.weappinfo.weappiconurl");
                this.f43693j2 = map.get(".msg.appmsg.weappinfo.shareId");
                this.f43697k2 = map.get(".msg.appmsg.weappinfo.sharekey");
                this.f43701l2 = Util.getInt(map.get(".msg.appmsg.weappinfo.nativeappinfo.type"), 2);
                this.f43705m2 = Util.nullAs(map.get(".msg.appmsg.weappinfo.nativeappinfo.appnamemultilanguagekey"), "");
                this.f43713o2 = Util.nullAs(map.get(".msg.appmsg.weappinfo.nativeappinfo.sourcename"), "");
                this.f43717p2 = Util.nullAs(map.get(".msg.appmsg.weappinfo.nativeappinfo.sourceiconurl"), "");
                this.f43709n2 = Util.getInt(map.get(".msg.appmsg.weappinfo.disableforward"), 0);
                this.f43721q2 = Util.getInt(map.get(".msg.appmsg.weappinfo.secflagforsinglepagemode"), 0);
                Util.getInt(map.get(".msg.appmsg.soundtype"), 0);
                int i17 = this.f43686i;
                if (i17 != 1) {
                    if (i17 == 13) {
                        this.f43679g0 = Util.getInt(map.get(".msg.appmsg.mallproductitem.$type"), 0);
                        this.f43683h0 = map.get(".msg.appmsg.mallproductitem.mallproductinfo");
                    } else if (i17 == 16) {
                        this.Q0 = bVar.o();
                        this.R0 = "";
                        this.T0 = Util.getInt(map.get(".msg.appmsg.carditem.from_scene"), 2);
                        this.S0 = map.get(".msg.appmsg.carditem.brand_name");
                        Util.getInt(map.get(".msg.appmsg.carditem.card_type"), -1);
                    } else if (i17 == 34) {
                        this.V0 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.order_id"), "");
                        this.U0 = sg.q.b(map.get(".msg.appmsg.giftcard_info.biz_uin"));
                        this.W0 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.app_name"), "");
                        this.X0 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.recv_digest"), "");
                        this.Y0 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.send_digest"), "");
                        this.Z0 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
                        this.f43656a1 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.title_color"), "");
                        this.f43660b1 = Util.nullAs(map.get(".msg.appmsg.giftcard_info.des_color"), "");
                    } else if (i17 == 57) {
                        MsgQuoteItem msgQuoteItem = new MsgQuoteItem();
                        this.f43745w2 = msgQuoteItem;
                        msgQuoteItem.f94401d = Util.getInt(map.get(".msg.appmsg.refermsg.type"), 0);
                        this.f43745w2.f94402e = Util.getLong(map.get(".msg.appmsg.refermsg.svrid"), 0L);
                        this.f43745w2.f94403f = Util.nullAs(map.get(".msg.appmsg.refermsg.fromusr"), "");
                        this.f43745w2.f94404g = Util.nullAs(map.get(".msg.appmsg.refermsg.chatusr"), "");
                        this.f43745w2.f94404g = Util.nullAs(map.get(".msg.appmsg.refermsg.chatusr"), "");
                        this.f43745w2.f94405h = Util.nullAs(map.get(".msg.appmsg.refermsg.displayname"), "");
                        this.f43745w2.f94407j = Util.nullAs(map.get(".msg.appmsg.refermsg.content"), "");
                        this.f43745w2.f94406i = Util.nullAs(map.get(".msg.appmsg.refermsg.msgsource"), "");
                    } else if (i17 == 68 || i17 == 101) {
                        this.f43725r2 = map.get(".msg.appmsg.liteapp.id");
                        this.f43729s2 = map.get(".msg.appmsg.liteapp.path");
                        this.f43733t2 = map.get(".msg.appmsg.liteapp.query");
                        this.f43737u2 = Util.getInt(map.get(".msg.appmsg.liteapp.source"), 0);
                    } else {
                        if (i17 != 2011) {
                            switch (i17) {
                                case 2001:
                                    this.f43680g1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.iconurl"));
                                    this.f43700l1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.scenetext"));
                                    this.f43676f1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.url"));
                                    this.f43684h1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.receivertitle"));
                                    this.f43688i1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.sendertitle"));
                                    this.f43696k1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.receiverdes"));
                                    this.f43692j1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.senderdes"));
                                    this.f43704m1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.templateid"));
                                    this.f43708n1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.sceneid"));
                                    this.f43712o1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.nativeurl"));
                                    this.f43716p1 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.localtype"), 0);
                                    this.f43720q1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.paymsgid"));
                                    this.f43724r1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.imageid"));
                                    this.f43728s1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.imageaeskey"));
                                    this.f43732t1 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.imagelength"), 0);
                                    this.f43740v1 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.droptips"), 0);
                                    this.K0 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.invalidtime"), 0);
                                    this.D1 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.bubbletype"), 0);
                                    this.f43744w1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.billno"));
                                    this.f43748x1 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.newaa.newaatype"), 0);
                                    this.f43752y1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.receivertitle"));
                                    this.f43756z1 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.launchertitle"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.notinertitle"));
                                    String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.receiverlist"));
                                    if (!Util.isNullOrNil(nullAsNil) && (split2 = nullAsNil.split("\\|")) != null && split2.length > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        this.A1 = arrayList;
                                        arrayList.addAll(Arrays.asList(split2));
                                    }
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.payertitle"));
                                    String nullAsNil2 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.payerlist"));
                                    String nullAsNil3 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.customize_payerlist"));
                                    if (this.f43748x1 != 5 || Util.isNullOrNil(nullAsNil3)) {
                                        this.C1 = false;
                                    } else {
                                        this.C1 = true;
                                        nullAsNil2 = nullAsNil3;
                                    }
                                    if (!Util.isNullOrNil(nullAsNil2) && (split = nullAsNil2.split("\\|")) != null && split.length > 0) {
                                        ArrayList arrayList2 = new ArrayList();
                                        this.B1 = arrayList2;
                                        arrayList2.addAll(Arrays.asList(split));
                                    }
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.outtradeno"));
                                    Util.getInt(map.get(".msg.appmsg.wcpayinfo.newaa.seq"), 0);
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.newaa.launcherusername"));
                                    break;
                                case 2002:
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.url"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.templateid"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.iconurl"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.miniiconurl"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.backgroundurl"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.receivertitle"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.sendertitle"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.scenetext"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.senderdes"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.receiverdes"));
                                    Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo.sceneid"));
                                    break;
                            }
                        }
                        this.G0 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.paysubtype"), 0);
                        this.H0 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.feedesc"));
                        this.I0 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.transcationid"));
                        this.J0 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.transferid"));
                        this.K0 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.invalidtime"), 0);
                        this.L0 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.effectivedate"), 3);
                        this.O0 = Util.getInt(map.get(".msg.appmsg.wcpayinfo.total_fee"), 0);
                        this.P0 = Util.nullAs(map.get(".msg.appmsg.wcpayinfo.fee_type"), "ZAR");
                        this.T1 = Util.nullAs(map.get(".msg.appmsg.wcpayinfo.pay_memo"), "");
                        this.M0 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.payer_username"));
                        this.N0 = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.receiver_username"));
                    }
                } else if (map.get(".msg.alphainfo.url") != null && map.get(".msg.alphainfo.md5") != null) {
                    this.f43736u1 = true;
                }
                int i18 = this.f43686i;
                if (i18 == 21) {
                    this.H = Util.getInt(map.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
                } else if (i18 == 2001) {
                    this.H = Util.getInt(map.get(".msg.appmsg.wcpayinfo.innertype"), 0);
                } else {
                    int i19 = Util.getInt(map.get(".msg.appmsg.showtype"), 0);
                    this.H = i19;
                    if (i19 != 1) {
                        if (i19 == 2) {
                            String lowerCase = bVar.o().toLowerCase();
                            this.I = bVar.o().substring(lowerCase.indexOf("<ShakePageResult>".toLowerCase()) + 17, lowerCase.indexOf("</ShakePageResult>".toLowerCase()));
                        }
                    } else if (Util.getInt(map.get(".msg.appmsg.mmreader.category.$count"), 0) > 0) {
                        this.f43702m = SemiXml.encode(map);
                    }
                }
                this.U1 = map.get(".msg.appmsg.statextstr");
                int i25 = Util.getInt(map.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
                this.Y = i25;
                if (i25 == 5 && Util.getInt(map.get(".msg.appmsg.mmreader.category.$count"), 0) > 1) {
                    this.Y = 0;
                }
                this.Z = Util.getInt(map.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
                this.f43699l0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.ranktitle");
                String str = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rankid");
                this.f43703m0 = str;
                if (Util.isNullOrNil(str)) {
                    this.f43703m0 = map.get(".msg.appmsg.hardwareinfo.likeuserlist.userinfo.rankid");
                }
                this.f43707n0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.rankdisplay");
                this.f43711o0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoretitle");
                this.f43715p0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoredisplay");
                this.f43719q0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.tipdisplay");
                this.f43723r0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.color");
                this.f43727s0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightcolor");
                this.f43731t0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.linecolor");
                this.f43739v0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.fontcolor");
                this.f43735u0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightlinecolor");
                this.f43747x0 = map.get(".msg.appmsg.hardwareinfo.rankview.rankviewtitle");
                this.f43743w0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.championusername");
                this.f43755z0 = Util.getInt(map.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
                this.B0 = Util.getInt(map.get(".msg.appmsg.hardwareinfo.timestamp"), 0);
                this.A0 = Util.getInt(map.get(".msg.appmsg.hardwareinfo.devicetype"), 0);
                this.f43751y0 = map.get(".msg.appmsg.hardwareinfo.rankview.championinfo.motto");
                map.get(".msg.appmsg.hardwareinfo.rankview.championinfo.coverimgurl");
                this.D0 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.displayusername");
                String str2 = map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.title");
                this.E0 = str2;
                this.C0 = str2;
                this.F0 = Util.nullAsNil(map.get(".msg.appmsg.template_id"));
                this.f43726s = map.get(".msg.appmsg.md5");
                this.f43664c1 = Util.getInt(map.get(".msg.appmsg.jumpcontrol.enable"), 0);
                this.f43668d1 = map.get(".msg.appmsg.jumpcontrol.jumpurl");
                this.f43672e1 = map.get(".msg.appmsg.jumpcontrol.pushcontent");
                Map<String, String> parseXml = XmlParser.parseXml(bVar.n(), "msgoperation", null);
                if (parseXml != null) {
                    a aVar = new a();
                    this.f43658b = aVar;
                    aVar.f43758a = parseXml.get(".msgoperation.expinfo.expidstr");
                    this.f43658b.f43759b = Util.getInt(parseXml.get(".msgoperation.appmsg.usedefaultthumb"), 0);
                    this.f43658b.f43760c = Util.getInt(parseXml.get(".msgoperation.appmsg.isupdatetitle"), 0);
                    this.f43658b.f43761d = parseXml.get(".msgoperation.appmsg.title");
                    this.f43658b.f43762e = Util.getInt(parseXml.get(".msgoperation.appmsg.isupdatedesc"), 0);
                    this.f43658b.f43763f = parseXml.get(".msgoperation.appmsg.desc");
                    this.f43658b.f43764g = Util.getInt(parseXml.get(".msgoperation.appmsg.ishiddentail"), 0);
                }
            } catch (Exception e15) {
                Log.e("MicroMsg.AppMessage", "parse amessage xml failed");
                Log.e("MicroMsg.AppMessage", "exception:%s", Util.stackTraceToString(e15));
                throw e15;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void f(g gVar) {
            if (gVar == null) {
                Log.printErrStackTrace("MicroMsg.AppMessage", new NullPointerException(""), "piece is null", new Object[0]);
            } else {
                this.F2.put(gVar.getClass(), gVar);
            }
        }

        @Override // com.tencent.mm.message.g
        /* renamed from: h */
        public b a() {
            b bVar = new b();
            Log.i("MicroMsg.AppMessage", "summerbig cloneContent srcContent aesKey[%s], filemd5[%s], appid[%s]", Util.secPrint(this.R), this.f43726s, bVar.f43666d);
            bVar.f43682h = this.f43682h;
            bVar.f43666d = this.f43666d;
            bVar.F = this.F;
            bVar.E = this.E;
            bVar.f43710o = this.f43710o;
            bVar.f43698l = this.f43698l;
            bVar.f43702m = this.f43702m;
            bVar.f43678g = this.f43678g;
            bVar.f43695k0 = this.f43695k0;
            bVar.f43718q = this.f43718q;
            bVar.V = this.V;
            bVar.W = this.W;
            bVar.X = this.X;
            bVar.f43722r = this.f43722r;
            bVar.f43706n = this.f43706n;
            bVar.G = this.G;
            bVar.f43694k = this.f43694k;
            bVar.f43670e = this.f43670e;
            bVar.f43674f = this.f43674f;
            bVar.f43686i = this.f43686i;
            bVar.H = this.H;
            bVar.Y = this.Y;
            bVar.Z = this.Z;
            bVar.f43690j = this.f43690j;
            bVar.f43714p = this.f43714p;
            bVar.f43738v = this.f43738v;
            bVar.f43742w = this.f43742w;
            bVar.f43746x = this.f43746x;
            bVar.f43750y = this.f43750y;
            bVar.I = this.I;
            bVar.T = this.T;
            bVar.U = this.U;
            bVar.f43655a0 = this.f43655a0;
            bVar.f43659b0 = this.f43659b0;
            bVar.f43667d0 = this.f43667d0;
            bVar.f43663c0 = this.f43663c0;
            bVar.f43679g0 = this.f43679g0;
            bVar.f43683h0 = this.f43683h0;
            bVar.f43691j0 = this.f43691j0;
            bVar.f43687i0 = this.f43687i0;
            bVar.f43671e0 = this.f43671e0;
            bVar.f43675f0 = this.f43675f0;
            bVar.F0 = this.F0;
            bVar.Q0 = this.Q0;
            bVar.R0 = this.R0;
            bVar.S0 = this.S0;
            bVar.T0 = this.T0;
            bVar.H0 = this.H0;
            bVar.K0 = this.K0;
            bVar.G0 = this.G0;
            bVar.I0 = this.I0;
            bVar.J0 = this.J0;
            bVar.M0 = this.M0;
            bVar.N0 = this.N0;
            bVar.f43664c1 = this.f43664c1;
            bVar.f43668d1 = this.f43668d1;
            bVar.f43672e1 = this.f43672e1;
            bVar.f43734u = this.f43734u;
            bVar.E1 = this.E1;
            bVar.F1 = this.F1;
            bVar.G1 = this.G1;
            bVar.H1 = this.H1;
            bVar.I1 = this.I1;
            bVar.T1 = this.T1;
            bVar.J1 = this.J1;
            bVar.K1 = this.K1;
            bVar.L1 = this.K1;
            bVar.M1 = this.M1;
            bVar.N1 = this.N1;
            bVar.O1 = this.O1;
            bVar.P1 = this.P1;
            bVar.Q1 = this.Q1;
            bVar.R1 = this.R1;
            bVar.S1 = this.S1;
            bVar.W1 = this.W1;
            bVar.X1 = this.X1;
            bVar.Y1 = this.Y1;
            bVar.Z1 = this.Z1;
            bVar.f43657a2 = this.f43657a2;
            bVar.f43661b2 = this.f43661b2;
            bVar.f43665c2 = this.f43665c2;
            bVar.f43669d2 = this.f43669d2;
            bVar.C2 = this.C2;
            bVar.U1 = this.U1;
            bVar.V1 = this.V1;
            bVar.J = this.J;
            bVar.R = this.R;
            bVar.f43726s = this.f43726s;
            bVar.f43730t = this.f43730t;
            bVar.f43658b = this.f43658b;
            bVar.f43673e2 = this.f43673e2;
            bVar.f43677f2 = this.f43677f2;
            bVar.f43685h2 = this.f43685h2;
            bVar.f43689i2 = this.f43689i2;
            bVar.f43757z2 = this.f43757z2;
            bVar.f43681g2 = this.f43681g2;
            bVar.A2 = this.A2;
            bVar.B2 = this.B2;
            bVar.f43693j2 = this.f43693j2;
            bVar.f43697k2 = this.f43697k2;
            bVar.f43701l2 = this.f43701l2;
            bVar.f43705m2 = this.f43705m2;
            bVar.f43713o2 = this.f43713o2;
            bVar.f43717p2 = this.f43717p2;
            bVar.f43709n2 = this.f43709n2;
            bVar.f43721q2 = this.f43721q2;
            bVar.I2 = this.I2;
            bVar.H2 = this.H2;
            bVar.G2 = this.G2;
            bVar.f43754z = this.f43754z;
            bVar.A = this.A;
            bVar.B = this.B;
            bVar.C = this.C;
            bVar.D = this.D;
            bVar.f43745w2 = this.f43745w2;
            bVar.f43741v2 = this.f43741v2;
            bVar.f43725r2 = this.f43725r2;
            bVar.f43729s2 = this.f43729s2;
            bVar.f43733t2 = this.f43733t2;
            bVar.f43737u2 = this.f43737u2;
            bVar.D2 = this.D2;
            for (Map.Entry<Class<? extends g>, g> entry : this.F2.entrySet()) {
                g a15 = entry.getValue().a();
                if (a15 != null) {
                    bVar.f(a15);
                }
            }
            return bVar;
        }

        public void j(l lVar) {
            lVar.field_appId = this.f43666d;
            lVar.field_title = this.f43674f;
            lVar.field_description = this.f43678g;
            lVar.field_type = this.f43686i;
            lVar.field_source = this.F;
        }

        public String k() {
            a aVar = this.f43658b;
            return (aVar == null || aVar.f43762e == 0) ? this.f43678g : aVar.f43763f;
        }

        public String l(Context context, boolean z15) {
            String str;
            String str2 = "";
            if (q(true)) {
                if (!Util.isNullOrNil(this.f43713o2)) {
                    if (z1.V5(this.f43738v) && z15) {
                        return "[" + this.f43713o2 + "]";
                    }
                    return this.f43713o2;
                } else if (!Util.isNullOrNil(this.f43705m2)) {
                    int identifier = context.getResources().getIdentifier(this.f43705m2, "string", context.getPackageName());
                    Log.d("MicroMsg.AppMessage", "id: %d.", Integer.valueOf(identifier));
                    if (identifier > 0) {
                        str = context.getResources().getString(identifier);
                    } else if (this.f43701l2 != 0) {
                        str = this.f43742w;
                    }
                    str2 = str;
                } else if (this.f43701l2 != 0) {
                    str2 = this.f43742w;
                }
            }
            if (z15 && !str2.isEmpty()) {
                str2 = "[" + str2 + "]";
            }
            Log.d("MicroMsg.AppMessage", "txt: %s.", str2);
            return str2;
        }

        public String m() {
            a aVar = this.f43658b;
            return (aVar == null || aVar.f43760c == 0) ? this.f43674f : aVar.f43761d;
        }

        public String n() {
            return this.I2;
        }

        public String o() {
            return this.H2;
        }

        public boolean p() {
            a aVar = this.f43658b;
            return aVar != null && aVar.f43759b == 1;
        }

        public boolean q(boolean z15) {
            int i15;
            if (z15) {
                return 44 == this.f43686i && (i15 = this.f43701l2) >= 0 && i15 < 2;
            }
            int i16 = this.f43701l2;
            return i16 >= 0 && i16 < 2;
        }

        public <T extends g> T w(Class<T> cls) {
            return (T) this.F2.get(cls);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final List<nr3.b<? extends g>> f43765a = Collections.synchronizedList(new ArrayList());

        /* renamed from: b  reason: collision with root package name */
        public static final HashMap<Integer, nr3.b<? extends g>> f43766b = new HashMap<>();

        public static g b(int i15) {
            nr3.b<? extends g> bVar = f43766b.get(Integer.valueOf(i15));
            if (bVar == null) {
                Log.w("MicroMsg.AppMessage", "get for type(%s) is null", Integer.valueOf(i15));
                return null;
            }
            g gVar = bVar.get();
            gVar.f43625a = i15;
            return gVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface d extends wl.f {
        g[] get();
    }

    static {
        Field[] declaredFields;
        if (CrashReportFactory.hasDebuger()) {
            boolean z15 = false;
            int i15 = 0;
            for (Field field : b.class.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && !field.getName().equals("_hellAccFlag_")) {
                    i15++;
                }
            }
            if (i15 > 216) {
                Log.e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", Integer.valueOf(i15), 216);
            } else {
                Log.i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", Integer.valueOf(i15));
                z15 = true;
            }
            Assert.assertTrue(z15);
        }
    }

    @Override // xh.f0, com.tencent.mm.sdk.storage.IAutoDBItem
    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return A;
    }
}
