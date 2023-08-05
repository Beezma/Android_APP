package com.tools.comparadordetextos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import models.Texts

class MainViewModel : ViewModel() {

    val texts: LiveData<Texts> get() = _texts
    private var _texts = MutableLiveData<Texts>(Texts("¿=?"))

    fun compareTwoTexts(text1: String, text2: String) {
        if (text1 == text2) {
            textPositive()
        } else {
            textNegative()
        }
    }

    fun textPositive() {
        _texts.value = Texts("iguales")
    }

    fun textNegative() {
        _texts.value = Texts("distintos")
    }
}
