package com.shruthi.pangaj.kotlinsample.Retrofit

import com.shruthi.pangaj.kotlinsample.models.response.KSSampleResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

/**
 * Created by Pan on 6/6/2017.
 */

class KSRetrofit {

    fun getClient(): MEGitApiInterface {
        val gitApiInterface = getRetrofitClient().create(MEGitApiInterface::class.java)
        return gitApiInterface
    }

    fun getRetrofitClient(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val okClient = OkHttpClient.Builder()
                .addInterceptor { chain ->
                    val request = chain.request().newBuilder()
                            .addHeader("content-type", "application/json")
                            .addHeader("token-type", "Bearer").build()
                    chain.proceed(request)
                }.addInterceptor(interceptor).readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build()
        val builder = Retrofit.Builder()
        builder.baseUrl("http://echo.jsontest.com/")
                .client(okClient)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
        return builder.build()
    }

    public interface MEGitApiInterface {
        @POST("key/value/one/two")
        abstract fun sampleResponse(): Call<KSSampleResponse>
    }
}