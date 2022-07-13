package com.example.appfigmatest

import android.content.Context

class Prefs (val context:Context){
    val DATABASE = "MyDB"
    val USER_NAME = "UserName"
    val COLOR = "Color"
    val storage = context.getSharedPreferences(DATABASE, Context.MODE_PRIVATE)

    fun saveName(name:String){
        storage.edit().putString(USER_NAME, name).apply()
    }

    fun saveEmail(remember:Boolean){
        storage.edit().putBoolean(COLOR, remember).apply()
    }
    fun savePassword(name:String){
        storage.edit().putString(USER_NAME, name).apply()
    }

    fun getName():String{
        return storage.getString(USER_NAME, "")!!
    }

    fun getEmail():String{
        return storage.getString(COLOR, " ")!!
    }
    fun getPassword():String{
        return storage.getString(USER_NAME, "")!!
    }

    fun wipeData(){
        storage.edit().clear().apply()
    }

}