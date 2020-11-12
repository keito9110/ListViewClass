package com.example.listviewclass;

import android.provider.ContactsContract;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private String birth;

    public Person(String name , String birth){
        this.name = name;
        this.birth = birth;
    }
    private int getAge(){
        // 現在の時刻を取得
        Date date = new Date();
        // 表示形式を設定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String niti = sdf.format(date);
        int age  = 0;
        int seitan = Integer.parseInt(birth);
        int gen = Integer.parseInt(niti);
        age = (int) Math.floor((gen-seitan)/10000);
        return age;
    }
    @NonNull
    @Override
    public String toString(){
        return "名前 ： "+ name +"  年齢 ： " + getAge();
    }
}
