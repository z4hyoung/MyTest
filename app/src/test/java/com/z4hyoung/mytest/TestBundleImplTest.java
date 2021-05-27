package com.z4hyoung.mytest;

import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class TestBundleImplTest {

    @Test
    public void test1() {
        TestBundleImpl impl = new TestBundleImpl();
        Bundle bundle = new Bundle();
        impl.test(bundle);
        assertEquals(0, bundle.getInt("result"));
    }
}