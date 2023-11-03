package com.example.introtodesigningfortesting.examples

class FirstFragmentLogic {

    private val database = Database()

    fun getApplicationName(): String{
        return database.getAppName()
    }
}