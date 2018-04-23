package com.zl.testapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private DownloadBinder mDownloadBinder = new DownloadBinder();

    class DownloadBinder extends Binder {
        public void startDownload() {
            Log.d("mTag", "DownloadBinder(MyService)：startDownload()");
        }

        public int getProgress() {
            Log.d("mTag", "DownloadBinder(MyService)：getProgress()");
            return 0;
        }
    }

    public MyService() {
        Log.d("mTag", "MyService（构造方法）：MyService()");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d("mTag", "MyService：onBind()");
        return mDownloadBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("mTag", "MyService：onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("mTag", "MyService：onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("mTag", "MyService：onDestroy()");
    }
}
