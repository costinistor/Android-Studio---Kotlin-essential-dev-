package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        btnToggle.setOnCheckedChangeListener { buttonView, isChecked ->
            tvResultToggle.text = if(isChecked) "Button is ON" else "Button is OFF"
        }
    }
}
