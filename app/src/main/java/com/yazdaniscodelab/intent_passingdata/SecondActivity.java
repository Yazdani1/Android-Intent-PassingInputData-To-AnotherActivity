package com.yazdaniscodelab.intent_passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt=(TextView)findViewById(R.id.text_show_xml);
        Intent intent=getIntent();
        String name=intent.getStringExtra("mykey");
        txt.setText(name);

    }
}
