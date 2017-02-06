package com.example.HonorTest;

/**
 * Created by jelly on 2017/2/4.
 */
public class NdkClass {
    static{
        System.loadLibrary("ndkTest");
    }
    public native String getStringFromJni();
}
