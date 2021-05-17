package com.example.audioequalizer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


public class AudioEqualizerService extends Service{
    public void onCreate(){
        super.onCreate();
    }

    public int onStartCommand (Intent intent, int flags, int startId){
        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy(){
        super.onDestroy();
    }

    public IBinder onBind (Intent intent){
        return null;
    }
}
