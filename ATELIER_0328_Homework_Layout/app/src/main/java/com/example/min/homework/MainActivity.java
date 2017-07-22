package com.example.min.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String _passwd = "passwd";
        final String _id = "admin1234";

        final EditText id = (EditText) findViewById(R.id.id);
        final EditText password = (EditText) findViewById(R.id.password);
        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(_id.equals(id.getText().toString()) && _passwd.equals(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
