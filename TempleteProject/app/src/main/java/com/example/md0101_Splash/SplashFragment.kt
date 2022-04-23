package com.example.md0101_Splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Environment
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// データバインディングを実現するために必要なライブラリ
import androidx.databinding.DataBindingUtil

import com.example.templeteproject.R
import com.example.templeteproject.databinding.SplashFragmentBinding

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var myViewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        SplashFragmentBinding.inflate(inflater).also {
            it.lifecycleOwner = this
            this.myViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
            it.viewModel = this.myViewModel
        }.root
//    ): View? {
//        // データバインディングの初期設定
//        // DataBindingUtilからBindingインスタンスを生成
//        val binding = DataBindingUtil.inflate<SplashFragmentBinding>(inflater, R.layout.splash_fragment, container, false);
//        // ライフサイクルオーナにActivityを指定しないとデータの管理が始まらない
//        binding.lifecycleOwner = this
//        myViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
//        binding.viewModel = myViewModel
//
////        this.initBinding()
//        return inflater.inflate(R.layout.splash_fragment, container, false)
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        myViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        // TODO: Use the ViewModel
    }

    /**
     * データバインディングの初期設定
     */
    private fun initBinding() {

    }
}