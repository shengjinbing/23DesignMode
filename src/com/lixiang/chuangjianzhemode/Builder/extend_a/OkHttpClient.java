package com.lixiang.chuangjianzhemode.Builder.extend_a;

import java.util.concurrent.TimeUnit;

public class OkHttpClient {
    final int connectTimeout;
    final int readTimeout;
    final int writeTimeout;
    public OkHttpClient(Builder builder) {
        connectTimeout = builder.connectTimeout;
        readTimeout = builder.readTimeout;
        writeTimeout = builder.writeTimeout;
    }

    public static final class Builder{
         int connectTimeout;
         int readTimeout;
         int writeTimeout;
        //定义各种成员全局变量
        public Builder() {
            //初始化成员变量参数
        }

        Builder(OkHttpClient okHttpClient){
            //初始化成员变量参数
        }
        public Builder addInterceptor() {
            System.out.println("添加拦截器");
            return this;
        }

        public Builder connectTimeout(long timeout, TimeUnit unit) {
            connectTimeout = (int) timeout;
            System.out.println("设置连接超时时间");
            return this;
        }

        public Builder writeTimeout(long timeout, TimeUnit unit) {
            writeTimeout = (int) timeout;
            System.out.println("设置写入超时时间");
            return this;
        }

        public Builder readTimeout(long timeout, TimeUnit unit){
            readTimeout = (int) timeout;
            System.out.println("设置读取超时时间");
            return this;
        }

        public OkHttpClient build(){
            return new OkHttpClient(this);
        }
    }
}
