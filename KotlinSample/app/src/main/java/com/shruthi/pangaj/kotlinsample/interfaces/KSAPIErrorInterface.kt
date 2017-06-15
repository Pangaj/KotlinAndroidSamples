package com.shruthi.pangaj.kotlinsample.interfaces

/**
 * Created by Pan on 6/15/2017.
 */

public interface KSAPIErrorInterface {
    fun userUnAuthorisedError()

    fun commonError(message: String)

    fun generalError()
}
