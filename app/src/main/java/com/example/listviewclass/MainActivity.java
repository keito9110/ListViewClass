package com.example.listviewclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lstv;
    private ArrayAdapter<Person> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstv = (ListView)findViewById(R.id.listArea);

        ArrayList<Person> psList = new ArrayList<Person>();
        Person ps1 = new Person("migita","20000217");
        Person ps2 = new Person("sibata","20010917");
        psList.add(ps1);
        psList.add(ps2);

        adapter = new ArrayAdapter<Person>
                (this, R.layout.list_item_row, R.id.txtoutput, psList);

        lstv.setAdapter(adapter);
}
    public void Onclick(View view){
        ArrayList<Person> pslist = new ArrayList<Person>();

        EditText name = findViewById(R.id.name_txt);
        EditText birth = findViewById(R.id.birth_txt);
        String sei = name.getText().toString();
        String tan = birth.getText().toString();
        if(sei.equals("")||tan.equals("")) {
            Toast.makeText(this,"すべての項目を入力してください",Toast.LENGTH_LONG).show();
        }else {
            Person list = new Person(sei, tan);
            adapter.add(list);
        }
        //入力項目リセット
        String rename = "";
        name.setText(rename, TextView.BufferType.NORMAL);
        birth.setText(rename, TextView.BufferType.NORMAL);
    }
}