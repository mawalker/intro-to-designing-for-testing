package com.example.introtodesigningfortesting.examples

import android.app.Application
import com.example.introtodesigningfortesting.R

object ResourceGrabber : ResourceGrabberInterface {

    // this would be a type of memory leak in Android if this was 'just' a Context
    // but Application is also a singleton so it is fine
    var application: Application? = null

    override fun getAppName(): String? {
        return application?.getString(R.string.app_name)
    }

}
