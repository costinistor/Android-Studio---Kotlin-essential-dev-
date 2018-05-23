package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_radio_group.*

class RadioGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_group)


        rgCity.setOnCheckedChangeListener { group, checkedId ->
            var rbCity = findViewById<RadioButton>(checkedId)
            tvResult.text = rbCity.text
        }

        GetSelected()

    }

    fun GetSelected(){
        rbParis.isChecked = true
        rbLondon.setOnClickListener { tvPrintRb.text = "London is selected" }
        rbParis.setOnClickListener { tvPrintRb.text = "Paris is selected" }
        rbRome.setOnClickListener { tvPrintRb.text = "Rome is selected" }
    }

}


