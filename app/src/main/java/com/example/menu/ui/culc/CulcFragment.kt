package com.example.menu.ui.culc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.menu.R

class CulcFragment : Fragment() {

    private lateinit var culcViewModel: CulcViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        culcViewModel =
            ViewModelProviders.of(this).get(CulcViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_culc, container, false)
        val textView: TextView = root.findViewById(R.id.text_culc)
        culcViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}