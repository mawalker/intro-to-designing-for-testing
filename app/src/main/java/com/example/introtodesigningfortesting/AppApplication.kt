package com.example.introtodesigningfortesting

import android.app.Application
import com.example.introtodesigningfortesting.examples.ResourceGrabber

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        ResourceGrabber.application = this
    }



}