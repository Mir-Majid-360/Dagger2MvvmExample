package com.majid.dagger2mvvmexample.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.majid.dagger2mvvmexample.models.Product
import com.majid.dagger2mvvmexample.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(val repository: ProductRepository, val randomize: Randomize) : ViewModel() {

    val productsLiveData : LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}

class  Randomize @Inject constructor(){
    fun doAction(){
        Log.d("TAG", "Majid Manzoor Mir")
    }
}