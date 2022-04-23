package com.example


// Anctivityの道入に必要なライブラリ
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.templeteproject.R

class SecondActivity: AppCompatActivity() {
    /**
     * 画面表示時の処理
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 画面レイアウトの読み込み
        setContentView(R.layout.activity_second)
    }
}