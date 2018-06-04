package toastdialog.com.androidtoastanddialog

import android.app.DialogFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), dialogCustom.OnInputSelected {

    override fun sendInput(input: String) {
        tvInfo.text = input
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener { openToastDialog() }
        btnAlertDialog.setOnClickListener { openAlertDialog() }
        btnCustomDialog.setOnClickListener { openCustomDialog() }
    }

    fun openToastDialog(){
        Toast.makeText(this@MainActivity, "This is a toast dialog", Toast.LENGTH_LONG).show()
    }

    fun openAlertDialog(){
        var alertBuilder = AlertDialog.Builder(this)
        alertBuilder.setTitle("My alert dialog")
        alertBuilder.setMessage("This is an alert dialog")
        alertBuilder.setPositiveButton("Yes"){ dialog, which ->
            showToast("You chose yes")
        }

        alertBuilder.setNegativeButton("No") { dialog, which ->
            showToast("You selected no")
        }

        alertBuilder.setNeutralButton("Cancel"){dialog, which ->
            showToast("You canceled the dialog")
        }
        var dialog = alertBuilder.create()
        dialog.show()
    }

    fun showToast(message: String){
        var toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun openCustomDialog(){
        val transaction = fragmentManager.beginTransaction()
        val dialog = dialogCustom()
        dialog.show(transaction, "dialog")
    }
}


