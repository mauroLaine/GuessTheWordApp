package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class ScoreViewModel(val finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        Timber.i("Initialized ScoreViewModel: " + finalScore)
        _score.value = finalScore
    }

    fun eventPlayAgain() {
        _score.value = 0
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("ScoreViewModel destroyed!")
    }
}