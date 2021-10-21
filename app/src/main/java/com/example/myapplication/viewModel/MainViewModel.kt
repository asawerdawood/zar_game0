package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.Repository

class MainViewModel:ViewModel() {
     val number=MutableLiveData<Int>()
    var repository=Repository()

     fun changeNumber(){
        number.postValue(repository.rand())
    }

}