package com.bonbon.musicmachine;

import android.os.Looper;
import android.util.Log;

public class DownloadThread extends Thread {
    public static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler mHandler;

    @Override
    public void run() {
        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();
    }
}
