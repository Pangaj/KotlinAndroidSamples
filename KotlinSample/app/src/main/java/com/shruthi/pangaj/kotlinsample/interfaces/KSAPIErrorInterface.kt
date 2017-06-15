package com.shruthi.pangaj.kotlinsample.interfaces

import com.shruthi.pangaj.kotlinsample.Retrofit.KSRetrofit
import retrofit2.Response

/**
 * Created by Pan on 6/15/2017.
 */

interface LZAPIErrorInterface {
    fun userUnAuthorisedError()

    fun commonError(message: String)

    fun generalError()
}
