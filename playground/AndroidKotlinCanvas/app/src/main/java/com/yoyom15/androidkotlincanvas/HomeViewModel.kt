package com.yoyom15.androidkotlincanvas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "@yoyom15"
    }
    val text: LiveData<String> = _text
}