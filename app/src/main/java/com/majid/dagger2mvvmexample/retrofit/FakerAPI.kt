package com.majid.dagger2mvvmexample.retrofit

import com.majid.dagger2mvvmexample.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
  suspend  fun getProducts(): Response<List<Product>>
}