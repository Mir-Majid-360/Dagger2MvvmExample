package com.majid.dagger2mvvmexample

import android.app.Application
import com.majid.dagger2mvvmexample.di.ApplicationComponent
import com.majid.dagger2mvvmexample.di.DaggerApplicationComponent

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}