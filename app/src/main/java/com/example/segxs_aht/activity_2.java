package com.example.segxs_aht;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import ru.spbstu.college.mhw7.R;

public class activity_2 extends AppCompatActivity {
    ListView lv1, lv2;
    EditText et;
    Button b1, b2, bBack;
    ArrayList<String> listItems1;
    ArrayList<String> listItems2;
    private ArrayAdapter adapter1;
    private ArrayAdapter adapter2;//adapters like in mhw5;
    String []n1;
    String []n2;


    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.n2_activity);

        listItems1 = new ArrayList<String>();
        adapter1 = new ArrayAdapter<String>(this,
                R.layout.list_activity,
                listItems1);

        listItems2 = new ArrayList<String>();
        adapter2 = new ArrayAdapter<String>(this,
                R.layout.list_activity,
                listItems2);

        lv1 = (ListView) findViewById(R.id.listView1);
        lv2 = (ListView) findViewById(R.id.listView2);
        et = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.bAdd1);
        b2 = (Button) findViewById(R.id.bAdd2);
        bBack = (Button) findViewById(R.id.bBack);
        lv1.setAdapter(adapter1);
        lv2.setAdapter(adapter2);

        n1 = getResources().getStringArray(R.array.n1);
        n2 = getResources().getStringArray(R.array.n2);
        adapter1.addAll(n1);
        adapter2.addAll(n2);


        bBack_onClickListener();
        b1_onClickListener();
        b2_onClickListener();
    }

    private void bBack_onClickListener(){
        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void b1_onClickListener(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et.getText().toString();

                if (s != "" && s != null && !s.isEmpty()) {
                    adapter1.add(s);
                }
            }
        });
    }

    protected void b2_onClickListener(){
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et.getText().toString();

                if (s != "" && s != null && !s.isEmpty()) {
                    //listItems.add(s);
                    adapter2.add(s);
                }
            }
        });
    }
}
