package com.example.segxs_aht;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ru.spbstu.college.mhw7.R;


public class activity_main extends AppCompatActivity {
    Button bStart;

    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        bStart = (Button) findViewById(R.id.bStart);
        bStart_onClickListener();
    }

    protected void bStart_onClickListener(){
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStart = new Intent(activity_main.this, activity_2.class);
                startActivity(intentStart);
            }
        });
    }

    //public static class activity_2 {
    //}
}
