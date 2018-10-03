package giancarlosgarza.com.broadcastreceiver_a9;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void Emision (View view){
        Intent intent = new Intent();
        intent.setAction("giancarlosgarza.com.broadcastreceiver_a9");
        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }
}
