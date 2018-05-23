package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        btnSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                imageView.setImageResource(R.mipmap.ic_launcher_round)
                tvInfoSwitch.text = "Image is changed to round"
            }else{
                imageView.setImageResource(R.mipmap.ic_launcher)
                tvInfoSwitch.text = "Image is back to square"
            }
        }
    }
}
