package com.example.audioequalizer;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.content.*;
import android.os.*;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;


public class AudioEqualizerService extends Service {

    public static final String CHANNEL_ID = "Audio Equalizer Channel";
    private static final int NOTIF_ID = 1;
    private static final String NOTIF_CHANNEL_ID = "Channel_Id";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        // does the work here
/*
        startForeground();
        Intent intent1 = new Intent (this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent1,0);
        Notification notification = new NotificationCompat.Builder(this,"ChannelId1")
                .setContentTitle("Audio Equalizer is On")
                .setContentText("Audio Equalizer is On")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(pendingIntent).build();

        return START_STICKY;

 */
        Intent notifcationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,notifcationIntent,0);

        Notification notification = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("Audio Equalizer Service")
                .setSmallIcon(R.drawable.ic_android)
                .setContentIntent(pendingIntent)
                .build();

        startForeground(1,notification);

        return START_NOT_STICKY;
    }

    private void startForeground() {
/*
        Intent notificationIntent = new Intent(this, MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);

        startForeground(NOTIF_ID, new NotificationCompat.Builder(this,
                NOTIF_CHANNEL_ID) // don't forget create a notification channel first
                .setOngoing(true)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle(getString(R.string.app_name))
                .setContentText("Service is running background")
                .setContentIntent(pendingIntent)
                .build());
        */

        /*
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) //check if sdk channel is greater than or equal to oreo
        {
            NotificationChannel notificationChannel = new NotificationChannel("ChannelId1", "Audio Equalizer Notification", NotificationManager.IMPORTANCE_DEFAULT);
                    NotificationManager manager = getSystemService(NotificationManager.class);
                            manager.createNotificationChannel(notificationChannel);
        }

         */
    }

    public Context context = this;
    public Handler handler = null;
    public static Runnable runnable = null;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    public void onCreate(Bundle savedInstanceState) {

/*
        Toast.makeText(this, "Service created!", Toast.LENGTH_LONG).show();

        Intent notificationIntent = new Intent(this, MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher_foreground)
                .setContentTitle("My Awesome App")
                .setContentText("Doing some work...")
                .setContentIntent(pendingIntent).build();

        startForeground(1337, notification);

        handler = new Handler();
        runnable = new Runnable() {
            public void run() {
                Toast.makeText(context, "Service is still running", Toast.LENGTH_LONG).show();
                handler.postDelayed(runnable, 10000);
            }
        };

        handler.postDelayed(runnable, 15000);

*/
    }

    @Override
    public void onDestroy() {
        //handler.removeCallbacks(runnable);
        /*
        stopForeground(true);
        stopSelf();
        Toast.makeText(this, "Service stopped", Toast.LENGTH_LONG).show();
         */
        super.onDestroy();
    }
/*
    @Override
    public void onStart(Intent intent, int startid) {
        startForeground();
        Toast.makeText(this, "Service started by user.", Toast.LENGTH_LONG).show();
    }
*/
}