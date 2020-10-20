package ir.sass.hilt_android.api

import ir.sass.hilt_android.view.MainActivity
import javax.inject.Inject

class ApiRepo @Inject constructor(val apiService: ApiInterface , val emitter : RemoteErrorEmitter) {
    fun getPhoto(id : Int)  = apiCall(emitter){apiService.getPhoto(id)}
}