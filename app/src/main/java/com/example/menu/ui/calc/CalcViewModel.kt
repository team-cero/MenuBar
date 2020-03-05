package com.example.menu.ui.calc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is calc Fragment"
    }
    val text: LiveData<String> = _text
}