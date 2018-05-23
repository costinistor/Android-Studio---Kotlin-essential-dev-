package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

//        cbBoxA.setOnClickListener {
//            tvPrintResult.text = if(cbBoxA.isChecked) "Box A is checked" else "Box A is unchecked"
//        }

        btnSeeResult.setOnClickListener {
            tvPrintResult.text = checkResult()
        }

    }

    fun checkResult():String{
        var result = ""
        result += if(cbBoxA.isChecked) "Box A is checked \n" else "Box A is unchecked \n"
        result += if(cbBoxB.isChecked) "Box B is checked \n" else "Box B is unchecked \n"
        result += if(cbBoxC.isChecked) "Box C is checked \n" else "Box C is unchecked \n"
        return result
    }
}
