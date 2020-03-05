package com.example.menu.ui.calc


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.menu.R
import com.example.menu.ui.calc.CalcViewModel

class CalcFragment : Fragment() {

    private lateinit var calcViewModel: CalcViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        calcViewModel =
            ViewModelProviders.of(this).get(CalcViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calc, container, false)
        val textView: TextView = root.findViewById(R.id.text_calc)
        calcViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}