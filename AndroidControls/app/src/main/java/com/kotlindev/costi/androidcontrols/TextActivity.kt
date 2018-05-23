package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        btnPrintText.setOnClickListener {
            val getText = etGetText.text
            if(getText.isNullOrBlank()){
                tvPutText.text = "Your input is empty"
            }else{
                tvPutText.text = "Hello, $getText"
            }
        }
    }
}
