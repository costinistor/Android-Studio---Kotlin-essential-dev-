package toastdialog.com.androidtoastanddialog

import android.app.DialogFragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import kotlinx.android.synthetic.main.dialog_custom.*
import kotlinx.android.synthetic.main.dialog_custom.view.*



/**
 * Created by Costi on 6/4/2018.
 */
class dialogCustom: DialogFragment() {

    interface OnInputSelected{
        fun sendInput(input:String)
    }

    var mOnInputSelected: OnInputSelected? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        var view = inflater!!.inflate(R.layout.dialog_custom, container, false)

        view.btnSend.setOnClickListener {
            if(!etInfo.text.isNullOrEmpty()){
                var input = etInfo.text.toString()
                mOnInputSelected!!.sendInput(input)
                dismiss()
            }
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        dialog.window.requestFeature(Window.FEATURE_NO_TITLE)
        dialog.window.setBackgroundDrawableResource(R.drawable.bg_dialog_transparent)
        super.onActivityCreated(savedInstanceState)
        dialog.window.attributes.windowAnimations = R.style.dialog_animation
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            mOnInputSelected = context as OnInputSelected
        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString() + "erore")
        }
    }
}


