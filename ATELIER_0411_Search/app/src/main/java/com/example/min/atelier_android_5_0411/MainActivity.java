package com.example.min.atelier_android_5_0411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText _input;
    Button _clear;
    TextView _output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _input = (EditText) findViewById(R.id.input);
        _output = (TextView) findViewById(R.id.output);
        _clear = (Button) findViewById(R.id.clear);

        _clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _output.append(_input.getText());
//                _output.setText(_input.getText().toString());
            }
        });

    }
}
