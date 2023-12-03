package com.example.myfirstlinecode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("TAG", "onReceive: ");
        Toast.makeText(context, "network changes", Toast.LENGTH_LONG).show();
    }
}
