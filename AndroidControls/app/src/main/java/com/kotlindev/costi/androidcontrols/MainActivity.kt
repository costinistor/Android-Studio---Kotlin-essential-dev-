package com.kotlindev.costi.androidcontrols

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToText.setOnClickListener { OpenTextActivity() }
        btnToCheckBox.setOnClickListener { OpenCheckBoxActivity() }
        btnToRadioGroup.setOnClickListener { OpenRadioGrouActivity() }
        btnToSeekBar.setOnClickListener { OpenSeekBarActivity() }
        btnToSwitch.setOnClickListener { OpenSwitchActivity() }
        btnToToggle.setOnClickListener { OpenToggleActivity() }
        btnToSpinnerSimple.setOnClickListener { OpenSpinnerSimpleActivity() }
    }

    fun OpenTextActivity(){
        var intent = Intent(this, TextActivity::class.java)
        startActivity(intent)
    }

    fun OpenCheckBoxActivity(){
        startActivity(Intent(this, CheckBoxActivity::class.java))
    }

    fun OpenRadioGrouActivity(){
        startActivity(Intent(this, RadioGroupActivity::class.java))
    }

    fun OpenSeekBarActivity(){
        startActivity(Intent(this, SeekBarActivity::class.java))
    }

    fun OpenSwitchActivity(){
        startActivity(Intent(this, SwitchButtonActivity::class.java))
    }

    fun OpenToggleActivity(){
        startActivity(Intent(this, ToggleButtonActivity::class.java))
    }

    fun OpenSpinnerSimpleActivity(){
        startActivity(Intent(this, SpinnerSimpleActivity::class.java))
    }
}
