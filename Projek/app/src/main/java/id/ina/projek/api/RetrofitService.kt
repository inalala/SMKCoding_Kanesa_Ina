package id.ina.projek.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitService {
    companion object {

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonlaceholder.typecode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun <S> createService(servisClass: Class<S>): S {
            val serviceClass = null
            return retrofit.create(serviceClass)
        }
    }
}