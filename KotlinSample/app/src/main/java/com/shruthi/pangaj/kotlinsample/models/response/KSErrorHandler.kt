package com.shruthi.pangaj.kotlinsample.models.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by pangaj on 15/06/17.
 */

class KSErrorHandler : Serializable {
    /**
     * @return The errors
     */
    /**
     * @param errors The errors
     */
    @SerializedName("errors")
    @Expose
    var errors: ArrayList<String> = ArrayList()
}
