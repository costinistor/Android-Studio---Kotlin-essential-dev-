package com.kotlindev.costi.androidcontrols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_spinner_simple.*

class SpinnerSimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_simple)

        var mCars = arrayOf("Honda", "Fiat", "Toyota", "Mazda", "Peugeot", "Ferrari", "Jaguar")

        spinnerSimple.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mCars)
        spinnerSimple.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //tvItemSpinner.text = parent!!.getItemAtPosition(position).toString()
                tvItemSpinner.text = mCars[position]
            }

        }
    }
}
