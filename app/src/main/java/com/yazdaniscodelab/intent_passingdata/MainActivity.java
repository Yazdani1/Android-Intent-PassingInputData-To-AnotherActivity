package com.yazdaniscodelab.intent_passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText=(EditText)findViewById(R.id.edit_text_xml);
        btn=(Button)findViewById(R.id.btn_xml);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=editText.getText().toString();

                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);

                intent.putExtra("mykey",name);

                startActivity(intent);

            }
        });


    }
}
