package com.example.md0101_Splash

// コンソールログの出力に必要なライブラリ
import android.util.Log
import androidx.lifecycle.ViewModel

class SplashViewModel : ViewModel() {
    // この画面の表示タイトル
    val myTitle: String = "Splash"

    // Nextボタンをタップしたときの処理
    fun onclickNextButton() {
        // とりあえず画面遷移
        Log.d(this.javaClass.name, "NEXTボタンタップ")
    }
}