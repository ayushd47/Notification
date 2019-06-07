package com.e.servicesandwearable;


import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import app.CreateChannel;

public class MainActivity extends AppCompatActivity {
        private Button button1,button2;
        NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        notificationManagerCompat = NotificationManagerCompat.from(this);
        CreateChannel channel = new CreateChannel(this);
        channel.createChannel();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });

    }
    private void DisplayNotification(){
        Notification notification  = new NotificationCompat.Builder(this,CreateChannel.CHANNEL_1)
                .setSmallIcon(R.drawable.ic_chat_black_24dp)
                .setContentTitle("No Connection")
                .setContentText("No Connectivity, Please connect")
                .setCategory(NotificationCompat.CATEGORY_SYSTEM)
                .build();
        notificationManagerCompat.notify(1,notification);

    }


    private void DisplayNotification2(){
        Notification notification  = new NotificationCompat.Builder(this,CreateChannel.CHANNEL_1)
                .setSmallIcon(R.drawable.ic_chat_black_24dp)
                .setContentTitle("No Connection")
                .setContentText("No Connectivity, Please connect")
                .setCategory(NotificationCompat.CATEGORY_SYSTEM)
                .build();
        notificationManagerCompat.notify(2,notification);

    }
}
