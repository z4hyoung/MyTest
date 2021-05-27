package com.z4hyoung.mytest;

import android.os.Bundle;

import com.example.android.ITestBundle;

final class TestBundleImpl extends ITestBundle.Stub {
    @Override
    public void test(Bundle bundle) {
        bundle.putInt("result", 0);
    }
}
