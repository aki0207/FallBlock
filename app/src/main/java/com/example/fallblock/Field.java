package com.example.fallblock;


import android.graphics.Point;

public class Field {


    int[][] field;
    int field_x;
    int field_y;
    int field_width;
    int field_height;
    //ブロックの現在位置
    int block_point_a;
    int block_point_b;
    int block_point_c;
    int block_point_d;
    int block_point_e;
    int block_point_f;
    int block_point_g;
    int block_point_h;
    boolean generated_flg;



    //フィールドを初期化
    public Field fieldInitialization(Field field, int X_AXIS, int Y_AXIS) {

        for (int y = 0; y < Y_AXIS; y++) {
            for (int x = 0; x < X_AXIS; x++) {
                //壁を作る
                if (x == 0 || x == X_AXIS - 1) {

                    field.field[y][x] = 1;

                } else if (y == Y_AXIS - 1) {

                    field.field[y][x] = 1;

                } else {

                    field.field[y][x] = 0;

                }

            }


        }


        field.field_x = 252;
        field.field_y = 250;
        field.field_width = 302;
        field.field_height = 300;
        field.generated_flg = true;

        return field;

    }

    //ブロックを移動できるか調べる
    public boolean isMovable(Point newPos,int[][] block) {



    }


}