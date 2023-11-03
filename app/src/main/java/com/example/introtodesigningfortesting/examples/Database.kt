package com.example.introtodesigningfortesting.examples

class Database {

    private val resourceGrabber = ResourceGrabber

    fun getAppName(): String {
        return resourceGrabber.getAppName() ?: ""
    }
}