package com.mc.virustop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.mc.virustop.web.WebCallback;
import com.mc.virustop.web.WebClient;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "WEB_CLIENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testWebClient();
    }

    /** Метод для тестирования взаимодействия с сервером. */
    private void testWebClient() {
        WebClient webClient = new WebClient();
        WebCallback webCallback = new WebCallback() {
            @Override
            public void onSuccess(String body) {
                Log.d(TAG, body);
            }

            @Override
            public void onFailing(String error) {
                Log.d(TAG, error);
            }
        };
        webClient.addItem(webCallback, "Title 4");
    }
}