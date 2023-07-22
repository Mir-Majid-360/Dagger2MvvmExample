package com.majid.dagger2mvvmexample.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.majid.dagger2mvvmexample.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {

    abstract fun getFakerDAO() : FakerDAO
}