package com.example.nilzor.robotest;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, resourceDir = "app/src/main/res", sdk = 19)
public class ExampleUnitTest {
    @Test
    public void appName() {
        Context context = RuntimeEnvironment.application;
        String appName = context.getString(R.string.app_name);
        assertEquals("LeApp", appName);
    }
}