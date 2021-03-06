package com.example.templeteproject

// 画面遷移関連のライブラリ
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

// Fragment遷移で要するライブラリ
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

// ログを出力するためのライブラリ
import android.util.Log

// 画面レイアウトに関するライブラリ
import android.widget.Button

// 他の画面
import com.example.SecondActivity

class MainActivity : AppCompatActivity() {
    /**
     * 画面表示時の処理
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 画面レイアウト読み込み
        setContentView(R.layout.activity_main)
    }
}