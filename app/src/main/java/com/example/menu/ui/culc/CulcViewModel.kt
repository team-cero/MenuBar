package com.example.menu.ui.culc


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CulcViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is culc Fragment"
    }
    val text: LiveData<String> = _text
}