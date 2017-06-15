package com.shruthi.pangaj.kotlinsample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.shruthi.pangaj.kotlinsample.R
import com.shruthi.pangaj.kotlinsample.Retrofit.KSRetrofit
import com.shruthi.pangaj.kotlinsample.models.response.KSSampleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Pan on 6/6/2017.
 */

class KSRetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ks_activity_retrofit)

        val btnCallAPI = findViewById(R.id.btn_call_api) as Button
        val tvResponseAPI = findViewById(R.id.tv_response_api) as TextView

        btnCallAPI.setOnClickListener {
            val callSampleResponse = KSRetrofit().getClient().sampleResponse()
            callSampleResponse.enqueue(object : Callback<KSSampleResponse> {
                override fun onResponse(call: Call<KSSampleResponse>, response: Response<KSSampleResponse>) {
//                    hideProgressDialog()
                    if (response.isSuccessful()) {
                        println(response.toString())
                    } else {
//                        handleAPIError(response, LZAppConstants.VERIFY_PASSWORD)
                    }
                }

                override fun onFailure(call: Call<KSSampleResponse>, t: Throwable) {
//                    hideProgressDialog()
//                    val errorMessage = LZRetrofitErrorHandler.getFailureMsg(t)
//                    showAlertDialog(errorMessage, LZAlertDialogFragment.TYPE_ERROR)
                }
            })
        }
    }

    /**
     * Method to handle API error

     * @param response The response
     */
    fun handleAPIError(response: Response<*>, errorType: Int) {
        LZJSONErrorParser.initInstance().checkError(response, errorType, object : LZAPIErrorInterface() {
            fun userUnAuthorisedError() {
                //do nothing
            }

            fun commonError(message: String) {
                val titleText = getString(R.string.error_title)
                showAlertDialog(message, LZAlertDialogFragment.TYPE_ERROR)
            }

            fun generalError() {
                showAlertDialog(getString(R.string.general_error), LZAlertDialogFragment.TYPE_ERROR)
            }
        })
    }
}