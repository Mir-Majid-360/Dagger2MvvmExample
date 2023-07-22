package com.majid.dagger2mvvmexample.di

import androidx.lifecycle.ViewModel
import com.majid.dagger2mvvmexample.viewmodels.MainViewModel
import com.majid.dagger2mvvmexample.viewmodels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract  fun mainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract  fun mainViewModel2(mainViewModel2: MainViewModel2): ViewModel
}