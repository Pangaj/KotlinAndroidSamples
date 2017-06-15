package com.shruthi.pangaj.kotlinsample.models.response

import android.util.Log
import com.shruthi.pangaj.kotlinsample.Retrofit.KSRetrofit
import com.shruthi.pangaj.kotlinsample.interfaces.KSAPIErrorInterface
import retrofit2.Response


/**
 * Created by pangaj on 15/06/17.
 */

class KSJSONErrorParser {
    private var instance: KSJSONErrorParser? = null
    private val TAG = "LZJSONErrorParser"

    fun initInstance(): KSJSONErrorParser {
        if (instance == null) {
            // Create the instance
            instance = KSJSONErrorParser()
        }
        return instance as KSJSONErrorParser
    }

    fun checkError(response: Response, errorType: Int, errorInterface: KSAPIErrorInterface) {
        try {
            val retrofitClient = KSRetrofit().getRetrofitClient()
            if (errorType == 1) {
                val converter = retrofitClient.responseBodyConverter(KSErrorHandler::class.java, Annotation[0])
                val errorResponse = converter.convert(response.errorBody())
                errorInterface.commonError(errorResponse.getErrors().get(0))
            } else {
                val converter = retrofitClient.responseBodyConverter(KSErrorHandler::class.java, Annotation[0])
                val errorResponse = converter.convert(response.errorBody())
                errorInterface.commonError(errorResponse.getErrors().get(0))
            }
        } catch (exception: Exception) {
            Log.d(TAG, "Exception in parsing error message " + exception.localizedMessage)
            errorInterface.generalError()
        }

    }
}