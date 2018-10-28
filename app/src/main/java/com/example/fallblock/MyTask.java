package com.example.fallblock;

import android.os.AsyncTask;



public class MyTask extends AsyncTask<MyView, MyView, MyView> {

    private MyView myView;
    boolean move_flg = true;

    public MyTask(MyView myView) {

        super();
        this.myView = myView;

    }

    /**

     * バックグランドで行う処理。今回で言えばn秒処理を待たせたい

     */

    @Override
    protected MyView doInBackground(MyView... value) {

        try {

            //停止時間。

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        //onPostExcuteに渡す的な?
        return value[0];

    }


    /**

     * バックグランド処理が完了し、UIスレッドに反映する

     */

    @Override
    protected void onPostExecute(MyView result) {

        while(true) {

            //ブロックを下方向へ移動する
            result.block.


        }
        result.AddCount();
        //result.block.downMove(result.block);
        result.invalidate();

        /*//単純に21マス下に動かすやつは下
        //count加算
        result.AddCount();
        //描画位置変更
        あほすぎresult.block.downMove(result.block);
        //再描画
        result.invalidate();*/

    }

}