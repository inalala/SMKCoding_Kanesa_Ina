package id.ina.projek.api

import id.ina.projek.model.MNew
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("posts")
    fun getDataPost(): Call<List<MNew>>

}