package ir.sass.hilt_android.viewModel

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import ir.sass.hilt_android.api.ApiRepo


class MyViewModel @ViewModelInject constructor(var repository: ApiRepo) : ViewModel() {

    fun getPhoto(id : Int) = repository.getPhoto(id)

}