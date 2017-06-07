package com.shruthi.pangaj.kotlinsample.models.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Pan on 6/7/2017.
 */

class KSEmptyResponse {
    @SerializedName("Result")
    @Expose
    private var result: Int? = null
    @SerializedName("Message")
    @Expose
    private var message: String? = null
    @SerializedName("MessageType")
    @Expose
    private var messageType: Int? = null
    @SerializedName("ResponseData")
    @Expose
    private var responseData: ResponseData? = null

    fun getResult(): Int? {
        return result
    }

    fun setResult(result: Int?) {
        this.result = result
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessageType(): Int? {
        return messageType
    }

    fun setMessageType(messageType: Int?) {
        this.messageType = messageType
    }

    fun getResponseData(): ResponseData? {
        return responseData
    }

    fun setResponseData(responseData: ResponseData) {
        this.responseData = responseData
    }

    inner class ResponseData {
        @SerializedName("CurrentBalance")
        @Expose
        var currentBalance: Float? = null
    }
}