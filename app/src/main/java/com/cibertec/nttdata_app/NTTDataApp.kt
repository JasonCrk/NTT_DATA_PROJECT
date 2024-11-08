package com.cibertec.nttdata_app

import android.app.Application

import com.google.firebase.FirebaseApp

class NTTDataApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}