package ir.sass.hilt_android.api

import ir.sass.hilt_android.model.Photo
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("photos/{id}")
    suspend fun getPhoto(@Path("id") id : Int) : Photo
}