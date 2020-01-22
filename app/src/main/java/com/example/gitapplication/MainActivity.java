package com.example.gitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView helloText = this.findViewById(R.id.helloText);
        helloText.setText("Hello");






        //long click 1

        helloText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("LongClick","Long click");
            }
        });

        helloText.setTextColor(getResources().getColor(R.color.colorAccent));

    }

}
