package com.example.md0201_TopGate

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.templeteproject.R

class TopGateFragment : Fragment() {

    companion object {
        fun newInstance() = TopGateFragment()
    }

    private lateinit var viewModel: TopGateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.top_gate_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TopGateViewModel::class.java)
        // TODO: Use the ViewModel
    }
}