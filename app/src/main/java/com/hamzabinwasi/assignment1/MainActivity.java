package com.hamzabinwasi.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_Log = null;
    private StringBuilder sb = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (sb.length() == 0){
            sb.append("==Start Log==\n");
        }
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("OnCreate called\n");
        txt_Log.setText(sb.toString());
    }

    @Override
    protected void onStart() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("OnStart called\n");
        txt_Log.setText(sb.toString());

        super.onStart();
    }

    @Override
    protected void onResume() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("OnResume called\n");
        txt_Log.setText(sb.toString());

        super.onResume();
    }

    @Override
    protected void onPause() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("onPause called\n");
        txt_Log.setText(sb.toString());

        super.onPause();
    }

    @Override
    protected void onStop() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("onStop called\n");
        txt_Log.setText(sb.toString());

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("onDestroy called\n");
        txt_Log.setText(sb.toString());

        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        txt_Log = (TextView)findViewById(R.id.txt_Log);
        sb.append("onRestart called\n");
        txt_Log.setText(sb.toString());

        super.onRestart();
    }
}
