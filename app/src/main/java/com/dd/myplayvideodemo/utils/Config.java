package com.dd.myplayvideodemo.utils;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.IOException;

public class Config {
    public static final String SDCARD_DIR = Environment.getExternalStorageDirectory().getAbsolutePath();
    public static final String DEFAULT_CACHE_DIR = SDCARD_DIR + "/caotaxuema";
}
