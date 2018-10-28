package com.example.fallblock;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    //フィールドのx軸,y軸のそれぞれのマス数
    public static final int X_AXIS = 12;
    public static final int Y_AXIS = 24;
    //MyTask task;
    MyView myView;
    int count = 0;

    //移動の際の判定用フラグ
    boolean move_flg = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        while (true) {


        }

    }




}
