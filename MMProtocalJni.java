package com.tencent.mm.protocal;

import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
/* loaded from: classes7.dex */
public final class MMProtocalJni {
    public static native byte[] aesDecrypt(byte[] bArr, byte[] bArr2);

    public static native int aesDecryptFile(String str, String str2, byte[] bArr);

    public static native byte[] aesEncrypt(byte[] bArr, byte[] bArr2);

    public static native int compress(byte[] bArr, PByteArray pByteArray, int i15, int i16);

    public static native int computerKeyWithAllStr(int i15, byte[] bArr, byte[] bArr2, PByteArray pByteArray, int i16);

    public static native byte[] decodeSecureNotifyData(byte[] bArr, int i15, int i16, int i17, int i18, int i19, int i25, int i26, byte[] bArr2);

    public static native void genClientCheckKVRes(int i15, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, PByteArray pByteArray);

    public static native int genSignature(int i15, byte[] bArr, byte[] bArr2);

    public static native int generateECKey(int i15, PByteArray pByteArray, PByteArray pByteArray2);

    public static native boolean mergeSyncKey(byte[] bArr, byte[] bArr2, PByteArray pByteArray);

    public static native boolean pack(byte[] bArr, PByteArray pByteArray, byte[] bArr2, int i15, byte[] bArr3, String str, int i16, int i17, int i18, byte[] bArr4, byte[] bArr5, int i19, int i25, int i26, int i27, int i28, int i29);

    public static native boolean packDoubleHybrid(PByteArray pByteArray, byte[] bArr, String str, int i15, int i16, int i17, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i18, int i19, int i25);

    public static native boolean packHybrid(PByteArray pByteArray, byte[] bArr, String str, int i15, int i16, int i17, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i18, int i19, int i25);

    public static native boolean packHybridEcdh(PByteArray pByteArray, byte[] bArr, String str, int i15, int i16, int i17, byte[] bArr2, int i18, int i19, int i25, int i26);

    public static native boolean rsaPublicEncrypt(byte[] bArr, PByteArray pByteArray, byte[] bArr2, byte[] bArr3);

    public static native boolean rsaPublicEncryptPemkey(byte[] bArr, PByteArray pByteArray, byte[] bArr2);

    public static native boolean setClientPackVersion(int i15);

    public static native void setDeviceTypeId(int i15);

    public static native void setIsLite(boolean z15);

    public static native boolean setProtocalJniLogLevel(int i15);

    public static native boolean unpack(PByteArray pByteArray, byte[] bArr, byte[] bArr2, PByteArray pByteArray2, PInt pInt, PInt pInt2, PInt pInt3, PInt pInt4, PInt pInt5, PInt pInt6);

    public static native boolean verifySyncKey(byte[] bArr);
}
