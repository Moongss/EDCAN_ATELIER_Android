package com.example.min.youngjaejokyo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static String select_item = "";
    EditText showtext;
    String sfName = "Text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showtext = (EditText) findViewById(R.id.Show_text);
        SharedPreferences sf = getSharedPreferences(sfName, 0);
        String str = sf.getString("name", "");
        showtext.setText(str);
        if (str == "") {
            Toast.makeText(this, "입력내용이 없습니다.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "전에 저장한 내용을 불러왔습니다!", Toast.LENGTH_SHORT).show();
        }

        final String[] mobileNetworkTypes = {"RED", "GREEN", "BLUE"};
        final Spinner spinnerExample = (Spinner)findViewById(R.id.spinnerExample);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(
                this, android.R.layout.simple_spinner_item, mobileNetworkTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerExample.setAdapter(adapter);

        spinnerExample.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView Text1 = (TextView)spinnerExample.getSelectedView();
                if(Text1.getText().toString() == "RED"){
                    showtext.setTextColor(Color.parseColor("#ff0000"));
                    Toast.makeText(MainActivity.this, "글씨가 빨간색으로 설정되었습니다.", Toast.LENGTH_SHORT).show();
                }else if(Text1.getText().toString() == "GREEN"){
                    showtext.setTextColor(Color.parseColor("#00ff00"));
                    Toast.makeText(MainActivity.this, "글씨가 초록색으로 설정되었습니다.", Toast.LENGTH_SHORT).show();
                }else{
                    showtext.setTextColor(Color.parseColor("#0000ff"));
                    Toast.makeText(MainActivity.this, "글씨가 파란색으로 설정되었습니다.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Button share = (Button) findViewById(R.id.Share);
        share.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = "공유하기";
                String text = showtext.getText().toString();
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, text);
                Intent chooser = Intent.createChooser(intent, "공유");
                startActivity(chooser);
            }
        });

        Button save = (Button) findViewById(R.id.Save);

        save.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sf = getSharedPreferences(sfName, 0);
                SharedPreferences.Editor editor = sf.edit();//저장하려면 editor가 필요
                String str = showtext.getText().toString(); // 사용자가 입력한 값
                editor.putString("name", str); // 입력
                editor.commit(); // 파일에 최종 반영함
                Toast.makeText(MainActivity.this, "저장되었습니다!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
