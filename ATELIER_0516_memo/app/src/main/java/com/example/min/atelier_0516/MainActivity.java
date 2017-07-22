package com.example.min.atelier_0516;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText search;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        search = (EditText) findViewById(R.id.search);
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);

        adapter.add("asdf");
        adapter.add("asdf");
        adapter.add("asdf");
        adapter.add("asdf");
        adapter.add("asdf");
        adapter.add("asdf");

        adapter.notifyDataSetChanged();

        setSupportActionBar(toolbar);
        toolbar.setTitle("메인");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.memo :
                Toast.makeText(this, "menu item clicked", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
                break;
        }
        return true;
    }


}
