package com.example.myapplicationaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public int viewch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bt1 = (ImageButton)findViewById(R.id.button1);
        ImageButton bt2 = (ImageButton)findViewById(R.id.button2);
        ImageButton bt3 = (ImageButton)findViewById(R.id.button3);
        ImageButton bt4 = (ImageButton)findViewById(R.id.button4);
        ImageButton bt5 = (ImageButton)findViewById(R.id.button5);



        final Intent intent1 = new Intent(this, Main2Activity.class);

        bt1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                viewch = 1;
                intent1.putExtra("key",viewch);
                startActivity(intent1);
            }
        });
        bt2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                viewch = 2;
                intent1.putExtra("key",viewch);
                startActivity(intent1);
            }
        });
        bt3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                viewch = 3;
                intent1.putExtra("key",viewch);
                startActivity(intent1);
            }
        });
        bt4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                viewch = 4;
                intent1.putExtra("key",viewch);
                startActivity(intent1);
            }
        });
        bt5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                viewch = 5;
                intent1.putExtra("key",viewch);
                startActivity(intent1);
            }
        });


    }

}
