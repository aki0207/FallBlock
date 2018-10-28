package com.example.fallblock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {


    //フィールドのx軸,y軸のそれぞれのマス数
    public static final int X_AXIS = 12;
    public static final int Y_AXIS = 24;

    //ブロックを生成するかどうかのflg。あとでええ感じにする

    boolean flg = true;


    Paint paint = new Paint();
    Field field = new Field();
    Block block = new Block();

    //移動先に壁、ブロックがない場合true
    boolean move_flg = true;

    //初回かどうかの判定につかう
    int count = 0;


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        field.field = new int[Y_AXIS][X_AXIS];

    }


    @Override

    protected void onDraw(Canvas canvas) {


        //フィールドの生成、初期化
        field = field.fieldInitialization(field, X_AXIS, Y_AXIS);

        //フィールド壁を描画。1は壁で黒く塗り、ブロックは2で赤く塗る。0は空きマスで何もしない
        for (int i = 0; i < Y_AXIS; i++) {
            for (int k = 0; k < X_AXIS; k++) {

                if (field.field[i][k] == 1) {

                    paint.setColor(Color.BLACK);
                    paint.setStrokeWidth(1.0f);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(field.field_x, field.field_y, field.field_width, field.field_height, paint);

                } else if (field.field[i][k] == 2) {

                    paint.setColor(Color.RED);
                    paint.setStrokeWidth(1.0f);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(field.field_x, field.field_y, field.field_width, field.field_height, paint);
                }

                //横にずらしてマスをつくる
                field.field_x = field.field_width + 1;
                field.field_width = field.field_x + 50;

            }

            //改行
            field.field_x = 252;
            field.field_y = field.field_height + 1;
            field.field_width = 302;
            field.field_height = field.field_y + 50;

        }


        block = block.SquareBlock(block);
        //ブロックの描画
        for (int i = 0; i < block.BLOCK_SIZE_X; i++) {

            for (int k = 0; k < block.BLOCK_SIZE_Y; k++) {

                if (block.block[i][k] == 1) {

                    paint.setColor(Color.RED);
                    paint.setStrokeWidth(1.0f);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(block.block_x, block.block_y, block.block_width, block.block_height, paint);
                }

                if (k == 0) {

                    //ずらす前に退避をとる
                    block.block_x_evacuation = block.block_x;
                    block.block_width_evacuation = block.block_width;

                }

                //横にずらしてマスをつくる
                block.block_x = block.block_width + 1;
                block.block_width = block.block_x + 50;

            }

            //改行。四角はこれでいけてるけど他の形は怪しいな
            block.block_x = block.block_x_evacuation;
            block.block_y = block.block_height + 1;
            block.block_width = block.block_width_evacuation;
            block.block_height = block.block_y + 50;
        }
    }




public void AddCount(){


        this.count=count+1;


        }


        }







