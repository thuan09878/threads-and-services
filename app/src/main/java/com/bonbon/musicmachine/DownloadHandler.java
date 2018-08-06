package com.bonbon.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class DownloadHandler extends Handler {

    public static final String TAG = DownloadHandler.class.getSimpleName();

    @Override
    public void handleMessage(Message msg) {
        downloadSong(msg.obj.toString());
    }

    private void downloadSong(String song) {
        long end = System.currentTimeMillis() + 10 * 1000;

        while (System.currentTimeMillis() < end) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, song + " downloaded!");
    }
}
