package com.example.geekout

import android.os.Bundle
import android.app.Activity

class SettingsActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Sets the Content View to the default view: Menu
        setContentView(R.layout.settings)
    }
}