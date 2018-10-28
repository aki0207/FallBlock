package com.example.fallblock;

import android.graphics.Point;

public class Block {

    //ブロックのサイズ
    int BLOCK_SIZE_X = 4;
    int BLOCK_SIZE_Y = 4;
    int LEFT = 0;
    int LIGHT = 1;
    int DOWN = 2;


    //ブロックの形を格納
    int[][] block = new int[BLOCK_SIZE_X][BLOCK_SIZE_Y];

    //位置
    Point pos;

    //描画座標
    int block_x;
    int block_y;
    int block_width;
    int block_height;
    int block_x_evacuation;
    int block_width_evacuation;


    //四角のブロック生成

    public Block SquareBlock(Block block) {


        //とりまブロック[4][4]初期化
        block.block = blockInitialization(block.block);

        //四角いブロックを作成
        block.block[1][1] = 1;
        block.block[1][2] = 1;
        block.block[0][1] = 1;
        block.block[0][2] = 1;
        

        pos = new Point(4, 4);

        block_x = 610;
        block_y = 250;
        block_width = 660;
        block_height = 300;
        block_x_evacuation = 610;
        block_width_evacuation = 660;

        return block;


    }


    //ブロック初期化

    public int[][] blockInitialization(int block[][]) {

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                block[i][k] = 0;

            }
        }

        return block;

    }

    public boolean isMove(int direction) {

        switch (direction) {

            case LEFT :

                Point newPos = new Point(pos.x-1,pos.y);
                if()

        }


    }


}