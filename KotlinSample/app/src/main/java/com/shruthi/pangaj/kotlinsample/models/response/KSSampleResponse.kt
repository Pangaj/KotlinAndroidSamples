package com.shruthi.pangaj.kotlinsample.models.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
 * Created by Pan on 6/13/2017.
 */

class KSSampleResponse {
    @SerializedName("one")
    @Expose
    var one: String? = null
    @SerializedName("key")
    @Expose
    var key: String? = null
}