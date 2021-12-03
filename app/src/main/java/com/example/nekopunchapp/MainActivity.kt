package com.example.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //画面タッチイベント
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var iv :ImageView = findViewById(R.id.iv)

        when(event?.action){
            //画面をタッチした時、画像をcat02に変更する
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02)
            //画面をタッチしてスライドした時、画像をcat03に変更する
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03)
            //画面から離した時、画像をcat01に変更する
            MotionEvent.ACTION_UP   -> iv.setImageResource(R.drawable.cat01)
        }
        return super.onTouchEvent(event)
    }
}