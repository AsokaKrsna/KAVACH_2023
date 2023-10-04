package com.tencent.ilink.network;

import com.google.protobuf.a0;
import com.google.protobuf.b;
import com.google.protobuf.j1;
import com.google.protobuf.k;
import com.google.protobuf.k1;
import com.google.protobuf.l;
import com.google.protobuf.l0;
import com.google.protobuf.o0;
import com.google.protobuf.w1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* loaded from: classes11.dex */
public final class Proto {

    /* renamed from: com.tencent.ilink.network.Proto$1  reason: invalid class name */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[l0.f.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes11.dex */
    public static final class CloudCgiRequest extends l0<CloudCgiRequest, Builder> implements CloudCgiRequestOrBuilder {
        public static final int CGI_TYPE_FIELD_NUMBER = 1;
        public static final int CLOUD_TASKID_FIELD_NUMBER = 2;
        private static final CloudCgiRequest DEFAULT_INSTANCE;
        public static final int LONG_POLLING_FIELD_NUMBER = 5;
        private static volatile w1<CloudCgiRequest> PARSER = null;
        public static final int REQUEST_BODY_FIELD_NUMBER = 3;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int cloudTaskid_;
        private boolean longPolling_;
        private int timeoutMs_;
        private int cgiType_ = 1;
        private k requestBody_ = k.f21365e;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<CloudCgiRequest, Builder> implements CloudCgiRequestOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCgiType() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearCgiType();
                return this;
            }

            public Builder clearCloudTaskid() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearCloudTaskid();
                return this;
            }

            public Builder clearLongPolling() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearLongPolling();
                return this;
            }

            public Builder clearRequestBody() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearRequestBody();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearTimeoutMs();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public CloudCgiType getCgiType() {
                return ((CloudCgiRequest) this.instance).getCgiType();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public int getCloudTaskid() {
                return ((CloudCgiRequest) this.instance).getCloudTaskid();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean getLongPolling() {
                return ((CloudCgiRequest) this.instance).getLongPolling();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public k getRequestBody() {
                return ((CloudCgiRequest) this.instance).getRequestBody();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public int getTimeoutMs() {
                return ((CloudCgiRequest) this.instance).getTimeoutMs();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean hasCgiType() {
                return ((CloudCgiRequest) this.instance).hasCgiType();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean hasCloudTaskid() {
                return ((CloudCgiRequest) this.instance).hasCloudTaskid();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean hasLongPolling() {
                return ((CloudCgiRequest) this.instance).hasLongPolling();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean hasRequestBody() {
                return ((CloudCgiRequest) this.instance).hasRequestBody();
            }

            @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
            public boolean hasTimeoutMs() {
                return ((CloudCgiRequest) this.instance).hasTimeoutMs();
            }

            public Builder setCgiType(CloudCgiType cloudCgiType) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setCgiType(cloudCgiType);
                return this;
            }

            public Builder setCloudTaskid(int i15) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setCloudTaskid(i15);
                return this;
            }

            public Builder setLongPolling(boolean z15) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setLongPolling(z15);
                return this;
            }

            public Builder setRequestBody(k kVar) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setRequestBody(kVar);
                return this;
            }

            public Builder setTimeoutMs(int i15) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setTimeoutMs(i15);
                return this;
            }

            private Builder() {
                super(CloudCgiRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            CloudCgiRequest cloudCgiRequest = new CloudCgiRequest();
            DEFAULT_INSTANCE = cloudCgiRequest;
            l0.registerDefaultInstance(CloudCgiRequest.class, cloudCgiRequest);
        }

        private CloudCgiRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCgiType() {
            this.bitField0_ &= -2;
            this.cgiType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloudTaskid() {
            this.bitField0_ &= -3;
            this.cloudTaskid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongPolling() {
            this.bitField0_ &= -17;
            this.longPolling_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestBody() {
            this.bitField0_ &= -5;
            this.requestBody_ = getDefaultInstance().getRequestBody();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -9;
            this.timeoutMs_ = 0;
        }

        public static CloudCgiRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudCgiRequest parseDelimitedFrom(InputStream inputStream) {
            return (CloudCgiRequest) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudCgiRequest parseFrom(ByteBuffer byteBuffer) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<CloudCgiRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCgiType(CloudCgiType cloudCgiType) {
            this.cgiType_ = cloudCgiType.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloudTaskid(int i15) {
            this.bitField0_ |= 2;
            this.cloudTaskid_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongPolling(boolean z15) {
            this.bitField0_ |= 16;
            this.longPolling_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestBody(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.requestBody_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutMs(int i15) {
            this.bitField0_ |= 8;
            this.timeoutMs_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "cgiType_", CloudCgiType.internalGetVerifier(), "cloudTaskid_", "requestBody_", "timeoutMs_", "longPolling_"});
                case 3:
                    return new CloudCgiRequest();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<CloudCgiRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CloudCgiRequest.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public CloudCgiType getCgiType() {
            CloudCgiType forNumber = CloudCgiType.forNumber(this.cgiType_);
            return forNumber == null ? CloudCgiType.kAuthRequest : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public int getCloudTaskid() {
            return this.cloudTaskid_;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean getLongPolling() {
            return this.longPolling_;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public k getRequestBody() {
            return this.requestBody_;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean hasCgiType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean hasCloudTaskid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean hasLongPolling() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean hasRequestBody() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.CloudCgiRequestOrBuilder
        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(CloudCgiRequest cloudCgiRequest) {
            return DEFAULT_INSTANCE.createBuilder(cloudCgiRequest);
        }

        public static CloudCgiRequest parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (CloudCgiRequest) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CloudCgiRequest parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CloudCgiRequest parseFrom(k kVar) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CloudCgiRequest parseFrom(k kVar, a0 a0Var) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CloudCgiRequest parseFrom(byte[] bArr) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudCgiRequest parseFrom(byte[] bArr, a0 a0Var) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CloudCgiRequest parseFrom(InputStream inputStream) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudCgiRequest parseFrom(InputStream inputStream, a0 a0Var) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CloudCgiRequest parseFrom(l lVar) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CloudCgiRequest parseFrom(l lVar, a0 a0Var) {
            return (CloudCgiRequest) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface CloudCgiRequestOrBuilder extends k1 {
        CloudCgiType getCgiType();

        int getCloudTaskid();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        boolean getLongPolling();

        k getRequestBody();

        int getTimeoutMs();

        boolean hasCgiType();

        boolean hasCloudTaskid();

        boolean hasLongPolling();

        boolean hasRequestBody();

        boolean hasTimeoutMs();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum CloudCgiType implements o0.c {
        kAuthRequest(1),
        kTransferRequest(2);
        
        private static final o0.d<CloudCgiType> internalValueMap = new o0.d<CloudCgiType>() { // from class: com.tencent.ilink.network.Proto.CloudCgiType.1
            @Override // com.google.protobuf.o0.d
            public CloudCgiType findValueByNumber(int i15) {
                return CloudCgiType.forNumber(i15);
            }
        };
        public static final int kAuthRequest_VALUE = 1;
        public static final int kTransferRequest_VALUE = 2;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class CloudCgiTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new CloudCgiTypeVerifier();

            private CloudCgiTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return CloudCgiType.forNumber(i15) != null;
            }
        }

        CloudCgiType(int i15) {
            this.value = i15;
        }

        public static CloudCgiType forNumber(int i15) {
            if (i15 != 1) {
                if (i15 != 2) {
                    return null;
                }
                return kTransferRequest;
            }
            return kAuthRequest;
        }

        public static o0.d<CloudCgiType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return CloudCgiTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CloudCgiType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class HostInfo extends l0<HostInfo, Builder> implements HostInfoOrBuilder {
        private static final HostInfo DEFAULT_INSTANCE;
        public static final int IP_LIST_FIELD_NUMBER = 3;
        public static final int ORIGIN_FIELD_NUMBER = 1;
        private static volatile w1<HostInfo> PARSER = null;
        public static final int SUBSTITUTE_FIELD_NUMBER = 2;
        private int bitField0_;
        private String origin_ = "";
        private String substitute_ = "";
        private o0.j<IPInfo> ipList_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<HostInfo, Builder> implements HostInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllIpList(Iterable<? extends IPInfo> iterable) {
                copyOnWrite();
                ((HostInfo) this.instance).addAllIpList(iterable);
                return this;
            }

            public Builder addIpList(IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(iPInfo);
                return this;
            }

            public Builder clearIpList() {
                copyOnWrite();
                ((HostInfo) this.instance).clearIpList();
                return this;
            }

            public Builder clearOrigin() {
                copyOnWrite();
                ((HostInfo) this.instance).clearOrigin();
                return this;
            }

            public Builder clearSubstitute() {
                copyOnWrite();
                ((HostInfo) this.instance).clearSubstitute();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public IPInfo getIpList(int i15) {
                return ((HostInfo) this.instance).getIpList(i15);
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public int getIpListCount() {
                return ((HostInfo) this.instance).getIpListCount();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public List<IPInfo> getIpListList() {
                return Collections.unmodifiableList(((HostInfo) this.instance).getIpListList());
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public String getOrigin() {
                return ((HostInfo) this.instance).getOrigin();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public k getOriginBytes() {
                return ((HostInfo) this.instance).getOriginBytes();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public String getSubstitute() {
                return ((HostInfo) this.instance).getSubstitute();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public k getSubstituteBytes() {
                return ((HostInfo) this.instance).getSubstituteBytes();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public boolean hasOrigin() {
                return ((HostInfo) this.instance).hasOrigin();
            }

            @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
            public boolean hasSubstitute() {
                return ((HostInfo) this.instance).hasSubstitute();
            }

            public Builder removeIpList(int i15) {
                copyOnWrite();
                ((HostInfo) this.instance).removeIpList(i15);
                return this;
            }

            public Builder setIpList(int i15, IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).setIpList(i15, iPInfo);
                return this;
            }

            public Builder setOrigin(String str) {
                copyOnWrite();
                ((HostInfo) this.instance).setOrigin(str);
                return this;
            }

            public Builder setOriginBytes(k kVar) {
                copyOnWrite();
                ((HostInfo) this.instance).setOriginBytes(kVar);
                return this;
            }

            public Builder setSubstitute(String str) {
                copyOnWrite();
                ((HostInfo) this.instance).setSubstitute(str);
                return this;
            }

            public Builder setSubstituteBytes(k kVar) {
                copyOnWrite();
                ((HostInfo) this.instance).setSubstituteBytes(kVar);
                return this;
            }

            private Builder() {
                super(HostInfo.DEFAULT_INSTANCE);
            }

            public Builder addIpList(int i15, IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(i15, iPInfo);
                return this;
            }

            public Builder setIpList(int i15, IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).setIpList(i15, builder.build());
                return this;
            }

            public Builder addIpList(IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(builder.build());
                return this;
            }

            public Builder addIpList(int i15, IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(i15, builder.build());
                return this;
            }
        }

        static {
            HostInfo hostInfo = new HostInfo();
            DEFAULT_INSTANCE = hostInfo;
            l0.registerDefaultInstance(HostInfo.class, hostInfo);
        }

        private HostInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIpList(Iterable<? extends IPInfo> iterable) {
            ensureIpListIsMutable();
            b.addAll((Iterable) iterable, (List) this.ipList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIpList(IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.add(iPInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpList() {
            this.ipList_ = l0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrigin() {
            this.bitField0_ &= -2;
            this.origin_ = getDefaultInstance().getOrigin();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubstitute() {
            this.bitField0_ &= -3;
            this.substitute_ = getDefaultInstance().getSubstitute();
        }

        private void ensureIpListIsMutable() {
            o0.j<IPInfo> jVar = this.ipList_;
            if (jVar.Q()) {
                return;
            }
            this.ipList_ = l0.mutableCopy(jVar);
        }

        public static HostInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HostInfo parseDelimitedFrom(InputStream inputStream) {
            return (HostInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostInfo parseFrom(ByteBuffer byteBuffer) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<HostInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeIpList(int i15) {
            ensureIpListIsMutable();
            this.ipList_.remove(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpList(int i15, IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.set(i15, iPInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrigin(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.origin_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginBytes(k kVar) {
            this.origin_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubstitute(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.substitute_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubstituteBytes(k kVar) {
            this.substitute_ = kVar.u();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "origin_", "substitute_", "ipList_", IPInfo.class});
                case 3:
                    return new HostInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<HostInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (HostInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public IPInfo getIpList(int i15) {
            return this.ipList_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public int getIpListCount() {
            return this.ipList_.size();
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public List<IPInfo> getIpListList() {
            return this.ipList_;
        }

        public IPInfoOrBuilder getIpListOrBuilder(int i15) {
            return this.ipList_.get(i15);
        }

        public List<? extends IPInfoOrBuilder> getIpListOrBuilderList() {
            return this.ipList_;
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public String getOrigin() {
            return this.origin_;
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public k getOriginBytes() {
            return k.k(this.origin_);
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public String getSubstitute() {
            return this.substitute_;
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public k getSubstituteBytes() {
            return k.k(this.substitute_);
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public boolean hasOrigin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.HostInfoOrBuilder
        public boolean hasSubstitute() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(HostInfo hostInfo) {
            return DEFAULT_INSTANCE.createBuilder(hostInfo);
        }

        public static HostInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (HostInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HostInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static HostInfo parseFrom(k kVar) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIpList(int i15, IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.add(i15, iPInfo);
        }

        public static HostInfo parseFrom(k kVar, a0 a0Var) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static HostInfo parseFrom(byte[] bArr) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HostInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static HostInfo parseFrom(InputStream inputStream) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HostInfo parseFrom(l lVar) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static HostInfo parseFrom(l lVar, a0 a0Var) {
            return (HostInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface HostInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        IPInfo getIpList(int i15);

        int getIpListCount();

        List<IPInfo> getIpListList();

        String getOrigin();

        k getOriginBytes();

        String getSubstitute();

        k getSubstituteBytes();

        boolean hasOrigin();

        boolean hasSubstitute();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IPInfo extends l0<IPInfo, Builder> implements IPInfoOrBuilder {
        private static final IPInfo DEFAULT_INSTANCE;
        public static final int IPV4_FIELD_NUMBER = 2;
        public static final int IPV6_FIELD_NUMBER = 3;
        private static volatile w1<IPInfo> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String ipv4_ = "";
        private String ipv6_ = "";
        private int type_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IPInfo, Builder> implements IPInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIpv4() {
                copyOnWrite();
                ((IPInfo) this.instance).clearIpv4();
                return this;
            }

            public Builder clearIpv6() {
                copyOnWrite();
                ((IPInfo) this.instance).clearIpv6();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IPInfo) this.instance).clearType();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public String getIpv4() {
                return ((IPInfo) this.instance).getIpv4();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public k getIpv4Bytes() {
                return ((IPInfo) this.instance).getIpv4Bytes();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public String getIpv6() {
                return ((IPInfo) this.instance).getIpv6();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public k getIpv6Bytes() {
                return ((IPInfo) this.instance).getIpv6Bytes();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public int getType() {
                return ((IPInfo) this.instance).getType();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public boolean hasIpv4() {
                return ((IPInfo) this.instance).hasIpv4();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public boolean hasIpv6() {
                return ((IPInfo) this.instance).hasIpv6();
            }

            @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
            public boolean hasType() {
                return ((IPInfo) this.instance).hasType();
            }

            public Builder setIpv4(String str) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv4(str);
                return this;
            }

            public Builder setIpv4Bytes(k kVar) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv4Bytes(kVar);
                return this;
            }

            public Builder setIpv6(String str) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv6(str);
                return this;
            }

            public Builder setIpv6Bytes(k kVar) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv6Bytes(kVar);
                return this;
            }

            public Builder setType(int i15) {
                copyOnWrite();
                ((IPInfo) this.instance).setType(i15);
                return this;
            }

            private Builder() {
                super(IPInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IPInfo iPInfo = new IPInfo();
            DEFAULT_INSTANCE = iPInfo;
            l0.registerDefaultInstance(IPInfo.class, iPInfo);
        }

        private IPInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv4() {
            this.bitField0_ &= -3;
            this.ipv4_ = getDefaultInstance().getIpv4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv6() {
            this.bitField0_ &= -5;
            this.ipv6_ = getDefaultInstance().getIpv6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static IPInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IPInfo parseDelimitedFrom(InputStream inputStream) {
            return (IPInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IPInfo parseFrom(ByteBuffer byteBuffer) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IPInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ipv4_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv4Bytes(k kVar) {
            this.ipv4_ = kVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.ipv6_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6Bytes(k kVar) {
            this.ipv6_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i15) {
            this.bitField0_ |= 1;
            this.type_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "ipv4_", "ipv6_"});
                case 3:
                    return new IPInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IPInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IPInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public String getIpv4() {
            return this.ipv4_;
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public k getIpv4Bytes() {
            return k.k(this.ipv4_);
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public String getIpv6() {
            return this.ipv6_;
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public k getIpv6Bytes() {
            return k.k(this.ipv6_);
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public boolean hasIpv4() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public boolean hasIpv6() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IPInfoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IPInfo iPInfo) {
            return DEFAULT_INSTANCE.createBuilder(iPInfo);
        }

        public static IPInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IPInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IPInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IPInfo parseFrom(k kVar) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IPInfo parseFrom(k kVar, a0 a0Var) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IPInfo parseFrom(byte[] bArr) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IPInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IPInfo parseFrom(InputStream inputStream) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IPInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IPInfo parseFrom(l lVar) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IPInfo parseFrom(l lVar, a0 a0Var) {
            return (IPInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IPInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getIpv4();

        k getIpv4Bytes();

        String getIpv6();

        k getIpv6Bytes();

        int getType();

        boolean hasIpv4();

        boolean hasIpv6();

        boolean hasType();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkAddMsgCmd extends l0<IlinkAddMsgCmd, Builder> implements IlinkAddMsgCmdOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 6;
        public static final int CREATETIME_FIELD_NUMBER = 9;
        private static final IlinkAddMsgCmd DEFAULT_INSTANCE;
        public static final int FROMUSERNAME_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MSGTYPE_FIELD_NUMBER = 5;
        private static volatile w1<IlinkAddMsgCmd> PARSER = null;
        public static final int PUSHCONTENT_FIELD_NUMBER = 7;
        public static final int ROOMNAME_FIELD_NUMBER = 4;
        public static final int SEQ_FIELD_NUMBER = 8;
        public static final int STATUS_FIELD_NUMBER = 10;
        public static final int TOUSERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private long createTime_;
        private long id_;
        private int msgType_;
        private long seq_;
        private long status_;
        private String fromUsername_ = "";
        private String toUsername_ = "";
        private String roomName_ = "";
        private String content_ = "";
        private String pushContent_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkAddMsgCmd, Builder> implements IlinkAddMsgCmdOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearContent();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearMsgType();
                return this;
            }

            public Builder clearPushContent() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearPushContent();
                return this;
            }

            public Builder clearRoomName() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearRoomName();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearSeq();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearStatus();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearToUsername();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public String getContent() {
                return ((IlinkAddMsgCmd) this.instance).getContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public k getContentBytes() {
                return ((IlinkAddMsgCmd) this.instance).getContentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public long getCreateTime() {
                return ((IlinkAddMsgCmd) this.instance).getCreateTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public String getFromUsername() {
                return ((IlinkAddMsgCmd) this.instance).getFromUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public k getFromUsernameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getFromUsernameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public long getId() {
                return ((IlinkAddMsgCmd) this.instance).getId();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public int getMsgType() {
                return ((IlinkAddMsgCmd) this.instance).getMsgType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public String getPushContent() {
                return ((IlinkAddMsgCmd) this.instance).getPushContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public k getPushContentBytes() {
                return ((IlinkAddMsgCmd) this.instance).getPushContentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public String getRoomName() {
                return ((IlinkAddMsgCmd) this.instance).getRoomName();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public k getRoomNameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getRoomNameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public long getSeq() {
                return ((IlinkAddMsgCmd) this.instance).getSeq();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public long getStatus() {
                return ((IlinkAddMsgCmd) this.instance).getStatus();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public String getToUsername() {
                return ((IlinkAddMsgCmd) this.instance).getToUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public k getToUsernameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getToUsernameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasContent() {
                return ((IlinkAddMsgCmd) this.instance).hasContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasCreateTime() {
                return ((IlinkAddMsgCmd) this.instance).hasCreateTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasFromUsername() {
                return ((IlinkAddMsgCmd) this.instance).hasFromUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasId() {
                return ((IlinkAddMsgCmd) this.instance).hasId();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasMsgType() {
                return ((IlinkAddMsgCmd) this.instance).hasMsgType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasPushContent() {
                return ((IlinkAddMsgCmd) this.instance).hasPushContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasRoomName() {
                return ((IlinkAddMsgCmd) this.instance).hasRoomName();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasSeq() {
                return ((IlinkAddMsgCmd) this.instance).hasSeq();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasStatus() {
                return ((IlinkAddMsgCmd) this.instance).hasStatus();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
            public boolean hasToUsername() {
                return ((IlinkAddMsgCmd) this.instance).hasToUsername();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setContentBytes(kVar);
                return this;
            }

            public Builder setCreateTime(long j15) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setCreateTime(j15);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setId(long j15) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setId(j15);
                return this;
            }

            public Builder setMsgType(int i15) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setMsgType(i15);
                return this;
            }

            public Builder setPushContent(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setPushContent(str);
                return this;
            }

            public Builder setPushContentBytes(k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setPushContentBytes(kVar);
                return this;
            }

            public Builder setRoomName(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setRoomName(str);
                return this;
            }

            public Builder setRoomNameBytes(k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setRoomNameBytes(kVar);
                return this;
            }

            public Builder setSeq(long j15) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setSeq(j15);
                return this;
            }

            public Builder setStatus(long j15) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setStatus(j15);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkAddMsgCmd.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAddMsgCmd ilinkAddMsgCmd = new IlinkAddMsgCmd();
            DEFAULT_INSTANCE = ilinkAddMsgCmd;
            l0.registerDefaultInstance(IlinkAddMsgCmd.class, ilinkAddMsgCmd);
        }

        private IlinkAddMsgCmd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -33;
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTime() {
            this.bitField0_ &= -257;
            this.createTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -3;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -17;
            this.msgType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPushContent() {
            this.bitField0_ &= -65;
            this.pushContent_ = getDefaultInstance().getPushContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomName() {
            this.bitField0_ &= -9;
            this.roomName_ = getDefaultInstance().getRoomName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.bitField0_ &= -129;
            this.seq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -513;
            this.status_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -5;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        public static IlinkAddMsgCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAddMsgCmd parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAddMsgCmd) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAddMsgCmd parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkAddMsgCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.content_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(k kVar) {
            this.content_ = kVar.u();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTime(long j15) {
            this.bitField0_ |= 256;
            this.createTime_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fromUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUsernameBytes(k kVar) {
            this.fromUsername_ = kVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j15) {
            this.bitField0_ |= 1;
            this.id_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(int i15) {
            this.bitField0_ |= 16;
            this.msgType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPushContent(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.pushContent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPushContentBytes(k kVar) {
            this.pushContent_ = kVar.u();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.roomName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomNameBytes(k kVar) {
            this.roomName_ = kVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(long j15) {
            this.bitField0_ |= 128;
            this.seq_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(long j15) {
            this.bitField0_ |= 512;
            this.status_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUsername(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.toUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUsernameBytes(k kVar) {
            this.toUsername_ = kVar.u();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဃ\u0007\tဃ\b\nဃ\t", new Object[]{"bitField0_", "id_", "fromUsername_", "toUsername_", "roomName_", "msgType_", "content_", "pushContent_", "seq_", "createTime_", "status_"});
                case 3:
                    return new IlinkAddMsgCmd();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkAddMsgCmd> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAddMsgCmd.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public k getContentBytes() {
            return k.k(this.content_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public String getFromUsername() {
            return this.fromUsername_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public k getFromUsernameBytes() {
            return k.k(this.fromUsername_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public int getMsgType() {
            return this.msgType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public String getPushContent() {
            return this.pushContent_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public k getPushContentBytes() {
            return k.k(this.pushContent_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public String getRoomName() {
            return this.roomName_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public k getRoomNameBytes() {
            return k.k(this.roomName_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public long getStatus() {
            return this.status_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public String getToUsername() {
            return this.toUsername_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public k getToUsernameBytes() {
            return k.k(this.toUsername_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasCreateTime() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasFromUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasMsgType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasPushContent() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasRoomName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasSeq() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAddMsgCmdOrBuilder
        public boolean hasToUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkAddMsgCmd ilinkAddMsgCmd) {
            return DEFAULT_INSTANCE.createBuilder(ilinkAddMsgCmd);
        }

        public static IlinkAddMsgCmd parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(k kVar) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAddMsgCmd parseFrom(k kVar, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(byte[] bArr) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAddMsgCmd parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(InputStream inputStream) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAddMsgCmd parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(l lVar) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAddMsgCmd parseFrom(l lVar, a0 a0Var) {
            return (IlinkAddMsgCmd) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkAddMsgCmdOrBuilder extends k1 {
        String getContent();

        k getContentBytes();

        long getCreateTime();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getFromUsername();

        k getFromUsernameBytes();

        long getId();

        int getMsgType();

        String getPushContent();

        k getPushContentBytes();

        String getRoomName();

        k getRoomNameBytes();

        long getSeq();

        long getStatus();

        String getToUsername();

        k getToUsernameBytes();

        boolean hasContent();

        boolean hasCreateTime();

        boolean hasFromUsername();

        boolean hasId();

        boolean hasMsgType();

        boolean hasPushContent();

        boolean hasRoomName();

        boolean hasSeq();

        boolean hasStatus();

        boolean hasToUsername();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkAppAuthClientInfo extends l0<IlinkAppAuthClientInfo, Builder> implements IlinkAppAuthClientInfoOrBuilder {
        private static final IlinkAppAuthClientInfo DEFAULT_INSTANCE;
        public static final int HOST_LIST_FIELD_NUMBER = 1;
        private static volatile w1<IlinkAppAuthClientInfo> PARSER;
        private o0.j<HostInfo> hostList_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkAppAuthClientInfo, Builder> implements IlinkAppAuthClientInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllHostList(Iterable<? extends HostInfo> iterable) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addAllHostList(iterable);
                return this;
            }

            public Builder addHostList(HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(hostInfo);
                return this;
            }

            public Builder clearHostList() {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).clearHostList();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
            public HostInfo getHostList(int i15) {
                return ((IlinkAppAuthClientInfo) this.instance).getHostList(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
            public int getHostListCount() {
                return ((IlinkAppAuthClientInfo) this.instance).getHostListCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
            public List<HostInfo> getHostListList() {
                return Collections.unmodifiableList(((IlinkAppAuthClientInfo) this.instance).getHostListList());
            }

            public Builder removeHostList(int i15) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).removeHostList(i15);
                return this;
            }

            public Builder setHostList(int i15, HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).setHostList(i15, hostInfo);
                return this;
            }

            private Builder() {
                super(IlinkAppAuthClientInfo.DEFAULT_INSTANCE);
            }

            public Builder addHostList(int i15, HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(i15, hostInfo);
                return this;
            }

            public Builder setHostList(int i15, HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).setHostList(i15, builder.build());
                return this;
            }

            public Builder addHostList(HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(builder.build());
                return this;
            }

            public Builder addHostList(int i15, HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(i15, builder.build());
                return this;
            }
        }

        static {
            IlinkAppAuthClientInfo ilinkAppAuthClientInfo = new IlinkAppAuthClientInfo();
            DEFAULT_INSTANCE = ilinkAppAuthClientInfo;
            l0.registerDefaultInstance(IlinkAppAuthClientInfo.class, ilinkAppAuthClientInfo);
        }

        private IlinkAppAuthClientInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllHostList(Iterable<? extends HostInfo> iterable) {
            ensureHostListIsMutable();
            b.addAll((Iterable) iterable, (List) this.hostList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHostList(HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.add(hostInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHostList() {
            this.hostList_ = l0.emptyProtobufList();
        }

        private void ensureHostListIsMutable() {
            o0.j<HostInfo> jVar = this.hostList_;
            if (jVar.Q()) {
                return;
            }
            this.hostList_ = l0.mutableCopy(jVar);
        }

        public static IlinkAppAuthClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppAuthClientInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppAuthClientInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppAuthClientInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkAppAuthClientInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeHostList(int i15) {
            ensureHostListIsMutable();
            this.hostList_.remove(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostList(int i15, HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.set(i15, hostInfo);
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hostList_", HostInfo.class});
                case 3:
                    return new IlinkAppAuthClientInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkAppAuthClientInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppAuthClientInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
        public HostInfo getHostList(int i15) {
            return this.hostList_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
        public int getHostListCount() {
            return this.hostList_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppAuthClientInfoOrBuilder
        public List<HostInfo> getHostListList() {
            return this.hostList_;
        }

        public HostInfoOrBuilder getHostListOrBuilder(int i15) {
            return this.hostList_.get(i15);
        }

        public List<? extends HostInfoOrBuilder> getHostListOrBuilderList() {
            return this.hostList_;
        }

        public static Builder newBuilder(IlinkAppAuthClientInfo ilinkAppAuthClientInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkAppAuthClientInfo);
        }

        public static IlinkAppAuthClientInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(k kVar) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addHostList(int i15, HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.add(i15, hostInfo);
        }

        public static IlinkAppAuthClientInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(byte[] bArr) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppAuthClientInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(InputStream inputStream) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppAuthClientInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(l lVar) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppAuthClientInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkAppAuthClientInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkAppAuthClientInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        HostInfo getHostList(int i15);

        int getHostListCount();

        List<HostInfo> getHostListList();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkAppAuthFlag implements o0.c {
        kIlinkAppNoSessionEncrypt(1);
        
        private static final o0.d<IlinkAppAuthFlag> internalValueMap = new o0.d<IlinkAppAuthFlag>() { // from class: com.tencent.ilink.network.Proto.IlinkAppAuthFlag.1
            @Override // com.google.protobuf.o0.d
            public IlinkAppAuthFlag findValueByNumber(int i15) {
                return IlinkAppAuthFlag.forNumber(i15);
            }
        };
        public static final int kIlinkAppNoSessionEncrypt_VALUE = 1;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkAppAuthFlagVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkAppAuthFlagVerifier();

            private IlinkAppAuthFlagVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkAppAuthFlag.forNumber(i15) != null;
            }
        }

        IlinkAppAuthFlag(int i15) {
            this.value = i15;
        }

        public static IlinkAppAuthFlag forNumber(int i15) {
            if (i15 != 1) {
                return null;
            }
            return kIlinkAppNoSessionEncrypt;
        }

        public static o0.d<IlinkAppAuthFlag> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkAppAuthFlagVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkAppAuthFlag valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkAppCommSessionInfo extends l0<IlinkAppCommSessionInfo, Builder> implements IlinkAppCommSessionInfoOrBuilder {
        public static final int AUTH_FLAG_FIELD_NUMBER = 6;
        public static final int AUTOAUTH_ENC_KEY_FIELD_NUMBER = 3;
        public static final int CLIENT_SESSION_KEY_FIELD_NUMBER = 1;
        private static final IlinkAppCommSessionInfo DEFAULT_INSTANCE;
        private static volatile w1<IlinkAppCommSessionInfo> PARSER = null;
        public static final int SERVERID_FIELD_NUMBER = 5;
        public static final int SERVER_SESSION_KEY_FIELD_NUMBER = 2;
        public static final int UIN_FIELD_NUMBER = 4;
        private int authFlag_;
        private k autoauthEncKey_;
        private int bitField0_;
        private k clientSessionKey_;
        private k serverSessionKey_;
        private k serverid_;
        private long uin_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkAppCommSessionInfo, Builder> implements IlinkAppCommSessionInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAuthFlag() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearAuthFlag();
                return this;
            }

            public Builder clearAutoauthEncKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearAutoauthEncKey();
                return this;
            }

            public Builder clearClientSessionKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearClientSessionKey();
                return this;
            }

            public Builder clearServerSessionKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearServerSessionKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearUin();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public IlinkAppAuthFlag getAuthFlag() {
                return ((IlinkAppCommSessionInfo) this.instance).getAuthFlag();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public k getAutoauthEncKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getAutoauthEncKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public k getClientSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getClientSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public k getServerSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getServerSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public k getServerid() {
                return ((IlinkAppCommSessionInfo) this.instance).getServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public long getUin() {
                return ((IlinkAppCommSessionInfo) this.instance).getUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasAuthFlag() {
                return ((IlinkAppCommSessionInfo) this.instance).hasAuthFlag();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasAutoauthEncKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasAutoauthEncKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasClientSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasClientSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasServerSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasServerSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasServerid() {
                return ((IlinkAppCommSessionInfo) this.instance).hasServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
            public boolean hasUin() {
                return ((IlinkAppCommSessionInfo) this.instance).hasUin();
            }

            public Builder setAuthFlag(IlinkAppAuthFlag ilinkAppAuthFlag) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setAuthFlag(ilinkAppAuthFlag);
                return this;
            }

            public Builder setAutoauthEncKey(k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setAutoauthEncKey(kVar);
                return this;
            }

            public Builder setClientSessionKey(k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setClientSessionKey(kVar);
                return this;
            }

            public Builder setServerSessionKey(k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setServerSessionKey(kVar);
                return this;
            }

            public Builder setServerid(k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setUin(long j15) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setUin(j15);
                return this;
            }

            private Builder() {
                super(IlinkAppCommSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppCommSessionInfo ilinkAppCommSessionInfo = new IlinkAppCommSessionInfo();
            DEFAULT_INSTANCE = ilinkAppCommSessionInfo;
            l0.registerDefaultInstance(IlinkAppCommSessionInfo.class, ilinkAppCommSessionInfo);
        }

        private IlinkAppCommSessionInfo() {
            k kVar = k.f21365e;
            this.clientSessionKey_ = kVar;
            this.serverSessionKey_ = kVar;
            this.autoauthEncKey_ = kVar;
            this.serverid_ = kVar;
            this.authFlag_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthFlag() {
            this.bitField0_ &= -33;
            this.authFlag_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoauthEncKey() {
            this.bitField0_ &= -5;
            this.autoauthEncKey_ = getDefaultInstance().getAutoauthEncKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientSessionKey() {
            this.bitField0_ &= -2;
            this.clientSessionKey_ = getDefaultInstance().getClientSessionKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerSessionKey() {
            this.bitField0_ &= -3;
            this.serverSessionKey_ = getDefaultInstance().getServerSessionKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -17;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -9;
            this.uin_ = 0L;
        }

        public static IlinkAppCommSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppCommSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppCommSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppCommSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkAppCommSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthFlag(IlinkAppAuthFlag ilinkAppAuthFlag) {
            this.authFlag_ = ilinkAppAuthFlag.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoauthEncKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.autoauthEncKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientSessionKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.clientSessionKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerSessionKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.serverSessionKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.serverid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUin(long j15) {
            this.bitField0_ |= 8;
            this.uin_ = j15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ည\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "clientSessionKey_", "serverSessionKey_", "autoauthEncKey_", "uin_", "serverid_", "authFlag_", IlinkAppAuthFlag.internalGetVerifier()});
                case 3:
                    return new IlinkAppCommSessionInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkAppCommSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppCommSessionInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public IlinkAppAuthFlag getAuthFlag() {
            IlinkAppAuthFlag forNumber = IlinkAppAuthFlag.forNumber(this.authFlag_);
            return forNumber == null ? IlinkAppAuthFlag.kIlinkAppNoSessionEncrypt : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public k getAutoauthEncKey() {
            return this.autoauthEncKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public k getClientSessionKey() {
            return this.clientSessionKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public k getServerSessionKey() {
            return this.serverSessionKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public k getServerid() {
            return this.serverid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public long getUin() {
            return this.uin_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasAuthFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasAutoauthEncKey() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasClientSessionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasServerSessionKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasServerid() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppCommSessionInfoOrBuilder
        public boolean hasUin() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkAppCommSessionInfo ilinkAppCommSessionInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkAppCommSessionInfo);
        }

        public static IlinkAppCommSessionInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(k kVar) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppCommSessionInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(byte[] bArr) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppCommSessionInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppCommSessionInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(l lVar) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppCommSessionInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkAppCommSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkAppCommSessionInfoOrBuilder extends k1 {
        IlinkAppAuthFlag getAuthFlag();

        k getAutoauthEncKey();

        k getClientSessionKey();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        k getServerSessionKey();

        k getServerid();

        long getUin();

        boolean hasAuthFlag();

        boolean hasAutoauthEncKey();

        boolean hasClientSessionKey();

        boolean hasServerSessionKey();

        boolean hasServerid();

        boolean hasUin();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkAppGetSessionInfo extends l0<IlinkAppGetSessionInfo, Builder> implements IlinkAppGetSessionInfoOrBuilder {
        public static final int CLIENT_SESSION_KEY_FIELD_NUMBER = 3;
        public static final int COOKIE_FIELD_NUMBER = 6;
        private static final IlinkAppGetSessionInfo DEFAULT_INSTANCE;
        private static volatile w1<IlinkAppGetSessionInfo> PARSER = null;
        public static final int REAL_UIN_FIELD_NUMBER = 1;
        public static final int SERVERID_FIELD_NUMBER = 5;
        public static final int SERVER_SESSION_KEY_FIELD_NUMBER = 4;
        public static final int SHOW_UIN_FIELD_NUMBER = 2;
        private int bitField0_;
        private k clientSessionKey_;
        private k cookie_;
        private long realUin_;
        private k serverSessionKey_;
        private k serverid_;
        private long showUin_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkAppGetSessionInfo, Builder> implements IlinkAppGetSessionInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearClientSessionKey() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearClientSessionKey();
                return this;
            }

            public Builder clearCookie() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearCookie();
                return this;
            }

            public Builder clearRealUin() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearRealUin();
                return this;
            }

            public Builder clearServerSessionKey() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearServerSessionKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearShowUin() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearShowUin();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public k getClientSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).getClientSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public k getCookie() {
                return ((IlinkAppGetSessionInfo) this.instance).getCookie();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public long getRealUin() {
                return ((IlinkAppGetSessionInfo) this.instance).getRealUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public k getServerSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).getServerSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public k getServerid() {
                return ((IlinkAppGetSessionInfo) this.instance).getServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public long getShowUin() {
                return ((IlinkAppGetSessionInfo) this.instance).getShowUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasClientSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).hasClientSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasCookie() {
                return ((IlinkAppGetSessionInfo) this.instance).hasCookie();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasRealUin() {
                return ((IlinkAppGetSessionInfo) this.instance).hasRealUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasServerSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).hasServerSessionKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasServerid() {
                return ((IlinkAppGetSessionInfo) this.instance).hasServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
            public boolean hasShowUin() {
                return ((IlinkAppGetSessionInfo) this.instance).hasShowUin();
            }

            public Builder setClientSessionKey(k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setClientSessionKey(kVar);
                return this;
            }

            public Builder setCookie(k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setCookie(kVar);
                return this;
            }

            public Builder setRealUin(long j15) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setRealUin(j15);
                return this;
            }

            public Builder setServerSessionKey(k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setServerSessionKey(kVar);
                return this;
            }

            public Builder setServerid(k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setShowUin(long j15) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setShowUin(j15);
                return this;
            }

            private Builder() {
                super(IlinkAppGetSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppGetSessionInfo ilinkAppGetSessionInfo = new IlinkAppGetSessionInfo();
            DEFAULT_INSTANCE = ilinkAppGetSessionInfo;
            l0.registerDefaultInstance(IlinkAppGetSessionInfo.class, ilinkAppGetSessionInfo);
        }

        private IlinkAppGetSessionInfo() {
            k kVar = k.f21365e;
            this.clientSessionKey_ = kVar;
            this.serverSessionKey_ = kVar;
            this.serverid_ = kVar;
            this.cookie_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientSessionKey() {
            this.bitField0_ &= -5;
            this.clientSessionKey_ = getDefaultInstance().getClientSessionKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCookie() {
            this.bitField0_ &= -33;
            this.cookie_ = getDefaultInstance().getCookie();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRealUin() {
            this.bitField0_ &= -2;
            this.realUin_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerSessionKey() {
            this.bitField0_ &= -9;
            this.serverSessionKey_ = getDefaultInstance().getServerSessionKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -17;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShowUin() {
            this.bitField0_ &= -3;
            this.showUin_ = 0L;
        }

        public static IlinkAppGetSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppGetSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppGetSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppGetSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkAppGetSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientSessionKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.clientSessionKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCookie(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.cookie_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRealUin(long j15) {
            this.bitField0_ |= 1;
            this.realUin_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerSessionKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.serverSessionKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.serverid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowUin(long j15) {
            this.bitField0_ |= 2;
            this.showUin_ = j15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005", new Object[]{"bitField0_", "realUin_", "showUin_", "clientSessionKey_", "serverSessionKey_", "serverid_", "cookie_"});
                case 3:
                    return new IlinkAppGetSessionInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkAppGetSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppGetSessionInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public k getClientSessionKey() {
            return this.clientSessionKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public k getCookie() {
            return this.cookie_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public long getRealUin() {
            return this.realUin_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public k getServerSessionKey() {
            return this.serverSessionKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public k getServerid() {
            return this.serverid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public long getShowUin() {
            return this.showUin_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasClientSessionKey() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasCookie() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasRealUin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasServerSessionKey() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasServerid() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppGetSessionInfoOrBuilder
        public boolean hasShowUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkAppGetSessionInfo ilinkAppGetSessionInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkAppGetSessionInfo);
        }

        public static IlinkAppGetSessionInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(k kVar) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppGetSessionInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(byte[] bArr) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppGetSessionInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppGetSessionInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(l lVar) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppGetSessionInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkAppGetSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkAppGetSessionInfoOrBuilder extends k1 {
        k getClientSessionKey();

        k getCookie();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        long getRealUin();

        k getServerSessionKey();

        k getServerid();

        long getShowUin();

        boolean hasClientSessionKey();

        boolean hasCookie();

        boolean hasRealUin();

        boolean hasServerSessionKey();

        boolean hasServerid();

        boolean hasShowUin();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkAppLoginInfo extends l0<IlinkAppLoginInfo, Builder> implements IlinkAppLoginInfoOrBuilder {
        public static final int AUTH_CODE_FIELD_NUMBER = 1;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final IlinkAppLoginInfo DEFAULT_INSTANCE;
        private static volatile w1<IlinkAppLoginInfo> PARSER = null;
        public static final int SESSION_MODULE_TYPE_FIELD_NUMBER = 3;
        public static final int SESSION_TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int sessionModuleType_;
        private int sessionType_;
        private k authCode_ = k.f21365e;
        private String clientInfo_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkAppLoginInfo, Builder> implements IlinkAppLoginInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAuthCode() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearAuthCode();
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearClientInfo();
                return this;
            }

            public Builder clearSessionModuleType() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearSessionModuleType();
                return this;
            }

            public Builder clearSessionType() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearSessionType();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public k getAuthCode() {
                return ((IlinkAppLoginInfo) this.instance).getAuthCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public String getClientInfo() {
                return ((IlinkAppLoginInfo) this.instance).getClientInfo();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public k getClientInfoBytes() {
                return ((IlinkAppLoginInfo) this.instance).getClientInfoBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public int getSessionModuleType() {
                return ((IlinkAppLoginInfo) this.instance).getSessionModuleType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public int getSessionType() {
                return ((IlinkAppLoginInfo) this.instance).getSessionType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public boolean hasAuthCode() {
                return ((IlinkAppLoginInfo) this.instance).hasAuthCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public boolean hasClientInfo() {
                return ((IlinkAppLoginInfo) this.instance).hasClientInfo();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public boolean hasSessionModuleType() {
                return ((IlinkAppLoginInfo) this.instance).hasSessionModuleType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
            public boolean hasSessionType() {
                return ((IlinkAppLoginInfo) this.instance).hasSessionType();
            }

            public Builder setAuthCode(k kVar) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setAuthCode(kVar);
                return this;
            }

            public Builder setClientInfo(String str) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setClientInfo(str);
                return this;
            }

            public Builder setClientInfoBytes(k kVar) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setClientInfoBytes(kVar);
                return this;
            }

            public Builder setSessionModuleType(int i15) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setSessionModuleType(i15);
                return this;
            }

            public Builder setSessionType(int i15) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setSessionType(i15);
                return this;
            }

            private Builder() {
                super(IlinkAppLoginInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppLoginInfo ilinkAppLoginInfo = new IlinkAppLoginInfo();
            DEFAULT_INSTANCE = ilinkAppLoginInfo;
            l0.registerDefaultInstance(IlinkAppLoginInfo.class, ilinkAppLoginInfo);
        }

        private IlinkAppLoginInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuthCode() {
            this.bitField0_ &= -2;
            this.authCode_ = getDefaultInstance().getAuthCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientInfo() {
            this.bitField0_ &= -9;
            this.clientInfo_ = getDefaultInstance().getClientInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionModuleType() {
            this.bitField0_ &= -5;
            this.sessionModuleType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionType() {
            this.bitField0_ &= -3;
            this.sessionType_ = 0;
        }

        public static IlinkAppLoginInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppLoginInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppLoginInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppLoginInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkAppLoginInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuthCode(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.authCode_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.clientInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientInfoBytes(k kVar) {
            this.clientInfo_ = kVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionModuleType(int i15) {
            this.bitField0_ |= 4;
            this.sessionModuleType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionType(int i15) {
            this.bitField0_ |= 2;
            this.sessionType_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "authCode_", "sessionType_", "sessionModuleType_", "clientInfo_"});
                case 3:
                    return new IlinkAppLoginInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkAppLoginInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppLoginInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public k getAuthCode() {
            return this.authCode_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public String getClientInfo() {
            return this.clientInfo_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public k getClientInfoBytes() {
            return k.k(this.clientInfo_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public int getSessionModuleType() {
            return this.sessionModuleType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public int getSessionType() {
            return this.sessionType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public boolean hasAuthCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public boolean hasClientInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public boolean hasSessionModuleType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkAppLoginInfoOrBuilder
        public boolean hasSessionType() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkAppLoginInfo ilinkAppLoginInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkAppLoginInfo);
        }

        public static IlinkAppLoginInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(k kVar) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppLoginInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(byte[] bArr) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppLoginInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(InputStream inputStream) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppLoginInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(l lVar) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppLoginInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkAppLoginInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkAppLoginInfoOrBuilder extends k1 {
        k getAuthCode();

        String getClientInfo();

        k getClientInfoBytes();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        int getSessionModuleType();

        int getSessionType();

        boolean hasAuthCode();

        boolean hasClientInfo();

        boolean hasSessionModuleType();

        boolean hasSessionType();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkAppSessionType implements o0.c {
        kIlinkAppNoneLogin(0),
        kIlinkAppFaceLogin(1),
        kIlinkAppQrcodeLogin(2),
        kIlinkAppImLogin(3),
        kIlinkAppGetSession(4),
        kIlinkApp3rdAppAuth(5),
        kIlinkAppOAuthLogin(6),
        kIlinkAppVisitorLogin(7),
        kIlinkAppCloudLogin(8);
        
        private static final o0.d<IlinkAppSessionType> internalValueMap = new o0.d<IlinkAppSessionType>() { // from class: com.tencent.ilink.network.Proto.IlinkAppSessionType.1
            @Override // com.google.protobuf.o0.d
            public IlinkAppSessionType findValueByNumber(int i15) {
                return IlinkAppSessionType.forNumber(i15);
            }
        };
        public static final int kIlinkApp3rdAppAuth_VALUE = 5;
        public static final int kIlinkAppCloudLogin_VALUE = 8;
        public static final int kIlinkAppFaceLogin_VALUE = 1;
        public static final int kIlinkAppGetSession_VALUE = 4;
        public static final int kIlinkAppImLogin_VALUE = 3;
        public static final int kIlinkAppNoneLogin_VALUE = 0;
        public static final int kIlinkAppOAuthLogin_VALUE = 6;
        public static final int kIlinkAppQrcodeLogin_VALUE = 2;
        public static final int kIlinkAppVisitorLogin_VALUE = 7;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkAppSessionTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkAppSessionTypeVerifier();

            private IlinkAppSessionTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkAppSessionType.forNumber(i15) != null;
            }
        }

        IlinkAppSessionType(int i15) {
            this.value = i15;
        }

        public static IlinkAppSessionType forNumber(int i15) {
            switch (i15) {
                case 0:
                    return kIlinkAppNoneLogin;
                case 1:
                    return kIlinkAppFaceLogin;
                case 2:
                    return kIlinkAppQrcodeLogin;
                case 3:
                    return kIlinkAppImLogin;
                case 4:
                    return kIlinkAppGetSession;
                case 5:
                    return kIlinkApp3rdAppAuth;
                case 6:
                    return kIlinkAppOAuthLogin;
                case 7:
                    return kIlinkAppVisitorLogin;
                case 8:
                    return kIlinkAppCloudLogin;
                default:
                    return null;
            }
        }

        public static o0.d<IlinkAppSessionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkAppSessionTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkAppSessionType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkBypassMsgItem extends l0<IlinkBypassMsgItem, Builder> implements IlinkBypassMsgItemOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 5;
        public static final int CREATETIME_FIELD_NUMBER = 6;
        private static final IlinkBypassMsgItem DEFAULT_INSTANCE;
        public static final int FROM_USERNAME_FIELD_NUMBER = 2;
        public static final int MSGID_FIELD_NUMBER = 1;
        public static final int MSG_SESSION_ID_FIELD_NUMBER = 8;
        public static final int MSG_TYPE_FIELD_NUMBER = 4;
        private static volatile w1<IlinkBypassMsgItem> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 7;
        public static final int TO_USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private long createtime_;
        private int msgType_;
        private long msgid_;
        private long seq_;
        private String fromUsername_ = "";
        private String toUsername_ = "";
        private k content_ = k.f21365e;
        private String msgSessionId_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkBypassMsgItem, Builder> implements IlinkBypassMsgItemOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearContent();
                return this;
            }

            public Builder clearCreatetime() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearCreatetime();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearMsgSessionId() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgSessionId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgType();
                return this;
            }

            public Builder clearMsgid() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgid();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearSeq();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearToUsername();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public k getContent() {
                return ((IlinkBypassMsgItem) this.instance).getContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public long getCreatetime() {
                return ((IlinkBypassMsgItem) this.instance).getCreatetime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public String getFromUsername() {
                return ((IlinkBypassMsgItem) this.instance).getFromUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public k getFromUsernameBytes() {
                return ((IlinkBypassMsgItem) this.instance).getFromUsernameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public String getMsgSessionId() {
                return ((IlinkBypassMsgItem) this.instance).getMsgSessionId();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public k getMsgSessionIdBytes() {
                return ((IlinkBypassMsgItem) this.instance).getMsgSessionIdBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public int getMsgType() {
                return ((IlinkBypassMsgItem) this.instance).getMsgType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public long getMsgid() {
                return ((IlinkBypassMsgItem) this.instance).getMsgid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public long getSeq() {
                return ((IlinkBypassMsgItem) this.instance).getSeq();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public String getToUsername() {
                return ((IlinkBypassMsgItem) this.instance).getToUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public k getToUsernameBytes() {
                return ((IlinkBypassMsgItem) this.instance).getToUsernameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasContent() {
                return ((IlinkBypassMsgItem) this.instance).hasContent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasCreatetime() {
                return ((IlinkBypassMsgItem) this.instance).hasCreatetime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasFromUsername() {
                return ((IlinkBypassMsgItem) this.instance).hasFromUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasMsgSessionId() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgSessionId();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasMsgType() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasMsgid() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasSeq() {
                return ((IlinkBypassMsgItem) this.instance).hasSeq();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
            public boolean hasToUsername() {
                return ((IlinkBypassMsgItem) this.instance).hasToUsername();
            }

            public Builder setContent(k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setContent(kVar);
                return this;
            }

            public Builder setCreatetime(long j15) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setCreatetime(j15);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setMsgSessionId(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgSessionId(str);
                return this;
            }

            public Builder setMsgSessionIdBytes(k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgSessionIdBytes(kVar);
                return this;
            }

            public Builder setMsgType(int i15) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgType(i15);
                return this;
            }

            public Builder setMsgid(long j15) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgid(j15);
                return this;
            }

            public Builder setSeq(long j15) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setSeq(j15);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkBypassMsgItem.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkBypassMsgItem ilinkBypassMsgItem = new IlinkBypassMsgItem();
            DEFAULT_INSTANCE = ilinkBypassMsgItem;
            l0.registerDefaultInstance(IlinkBypassMsgItem.class, ilinkBypassMsgItem);
        }

        private IlinkBypassMsgItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -17;
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreatetime() {
            this.bitField0_ &= -33;
            this.createtime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -3;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgSessionId() {
            this.bitField0_ &= -129;
            this.msgSessionId_ = getDefaultInstance().getMsgSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -9;
            this.msgType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgid() {
            this.bitField0_ &= -2;
            this.msgid_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeq() {
            this.bitField0_ &= -65;
            this.seq_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -5;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        public static IlinkBypassMsgItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkBypassMsgItem parseDelimitedFrom(InputStream inputStream) {
            return (IlinkBypassMsgItem) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgItem parseFrom(ByteBuffer byteBuffer) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkBypassMsgItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.content_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreatetime(long j15) {
            this.bitField0_ |= 32;
            this.createtime_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fromUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFromUsernameBytes(k kVar) {
            this.fromUsername_ = kVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.msgSessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgSessionIdBytes(k kVar) {
            this.msgSessionId_ = kVar.u();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgType(int i15) {
            this.bitField0_ |= 8;
            this.msgType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgid(long j15) {
            this.bitField0_ |= 1;
            this.msgid_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeq(long j15) {
            this.bitField0_ |= 64;
            this.seq_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUsername(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.toUsername_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToUsernameBytes(k kVar) {
            this.toUsername_ = kVar.u();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ည\u0004\u0006ဃ\u0005\u0007ဃ\u0006\bဈ\u0007", new Object[]{"bitField0_", "msgid_", "fromUsername_", "toUsername_", "msgType_", "content_", "createtime_", "seq_", "msgSessionId_"});
                case 3:
                    return new IlinkBypassMsgItem();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkBypassMsgItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkBypassMsgItem.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public k getContent() {
            return this.content_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public long getCreatetime() {
            return this.createtime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public String getFromUsername() {
            return this.fromUsername_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public k getFromUsernameBytes() {
            return k.k(this.fromUsername_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public String getMsgSessionId() {
            return this.msgSessionId_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public k getMsgSessionIdBytes() {
            return k.k(this.msgSessionId_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public int getMsgType() {
            return this.msgType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public long getMsgid() {
            return this.msgid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public long getSeq() {
            return this.seq_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public String getToUsername() {
            return this.toUsername_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public k getToUsernameBytes() {
            return k.k(this.toUsername_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasCreatetime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasFromUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasMsgSessionId() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasMsgType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasMsgid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasSeq() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgItemOrBuilder
        public boolean hasToUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkBypassMsgItem ilinkBypassMsgItem) {
            return DEFAULT_INSTANCE.createBuilder(ilinkBypassMsgItem);
        }

        public static IlinkBypassMsgItem parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(k kVar) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkBypassMsgItem parseFrom(k kVar, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(byte[] bArr) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkBypassMsgItem parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(InputStream inputStream) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgItem parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(l lVar) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkBypassMsgItem parseFrom(l lVar, a0 a0Var) {
            return (IlinkBypassMsgItem) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkBypassMsgItemOrBuilder extends k1 {
        k getContent();

        long getCreatetime();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getFromUsername();

        k getFromUsernameBytes();

        String getMsgSessionId();

        k getMsgSessionIdBytes();

        int getMsgType();

        long getMsgid();

        long getSeq();

        String getToUsername();

        k getToUsernameBytes();

        boolean hasContent();

        boolean hasCreatetime();

        boolean hasFromUsername();

        boolean hasMsgSessionId();

        boolean hasMsgType();

        boolean hasMsgid();

        boolean hasSeq();

        boolean hasToUsername();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkBypassMsgList extends l0<IlinkBypassMsgList, Builder> implements IlinkBypassMsgListOrBuilder {
        private static final IlinkBypassMsgList DEFAULT_INSTANCE;
        public static final int MSGITEMS_FIELD_NUMBER = 1;
        private static volatile w1<IlinkBypassMsgList> PARSER;
        private o0.j<IlinkBypassMsgItem> msgitems_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkBypassMsgList, Builder> implements IlinkBypassMsgListOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMsgitems(Iterable<? extends IlinkBypassMsgItem> iterable) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addAllMsgitems(iterable);
                return this;
            }

            public Builder addMsgitems(IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(ilinkBypassMsgItem);
                return this;
            }

            public Builder clearMsgitems() {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).clearMsgitems();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
            public IlinkBypassMsgItem getMsgitems(int i15) {
                return ((IlinkBypassMsgList) this.instance).getMsgitems(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
            public int getMsgitemsCount() {
                return ((IlinkBypassMsgList) this.instance).getMsgitemsCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
            public List<IlinkBypassMsgItem> getMsgitemsList() {
                return Collections.unmodifiableList(((IlinkBypassMsgList) this.instance).getMsgitemsList());
            }

            public Builder removeMsgitems(int i15) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).removeMsgitems(i15);
                return this;
            }

            public Builder setMsgitems(int i15, IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).setMsgitems(i15, ilinkBypassMsgItem);
                return this;
            }

            private Builder() {
                super(IlinkBypassMsgList.DEFAULT_INSTANCE);
            }

            public Builder addMsgitems(int i15, IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(i15, ilinkBypassMsgItem);
                return this;
            }

            public Builder setMsgitems(int i15, IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).setMsgitems(i15, builder.build());
                return this;
            }

            public Builder addMsgitems(IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(builder.build());
                return this;
            }

            public Builder addMsgitems(int i15, IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(i15, builder.build());
                return this;
            }
        }

        static {
            IlinkBypassMsgList ilinkBypassMsgList = new IlinkBypassMsgList();
            DEFAULT_INSTANCE = ilinkBypassMsgList;
            l0.registerDefaultInstance(IlinkBypassMsgList.class, ilinkBypassMsgList);
        }

        private IlinkBypassMsgList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMsgitems(Iterable<? extends IlinkBypassMsgItem> iterable) {
            ensureMsgitemsIsMutable();
            b.addAll((Iterable) iterable, (List) this.msgitems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgitems(IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.add(ilinkBypassMsgItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgitems() {
            this.msgitems_ = l0.emptyProtobufList();
        }

        private void ensureMsgitemsIsMutable() {
            o0.j<IlinkBypassMsgItem> jVar = this.msgitems_;
            if (jVar.Q()) {
                return;
            }
            this.msgitems_ = l0.mutableCopy(jVar);
        }

        public static IlinkBypassMsgList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkBypassMsgList parseDelimitedFrom(InputStream inputStream) {
            return (IlinkBypassMsgList) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgList parseFrom(ByteBuffer byteBuffer) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkBypassMsgList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMsgitems(int i15) {
            ensureMsgitemsIsMutable();
            this.msgitems_.remove(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgitems(int i15, IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.set(i15, ilinkBypassMsgItem);
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"msgitems_", IlinkBypassMsgItem.class});
                case 3:
                    return new IlinkBypassMsgList();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkBypassMsgList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkBypassMsgList.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
        public IlinkBypassMsgItem getMsgitems(int i15) {
            return this.msgitems_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
        public int getMsgitemsCount() {
            return this.msgitems_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkBypassMsgListOrBuilder
        public List<IlinkBypassMsgItem> getMsgitemsList() {
            return this.msgitems_;
        }

        public IlinkBypassMsgItemOrBuilder getMsgitemsOrBuilder(int i15) {
            return this.msgitems_.get(i15);
        }

        public List<? extends IlinkBypassMsgItemOrBuilder> getMsgitemsOrBuilderList() {
            return this.msgitems_;
        }

        public static Builder newBuilder(IlinkBypassMsgList ilinkBypassMsgList) {
            return DEFAULT_INSTANCE.createBuilder(ilinkBypassMsgList);
        }

        public static IlinkBypassMsgList parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(k kVar) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMsgitems(int i15, IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.add(i15, ilinkBypassMsgItem);
        }

        public static IlinkBypassMsgList parseFrom(k kVar, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(byte[] bArr) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkBypassMsgList parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(InputStream inputStream) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgList parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(l lVar) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkBypassMsgList parseFrom(l lVar, a0 a0Var) {
            return (IlinkBypassMsgList) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkBypassMsgListOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        IlinkBypassMsgItem getMsgitems(int i15);

        int getMsgitemsCount();

        List<IlinkBypassMsgItem> getMsgitemsList();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkC2CDownload extends l0<IlinkC2CDownload, Builder> implements IlinkC2CDownloadOrBuilder {
        public static final int AESKEY_FIELD_NUMBER = 6;
        private static final IlinkC2CDownload DEFAULT_INSTANCE;
        public static final int FILEID_FIELD_NUMBER = 7;
        public static final int FILE_PATH_FIELD_NUMBER = 3;
        public static final int FILE_SIZE_FIELD_NUMBER = 4;
        public static final int FILE_TYPE_FIELD_NUMBER = 2;
        public static final int FILE_URL_FIELD_NUMBER = 5;
        private static volatile w1<IlinkC2CDownload> PARSER = null;
        public static final int TASK_IDENT_FIELD_NUMBER = 1;
        private k aeskey_;
        private int bitField0_;
        private long fileSize_;
        private int fileType_;
        private k fileid_;
        private String taskIdent_ = "";
        private String filePath_ = "";
        private String fileUrl_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkC2CDownload, Builder> implements IlinkC2CDownloadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAeskey() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearAeskey();
                return this;
            }

            public Builder clearFilePath() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFilePath();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileSize();
                return this;
            }

            public Builder clearFileType() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileType();
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileUrl();
                return this;
            }

            public Builder clearFileid() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileid();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearTaskIdent();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public k getAeskey() {
                return ((IlinkC2CDownload) this.instance).getAeskey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public String getFilePath() {
                return ((IlinkC2CDownload) this.instance).getFilePath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public k getFilePathBytes() {
                return ((IlinkC2CDownload) this.instance).getFilePathBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public long getFileSize() {
                return ((IlinkC2CDownload) this.instance).getFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public int getFileType() {
                return ((IlinkC2CDownload) this.instance).getFileType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public String getFileUrl() {
                return ((IlinkC2CDownload) this.instance).getFileUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public k getFileUrlBytes() {
                return ((IlinkC2CDownload) this.instance).getFileUrlBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public k getFileid() {
                return ((IlinkC2CDownload) this.instance).getFileid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public String getTaskIdent() {
                return ((IlinkC2CDownload) this.instance).getTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public k getTaskIdentBytes() {
                return ((IlinkC2CDownload) this.instance).getTaskIdentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasAeskey() {
                return ((IlinkC2CDownload) this.instance).hasAeskey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasFilePath() {
                return ((IlinkC2CDownload) this.instance).hasFilePath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasFileSize() {
                return ((IlinkC2CDownload) this.instance).hasFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasFileType() {
                return ((IlinkC2CDownload) this.instance).hasFileType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasFileUrl() {
                return ((IlinkC2CDownload) this.instance).hasFileUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasFileid() {
                return ((IlinkC2CDownload) this.instance).hasFileid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
            public boolean hasTaskIdent() {
                return ((IlinkC2CDownload) this.instance).hasTaskIdent();
            }

            public Builder setAeskey(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setAeskey(kVar);
                return this;
            }

            public Builder setFilePath(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFilePath(str);
                return this;
            }

            public Builder setFilePathBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFilePathBytes(kVar);
                return this;
            }

            public Builder setFileSize(long j15) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileSize(j15);
                return this;
            }

            public Builder setFileType(int i15) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileType(i15);
                return this;
            }

            public Builder setFileUrl(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileUrl(str);
                return this;
            }

            public Builder setFileUrlBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileUrlBytes(kVar);
                return this;
            }

            public Builder setFileid(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileid(kVar);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CDownload.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CDownload ilinkC2CDownload = new IlinkC2CDownload();
            DEFAULT_INSTANCE = ilinkC2CDownload;
            l0.registerDefaultInstance(IlinkC2CDownload.class, ilinkC2CDownload);
        }

        private IlinkC2CDownload() {
            k kVar = k.f21365e;
            this.aeskey_ = kVar;
            this.fileid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAeskey() {
            this.bitField0_ &= -33;
            this.aeskey_ = getDefaultInstance().getAeskey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilePath() {
            this.bitField0_ &= -5;
            this.filePath_ = getDefaultInstance().getFilePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -9;
            this.fileSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileType() {
            this.bitField0_ &= -3;
            this.fileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileUrl() {
            this.bitField0_ &= -17;
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileid() {
            this.bitField0_ &= -65;
            this.fileid_ = getDefaultInstance().getFileid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -2;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        public static IlinkC2CDownload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CDownload parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CDownload) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownload parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkC2CDownload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAeskey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.aeskey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilePath(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.filePath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilePathBytes(k kVar) {
            this.filePath_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSize(long j15) {
            this.bitField0_ |= 8;
            this.fileSize_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileType(int i15) {
            this.bitField0_ |= 2;
            this.fileType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrl(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.fileUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrlBytes(k kVar) {
            this.fileUrl_ = kVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.fileid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.taskIdent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdentBytes(k kVar) {
            this.taskIdent_ = kVar.u();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"bitField0_", "taskIdent_", "fileType_", "filePath_", "fileSize_", "fileUrl_", "aeskey_", "fileid_"});
                case 3:
                    return new IlinkC2CDownload();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkC2CDownload> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CDownload.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public k getAeskey() {
            return this.aeskey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public String getFilePath() {
            return this.filePath_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public k getFilePathBytes() {
            return k.k(this.filePath_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public long getFileSize() {
            return this.fileSize_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public int getFileType() {
            return this.fileType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public String getFileUrl() {
            return this.fileUrl_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public k getFileUrlBytes() {
            return k.k(this.fileUrl_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public k getFileid() {
            return this.fileid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public String getTaskIdent() {
            return this.taskIdent_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public k getTaskIdentBytes() {
            return k.k(this.taskIdent_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasAeskey() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasFilePath() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasFileSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasFileType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasFileUrl() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasFileid() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadOrBuilder
        public boolean hasTaskIdent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkC2CDownload ilinkC2CDownload) {
            return DEFAULT_INSTANCE.createBuilder(ilinkC2CDownload);
        }

        public static IlinkC2CDownload parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownload parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CDownload parseFrom(k kVar) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CDownload parseFrom(k kVar, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CDownload parseFrom(byte[] bArr) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CDownload parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CDownload parseFrom(InputStream inputStream) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownload parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownload parseFrom(l lVar) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CDownload parseFrom(l lVar, a0 a0Var) {
            return (IlinkC2CDownload) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkC2CDownloadOrBuilder extends k1 {
        k getAeskey();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getFilePath();

        k getFilePathBytes();

        long getFileSize();

        int getFileType();

        String getFileUrl();

        k getFileUrlBytes();

        k getFileid();

        String getTaskIdent();

        k getTaskIdentBytes();

        boolean hasAeskey();

        boolean hasFilePath();

        boolean hasFileSize();

        boolean hasFileType();

        boolean hasFileUrl();

        boolean hasFileid();

        boolean hasTaskIdent();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkC2CDownloadResult extends l0<IlinkC2CDownloadResult, Builder> implements IlinkC2CDownloadResultOrBuilder {
        private static final IlinkC2CDownloadResult DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 7;
        public static final int EN_QUEUETIME_FIELD_NUMBER = 5;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int FILE_SIZE_FIELD_NUMBER = 3;
        private static volatile w1<IlinkC2CDownloadResult> PARSER = null;
        public static final int RECVED_BYTES_FIELD_NUMBER = 4;
        public static final int START_TIME_FIELD_NUMBER = 6;
        public static final int TASK_IDENT_FIELD_NUMBER = 2;
        private int bitField0_;
        private long enQueuetime_;
        private long endTime_;
        private int errorCode_;
        private long fileSize_;
        private long recvedBytes_;
        private long startTime_;
        private String taskIdent_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkC2CDownloadResult, Builder> implements IlinkC2CDownloadResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEnQueuetime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearEnQueuetime();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearEndTime();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearFileSize();
                return this;
            }

            public Builder clearRecvedBytes() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearRecvedBytes();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearTaskIdent();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public long getEnQueuetime() {
                return ((IlinkC2CDownloadResult) this.instance).getEnQueuetime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public long getEndTime() {
                return ((IlinkC2CDownloadResult) this.instance).getEndTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public int getErrorCode() {
                return ((IlinkC2CDownloadResult) this.instance).getErrorCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public long getFileSize() {
                return ((IlinkC2CDownloadResult) this.instance).getFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public long getRecvedBytes() {
                return ((IlinkC2CDownloadResult) this.instance).getRecvedBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public long getStartTime() {
                return ((IlinkC2CDownloadResult) this.instance).getStartTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public String getTaskIdent() {
                return ((IlinkC2CDownloadResult) this.instance).getTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public k getTaskIdentBytes() {
                return ((IlinkC2CDownloadResult) this.instance).getTaskIdentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasEnQueuetime() {
                return ((IlinkC2CDownloadResult) this.instance).hasEnQueuetime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasEndTime() {
                return ((IlinkC2CDownloadResult) this.instance).hasEndTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasErrorCode() {
                return ((IlinkC2CDownloadResult) this.instance).hasErrorCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasFileSize() {
                return ((IlinkC2CDownloadResult) this.instance).hasFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasRecvedBytes() {
                return ((IlinkC2CDownloadResult) this.instance).hasRecvedBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasStartTime() {
                return ((IlinkC2CDownloadResult) this.instance).hasStartTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
            public boolean hasTaskIdent() {
                return ((IlinkC2CDownloadResult) this.instance).hasTaskIdent();
            }

            public Builder setEnQueuetime(long j15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setEnQueuetime(j15);
                return this;
            }

            public Builder setEndTime(long j15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setEndTime(j15);
                return this;
            }

            public Builder setErrorCode(int i15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setErrorCode(i15);
                return this;
            }

            public Builder setFileSize(long j15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setFileSize(j15);
                return this;
            }

            public Builder setRecvedBytes(long j15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setRecvedBytes(j15);
                return this;
            }

            public Builder setStartTime(long j15) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setStartTime(j15);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CDownloadResult.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CDownloadResult ilinkC2CDownloadResult = new IlinkC2CDownloadResult();
            DEFAULT_INSTANCE = ilinkC2CDownloadResult;
            l0.registerDefaultInstance(IlinkC2CDownloadResult.class, ilinkC2CDownloadResult);
        }

        private IlinkC2CDownloadResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnQueuetime() {
            this.bitField0_ &= -17;
            this.enQueuetime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -65;
            this.endTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -5;
            this.fileSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecvedBytes() {
            this.bitField0_ &= -9;
            this.recvedBytes_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -33;
            this.startTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -3;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        public static IlinkC2CDownloadResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CDownloadResult parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CDownloadResult) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownloadResult parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkC2CDownloadResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnQueuetime(long j15) {
            this.bitField0_ |= 16;
            this.enQueuetime_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(long j15) {
            this.bitField0_ |= 64;
            this.endTime_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i15) {
            this.bitField0_ |= 1;
            this.errorCode_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSize(long j15) {
            this.bitField0_ |= 4;
            this.fileSize_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecvedBytes(long j15) {
            this.bitField0_ |= 8;
            this.recvedBytes_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(long j15) {
            this.bitField0_ |= 32;
            this.startTime_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.taskIdent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdentBytes(k kVar) {
            this.taskIdent_ = kVar.u();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007ဃ\u0006", new Object[]{"bitField0_", "errorCode_", "taskIdent_", "fileSize_", "recvedBytes_", "enQueuetime_", "startTime_", "endTime_"});
                case 3:
                    return new IlinkC2CDownloadResult();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkC2CDownloadResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CDownloadResult.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public long getEnQueuetime() {
            return this.enQueuetime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public long getEndTime() {
            return this.endTime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public long getFileSize() {
            return this.fileSize_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public long getRecvedBytes() {
            return this.recvedBytes_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public long getStartTime() {
            return this.startTime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public String getTaskIdent() {
            return this.taskIdent_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public k getTaskIdentBytes() {
            return k.k(this.taskIdent_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasEnQueuetime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasEndTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasRecvedBytes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CDownloadResultOrBuilder
        public boolean hasTaskIdent() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkC2CDownloadResult ilinkC2CDownloadResult) {
            return DEFAULT_INSTANCE.createBuilder(ilinkC2CDownloadResult);
        }

        public static IlinkC2CDownloadResult parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(k kVar) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CDownloadResult parseFrom(k kVar, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(byte[] bArr) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CDownloadResult parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(InputStream inputStream) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownloadResult parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(l lVar) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CDownloadResult parseFrom(l lVar, a0 a0Var) {
            return (IlinkC2CDownloadResult) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkC2CDownloadResultOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        long getEnQueuetime();

        long getEndTime();

        int getErrorCode();

        long getFileSize();

        long getRecvedBytes();

        long getStartTime();

        String getTaskIdent();

        k getTaskIdentBytes();

        boolean hasEnQueuetime();

        boolean hasEndTime();

        boolean hasErrorCode();

        boolean hasFileSize();

        boolean hasRecvedBytes();

        boolean hasStartTime();

        boolean hasTaskIdent();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkC2CUpload extends l0<IlinkC2CUpload, Builder> implements IlinkC2CUploadOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 6;
        public static final int BIZ_SCENE_FIELD_NUMBER = 5;
        private static final IlinkC2CUpload DEFAULT_INSTANCE;
        public static final int FILE_DATA_FIELD_NUMBER = 9;
        public static final int FILE_PATH_FIELD_NUMBER = 3;
        public static final int FILE_TYPE_FIELD_NUMBER = 2;
        public static final int IS_STORAGE_MODE_FIELD_NUMBER = 7;
        private static volatile w1<IlinkC2CUpload> PARSER = null;
        public static final int SNS_UPLOAD_VERSION_FIELD_NUMBER = 8;
        public static final int TASK_IDENT_FIELD_NUMBER = 1;
        public static final int THUMB_FILEDATA_FIELD_NUMBER = 10;
        public static final int THUMB_FILEPATH_FIELD_NUMBER = 4;
        private int appType_;
        private int bitField0_;
        private int bizScene_;
        private k fileData_;
        private int fileType_;
        private boolean isStorageMode_;
        private int snsUploadVersion_;
        private k thumbFiledata_;
        private String taskIdent_ = "";
        private String filePath_ = "";
        private String thumbFilepath_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkC2CUpload, Builder> implements IlinkC2CUploadOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppType() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearAppType();
                return this;
            }

            public Builder clearBizScene() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearBizScene();
                return this;
            }

            public Builder clearFileData() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFileData();
                return this;
            }

            public Builder clearFilePath() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFilePath();
                return this;
            }

            public Builder clearFileType() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFileType();
                return this;
            }

            public Builder clearIsStorageMode() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearIsStorageMode();
                return this;
            }

            public Builder clearSnsUploadVersion() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearSnsUploadVersion();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearTaskIdent();
                return this;
            }

            public Builder clearThumbFiledata() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearThumbFiledata();
                return this;
            }

            public Builder clearThumbFilepath() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearThumbFilepath();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public int getAppType() {
                return ((IlinkC2CUpload) this.instance).getAppType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public IlinkEBizScene getBizScene() {
                return ((IlinkC2CUpload) this.instance).getBizScene();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public k getFileData() {
                return ((IlinkC2CUpload) this.instance).getFileData();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public String getFilePath() {
                return ((IlinkC2CUpload) this.instance).getFilePath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public k getFilePathBytes() {
                return ((IlinkC2CUpload) this.instance).getFilePathBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public int getFileType() {
                return ((IlinkC2CUpload) this.instance).getFileType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean getIsStorageMode() {
                return ((IlinkC2CUpload) this.instance).getIsStorageMode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public int getSnsUploadVersion() {
                return ((IlinkC2CUpload) this.instance).getSnsUploadVersion();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public String getTaskIdent() {
                return ((IlinkC2CUpload) this.instance).getTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public k getTaskIdentBytes() {
                return ((IlinkC2CUpload) this.instance).getTaskIdentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public k getThumbFiledata() {
                return ((IlinkC2CUpload) this.instance).getThumbFiledata();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public String getThumbFilepath() {
                return ((IlinkC2CUpload) this.instance).getThumbFilepath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public k getThumbFilepathBytes() {
                return ((IlinkC2CUpload) this.instance).getThumbFilepathBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasAppType() {
                return ((IlinkC2CUpload) this.instance).hasAppType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasBizScene() {
                return ((IlinkC2CUpload) this.instance).hasBizScene();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasFileData() {
                return ((IlinkC2CUpload) this.instance).hasFileData();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasFilePath() {
                return ((IlinkC2CUpload) this.instance).hasFilePath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasFileType() {
                return ((IlinkC2CUpload) this.instance).hasFileType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasIsStorageMode() {
                return ((IlinkC2CUpload) this.instance).hasIsStorageMode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasSnsUploadVersion() {
                return ((IlinkC2CUpload) this.instance).hasSnsUploadVersion();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasTaskIdent() {
                return ((IlinkC2CUpload) this.instance).hasTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasThumbFiledata() {
                return ((IlinkC2CUpload) this.instance).hasThumbFiledata();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
            public boolean hasThumbFilepath() {
                return ((IlinkC2CUpload) this.instance).hasThumbFilepath();
            }

            public Builder setAppType(int i15) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setAppType(i15);
                return this;
            }

            public Builder setBizScene(IlinkEBizScene ilinkEBizScene) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setBizScene(ilinkEBizScene);
                return this;
            }

            public Builder setFileData(k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFileData(kVar);
                return this;
            }

            public Builder setFilePath(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFilePath(str);
                return this;
            }

            public Builder setFilePathBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFilePathBytes(kVar);
                return this;
            }

            public Builder setFileType(int i15) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFileType(i15);
                return this;
            }

            public Builder setIsStorageMode(boolean z15) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setIsStorageMode(z15);
                return this;
            }

            public Builder setSnsUploadVersion(int i15) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setSnsUploadVersion(i15);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            public Builder setThumbFiledata(k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFiledata(kVar);
                return this;
            }

            public Builder setThumbFilepath(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFilepath(str);
                return this;
            }

            public Builder setThumbFilepathBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFilepathBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CUpload.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CUpload ilinkC2CUpload = new IlinkC2CUpload();
            DEFAULT_INSTANCE = ilinkC2CUpload;
            l0.registerDefaultInstance(IlinkC2CUpload.class, ilinkC2CUpload);
        }

        private IlinkC2CUpload() {
            k kVar = k.f21365e;
            this.fileData_ = kVar;
            this.thumbFiledata_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppType() {
            this.bitField0_ &= -33;
            this.appType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBizScene() {
            this.bitField0_ &= -17;
            this.bizScene_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileData() {
            this.bitField0_ &= -257;
            this.fileData_ = getDefaultInstance().getFileData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilePath() {
            this.bitField0_ &= -5;
            this.filePath_ = getDefaultInstance().getFilePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileType() {
            this.bitField0_ &= -3;
            this.fileType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsStorageMode() {
            this.bitField0_ &= -65;
            this.isStorageMode_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSnsUploadVersion() {
            this.bitField0_ &= -129;
            this.snsUploadVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -2;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThumbFiledata() {
            this.bitField0_ &= -513;
            this.thumbFiledata_ = getDefaultInstance().getThumbFiledata();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThumbFilepath() {
            this.bitField0_ &= -9;
            this.thumbFilepath_ = getDefaultInstance().getThumbFilepath();
        }

        public static IlinkC2CUpload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CUpload parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CUpload) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUpload parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkC2CUpload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppType(int i15) {
            this.bitField0_ |= 32;
            this.appType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBizScene(IlinkEBizScene ilinkEBizScene) {
            this.bizScene_ = ilinkEBizScene.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileData(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 256;
            this.fileData_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilePath(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.filePath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilePathBytes(k kVar) {
            this.filePath_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileType(int i15) {
            this.bitField0_ |= 2;
            this.fileType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsStorageMode(boolean z15) {
            this.bitField0_ |= 64;
            this.isStorageMode_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSnsUploadVersion(int i15) {
            this.bitField0_ |= 128;
            this.snsUploadVersion_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.taskIdent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdentBytes(k kVar) {
            this.taskIdent_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbFiledata(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 512;
            this.thumbFiledata_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbFilepath(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.thumbFilepath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbFilepathBytes(k kVar) {
            this.thumbFilepath_ = kVar.u();
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဋ\u0005\u0007ဇ\u0006\bဋ\u0007\tည\b\nည\t", new Object[]{"bitField0_", "taskIdent_", "fileType_", "filePath_", "thumbFilepath_", "bizScene_", IlinkEBizScene.internalGetVerifier(), "appType_", "isStorageMode_", "snsUploadVersion_", "fileData_", "thumbFiledata_"});
                case 3:
                    return new IlinkC2CUpload();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkC2CUpload> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CUpload.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public int getAppType() {
            return this.appType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public IlinkEBizScene getBizScene() {
            IlinkEBizScene forNumber = IlinkEBizScene.forNumber(this.bizScene_);
            return forNumber == null ? IlinkEBizScene.kC2CScene : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public k getFileData() {
            return this.fileData_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public String getFilePath() {
            return this.filePath_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public k getFilePathBytes() {
            return k.k(this.filePath_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public int getFileType() {
            return this.fileType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean getIsStorageMode() {
            return this.isStorageMode_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public int getSnsUploadVersion() {
            return this.snsUploadVersion_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public String getTaskIdent() {
            return this.taskIdent_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public k getTaskIdentBytes() {
            return k.k(this.taskIdent_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public k getThumbFiledata() {
            return this.thumbFiledata_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public String getThumbFilepath() {
            return this.thumbFilepath_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public k getThumbFilepathBytes() {
            return k.k(this.thumbFilepath_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasBizScene() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasFileData() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasFilePath() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasFileType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasIsStorageMode() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasSnsUploadVersion() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasTaskIdent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasThumbFiledata() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadOrBuilder
        public boolean hasThumbFilepath() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkC2CUpload ilinkC2CUpload) {
            return DEFAULT_INSTANCE.createBuilder(ilinkC2CUpload);
        }

        public static IlinkC2CUpload parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUpload parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CUpload parseFrom(k kVar) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CUpload parseFrom(k kVar, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CUpload parseFrom(byte[] bArr) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CUpload parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CUpload parseFrom(InputStream inputStream) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUpload parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUpload parseFrom(l lVar) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CUpload parseFrom(l lVar, a0 a0Var) {
            return (IlinkC2CUpload) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkC2CUploadOrBuilder extends k1 {
        int getAppType();

        IlinkEBizScene getBizScene();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        k getFileData();

        String getFilePath();

        k getFilePathBytes();

        int getFileType();

        boolean getIsStorageMode();

        int getSnsUploadVersion();

        String getTaskIdent();

        k getTaskIdentBytes();

        k getThumbFiledata();

        String getThumbFilepath();

        k getThumbFilepathBytes();

        boolean hasAppType();

        boolean hasBizScene();

        boolean hasFileData();

        boolean hasFilePath();

        boolean hasFileType();

        boolean hasIsStorageMode();

        boolean hasSnsUploadVersion();

        boolean hasTaskIdent();

        boolean hasThumbFiledata();

        boolean hasThumbFilepath();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkC2CUploadResult extends l0<IlinkC2CUploadResult, Builder> implements IlinkC2CUploadResultOrBuilder {
        public static final int AESKEY_FIELD_NUMBER = 7;
        private static final IlinkC2CUploadResult DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int FILEID_FIELD_NUMBER = 6;
        public static final int FILE_SIZE_FIELD_NUMBER = 3;
        public static final int FILE_URL_FIELD_NUMBER = 4;
        private static volatile w1<IlinkC2CUploadResult> PARSER = null;
        public static final int TASK_IDENT_FIELD_NUMBER = 2;
        public static final int THUMB_URL_FIELD_NUMBER = 5;
        private k aeskey_;
        private int bitField0_;
        private int errorCode_;
        private long fileSize_;
        private k fileid_;
        private String taskIdent_ = "";
        private String fileUrl_ = "";
        private String thumbUrl_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkC2CUploadResult, Builder> implements IlinkC2CUploadResultOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAeskey() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearAeskey();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileSize();
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileUrl();
                return this;
            }

            public Builder clearFileid() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileid();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearTaskIdent();
                return this;
            }

            public Builder clearThumbUrl() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearThumbUrl();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public k getAeskey() {
                return ((IlinkC2CUploadResult) this.instance).getAeskey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public int getErrorCode() {
                return ((IlinkC2CUploadResult) this.instance).getErrorCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public long getFileSize() {
                return ((IlinkC2CUploadResult) this.instance).getFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public String getFileUrl() {
                return ((IlinkC2CUploadResult) this.instance).getFileUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public k getFileUrlBytes() {
                return ((IlinkC2CUploadResult) this.instance).getFileUrlBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public k getFileid() {
                return ((IlinkC2CUploadResult) this.instance).getFileid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public String getTaskIdent() {
                return ((IlinkC2CUploadResult) this.instance).getTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public k getTaskIdentBytes() {
                return ((IlinkC2CUploadResult) this.instance).getTaskIdentBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public String getThumbUrl() {
                return ((IlinkC2CUploadResult) this.instance).getThumbUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public k getThumbUrlBytes() {
                return ((IlinkC2CUploadResult) this.instance).getThumbUrlBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasAeskey() {
                return ((IlinkC2CUploadResult) this.instance).hasAeskey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasErrorCode() {
                return ((IlinkC2CUploadResult) this.instance).hasErrorCode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasFileSize() {
                return ((IlinkC2CUploadResult) this.instance).hasFileSize();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasFileUrl() {
                return ((IlinkC2CUploadResult) this.instance).hasFileUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasFileid() {
                return ((IlinkC2CUploadResult) this.instance).hasFileid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasTaskIdent() {
                return ((IlinkC2CUploadResult) this.instance).hasTaskIdent();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
            public boolean hasThumbUrl() {
                return ((IlinkC2CUploadResult) this.instance).hasThumbUrl();
            }

            public Builder setAeskey(k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setAeskey(kVar);
                return this;
            }

            public Builder setErrorCode(int i15) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setErrorCode(i15);
                return this;
            }

            public Builder setFileSize(long j15) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileSize(j15);
                return this;
            }

            public Builder setFileUrl(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileUrl(str);
                return this;
            }

            public Builder setFileUrlBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileUrlBytes(kVar);
                return this;
            }

            public Builder setFileid(k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileid(kVar);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            public Builder setThumbUrl(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setThumbUrl(str);
                return this;
            }

            public Builder setThumbUrlBytes(k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setThumbUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CUploadResult.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CUploadResult ilinkC2CUploadResult = new IlinkC2CUploadResult();
            DEFAULT_INSTANCE = ilinkC2CUploadResult;
            l0.registerDefaultInstance(IlinkC2CUploadResult.class, ilinkC2CUploadResult);
        }

        private IlinkC2CUploadResult() {
            k kVar = k.f21365e;
            this.fileid_ = kVar;
            this.aeskey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAeskey() {
            this.bitField0_ &= -65;
            this.aeskey_ = getDefaultInstance().getAeskey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -5;
            this.fileSize_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileUrl() {
            this.bitField0_ &= -9;
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileid() {
            this.bitField0_ &= -33;
            this.fileid_ = getDefaultInstance().getFileid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -3;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThumbUrl() {
            this.bitField0_ &= -17;
            this.thumbUrl_ = getDefaultInstance().getThumbUrl();
        }

        public static IlinkC2CUploadResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CUploadResult parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CUploadResult) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUploadResult parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkC2CUploadResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAeskey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.aeskey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(int i15) {
            this.bitField0_ |= 1;
            this.errorCode_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSize(long j15) {
            this.bitField0_ |= 4;
            this.fileSize_ = j15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.fileUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrlBytes(k kVar) {
            this.fileUrl_ = kVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.fileid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.taskIdent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaskIdentBytes(k kVar) {
            this.taskIdent_ = kVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbUrl(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.thumbUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThumbUrlBytes(k kVar) {
            this.thumbUrl_ = kVar.u();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"bitField0_", "errorCode_", "taskIdent_", "fileSize_", "fileUrl_", "thumbUrl_", "fileid_", "aeskey_"});
                case 3:
                    return new IlinkC2CUploadResult();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkC2CUploadResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CUploadResult.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public k getAeskey() {
            return this.aeskey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public int getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public long getFileSize() {
            return this.fileSize_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public String getFileUrl() {
            return this.fileUrl_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public k getFileUrlBytes() {
            return k.k(this.fileUrl_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public k getFileid() {
            return this.fileid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public String getTaskIdent() {
            return this.taskIdent_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public k getTaskIdentBytes() {
            return k.k(this.taskIdent_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public String getThumbUrl() {
            return this.thumbUrl_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public k getThumbUrlBytes() {
            return k.k(this.thumbUrl_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasAeskey() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasFileUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasFileid() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasTaskIdent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkC2CUploadResultOrBuilder
        public boolean hasThumbUrl() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(IlinkC2CUploadResult ilinkC2CUploadResult) {
            return DEFAULT_INSTANCE.createBuilder(ilinkC2CUploadResult);
        }

        public static IlinkC2CUploadResult parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(k kVar) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CUploadResult parseFrom(k kVar, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(byte[] bArr) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CUploadResult parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(InputStream inputStream) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUploadResult parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(l lVar) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CUploadResult parseFrom(l lVar, a0 a0Var) {
            return (IlinkC2CUploadResult) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkC2CUploadResultOrBuilder extends k1 {
        k getAeskey();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        int getErrorCode();

        long getFileSize();

        String getFileUrl();

        k getFileUrlBytes();

        k getFileid();

        String getTaskIdent();

        k getTaskIdentBytes();

        String getThumbUrl();

        k getThumbUrlBytes();

        boolean hasAeskey();

        boolean hasErrorCode();

        boolean hasFileSize();

        boolean hasFileUrl();

        boolean hasFileid();

        boolean hasTaskIdent();

        boolean hasThumbUrl();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkCdnFileType implements o0.c {
        kMediaTypeFile(5),
        kMediaTypeAppImageStorage(20304);
        
        private static final o0.d<IlinkCdnFileType> internalValueMap = new o0.d<IlinkCdnFileType>() { // from class: com.tencent.ilink.network.Proto.IlinkCdnFileType.1
            @Override // com.google.protobuf.o0.d
            public IlinkCdnFileType findValueByNumber(int i15) {
                return IlinkCdnFileType.forNumber(i15);
            }
        };
        public static final int kMediaTypeAppImageStorage_VALUE = 20304;
        public static final int kMediaTypeFile_VALUE = 5;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkCdnFileTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkCdnFileTypeVerifier();

            private IlinkCdnFileTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkCdnFileType.forNumber(i15) != null;
            }
        }

        IlinkCdnFileType(int i15) {
            this.value = i15;
        }

        public static IlinkCdnFileType forNumber(int i15) {
            if (i15 != 5) {
                if (i15 != 20304) {
                    return null;
                }
                return kMediaTypeAppImageStorage;
            }
            return kMediaTypeFile;
        }

        public static o0.d<IlinkCdnFileType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkCdnFileTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkCdnFileType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkCmdItem extends l0<IlinkCmdItem, Builder> implements IlinkCmdItemOrBuilder {
        public static final int CMDBUF_FIELD_NUMBER = 2;
        public static final int CMDID_FIELD_NUMBER = 1;
        private static final IlinkCmdItem DEFAULT_INSTANCE;
        private static volatile w1<IlinkCmdItem> PARSER;
        private int bitField0_;
        private k cmdbuf_ = k.f21365e;
        private int cmdid_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkCmdItem, Builder> implements IlinkCmdItemOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCmdbuf() {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).clearCmdbuf();
                return this;
            }

            public Builder clearCmdid() {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).clearCmdid();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
            public k getCmdbuf() {
                return ((IlinkCmdItem) this.instance).getCmdbuf();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
            public int getCmdid() {
                return ((IlinkCmdItem) this.instance).getCmdid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
            public boolean hasCmdbuf() {
                return ((IlinkCmdItem) this.instance).hasCmdbuf();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
            public boolean hasCmdid() {
                return ((IlinkCmdItem) this.instance).hasCmdid();
            }

            public Builder setCmdbuf(k kVar) {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).setCmdbuf(kVar);
                return this;
            }

            public Builder setCmdid(int i15) {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).setCmdid(i15);
                return this;
            }

            private Builder() {
                super(IlinkCmdItem.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkCmdItem ilinkCmdItem = new IlinkCmdItem();
            DEFAULT_INSTANCE = ilinkCmdItem;
            l0.registerDefaultInstance(IlinkCmdItem.class, ilinkCmdItem);
        }

        private IlinkCmdItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdbuf() {
            this.bitField0_ &= -3;
            this.cmdbuf_ = getDefaultInstance().getCmdbuf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdid() {
            this.bitField0_ &= -2;
            this.cmdid_ = 0;
        }

        public static IlinkCmdItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkCmdItem parseDelimitedFrom(InputStream inputStream) {
            return (IlinkCmdItem) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCmdItem parseFrom(ByteBuffer byteBuffer) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkCmdItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdbuf(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.cmdbuf_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdid(int i15) {
            this.bitField0_ |= 1;
            this.cmdid_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"bitField0_", "cmdid_", "cmdbuf_"});
                case 3:
                    return new IlinkCmdItem();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkCmdItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkCmdItem.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
        public k getCmdbuf() {
            return this.cmdbuf_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
        public int getCmdid() {
            return this.cmdid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
        public boolean hasCmdbuf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkCmdItemOrBuilder
        public boolean hasCmdid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkCmdItem ilinkCmdItem) {
            return DEFAULT_INSTANCE.createBuilder(ilinkCmdItem);
        }

        public static IlinkCmdItem parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkCmdItem) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCmdItem parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkCmdItem parseFrom(k kVar) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkCmdItem parseFrom(k kVar, a0 a0Var) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkCmdItem parseFrom(byte[] bArr) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkCmdItem parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkCmdItem parseFrom(InputStream inputStream) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCmdItem parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCmdItem parseFrom(l lVar) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkCmdItem parseFrom(l lVar, a0 a0Var) {
            return (IlinkCmdItem) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkCmdItemOrBuilder extends k1 {
        k getCmdbuf();

        int getCmdid();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        boolean hasCmdbuf();

        boolean hasCmdid();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkContentType implements o0.c {
        kIlinkContentTypeDefault(0),
        kIlinkContentTypeProtobuf(1),
        kIlinkContentTypeJson(2);
        
        private static final o0.d<IlinkContentType> internalValueMap = new o0.d<IlinkContentType>() { // from class: com.tencent.ilink.network.Proto.IlinkContentType.1
            @Override // com.google.protobuf.o0.d
            public IlinkContentType findValueByNumber(int i15) {
                return IlinkContentType.forNumber(i15);
            }
        };
        public static final int kIlinkContentTypeDefault_VALUE = 0;
        public static final int kIlinkContentTypeJson_VALUE = 2;
        public static final int kIlinkContentTypeProtobuf_VALUE = 1;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkContentTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkContentTypeVerifier();

            private IlinkContentTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkContentType.forNumber(i15) != null;
            }
        }

        IlinkContentType(int i15) {
            this.value = i15;
        }

        public static IlinkContentType forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        return null;
                    }
                    return kIlinkContentTypeJson;
                }
                return kIlinkContentTypeProtobuf;
            }
            return kIlinkContentTypeDefault;
        }

        public static o0.d<IlinkContentType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkContentTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkContentType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public enum IlinkCryptoAlgo implements o0.c {
        kIlinkNoCrypto(0),
        kIlinkSession(1),
        kIlinkHybridEcdh(2),
        kIlinkEcdh(3);
        
        private static final o0.d<IlinkCryptoAlgo> internalValueMap = new o0.d<IlinkCryptoAlgo>() { // from class: com.tencent.ilink.network.Proto.IlinkCryptoAlgo.1
            @Override // com.google.protobuf.o0.d
            public IlinkCryptoAlgo findValueByNumber(int i15) {
                return IlinkCryptoAlgo.forNumber(i15);
            }
        };
        public static final int kIlinkEcdh_VALUE = 3;
        public static final int kIlinkHybridEcdh_VALUE = 2;
        public static final int kIlinkNoCrypto_VALUE = 0;
        public static final int kIlinkSession_VALUE = 1;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkCryptoAlgoVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkCryptoAlgoVerifier();

            private IlinkCryptoAlgoVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkCryptoAlgo.forNumber(i15) != null;
            }
        }

        IlinkCryptoAlgo(int i15) {
            this.value = i15;
        }

        public static IlinkCryptoAlgo forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            return null;
                        }
                        return kIlinkEcdh;
                    }
                    return kIlinkHybridEcdh;
                }
                return kIlinkSession;
            }
            return kIlinkNoCrypto;
        }

        public static o0.d<IlinkCryptoAlgo> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkCryptoAlgoVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkCryptoAlgo valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkDeviceSessionInfo extends l0<IlinkDeviceSessionInfo, Builder> implements IlinkDeviceSessionInfoOrBuilder {
        public static final int AUTOAUTH_ENC_KEY_FIELD_NUMBER = 3;
        public static final int CLIENT_RANDOM_KEY_FIELD_NUMBER = 1;
        public static final int COOKIE_FIELD_NUMBER = 5;
        private static final IlinkDeviceSessionInfo DEFAULT_INSTANCE;
        public static final int ILINK_DEVICEID_FIELD_NUMBER = 7;
        public static final int ILINK_PRODUCTID_FIELD_NUMBER = 8;
        private static volatile w1<IlinkDeviceSessionInfo> PARSER = null;
        public static final int SERVERID_FIELD_NUMBER = 4;
        public static final int SERVER_RANDOM_KEY_FIELD_NUMBER = 2;
        public static final int UIN_FIELD_NUMBER = 6;
        private k autoauthEncKey_;
        private int bitField0_;
        private k clientRandomKey_;
        private k cookie_;
        private k ilinkDeviceid_;
        private int ilinkProductid_;
        private k serverRandomKey_;
        private k serverid_;
        private long uin_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkDeviceSessionInfo, Builder> implements IlinkDeviceSessionInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAutoauthEncKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearAutoauthEncKey();
                return this;
            }

            public Builder clearClientRandomKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearClientRandomKey();
                return this;
            }

            public Builder clearCookie() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearCookie();
                return this;
            }

            public Builder clearIlinkDeviceid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearIlinkDeviceid();
                return this;
            }

            public Builder clearIlinkProductid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearIlinkProductid();
                return this;
            }

            public Builder clearServerRandomKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearServerRandomKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearUin();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getAutoauthEncKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getAutoauthEncKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getClientRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getClientRandomKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getCookie() {
                return ((IlinkDeviceSessionInfo) this.instance).getCookie();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getIlinkDeviceid() {
                return ((IlinkDeviceSessionInfo) this.instance).getIlinkDeviceid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public int getIlinkProductid() {
                return ((IlinkDeviceSessionInfo) this.instance).getIlinkProductid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getServerRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getServerRandomKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public k getServerid() {
                return ((IlinkDeviceSessionInfo) this.instance).getServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public long getUin() {
                return ((IlinkDeviceSessionInfo) this.instance).getUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasAutoauthEncKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasAutoauthEncKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasClientRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasClientRandomKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasCookie() {
                return ((IlinkDeviceSessionInfo) this.instance).hasCookie();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasIlinkDeviceid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasIlinkDeviceid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasIlinkProductid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasIlinkProductid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasServerRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasServerRandomKey();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasServerid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasServerid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
            public boolean hasUin() {
                return ((IlinkDeviceSessionInfo) this.instance).hasUin();
            }

            public Builder setAutoauthEncKey(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setAutoauthEncKey(kVar);
                return this;
            }

            public Builder setClientRandomKey(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setClientRandomKey(kVar);
                return this;
            }

            public Builder setCookie(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setCookie(kVar);
                return this;
            }

            public Builder setIlinkDeviceid(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setIlinkDeviceid(kVar);
                return this;
            }

            public Builder setIlinkProductid(int i15) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setIlinkProductid(i15);
                return this;
            }

            public Builder setServerRandomKey(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setServerRandomKey(kVar);
                return this;
            }

            public Builder setServerid(k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setUin(long j15) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setUin(j15);
                return this;
            }

            private Builder() {
                super(IlinkDeviceSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkDeviceSessionInfo ilinkDeviceSessionInfo = new IlinkDeviceSessionInfo();
            DEFAULT_INSTANCE = ilinkDeviceSessionInfo;
            l0.registerDefaultInstance(IlinkDeviceSessionInfo.class, ilinkDeviceSessionInfo);
        }

        private IlinkDeviceSessionInfo() {
            k kVar = k.f21365e;
            this.clientRandomKey_ = kVar;
            this.serverRandomKey_ = kVar;
            this.autoauthEncKey_ = kVar;
            this.serverid_ = kVar;
            this.cookie_ = kVar;
            this.ilinkDeviceid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoauthEncKey() {
            this.bitField0_ &= -5;
            this.autoauthEncKey_ = getDefaultInstance().getAutoauthEncKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientRandomKey() {
            this.bitField0_ &= -2;
            this.clientRandomKey_ = getDefaultInstance().getClientRandomKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCookie() {
            this.bitField0_ &= -17;
            this.cookie_ = getDefaultInstance().getCookie();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlinkDeviceid() {
            this.bitField0_ &= -65;
            this.ilinkDeviceid_ = getDefaultInstance().getIlinkDeviceid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlinkProductid() {
            this.bitField0_ &= -129;
            this.ilinkProductid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerRandomKey() {
            this.bitField0_ &= -3;
            this.serverRandomKey_ = getDefaultInstance().getServerRandomKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -9;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -33;
            this.uin_ = 0L;
        }

        public static IlinkDeviceSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkDeviceSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkDeviceSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkDeviceSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoauthEncKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.autoauthEncKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientRandomKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.clientRandomKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCookie(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.cookie_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkDeviceid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.ilinkDeviceid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkProductid(int i15) {
            this.bitField0_ |= 128;
            this.ilinkProductid_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerRandomKey(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.serverRandomKey_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerid(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.serverid_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUin(long j15) {
            this.bitField0_ |= 32;
            this.uin_ = j15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဃ\u0005\u0007ည\u0006\bဋ\u0007", new Object[]{"bitField0_", "clientRandomKey_", "serverRandomKey_", "autoauthEncKey_", "serverid_", "cookie_", "uin_", "ilinkDeviceid_", "ilinkProductid_"});
                case 3:
                    return new IlinkDeviceSessionInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkDeviceSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkDeviceSessionInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getAutoauthEncKey() {
            return this.autoauthEncKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getClientRandomKey() {
            return this.clientRandomKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getCookie() {
            return this.cookie_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getIlinkDeviceid() {
            return this.ilinkDeviceid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public int getIlinkProductid() {
            return this.ilinkProductid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getServerRandomKey() {
            return this.serverRandomKey_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public k getServerid() {
            return this.serverid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public long getUin() {
            return this.uin_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasAutoauthEncKey() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasClientRandomKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasCookie() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasIlinkDeviceid() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasIlinkProductid() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasServerRandomKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasServerid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkDeviceSessionInfoOrBuilder
        public boolean hasUin() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(IlinkDeviceSessionInfo ilinkDeviceSessionInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkDeviceSessionInfo);
        }

        public static IlinkDeviceSessionInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(k kVar) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkDeviceSessionInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(byte[] bArr) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkDeviceSessionInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceSessionInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(l lVar) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkDeviceSessionInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkDeviceSessionInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkDeviceSessionInfoOrBuilder extends k1 {
        k getAutoauthEncKey();

        k getClientRandomKey();

        k getCookie();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        k getIlinkDeviceid();

        int getIlinkProductid();

        k getServerRandomKey();

        k getServerid();

        long getUin();

        boolean hasAutoauthEncKey();

        boolean hasClientRandomKey();

        boolean hasCookie();

        boolean hasIlinkDeviceid();

        boolean hasIlinkProductid();

        boolean hasServerRandomKey();

        boolean hasServerid();

        boolean hasUin();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkDeviceSessionType implements o0.c {
        kIlinkDeviceAuth(0),
        kIlinkDeviceGetSession(1);
        
        private static final o0.d<IlinkDeviceSessionType> internalValueMap = new o0.d<IlinkDeviceSessionType>() { // from class: com.tencent.ilink.network.Proto.IlinkDeviceSessionType.1
            @Override // com.google.protobuf.o0.d
            public IlinkDeviceSessionType findValueByNumber(int i15) {
                return IlinkDeviceSessionType.forNumber(i15);
            }
        };
        public static final int kIlinkDeviceAuth_VALUE = 0;
        public static final int kIlinkDeviceGetSession_VALUE = 1;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkDeviceSessionTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkDeviceSessionTypeVerifier();

            private IlinkDeviceSessionTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkDeviceSessionType.forNumber(i15) != null;
            }
        }

        IlinkDeviceSessionType(int i15) {
            this.value = i15;
        }

        public static IlinkDeviceSessionType forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    return null;
                }
                return kIlinkDeviceGetSession;
            }
            return kIlinkDeviceAuth;
        }

        public static o0.d<IlinkDeviceSessionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkDeviceSessionTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkDeviceSessionType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public enum IlinkEBizScene implements o0.c {
        kC2CScene(0),
        kAppScene(2);
        
        private static final o0.d<IlinkEBizScene> internalValueMap = new o0.d<IlinkEBizScene>() { // from class: com.tencent.ilink.network.Proto.IlinkEBizScene.1
            @Override // com.google.protobuf.o0.d
            public IlinkEBizScene findValueByNumber(int i15) {
                return IlinkEBizScene.forNumber(i15);
            }
        };
        public static final int kAppScene_VALUE = 2;
        public static final int kC2CScene_VALUE = 0;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkEBizSceneVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkEBizSceneVerifier();

            private IlinkEBizSceneVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkEBizScene.forNumber(i15) != null;
            }
        }

        IlinkEBizScene(int i15) {
            this.value = i15;
        }

        public static IlinkEBizScene forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 2) {
                    return null;
                }
                return kAppScene;
            }
            return kC2CScene;
        }

        public static o0.d<IlinkEBizScene> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkEBizSceneVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkEBizScene valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkKvReportInfo extends l0<IlinkKvReportInfo, Builder> implements IlinkKvReportInfoOrBuilder {
        private static final IlinkKvReportInfo DEFAULT_INSTANCE;
        public static final int IGNORE_FREQ_CHECK_FIELD_NUMBER = 5;
        public static final int LOGID_FIELD_NUMBER = 1;
        private static volatile w1<IlinkKvReportInfo> PARSER = null;
        public static final int REPORT_NOW_FIELD_NUMBER = 4;
        public static final int REPORT_UIN_TYPE_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private boolean ignoreFreqCheck_;
        private int logid_;
        private boolean reportNow_;
        private int reportUinType_;
        private int type_;
        private k value_ = k.f21365e;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkKvReportInfo, Builder> implements IlinkKvReportInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIgnoreFreqCheck() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearIgnoreFreqCheck();
                return this;
            }

            public Builder clearLogid() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearLogid();
                return this;
            }

            public Builder clearReportNow() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearReportNow();
                return this;
            }

            public Builder clearReportUinType() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearReportUinType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearValue();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean getIgnoreFreqCheck() {
                return ((IlinkKvReportInfo) this.instance).getIgnoreFreqCheck();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public int getLogid() {
                return ((IlinkKvReportInfo) this.instance).getLogid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean getReportNow() {
                return ((IlinkKvReportInfo) this.instance).getReportNow();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public int getReportUinType() {
                return ((IlinkKvReportInfo) this.instance).getReportUinType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public int getType() {
                return ((IlinkKvReportInfo) this.instance).getType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public k getValue() {
                return ((IlinkKvReportInfo) this.instance).getValue();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasIgnoreFreqCheck() {
                return ((IlinkKvReportInfo) this.instance).hasIgnoreFreqCheck();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasLogid() {
                return ((IlinkKvReportInfo) this.instance).hasLogid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasReportNow() {
                return ((IlinkKvReportInfo) this.instance).hasReportNow();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasReportUinType() {
                return ((IlinkKvReportInfo) this.instance).hasReportUinType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasType() {
                return ((IlinkKvReportInfo) this.instance).hasType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
            public boolean hasValue() {
                return ((IlinkKvReportInfo) this.instance).hasValue();
            }

            public Builder setIgnoreFreqCheck(boolean z15) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setIgnoreFreqCheck(z15);
                return this;
            }

            public Builder setLogid(int i15) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setLogid(i15);
                return this;
            }

            public Builder setReportNow(boolean z15) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setReportNow(z15);
                return this;
            }

            public Builder setReportUinType(int i15) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setReportUinType(i15);
                return this;
            }

            public Builder setType(int i15) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setType(i15);
                return this;
            }

            public Builder setValue(k kVar) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setValue(kVar);
                return this;
            }

            private Builder() {
                super(IlinkKvReportInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkKvReportInfo ilinkKvReportInfo = new IlinkKvReportInfo();
            DEFAULT_INSTANCE = ilinkKvReportInfo;
            l0.registerDefaultInstance(IlinkKvReportInfo.class, ilinkKvReportInfo);
        }

        private IlinkKvReportInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIgnoreFreqCheck() {
            this.bitField0_ &= -17;
            this.ignoreFreqCheck_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogid() {
            this.bitField0_ &= -2;
            this.logid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReportNow() {
            this.bitField0_ &= -9;
            this.reportNow_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReportUinType() {
            this.bitField0_ &= -33;
            this.reportUinType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -5;
            this.value_ = getDefaultInstance().getValue();
        }

        public static IlinkKvReportInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkKvReportInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkKvReportInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkKvReportInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkKvReportInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIgnoreFreqCheck(boolean z15) {
            this.bitField0_ |= 16;
            this.ignoreFreqCheck_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogid(int i15) {
            this.bitField0_ |= 1;
            this.logid_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReportNow(boolean z15) {
            this.bitField0_ |= 8;
            this.reportNow_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReportUinType(int i15) {
            this.bitField0_ |= 32;
            this.reportUinType_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i15) {
            this.bitField0_ |= 2;
            this.type_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.value_ = kVar;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "logid_", "type_", "value_", "reportNow_", "ignoreFreqCheck_", "reportUinType_"});
                case 3:
                    return new IlinkKvReportInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkKvReportInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkKvReportInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean getIgnoreFreqCheck() {
            return this.ignoreFreqCheck_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public int getLogid() {
            return this.logid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean getReportNow() {
            return this.reportNow_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public int getReportUinType() {
            return this.reportUinType_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public k getValue() {
            return this.value_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasIgnoreFreqCheck() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasLogid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasReportNow() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasReportUinType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkKvReportInfoOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkKvReportInfo ilinkKvReportInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkKvReportInfo);
        }

        public static IlinkKvReportInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(k kVar) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkKvReportInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(byte[] bArr) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkKvReportInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(InputStream inputStream) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkKvReportInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(l lVar) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkKvReportInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkKvReportInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkKvReportInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        boolean getIgnoreFreqCheck();

        int getLogid();

        boolean getReportNow();

        int getReportUinType();

        int getType();

        k getValue();

        boolean hasIgnoreFreqCheck();

        boolean hasLogid();

        boolean hasReportNow();

        boolean hasReportUinType();

        boolean hasType();

        boolean hasValue();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkLogLevel implements o0.c {
        kIlinkLogLevelVerbose(0),
        kIlinkLogLevelDebug(1),
        kIlinkLogLevelInfo(2),
        kIlinkLogLevelWarn(3),
        kIlinkLogLevelError(4),
        kIlinkLogLevelFatal(5),
        kIlinkLogLevelNone(6);
        
        private static final o0.d<IlinkLogLevel> internalValueMap = new o0.d<IlinkLogLevel>() { // from class: com.tencent.ilink.network.Proto.IlinkLogLevel.1
            @Override // com.google.protobuf.o0.d
            public IlinkLogLevel findValueByNumber(int i15) {
                return IlinkLogLevel.forNumber(i15);
            }
        };
        public static final int kIlinkLogLevelDebug_VALUE = 1;
        public static final int kIlinkLogLevelError_VALUE = 4;
        public static final int kIlinkLogLevelFatal_VALUE = 5;
        public static final int kIlinkLogLevelInfo_VALUE = 2;
        public static final int kIlinkLogLevelNone_VALUE = 6;
        public static final int kIlinkLogLevelVerbose_VALUE = 0;
        public static final int kIlinkLogLevelWarn_VALUE = 3;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkLogLevelVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkLogLevelVerifier();

            private IlinkLogLevelVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkLogLevel.forNumber(i15) != null;
            }
        }

        IlinkLogLevel(int i15) {
            this.value = i15;
        }

        public static IlinkLogLevel forNumber(int i15) {
            switch (i15) {
                case 0:
                    return kIlinkLogLevelVerbose;
                case 1:
                    return kIlinkLogLevelDebug;
                case 2:
                    return kIlinkLogLevelInfo;
                case 3:
                    return kIlinkLogLevelWarn;
                case 4:
                    return kIlinkLogLevelError;
                case 5:
                    return kIlinkLogLevelFatal;
                case 6:
                    return kIlinkLogLevelNone;
                default:
                    return null;
            }
        }

        public static o0.d<IlinkLogLevel> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkLogLevelVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLogLevel valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkMsgIotAppMsg extends l0<IlinkMsgIotAppMsg, Builder> implements IlinkMsgIotAppMsgOrBuilder {
        public static final int APPBODY_FIELD_NUMBER = 3;
        public static final int APPID_FIELD_NUMBER = 1;
        private static final IlinkMsgIotAppMsg DEFAULT_INSTANCE;
        private static volatile w1<IlinkMsgIotAppMsg> PARSER = null;
        public static final int UIN_FIELD_NUMBER = 2;
        private int bitField0_;
        private long uin_;
        private String appid_ = "";
        private k appbody_ = k.f21365e;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkMsgIotAppMsg, Builder> implements IlinkMsgIotAppMsgOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppbody() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearAppbody();
                return this;
            }

            public Builder clearAppid() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearAppid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearUin();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public k getAppbody() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppbody();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public String getAppid() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public k getAppidBytes() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppidBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public long getUin() {
                return ((IlinkMsgIotAppMsg) this.instance).getUin();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public boolean hasAppbody() {
                return ((IlinkMsgIotAppMsg) this.instance).hasAppbody();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public boolean hasAppid() {
                return ((IlinkMsgIotAppMsg) this.instance).hasAppid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
            public boolean hasUin() {
                return ((IlinkMsgIotAppMsg) this.instance).hasUin();
            }

            public Builder setAppbody(k kVar) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppbody(kVar);
                return this;
            }

            public Builder setAppid(String str) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppid(str);
                return this;
            }

            public Builder setAppidBytes(k kVar) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppidBytes(kVar);
                return this;
            }

            public Builder setUin(long j15) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setUin(j15);
                return this;
            }

            private Builder() {
                super(IlinkMsgIotAppMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkMsgIotAppMsg ilinkMsgIotAppMsg = new IlinkMsgIotAppMsg();
            DEFAULT_INSTANCE = ilinkMsgIotAppMsg;
            l0.registerDefaultInstance(IlinkMsgIotAppMsg.class, ilinkMsgIotAppMsg);
        }

        private IlinkMsgIotAppMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppbody() {
            this.bitField0_ &= -5;
            this.appbody_ = getDefaultInstance().getAppbody();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppid() {
            this.bitField0_ &= -2;
            this.appid_ = getDefaultInstance().getAppid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -3;
            this.uin_ = 0L;
        }

        public static IlinkMsgIotAppMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkMsgIotAppMsg parseDelimitedFrom(InputStream inputStream) {
            return (IlinkMsgIotAppMsg) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkMsgIotAppMsg parseFrom(ByteBuffer byteBuffer) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkMsgIotAppMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppbody(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.appbody_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppidBytes(k kVar) {
            this.appid_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUin(long j15) {
            this.bitField0_ |= 2;
            this.uin_ = j15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "appid_", "uin_", "appbody_"});
                case 3:
                    return new IlinkMsgIotAppMsg();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkMsgIotAppMsg> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkMsgIotAppMsg.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public k getAppbody() {
            return this.appbody_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public String getAppid() {
            return this.appid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public k getAppidBytes() {
            return k.k(this.appid_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public long getUin() {
            return this.uin_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public boolean hasAppbody() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public boolean hasAppid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkMsgIotAppMsgOrBuilder
        public boolean hasUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkMsgIotAppMsg ilinkMsgIotAppMsg) {
            return DEFAULT_INSTANCE.createBuilder(ilinkMsgIotAppMsg);
        }

        public static IlinkMsgIotAppMsg parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(k kVar) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkMsgIotAppMsg parseFrom(k kVar, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(byte[] bArr) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkMsgIotAppMsg parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(InputStream inputStream) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkMsgIotAppMsg parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(l lVar) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkMsgIotAppMsg parseFrom(l lVar, a0 a0Var) {
            return (IlinkMsgIotAppMsg) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkMsgIotAppMsgOrBuilder extends k1 {
        k getAppbody();

        String getAppid();

        k getAppidBytes();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        long getUin();

        boolean hasAppbody();

        boolean hasAppid();

        boolean hasUin();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkNetProxyInfo extends l0<IlinkNetProxyInfo, Builder> implements IlinkNetProxyInfoOrBuilder {
        private static final IlinkNetProxyInfo DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        private static volatile w1<IlinkNetProxyInfo> PARSER = null;
        public static final int PASSWORD_FIELD_NUMBER = 4;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PROXYTYPE_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private String ip_ = "";
        private k password_;
        private int port_;
        private int proxytype_;
        private k username_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkNetProxyInfo, Builder> implements IlinkNetProxyInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIp() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearIp();
                return this;
            }

            public Builder clearPassword() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearPassword();
                return this;
            }

            public Builder clearPort() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearPort();
                return this;
            }

            public Builder clearProxytype() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearProxytype();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearUsername();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public String getIp() {
                return ((IlinkNetProxyInfo) this.instance).getIp();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public k getIpBytes() {
                return ((IlinkNetProxyInfo) this.instance).getIpBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public k getPassword() {
                return ((IlinkNetProxyInfo) this.instance).getPassword();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public int getPort() {
                return ((IlinkNetProxyInfo) this.instance).getPort();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public int getProxytype() {
                return ((IlinkNetProxyInfo) this.instance).getProxytype();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public k getUsername() {
                return ((IlinkNetProxyInfo) this.instance).getUsername();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public boolean hasIp() {
                return ((IlinkNetProxyInfo) this.instance).hasIp();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public boolean hasPassword() {
                return ((IlinkNetProxyInfo) this.instance).hasPassword();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public boolean hasPort() {
                return ((IlinkNetProxyInfo) this.instance).hasPort();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public boolean hasProxytype() {
                return ((IlinkNetProxyInfo) this.instance).hasProxytype();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
            public boolean hasUsername() {
                return ((IlinkNetProxyInfo) this.instance).hasUsername();
            }

            public Builder setIp(String str) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setIp(str);
                return this;
            }

            public Builder setIpBytes(k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setIpBytes(kVar);
                return this;
            }

            public Builder setPassword(k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setPassword(kVar);
                return this;
            }

            public Builder setPort(int i15) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setPort(i15);
                return this;
            }

            public Builder setProxytype(int i15) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setProxytype(i15);
                return this;
            }

            public Builder setUsername(k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setUsername(kVar);
                return this;
            }

            private Builder() {
                super(IlinkNetProxyInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkNetProxyInfo ilinkNetProxyInfo = new IlinkNetProxyInfo();
            DEFAULT_INSTANCE = ilinkNetProxyInfo;
            l0.registerDefaultInstance(IlinkNetProxyInfo.class, ilinkNetProxyInfo);
        }

        private IlinkNetProxyInfo() {
            k kVar = k.f21365e;
            this.username_ = kVar;
            this.password_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.bitField0_ &= -2;
            this.ip_ = getDefaultInstance().getIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPassword() {
            this.bitField0_ &= -9;
            this.password_ = getDefaultInstance().getPassword();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPort() {
            this.bitField0_ &= -3;
            this.port_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProxytype() {
            this.bitField0_ &= -17;
            this.proxytype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -5;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static IlinkNetProxyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkNetProxyInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkNetProxyInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkNetProxyInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkNetProxyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpBytes(k kVar) {
            this.ip_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassword(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.password_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPort(int i15) {
            this.bitField0_ |= 2;
            this.port_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProxytype(int i15) {
            this.bitField0_ |= 16;
            this.proxytype_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsername(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.username_ = kVar;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "ip_", "port_", "username_", "password_", "proxytype_"});
                case 3:
                    return new IlinkNetProxyInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkNetProxyInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkNetProxyInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public String getIp() {
            return this.ip_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public k getIpBytes() {
            return k.k(this.ip_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public k getPassword() {
            return this.password_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public int getPort() {
            return this.port_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public int getProxytype() {
            return this.proxytype_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public k getUsername() {
            return this.username_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public boolean hasIp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public boolean hasPassword() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public boolean hasPort() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public boolean hasProxytype() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkNetProxyInfoOrBuilder
        public boolean hasUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkNetProxyInfo ilinkNetProxyInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkNetProxyInfo);
        }

        public static IlinkNetProxyInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(k kVar) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkNetProxyInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(byte[] bArr) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkNetProxyInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(InputStream inputStream) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkNetProxyInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(l lVar) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkNetProxyInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkNetProxyInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkNetProxyInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getIp();

        k getIpBytes();

        k getPassword();

        int getPort();

        int getProxytype();

        k getUsername();

        boolean hasIp();

        boolean hasPassword();

        boolean hasPort();

        boolean hasProxytype();

        boolean hasUsername();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkNetType implements o0.c {
        kIlinkShortlink(0),
        kIlinkLonglink(1);
        
        private static final o0.d<IlinkNetType> internalValueMap = new o0.d<IlinkNetType>() { // from class: com.tencent.ilink.network.Proto.IlinkNetType.1
            @Override // com.google.protobuf.o0.d
            public IlinkNetType findValueByNumber(int i15) {
                return IlinkNetType.forNumber(i15);
            }
        };
        public static final int kIlinkLonglink_VALUE = 1;
        public static final int kIlinkShortlink_VALUE = 0;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkNetTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkNetTypeVerifier();

            private IlinkNetTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkNetType.forNumber(i15) != null;
            }
        }

        IlinkNetType(int i15) {
            this.value = i15;
        }

        public static IlinkNetType forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    return null;
                }
                return kIlinkLonglink;
            }
            return kIlinkShortlink;
        }

        public static o0.d<IlinkNetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkNetTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkNetType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkPullLogCmd extends l0<IlinkPullLogCmd, Builder> implements IlinkPullLogCmdOrBuilder {
        private static final IlinkPullLogCmd DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 2;
        public static final int EXT_BUFFER_FIELD_NUMBER = 7;
        public static final int ILINK_APPIDS_FIELD_NUMBER = 5;
        public static final int ILINK_CAPATH_FIELD_NUMBER = 8;
        public static final int ILINK_LOGS_FIELD_NUMBER = 9;
        public static final int INCLUDE_DEVLOG_FIELD_NUMBER = 6;
        private static volatile w1<IlinkPullLogCmd> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 1;
        public static final int UPLOAD_TOKEN_FIELD_NUMBER = 3;
        public static final int USE_NETTYPE_FIELD_NUMBER = 4;
        private int bitField0_;
        private int endTime_;
        private boolean includeDevlog_;
        private int startTime_;
        private int useNettype_;
        private String uploadToken_ = "";
        private o0.j<String> ilinkAppids_ = l0.emptyProtobufList();
        private String extBuffer_ = "";
        private String ilinkCapath_ = "";
        private o0.j<String> ilinkLogs_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkPullLogCmd, Builder> implements IlinkPullLogCmdOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllIlinkAppids(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addAllIlinkAppids(iterable);
                return this;
            }

            public Builder addAllIlinkLogs(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addAllIlinkLogs(iterable);
                return this;
            }

            public Builder addIlinkAppids(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkAppids(str);
                return this;
            }

            public Builder addIlinkAppidsBytes(k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkAppidsBytes(kVar);
                return this;
            }

            public Builder addIlinkLogs(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkLogs(str);
                return this;
            }

            public Builder addIlinkLogsBytes(k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkLogsBytes(kVar);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearEndTime();
                return this;
            }

            public Builder clearExtBuffer() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearExtBuffer();
                return this;
            }

            public Builder clearIlinkAppids() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkAppids();
                return this;
            }

            public Builder clearIlinkCapath() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkCapath();
                return this;
            }

            public Builder clearIlinkLogs() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkLogs();
                return this;
            }

            public Builder clearIncludeDevlog() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIncludeDevlog();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearStartTime();
                return this;
            }

            public Builder clearUploadToken() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearUploadToken();
                return this;
            }

            public Builder clearUseNettype() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearUseNettype();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public int getEndTime() {
                return ((IlinkPullLogCmd) this.instance).getEndTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public String getExtBuffer() {
                return ((IlinkPullLogCmd) this.instance).getExtBuffer();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public k getExtBufferBytes() {
                return ((IlinkPullLogCmd) this.instance).getExtBufferBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public String getIlinkAppids(int i15) {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppids(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public k getIlinkAppidsBytes(int i15) {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppidsBytes(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public int getIlinkAppidsCount() {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppidsCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public List<String> getIlinkAppidsList() {
                return Collections.unmodifiableList(((IlinkPullLogCmd) this.instance).getIlinkAppidsList());
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public String getIlinkCapath() {
                return ((IlinkPullLogCmd) this.instance).getIlinkCapath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public k getIlinkCapathBytes() {
                return ((IlinkPullLogCmd) this.instance).getIlinkCapathBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public String getIlinkLogs(int i15) {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogs(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public k getIlinkLogsBytes(int i15) {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogsBytes(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public int getIlinkLogsCount() {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogsCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public List<String> getIlinkLogsList() {
                return Collections.unmodifiableList(((IlinkPullLogCmd) this.instance).getIlinkLogsList());
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean getIncludeDevlog() {
                return ((IlinkPullLogCmd) this.instance).getIncludeDevlog();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public int getStartTime() {
                return ((IlinkPullLogCmd) this.instance).getStartTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public String getUploadToken() {
                return ((IlinkPullLogCmd) this.instance).getUploadToken();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public k getUploadTokenBytes() {
                return ((IlinkPullLogCmd) this.instance).getUploadTokenBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public int getUseNettype() {
                return ((IlinkPullLogCmd) this.instance).getUseNettype();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasEndTime() {
                return ((IlinkPullLogCmd) this.instance).hasEndTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasExtBuffer() {
                return ((IlinkPullLogCmd) this.instance).hasExtBuffer();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasIlinkCapath() {
                return ((IlinkPullLogCmd) this.instance).hasIlinkCapath();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasIncludeDevlog() {
                return ((IlinkPullLogCmd) this.instance).hasIncludeDevlog();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasStartTime() {
                return ((IlinkPullLogCmd) this.instance).hasStartTime();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasUploadToken() {
                return ((IlinkPullLogCmd) this.instance).hasUploadToken();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
            public boolean hasUseNettype() {
                return ((IlinkPullLogCmd) this.instance).hasUseNettype();
            }

            public Builder setEndTime(int i15) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setEndTime(i15);
                return this;
            }

            public Builder setExtBuffer(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setExtBuffer(str);
                return this;
            }

            public Builder setExtBufferBytes(k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setExtBufferBytes(kVar);
                return this;
            }

            public Builder setIlinkAppids(int i15, String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkAppids(i15, str);
                return this;
            }

            public Builder setIlinkCapath(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkCapath(str);
                return this;
            }

            public Builder setIlinkCapathBytes(k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkCapathBytes(kVar);
                return this;
            }

            public Builder setIlinkLogs(int i15, String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkLogs(i15, str);
                return this;
            }

            public Builder setIncludeDevlog(boolean z15) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIncludeDevlog(z15);
                return this;
            }

            public Builder setStartTime(int i15) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setStartTime(i15);
                return this;
            }

            public Builder setUploadToken(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUploadToken(str);
                return this;
            }

            public Builder setUploadTokenBytes(k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUploadTokenBytes(kVar);
                return this;
            }

            public Builder setUseNettype(int i15) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUseNettype(i15);
                return this;
            }

            private Builder() {
                super(IlinkPullLogCmd.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkPullLogCmd ilinkPullLogCmd = new IlinkPullLogCmd();
            DEFAULT_INSTANCE = ilinkPullLogCmd;
            l0.registerDefaultInstance(IlinkPullLogCmd.class, ilinkPullLogCmd);
        }

        private IlinkPullLogCmd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIlinkAppids(Iterable<String> iterable) {
            ensureIlinkAppidsIsMutable();
            b.addAll((Iterable) iterable, (List) this.ilinkAppids_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIlinkLogs(Iterable<String> iterable) {
            ensureIlinkLogsIsMutable();
            b.addAll((Iterable) iterable, (List) this.ilinkLogs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIlinkAppids(String str) {
            str.getClass();
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIlinkAppidsBytes(k kVar) {
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.add(kVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIlinkLogs(String str) {
            str.getClass();
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIlinkLogsBytes(k kVar) {
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.add(kVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtBuffer() {
            this.bitField0_ &= -33;
            this.extBuffer_ = getDefaultInstance().getExtBuffer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlinkAppids() {
            this.ilinkAppids_ = l0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlinkCapath() {
            this.bitField0_ &= -65;
            this.ilinkCapath_ = getDefaultInstance().getIlinkCapath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIlinkLogs() {
            this.ilinkLogs_ = l0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncludeDevlog() {
            this.bitField0_ &= -17;
            this.includeDevlog_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadToken() {
            this.bitField0_ &= -5;
            this.uploadToken_ = getDefaultInstance().getUploadToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseNettype() {
            this.bitField0_ &= -9;
            this.useNettype_ = 0;
        }

        private void ensureIlinkAppidsIsMutable() {
            o0.j<String> jVar = this.ilinkAppids_;
            if (jVar.Q()) {
                return;
            }
            this.ilinkAppids_ = l0.mutableCopy(jVar);
        }

        private void ensureIlinkLogsIsMutable() {
            o0.j<String> jVar = this.ilinkLogs_;
            if (jVar.Q()) {
                return;
            }
            this.ilinkLogs_ = l0.mutableCopy(jVar);
        }

        public static IlinkPullLogCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkPullLogCmd parseDelimitedFrom(InputStream inputStream) {
            return (IlinkPullLogCmd) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkPullLogCmd parseFrom(ByteBuffer byteBuffer) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkPullLogCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTime(int i15) {
            this.bitField0_ |= 2;
            this.endTime_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extBuffer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtBufferBytes(k kVar) {
            this.extBuffer_ = kVar.u();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkAppids(int i15, String str) {
            str.getClass();
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.set(i15, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkCapath(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.ilinkCapath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkCapathBytes(k kVar) {
            this.ilinkCapath_ = kVar.u();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIlinkLogs(int i15, String str) {
            str.getClass();
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.set(i15, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncludeDevlog(boolean z15) {
            this.bitField0_ |= 16;
            this.includeDevlog_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTime(int i15) {
            this.bitField0_ |= 1;
            this.startTime_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadToken(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.uploadToken_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadTokenBytes(k kVar) {
            this.uploadToken_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseNettype(int i15) {
            this.bitField0_ |= 8;
            this.useNettype_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005\u001a\u0006ဇ\u0004\u0007ဈ\u0005\bဈ\u0006\t\u001a", new Object[]{"bitField0_", "startTime_", "endTime_", "uploadToken_", "useNettype_", "ilinkAppids_", "includeDevlog_", "extBuffer_", "ilinkCapath_", "ilinkLogs_"});
                case 3:
                    return new IlinkPullLogCmd();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkPullLogCmd> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkPullLogCmd.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public int getEndTime() {
            return this.endTime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public String getExtBuffer() {
            return this.extBuffer_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public k getExtBufferBytes() {
            return k.k(this.extBuffer_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public String getIlinkAppids(int i15) {
            return this.ilinkAppids_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public k getIlinkAppidsBytes(int i15) {
            return k.k(this.ilinkAppids_.get(i15));
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public int getIlinkAppidsCount() {
            return this.ilinkAppids_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public List<String> getIlinkAppidsList() {
            return this.ilinkAppids_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public String getIlinkCapath() {
            return this.ilinkCapath_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public k getIlinkCapathBytes() {
            return k.k(this.ilinkCapath_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public String getIlinkLogs(int i15) {
            return this.ilinkLogs_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public k getIlinkLogsBytes(int i15) {
            return k.k(this.ilinkLogs_.get(i15));
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public int getIlinkLogsCount() {
            return this.ilinkLogs_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public List<String> getIlinkLogsList() {
            return this.ilinkLogs_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean getIncludeDevlog() {
            return this.includeDevlog_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public int getStartTime() {
            return this.startTime_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public String getUploadToken() {
            return this.uploadToken_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public k getUploadTokenBytes() {
            return k.k(this.uploadToken_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public int getUseNettype() {
            return this.useNettype_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasExtBuffer() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasIlinkCapath() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasIncludeDevlog() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasUploadToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkPullLogCmdOrBuilder
        public boolean hasUseNettype() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkPullLogCmd ilinkPullLogCmd) {
            return DEFAULT_INSTANCE.createBuilder(ilinkPullLogCmd);
        }

        public static IlinkPullLogCmd parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(k kVar) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkPullLogCmd parseFrom(k kVar, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(byte[] bArr) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkPullLogCmd parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(InputStream inputStream) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkPullLogCmd parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(l lVar) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkPullLogCmd parseFrom(l lVar, a0 a0Var) {
            return (IlinkPullLogCmd) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkPullLogCmdOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        int getEndTime();

        String getExtBuffer();

        k getExtBufferBytes();

        String getIlinkAppids(int i15);

        k getIlinkAppidsBytes(int i15);

        int getIlinkAppidsCount();

        List<String> getIlinkAppidsList();

        String getIlinkCapath();

        k getIlinkCapathBytes();

        String getIlinkLogs(int i15);

        k getIlinkLogsBytes(int i15);

        int getIlinkLogsCount();

        List<String> getIlinkLogsList();

        boolean getIncludeDevlog();

        int getStartTime();

        String getUploadToken();

        k getUploadTokenBytes();

        int getUseNettype();

        boolean hasEndTime();

        boolean hasExtBuffer();

        boolean hasIlinkCapath();

        boolean hasIncludeDevlog();

        boolean hasStartTime();

        boolean hasUploadToken();

        boolean hasUseNettype();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkPullLogNetType implements o0.c {
        kIlinkLan(0),
        kIlinkAny(1);
        
        private static final o0.d<IlinkPullLogNetType> internalValueMap = new o0.d<IlinkPullLogNetType>() { // from class: com.tencent.ilink.network.Proto.IlinkPullLogNetType.1
            @Override // com.google.protobuf.o0.d
            public IlinkPullLogNetType findValueByNumber(int i15) {
                return IlinkPullLogNetType.forNumber(i15);
            }
        };
        public static final int kIlinkAny_VALUE = 1;
        public static final int kIlinkLan_VALUE = 0;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkPullLogNetTypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkPullLogNetTypeVerifier();

            private IlinkPullLogNetTypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkPullLogNetType.forNumber(i15) != null;
            }
        }

        IlinkPullLogNetType(int i15) {
            this.value = i15;
        }

        public static IlinkPullLogNetType forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    return null;
                }
                return kIlinkAny;
            }
            return kIlinkLan;
        }

        public static o0.d<IlinkPullLogNetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkPullLogNetTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkPullLogNetType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public enum IlinkReqCGIType implements o0.c {
        kIlinkCGITypeDirect(0),
        kIlinkCGITypeH5Transfer(1);
        
        private static final o0.d<IlinkReqCGIType> internalValueMap = new o0.d<IlinkReqCGIType>() { // from class: com.tencent.ilink.network.Proto.IlinkReqCGIType.1
            @Override // com.google.protobuf.o0.d
            public IlinkReqCGIType findValueByNumber(int i15) {
                return IlinkReqCGIType.forNumber(i15);
            }
        };
        public static final int kIlinkCGITypeDirect_VALUE = 0;
        public static final int kIlinkCGITypeH5Transfer_VALUE = 1;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkReqCGITypeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkReqCGITypeVerifier();

            private IlinkReqCGITypeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkReqCGIType.forNumber(i15) != null;
            }
        }

        IlinkReqCGIType(int i15) {
            this.value = i15;
        }

        public static IlinkReqCGIType forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    return null;
                }
                return kIlinkCGITypeH5Transfer;
            }
            return kIlinkCGITypeDirect;
        }

        public static o0.d<IlinkReqCGIType> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkReqCGITypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkReqCGIType valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkRequestInfo extends l0<IlinkRequestInfo, Builder> implements IlinkRequestInfoOrBuilder {
        public static final int BODY_FIELD_NUMBER = 3;
        public static final int CGI_TYPE_FIELD_NUMBER = 14;
        public static final int CMDID_FIELD_NUMBER = 1;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 12;
        public static final int CRYPTO_ALGO_FIELD_NUMBER = 7;
        private static final IlinkRequestInfo DEFAULT_INSTANCE;
        public static final int LIMIT_FLOW_FIELD_NUMBER = 8;
        public static final int LIMIT_FREQUENCY_FIELD_NUMBER = 9;
        public static final int LONG_POLLING_FIELD_NUMBER = 10;
        public static final int LONG_POLLING_TIMEOUT_FIELD_NUMBER = 11;
        public static final int NETWORK_STATUS_SENSITIVE_FIELD_NUMBER = 13;
        public static final int NET_TYPE_FIELD_NUMBER = 6;
        private static volatile w1<IlinkRequestInfo> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 5;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
        public static final int URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cgiType_;
        private int cmdid_;
        private boolean limitFlow_;
        private boolean limitFrequency_;
        private int longPollingTimeout_;
        private boolean longPolling_;
        private boolean networkStatusSensitive_;
        private int retryCount_;
        private int timeoutMs_;
        private String url_ = "";
        private k body_ = k.f21365e;
        private int netType_ = 1;
        private int cryptoAlgo_ = 1;
        private int contentType_ = 1;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkRequestInfo, Builder> implements IlinkRequestInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearBody();
                return this;
            }

            public Builder clearCgiType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCgiType();
                return this;
            }

            public Builder clearCmdid() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCmdid();
                return this;
            }

            public Builder clearContentType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearContentType();
                return this;
            }

            public Builder clearCryptoAlgo() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCryptoAlgo();
                return this;
            }

            public Builder clearLimitFlow() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLimitFlow();
                return this;
            }

            public Builder clearLimitFrequency() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLimitFrequency();
                return this;
            }

            public Builder clearLongPolling() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLongPolling();
                return this;
            }

            public Builder clearLongPollingTimeout() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLongPollingTimeout();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearNetType();
                return this;
            }

            public Builder clearNetworkStatusSensitive() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearNetworkStatusSensitive();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearTimeoutMs();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearUrl();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public k getBody() {
                return ((IlinkRequestInfo) this.instance).getBody();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public IlinkReqCGIType getCgiType() {
                return ((IlinkRequestInfo) this.instance).getCgiType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public int getCmdid() {
                return ((IlinkRequestInfo) this.instance).getCmdid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public IlinkContentType getContentType() {
                return ((IlinkRequestInfo) this.instance).getContentType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public IlinkCryptoAlgo getCryptoAlgo() {
                return ((IlinkRequestInfo) this.instance).getCryptoAlgo();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean getLimitFlow() {
                return ((IlinkRequestInfo) this.instance).getLimitFlow();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean getLimitFrequency() {
                return ((IlinkRequestInfo) this.instance).getLimitFrequency();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean getLongPolling() {
                return ((IlinkRequestInfo) this.instance).getLongPolling();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public int getLongPollingTimeout() {
                return ((IlinkRequestInfo) this.instance).getLongPollingTimeout();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public IlinkNetType getNetType() {
                return ((IlinkRequestInfo) this.instance).getNetType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean getNetworkStatusSensitive() {
                return ((IlinkRequestInfo) this.instance).getNetworkStatusSensitive();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public int getRetryCount() {
                return ((IlinkRequestInfo) this.instance).getRetryCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public int getTimeoutMs() {
                return ((IlinkRequestInfo) this.instance).getTimeoutMs();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public String getUrl() {
                return ((IlinkRequestInfo) this.instance).getUrl();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public k getUrlBytes() {
                return ((IlinkRequestInfo) this.instance).getUrlBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasBody() {
                return ((IlinkRequestInfo) this.instance).hasBody();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasCgiType() {
                return ((IlinkRequestInfo) this.instance).hasCgiType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasCmdid() {
                return ((IlinkRequestInfo) this.instance).hasCmdid();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasContentType() {
                return ((IlinkRequestInfo) this.instance).hasContentType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasCryptoAlgo() {
                return ((IlinkRequestInfo) this.instance).hasCryptoAlgo();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasLimitFlow() {
                return ((IlinkRequestInfo) this.instance).hasLimitFlow();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasLimitFrequency() {
                return ((IlinkRequestInfo) this.instance).hasLimitFrequency();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasLongPolling() {
                return ((IlinkRequestInfo) this.instance).hasLongPolling();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasLongPollingTimeout() {
                return ((IlinkRequestInfo) this.instance).hasLongPollingTimeout();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasNetType() {
                return ((IlinkRequestInfo) this.instance).hasNetType();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasNetworkStatusSensitive() {
                return ((IlinkRequestInfo) this.instance).hasNetworkStatusSensitive();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasRetryCount() {
                return ((IlinkRequestInfo) this.instance).hasRetryCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasTimeoutMs() {
                return ((IlinkRequestInfo) this.instance).hasTimeoutMs();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
            public boolean hasUrl() {
                return ((IlinkRequestInfo) this.instance).hasUrl();
            }

            public Builder setBody(k kVar) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setBody(kVar);
                return this;
            }

            public Builder setCgiType(IlinkReqCGIType ilinkReqCGIType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCgiType(ilinkReqCGIType);
                return this;
            }

            public Builder setCmdid(int i15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCmdid(i15);
                return this;
            }

            public Builder setContentType(IlinkContentType ilinkContentType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setContentType(ilinkContentType);
                return this;
            }

            public Builder setCryptoAlgo(IlinkCryptoAlgo ilinkCryptoAlgo) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCryptoAlgo(ilinkCryptoAlgo);
                return this;
            }

            public Builder setLimitFlow(boolean z15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLimitFlow(z15);
                return this;
            }

            public Builder setLimitFrequency(boolean z15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLimitFrequency(z15);
                return this;
            }

            public Builder setLongPolling(boolean z15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLongPolling(z15);
                return this;
            }

            public Builder setLongPollingTimeout(int i15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLongPollingTimeout(i15);
                return this;
            }

            public Builder setNetType(IlinkNetType ilinkNetType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setNetType(ilinkNetType);
                return this;
            }

            public Builder setNetworkStatusSensitive(boolean z15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setNetworkStatusSensitive(z15);
                return this;
            }

            public Builder setRetryCount(int i15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setRetryCount(i15);
                return this;
            }

            public Builder setTimeoutMs(int i15) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setTimeoutMs(i15);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(k kVar) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkRequestInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkRequestInfo ilinkRequestInfo = new IlinkRequestInfo();
            DEFAULT_INSTANCE = ilinkRequestInfo;
            l0.registerDefaultInstance(IlinkRequestInfo.class, ilinkRequestInfo);
        }

        private IlinkRequestInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -5;
            this.body_ = getDefaultInstance().getBody();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCgiType() {
            this.bitField0_ &= -8193;
            this.cgiType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdid() {
            this.bitField0_ &= -2;
            this.cmdid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentType() {
            this.bitField0_ &= -2049;
            this.contentType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCryptoAlgo() {
            this.bitField0_ &= -65;
            this.cryptoAlgo_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitFlow() {
            this.bitField0_ &= -129;
            this.limitFlow_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitFrequency() {
            this.bitField0_ &= -257;
            this.limitFrequency_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongPolling() {
            this.bitField0_ &= -513;
            this.longPolling_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongPollingTimeout() {
            this.bitField0_ &= -1025;
            this.longPollingTimeout_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -33;
            this.netType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkStatusSensitive() {
            this.bitField0_ &= -4097;
            this.networkStatusSensitive_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -17;
            this.retryCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -9;
            this.timeoutMs_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static IlinkRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkRequestInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkRequestInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.body_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCgiType(IlinkReqCGIType ilinkReqCGIType) {
            this.cgiType_ = ilinkReqCGIType.getNumber();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdid(int i15) {
            this.bitField0_ |= 1;
            this.cmdid_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentType(IlinkContentType ilinkContentType) {
            this.contentType_ = ilinkContentType.getNumber();
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCryptoAlgo(IlinkCryptoAlgo ilinkCryptoAlgo) {
            this.cryptoAlgo_ = ilinkCryptoAlgo.getNumber();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitFlow(boolean z15) {
            this.bitField0_ |= 128;
            this.limitFlow_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitFrequency(boolean z15) {
            this.bitField0_ |= 256;
            this.limitFrequency_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongPolling(boolean z15) {
            this.bitField0_ |= 512;
            this.longPolling_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongPollingTimeout(int i15) {
            this.bitField0_ |= 1024;
            this.longPollingTimeout_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetType(IlinkNetType ilinkNetType) {
            this.netType_ = ilinkNetType.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkStatusSensitive(boolean z15) {
            this.bitField0_ |= 4096;
            this.networkStatusSensitive_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryCount(int i15) {
            this.bitField0_ |= 16;
            this.retryCount_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutMs(int i15) {
            this.bitField0_ |= 8;
            this.timeoutMs_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(k kVar) {
            this.url_ = kVar.u();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bင\n\fဌ\u000b\rဇ\f\u000eဌ\r", new Object[]{"bitField0_", "cmdid_", "url_", "body_", "timeoutMs_", "retryCount_", "netType_", IlinkNetType.internalGetVerifier(), "cryptoAlgo_", IlinkCryptoAlgo.internalGetVerifier(), "limitFlow_", "limitFrequency_", "longPolling_", "longPollingTimeout_", "contentType_", IlinkContentType.internalGetVerifier(), "networkStatusSensitive_", "cgiType_", IlinkReqCGIType.internalGetVerifier()});
                case 3:
                    return new IlinkRequestInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkRequestInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkRequestInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public k getBody() {
            return this.body_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public IlinkReqCGIType getCgiType() {
            IlinkReqCGIType forNumber = IlinkReqCGIType.forNumber(this.cgiType_);
            return forNumber == null ? IlinkReqCGIType.kIlinkCGITypeDirect : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public int getCmdid() {
            return this.cmdid_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public IlinkContentType getContentType() {
            IlinkContentType forNumber = IlinkContentType.forNumber(this.contentType_);
            return forNumber == null ? IlinkContentType.kIlinkContentTypeProtobuf : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public IlinkCryptoAlgo getCryptoAlgo() {
            IlinkCryptoAlgo forNumber = IlinkCryptoAlgo.forNumber(this.cryptoAlgo_);
            return forNumber == null ? IlinkCryptoAlgo.kIlinkSession : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean getLimitFlow() {
            return this.limitFlow_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean getLimitFrequency() {
            return this.limitFrequency_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean getLongPolling() {
            return this.longPolling_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public int getLongPollingTimeout() {
            return this.longPollingTimeout_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public IlinkNetType getNetType() {
            IlinkNetType forNumber = IlinkNetType.forNumber(this.netType_);
            return forNumber == null ? IlinkNetType.kIlinkLonglink : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean getNetworkStatusSensitive() {
            return this.networkStatusSensitive_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public int getRetryCount() {
            return this.retryCount_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public k getUrlBytes() {
            return k.k(this.url_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasCgiType() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasCmdid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasContentType() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasCryptoAlgo() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasLimitFlow() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasLimitFrequency() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasLongPolling() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasLongPollingTimeout() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasNetType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasNetworkStatusSensitive() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasRetryCount() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkRequestInfoOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkRequestInfo ilinkRequestInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkRequestInfo);
        }

        public static IlinkRequestInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkRequestInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkRequestInfo parseFrom(k kVar) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkRequestInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkRequestInfo parseFrom(byte[] bArr) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkRequestInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkRequestInfo parseFrom(InputStream inputStream) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkRequestInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkRequestInfo parseFrom(l lVar) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkRequestInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkRequestInfoOrBuilder extends k1 {
        k getBody();

        IlinkReqCGIType getCgiType();

        int getCmdid();

        IlinkContentType getContentType();

        IlinkCryptoAlgo getCryptoAlgo();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        boolean getLimitFlow();

        boolean getLimitFrequency();

        boolean getLongPolling();

        int getLongPollingTimeout();

        IlinkNetType getNetType();

        boolean getNetworkStatusSensitive();

        int getRetryCount();

        int getTimeoutMs();

        String getUrl();

        k getUrlBytes();

        boolean hasBody();

        boolean hasCgiType();

        boolean hasCmdid();

        boolean hasContentType();

        boolean hasCryptoAlgo();

        boolean hasLimitFlow();

        boolean hasLimitFrequency();

        boolean hasLongPolling();

        boolean hasLongPollingTimeout();

        boolean hasNetType();

        boolean hasNetworkStatusSensitive();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        boolean hasUrl();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public enum IlinkRunningMode implements o0.c {
        kIlinkDeviceMode(0),
        kIlinkAppMode(1);
        
        private static final o0.d<IlinkRunningMode> internalValueMap = new o0.d<IlinkRunningMode>() { // from class: com.tencent.ilink.network.Proto.IlinkRunningMode.1
            @Override // com.google.protobuf.o0.d
            public IlinkRunningMode findValueByNumber(int i15) {
                return IlinkRunningMode.forNumber(i15);
            }
        };
        public static final int kIlinkAppMode_VALUE = 1;
        public static final int kIlinkDeviceMode_VALUE = 0;
        private final int value;

        /* loaded from: classes11.dex */
        public static final class IlinkRunningModeVerifier implements o0.e {
            public static final o0.e INSTANCE = new IlinkRunningModeVerifier();

            private IlinkRunningModeVerifier() {
            }

            @Override // com.google.protobuf.o0.e
            public boolean isInRange(int i15) {
                return IlinkRunningMode.forNumber(i15) != null;
            }
        }

        IlinkRunningMode(int i15) {
            this.value = i15;
        }

        public static IlinkRunningMode forNumber(int i15) {
            if (i15 != 0) {
                if (i15 != 1) {
                    return null;
                }
                return kIlinkAppMode;
            }
            return kIlinkDeviceMode;
        }

        public static o0.d<IlinkRunningMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static o0.e internalGetVerifier() {
            return IlinkRunningModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkRunningMode valueOf(int i15) {
            return forNumber(i15);
        }
    }

    /* loaded from: classes11.dex */
    public static final class IlinkServerIplist extends l0<IlinkServerIplist, Builder> implements IlinkServerIplistOrBuilder {
        private static final IlinkServerIplist DEFAULT_INSTANCE;
        private static volatile w1<IlinkServerIplist> PARSER = null;
        public static final int SVR_IPLIST_FIELD_NUMBER = 1;
        private o0.j<String> svrIplist_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkServerIplist, Builder> implements IlinkServerIplistOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllSvrIplist(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addAllSvrIplist(iterable);
                return this;
            }

            public Builder addSvrIplist(String str) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addSvrIplist(str);
                return this;
            }

            public Builder addSvrIplistBytes(k kVar) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addSvrIplistBytes(kVar);
                return this;
            }

            public Builder clearSvrIplist() {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).clearSvrIplist();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
            public String getSvrIplist(int i15) {
                return ((IlinkServerIplist) this.instance).getSvrIplist(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
            public k getSvrIplistBytes(int i15) {
                return ((IlinkServerIplist) this.instance).getSvrIplistBytes(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
            public int getSvrIplistCount() {
                return ((IlinkServerIplist) this.instance).getSvrIplistCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
            public List<String> getSvrIplistList() {
                return Collections.unmodifiableList(((IlinkServerIplist) this.instance).getSvrIplistList());
            }

            public Builder setSvrIplist(int i15, String str) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).setSvrIplist(i15, str);
                return this;
            }

            private Builder() {
                super(IlinkServerIplist.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkServerIplist ilinkServerIplist = new IlinkServerIplist();
            DEFAULT_INSTANCE = ilinkServerIplist;
            l0.registerDefaultInstance(IlinkServerIplist.class, ilinkServerIplist);
        }

        private IlinkServerIplist() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSvrIplist(Iterable<String> iterable) {
            ensureSvrIplistIsMutable();
            b.addAll((Iterable) iterable, (List) this.svrIplist_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvrIplist(String str) {
            str.getClass();
            ensureSvrIplistIsMutable();
            this.svrIplist_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSvrIplistBytes(k kVar) {
            ensureSvrIplistIsMutable();
            this.svrIplist_.add(kVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSvrIplist() {
            this.svrIplist_ = l0.emptyProtobufList();
        }

        private void ensureSvrIplistIsMutable() {
            o0.j<String> jVar = this.svrIplist_;
            if (jVar.Q()) {
                return;
            }
            this.svrIplist_ = l0.mutableCopy(jVar);
        }

        public static IlinkServerIplist getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkServerIplist parseDelimitedFrom(InputStream inputStream) {
            return (IlinkServerIplist) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkServerIplist parseFrom(ByteBuffer byteBuffer) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkServerIplist> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSvrIplist(int i15, String str) {
            str.getClass();
            ensureSvrIplistIsMutable();
            this.svrIplist_.set(i15, str);
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"svrIplist_"});
                case 3:
                    return new IlinkServerIplist();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkServerIplist> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkServerIplist.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
        public String getSvrIplist(int i15) {
            return this.svrIplist_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
        public k getSvrIplistBytes(int i15) {
            return k.k(this.svrIplist_.get(i15));
        }

        @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
        public int getSvrIplistCount() {
            return this.svrIplist_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkServerIplistOrBuilder
        public List<String> getSvrIplistList() {
            return this.svrIplist_;
        }

        public static Builder newBuilder(IlinkServerIplist ilinkServerIplist) {
            return DEFAULT_INSTANCE.createBuilder(ilinkServerIplist);
        }

        public static IlinkServerIplist parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkServerIplist) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkServerIplist parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkServerIplist parseFrom(k kVar) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkServerIplist parseFrom(k kVar, a0 a0Var) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkServerIplist parseFrom(byte[] bArr) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkServerIplist parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkServerIplist parseFrom(InputStream inputStream) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkServerIplist parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkServerIplist parseFrom(l lVar) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkServerIplist parseFrom(l lVar, a0 a0Var) {
            return (IlinkServerIplist) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkServerIplistOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getSvrIplist(int i15);

        k getSvrIplistBytes(int i15);

        int getSvrIplistCount();

        List<String> getSvrIplistList();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkSmcBaseInfo extends l0<IlinkSmcBaseInfo, Builder> implements IlinkSmcBaseInfoOrBuilder {
        private static final IlinkSmcBaseInfo DEFAULT_INSTANCE;
        public static final int DEVICE_BRAND_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 1;
        public static final int LANGUAGE_VER_FIELD_NUMBER = 5;
        public static final int OSNAME_FIELD_NUMBER = 3;
        public static final int OSVERSION_FIELD_NUMBER = 4;
        private static volatile w1<IlinkSmcBaseInfo> PARSER;
        private int bitField0_;
        private String deviceModel_ = "";
        private String deviceBrand_ = "";
        private String osname_ = "";
        private String osversion_ = "";
        private String languageVer_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkSmcBaseInfo, Builder> implements IlinkSmcBaseInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDeviceBrand() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearDeviceBrand();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearLanguageVer() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearLanguageVer();
                return this;
            }

            public Builder clearOsname() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearOsname();
                return this;
            }

            public Builder clearOsversion() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearOsversion();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public String getDeviceBrand() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceBrand();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public k getDeviceBrandBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceBrandBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public String getDeviceModel() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceModel();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public k getDeviceModelBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceModelBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public String getLanguageVer() {
                return ((IlinkSmcBaseInfo) this.instance).getLanguageVer();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public k getLanguageVerBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getLanguageVerBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public String getOsname() {
                return ((IlinkSmcBaseInfo) this.instance).getOsname();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public k getOsnameBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getOsnameBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public String getOsversion() {
                return ((IlinkSmcBaseInfo) this.instance).getOsversion();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public k getOsversionBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getOsversionBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public boolean hasDeviceBrand() {
                return ((IlinkSmcBaseInfo) this.instance).hasDeviceBrand();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public boolean hasDeviceModel() {
                return ((IlinkSmcBaseInfo) this.instance).hasDeviceModel();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public boolean hasLanguageVer() {
                return ((IlinkSmcBaseInfo) this.instance).hasLanguageVer();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public boolean hasOsname() {
                return ((IlinkSmcBaseInfo) this.instance).hasOsname();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
            public boolean hasOsversion() {
                return ((IlinkSmcBaseInfo) this.instance).hasOsversion();
            }

            public Builder setDeviceBrand(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceBrand(str);
                return this;
            }

            public Builder setDeviceBrandBytes(k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceBrandBytes(kVar);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceModelBytes(kVar);
                return this;
            }

            public Builder setLanguageVer(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setLanguageVer(str);
                return this;
            }

            public Builder setLanguageVerBytes(k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setLanguageVerBytes(kVar);
                return this;
            }

            public Builder setOsname(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsname(str);
                return this;
            }

            public Builder setOsnameBytes(k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsnameBytes(kVar);
                return this;
            }

            public Builder setOsversion(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsversion(str);
                return this;
            }

            public Builder setOsversionBytes(k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsversionBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkSmcBaseInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkSmcBaseInfo ilinkSmcBaseInfo = new IlinkSmcBaseInfo();
            DEFAULT_INSTANCE = ilinkSmcBaseInfo;
            l0.registerDefaultInstance(IlinkSmcBaseInfo.class, ilinkSmcBaseInfo);
        }

        private IlinkSmcBaseInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceBrand() {
            this.bitField0_ &= -3;
            this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.bitField0_ &= -2;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguageVer() {
            this.bitField0_ &= -17;
            this.languageVer_ = getDefaultInstance().getLanguageVer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsname() {
            this.bitField0_ &= -5;
            this.osname_ = getDefaultInstance().getOsname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsversion() {
            this.bitField0_ &= -9;
            this.osversion_ = getDefaultInstance().getOsversion();
        }

        public static IlinkSmcBaseInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkSmcBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkSmcBaseInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSmcBaseInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkSmcBaseInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBrand(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.deviceBrand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBrandBytes(k kVar) {
            this.deviceBrand_ = kVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(k kVar) {
            this.deviceModel_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageVer(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.languageVer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageVerBytes(k kVar) {
            this.languageVer_ = kVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsname(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.osname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsnameBytes(k kVar) {
            this.osname_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsversion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.osversion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsversionBytes(k kVar) {
            this.osversion_ = kVar.u();
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "deviceModel_", "deviceBrand_", "osname_", "osversion_", "languageVer_"});
                case 3:
                    return new IlinkSmcBaseInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkSmcBaseInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkSmcBaseInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public String getDeviceBrand() {
            return this.deviceBrand_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public k getDeviceBrandBytes() {
            return k.k(this.deviceBrand_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public k getDeviceModelBytes() {
            return k.k(this.deviceModel_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public String getLanguageVer() {
            return this.languageVer_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public k getLanguageVerBytes() {
            return k.k(this.languageVer_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public String getOsname() {
            return this.osname_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public k getOsnameBytes() {
            return k.k(this.osname_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public String getOsversion() {
            return this.osversion_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public k getOsversionBytes() {
            return k.k(this.osversion_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public boolean hasDeviceBrand() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public boolean hasDeviceModel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public boolean hasLanguageVer() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public boolean hasOsname() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSmcBaseInfoOrBuilder
        public boolean hasOsversion() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkSmcBaseInfo ilinkSmcBaseInfo) {
            return DEFAULT_INSTANCE.createBuilder(ilinkSmcBaseInfo);
        }

        public static IlinkSmcBaseInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(k kVar) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkSmcBaseInfo parseFrom(k kVar, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(byte[] bArr) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkSmcBaseInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(InputStream inputStream) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSmcBaseInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(l lVar) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkSmcBaseInfo parseFrom(l lVar, a0 a0Var) {
            return (IlinkSmcBaseInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkSmcBaseInfoOrBuilder extends k1 {
        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getDeviceBrand();

        k getDeviceBrandBytes();

        String getDeviceModel();

        k getDeviceModelBytes();

        String getLanguageVer();

        k getLanguageVerBytes();

        String getOsname();

        k getOsnameBytes();

        String getOsversion();

        k getOsversionBytes();

        boolean hasDeviceBrand();

        boolean hasDeviceModel();

        boolean hasLanguageVer();

        boolean hasOsname();

        boolean hasOsversion();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkStartConfig extends l0<IlinkStartConfig, Builder> implements IlinkStartConfigOrBuilder {
        public static final int APP_VERSION_FIELD_NUMBER = 6;
        public static final int DEBUG_IP_FIELD_NUMBER = 3;
        public static final int DEBUG_NET_FIELD_NUMBER = 2;
        private static final IlinkStartConfig DEFAULT_INSTANCE;
        public static final int FILE_DIR_FIELD_NUMBER = 1;
        private static volatile w1<IlinkStartConfig> PARSER = null;
        public static final int RUNNING_MODE_FIELD_NUMBER = 5;
        public static final int SELECT_DOMAIN_FIELD_NUMBER = 4;
        private int appVersion_;
        private int bitField0_;
        private int debugNet_;
        private int runningMode_;
        private int selectDomain_;
        private String fileDir_ = "";
        private String debugIp_ = "";

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkStartConfig, Builder> implements IlinkStartConfigOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearDebugIp() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearDebugIp();
                return this;
            }

            public Builder clearDebugNet() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearDebugNet();
                return this;
            }

            public Builder clearFileDir() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearFileDir();
                return this;
            }

            public Builder clearRunningMode() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearRunningMode();
                return this;
            }

            public Builder clearSelectDomain() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearSelectDomain();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public int getAppVersion() {
                return ((IlinkStartConfig) this.instance).getAppVersion();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public String getDebugIp() {
                return ((IlinkStartConfig) this.instance).getDebugIp();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public k getDebugIpBytes() {
                return ((IlinkStartConfig) this.instance).getDebugIpBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public int getDebugNet() {
                return ((IlinkStartConfig) this.instance).getDebugNet();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public String getFileDir() {
                return ((IlinkStartConfig) this.instance).getFileDir();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public k getFileDirBytes() {
                return ((IlinkStartConfig) this.instance).getFileDirBytes();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public IlinkRunningMode getRunningMode() {
                return ((IlinkStartConfig) this.instance).getRunningMode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public int getSelectDomain() {
                return ((IlinkStartConfig) this.instance).getSelectDomain();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasAppVersion() {
                return ((IlinkStartConfig) this.instance).hasAppVersion();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasDebugIp() {
                return ((IlinkStartConfig) this.instance).hasDebugIp();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasDebugNet() {
                return ((IlinkStartConfig) this.instance).hasDebugNet();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasFileDir() {
                return ((IlinkStartConfig) this.instance).hasFileDir();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasRunningMode() {
                return ((IlinkStartConfig) this.instance).hasRunningMode();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
            public boolean hasSelectDomain() {
                return ((IlinkStartConfig) this.instance).hasSelectDomain();
            }

            public Builder setAppVersion(int i15) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setAppVersion(i15);
                return this;
            }

            public Builder setDebugIp(String str) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugIp(str);
                return this;
            }

            public Builder setDebugIpBytes(k kVar) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugIpBytes(kVar);
                return this;
            }

            public Builder setDebugNet(int i15) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugNet(i15);
                return this;
            }

            public Builder setFileDir(String str) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setFileDir(str);
                return this;
            }

            public Builder setFileDirBytes(k kVar) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setFileDirBytes(kVar);
                return this;
            }

            public Builder setRunningMode(IlinkRunningMode ilinkRunningMode) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setRunningMode(ilinkRunningMode);
                return this;
            }

            public Builder setSelectDomain(int i15) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setSelectDomain(i15);
                return this;
            }

            private Builder() {
                super(IlinkStartConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkStartConfig ilinkStartConfig = new IlinkStartConfig();
            DEFAULT_INSTANCE = ilinkStartConfig;
            l0.registerDefaultInstance(IlinkStartConfig.class, ilinkStartConfig);
        }

        private IlinkStartConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.bitField0_ &= -33;
            this.appVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugIp() {
            this.bitField0_ &= -5;
            this.debugIp_ = getDefaultInstance().getDebugIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugNet() {
            this.bitField0_ &= -3;
            this.debugNet_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileDir() {
            this.bitField0_ &= -2;
            this.fileDir_ = getDefaultInstance().getFileDir();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRunningMode() {
            this.bitField0_ &= -17;
            this.runningMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelectDomain() {
            this.bitField0_ &= -9;
            this.selectDomain_ = 0;
        }

        public static IlinkStartConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkStartConfig parseDelimitedFrom(InputStream inputStream) {
            return (IlinkStartConfig) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkStartConfig parseFrom(ByteBuffer byteBuffer) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkStartConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersion(int i15) {
            this.bitField0_ |= 32;
            this.appVersion_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugIp(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.debugIp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugIpBytes(k kVar) {
            this.debugIp_ = kVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugNet(int i15) {
            this.bitField0_ |= 2;
            this.debugNet_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileDir(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fileDir_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileDirBytes(k kVar) {
            this.fileDir_ = kVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRunningMode(IlinkRunningMode ilinkRunningMode) {
            this.runningMode_ = ilinkRunningMode.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelectDomain(int i15) {
            this.bitField0_ |= 8;
            this.selectDomain_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဌ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "fileDir_", "debugNet_", "debugIp_", "selectDomain_", "runningMode_", IlinkRunningMode.internalGetVerifier(), "appVersion_"});
                case 3:
                    return new IlinkStartConfig();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkStartConfig> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkStartConfig.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public int getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public String getDebugIp() {
            return this.debugIp_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public k getDebugIpBytes() {
            return k.k(this.debugIp_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public int getDebugNet() {
            return this.debugNet_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public String getFileDir() {
            return this.fileDir_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public k getFileDirBytes() {
            return k.k(this.fileDir_);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public IlinkRunningMode getRunningMode() {
            IlinkRunningMode forNumber = IlinkRunningMode.forNumber(this.runningMode_);
            return forNumber == null ? IlinkRunningMode.kIlinkDeviceMode : forNumber;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public int getSelectDomain() {
            return this.selectDomain_;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasAppVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasDebugIp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasDebugNet() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasFileDir() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasRunningMode() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.IlinkStartConfigOrBuilder
        public boolean hasSelectDomain() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkStartConfig ilinkStartConfig) {
            return DEFAULT_INSTANCE.createBuilder(ilinkStartConfig);
        }

        public static IlinkStartConfig parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkStartConfig) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkStartConfig parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkStartConfig parseFrom(k kVar) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkStartConfig parseFrom(k kVar, a0 a0Var) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkStartConfig parseFrom(byte[] bArr) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkStartConfig parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkStartConfig parseFrom(InputStream inputStream) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkStartConfig parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkStartConfig parseFrom(l lVar) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkStartConfig parseFrom(l lVar, a0 a0Var) {
            return (IlinkStartConfig) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkStartConfigOrBuilder extends k1 {
        int getAppVersion();

        String getDebugIp();

        k getDebugIpBytes();

        int getDebugNet();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        String getFileDir();

        k getFileDirBytes();

        IlinkRunningMode getRunningMode();

        int getSelectDomain();

        boolean hasAppVersion();

        boolean hasDebugIp();

        boolean hasDebugNet();

        boolean hasFileDir();

        boolean hasRunningMode();

        boolean hasSelectDomain();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class IlinkSyncCmdList extends l0<IlinkSyncCmdList, Builder> implements IlinkSyncCmdListOrBuilder {
        public static final int CMDLIST_FIELD_NUMBER = 1;
        private static final IlinkSyncCmdList DEFAULT_INSTANCE;
        private static volatile w1<IlinkSyncCmdList> PARSER;
        private o0.j<IlinkCmdItem> cmdlist_ = l0.emptyProtobufList();

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<IlinkSyncCmdList, Builder> implements IlinkSyncCmdListOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCmdlist(Iterable<? extends IlinkCmdItem> iterable) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addAllCmdlist(iterable);
                return this;
            }

            public Builder addCmdlist(IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(ilinkCmdItem);
                return this;
            }

            public Builder clearCmdlist() {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).clearCmdlist();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
            public IlinkCmdItem getCmdlist(int i15) {
                return ((IlinkSyncCmdList) this.instance).getCmdlist(i15);
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
            public int getCmdlistCount() {
                return ((IlinkSyncCmdList) this.instance).getCmdlistCount();
            }

            @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
            public List<IlinkCmdItem> getCmdlistList() {
                return Collections.unmodifiableList(((IlinkSyncCmdList) this.instance).getCmdlistList());
            }

            public Builder removeCmdlist(int i15) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).removeCmdlist(i15);
                return this;
            }

            public Builder setCmdlist(int i15, IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).setCmdlist(i15, ilinkCmdItem);
                return this;
            }

            private Builder() {
                super(IlinkSyncCmdList.DEFAULT_INSTANCE);
            }

            public Builder addCmdlist(int i15, IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(i15, ilinkCmdItem);
                return this;
            }

            public Builder setCmdlist(int i15, IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).setCmdlist(i15, builder.build());
                return this;
            }

            public Builder addCmdlist(IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(builder.build());
                return this;
            }

            public Builder addCmdlist(int i15, IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(i15, builder.build());
                return this;
            }
        }

        static {
            IlinkSyncCmdList ilinkSyncCmdList = new IlinkSyncCmdList();
            DEFAULT_INSTANCE = ilinkSyncCmdList;
            l0.registerDefaultInstance(IlinkSyncCmdList.class, ilinkSyncCmdList);
        }

        private IlinkSyncCmdList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCmdlist(Iterable<? extends IlinkCmdItem> iterable) {
            ensureCmdlistIsMutable();
            b.addAll((Iterable) iterable, (List) this.cmdlist_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmdlist(IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.add(ilinkCmdItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmdlist() {
            this.cmdlist_ = l0.emptyProtobufList();
        }

        private void ensureCmdlistIsMutable() {
            o0.j<IlinkCmdItem> jVar = this.cmdlist_;
            if (jVar.Q()) {
                return;
            }
            this.cmdlist_ = l0.mutableCopy(jVar);
        }

        public static IlinkSyncCmdList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkSyncCmdList parseDelimitedFrom(InputStream inputStream) {
            return (IlinkSyncCmdList) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSyncCmdList parseFrom(ByteBuffer byteBuffer) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<IlinkSyncCmdList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCmdlist(int i15) {
            ensureCmdlistIsMutable();
            this.cmdlist_.remove(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmdlist(int i15, IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.set(i15, ilinkCmdItem);
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"cmdlist_", IlinkCmdItem.class});
                case 3:
                    return new IlinkSyncCmdList();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<IlinkSyncCmdList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkSyncCmdList.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
        public IlinkCmdItem getCmdlist(int i15) {
            return this.cmdlist_.get(i15);
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
        public int getCmdlistCount() {
            return this.cmdlist_.size();
        }

        @Override // com.tencent.ilink.network.Proto.IlinkSyncCmdListOrBuilder
        public List<IlinkCmdItem> getCmdlistList() {
            return this.cmdlist_;
        }

        public IlinkCmdItemOrBuilder getCmdlistOrBuilder(int i15) {
            return this.cmdlist_.get(i15);
        }

        public List<? extends IlinkCmdItemOrBuilder> getCmdlistOrBuilderList() {
            return this.cmdlist_;
        }

        public static Builder newBuilder(IlinkSyncCmdList ilinkSyncCmdList) {
            return DEFAULT_INSTANCE.createBuilder(ilinkSyncCmdList);
        }

        public static IlinkSyncCmdList parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(k kVar) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCmdlist(int i15, IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.add(i15, ilinkCmdItem);
        }

        public static IlinkSyncCmdList parseFrom(k kVar, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(byte[] bArr) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkSyncCmdList parseFrom(byte[] bArr, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(InputStream inputStream) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSyncCmdList parseFrom(InputStream inputStream, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(l lVar) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkSyncCmdList parseFrom(l lVar, a0 a0Var) {
            return (IlinkSyncCmdList) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface IlinkSyncCmdListOrBuilder extends k1 {
        IlinkCmdItem getCmdlist(int i15);

        int getCmdlistCount();

        List<IlinkCmdItem> getCmdlistList();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes11.dex */
    public static final class ResourceRequestInfo extends l0<ResourceRequestInfo, Builder> implements ResourceRequestInfoOrBuilder {
        public static final int APP_REQ_FIELD_NUMBER = 1;
        private static final ResourceRequestInfo DEFAULT_INSTANCE;
        public static final int LIMIT_FLOW_FIELD_NUMBER = 4;
        public static final int LIMIT_FREQUENCY_FIELD_NUMBER = 5;
        private static volatile w1<ResourceRequestInfo> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 3;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 2;
        private k appReq_ = k.f21365e;
        private int bitField0_;
        private boolean limitFlow_;
        private boolean limitFrequency_;
        private int retryCount_;
        private int timeoutMs_;

        /* loaded from: classes11.dex */
        public static final class Builder extends l0.a<ResourceRequestInfo, Builder> implements ResourceRequestInfoOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAppReq() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearAppReq();
                return this;
            }

            public Builder clearLimitFlow() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearLimitFlow();
                return this;
            }

            public Builder clearLimitFrequency() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearLimitFrequency();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearTimeoutMs();
                return this;
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public k getAppReq() {
                return ((ResourceRequestInfo) this.instance).getAppReq();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean getLimitFlow() {
                return ((ResourceRequestInfo) this.instance).getLimitFlow();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean getLimitFrequency() {
                return ((ResourceRequestInfo) this.instance).getLimitFrequency();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public int getRetryCount() {
                return ((ResourceRequestInfo) this.instance).getRetryCount();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public int getTimeoutMs() {
                return ((ResourceRequestInfo) this.instance).getTimeoutMs();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean hasAppReq() {
                return ((ResourceRequestInfo) this.instance).hasAppReq();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean hasLimitFlow() {
                return ((ResourceRequestInfo) this.instance).hasLimitFlow();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean hasLimitFrequency() {
                return ((ResourceRequestInfo) this.instance).hasLimitFrequency();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean hasRetryCount() {
                return ((ResourceRequestInfo) this.instance).hasRetryCount();
            }

            @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
            public boolean hasTimeoutMs() {
                return ((ResourceRequestInfo) this.instance).hasTimeoutMs();
            }

            public Builder setAppReq(k kVar) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setAppReq(kVar);
                return this;
            }

            public Builder setLimitFlow(boolean z15) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setLimitFlow(z15);
                return this;
            }

            public Builder setLimitFrequency(boolean z15) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setLimitFrequency(z15);
                return this;
            }

            public Builder setRetryCount(int i15) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setRetryCount(i15);
                return this;
            }

            public Builder setTimeoutMs(int i15) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setTimeoutMs(i15);
                return this;
            }

            private Builder() {
                super(ResourceRequestInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            ResourceRequestInfo resourceRequestInfo = new ResourceRequestInfo();
            DEFAULT_INSTANCE = resourceRequestInfo;
            l0.registerDefaultInstance(ResourceRequestInfo.class, resourceRequestInfo);
        }

        private ResourceRequestInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppReq() {
            this.bitField0_ &= -2;
            this.appReq_ = getDefaultInstance().getAppReq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitFlow() {
            this.bitField0_ &= -9;
            this.limitFlow_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitFrequency() {
            this.bitField0_ &= -17;
            this.limitFrequency_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -5;
            this.retryCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -3;
            this.timeoutMs_ = 0;
        }

        public static ResourceRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResourceRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (ResourceRequestInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static w1<ResourceRequestInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppReq(k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.appReq_ = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitFlow(boolean z15) {
            this.bitField0_ |= 8;
            this.limitFlow_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitFrequency(boolean z15) {
            this.bitField0_ |= 16;
            this.limitFrequency_ = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryCount(int i15) {
            this.bitField0_ |= 4;
            this.retryCount_ = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutMs(int i15) {
            this.bitField0_ |= 2;
            this.timeoutMs_ = i15;
        }

        @Override // com.google.protobuf.l0
        public final Object dynamicMethod(l0.f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "appReq_", "timeoutMs_", "retryCount_", "limitFlow_", "limitFrequency_"});
                case 3:
                    return new ResourceRequestInfo();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    w1<ResourceRequestInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ResourceRequestInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new l0.b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public k getAppReq() {
            return this.appReq_;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean getLimitFlow() {
            return this.limitFlow_;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean getLimitFrequency() {
            return this.limitFrequency_;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public int getRetryCount() {
            return this.retryCount_;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean hasAppReq() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean hasLimitFlow() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean hasLimitFrequency() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean hasRetryCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.ilink.network.Proto.ResourceRequestInfoOrBuilder
        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ResourceRequestInfo resourceRequestInfo) {
            return DEFAULT_INSTANCE.createBuilder(resourceRequestInfo);
        }

        public static ResourceRequestInfo parseDelimitedFrom(InputStream inputStream, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ResourceRequestInfo parseFrom(ByteBuffer byteBuffer, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ResourceRequestInfo parseFrom(k kVar) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ResourceRequestInfo parseFrom(k kVar, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ResourceRequestInfo parseFrom(byte[] bArr) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourceRequestInfo parseFrom(byte[] bArr, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ResourceRequestInfo parseFrom(InputStream inputStream) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceRequestInfo parseFrom(InputStream inputStream, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ResourceRequestInfo parseFrom(l lVar) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ResourceRequestInfo parseFrom(l lVar, a0 a0Var) {
            return (ResourceRequestInfo) l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* loaded from: classes11.dex */
    public interface ResourceRequestInfoOrBuilder extends k1 {
        k getAppReq();

        @Override // com.google.protobuf.k1
        /* synthetic */ j1 getDefaultInstanceForType();

        boolean getLimitFlow();

        boolean getLimitFrequency();

        int getRetryCount();

        int getTimeoutMs();

        boolean hasAppReq();

        boolean hasLimitFlow();

        boolean hasLimitFrequency();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        @Override // com.google.protobuf.k1
        /* synthetic */ boolean isInitialized();
    }

    private Proto() {
    }

    public static void registerAllExtensions(a0 a0Var) {
    }
}
