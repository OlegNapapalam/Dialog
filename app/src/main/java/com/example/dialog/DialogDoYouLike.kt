package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_do_you_like.*

class DialogDoYouLike : DialogFragment() {

    private var listenerNo: ((Boolean) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.dialog_do_you_like, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvYes.setOnClickListener {
            dismiss()
        }

        tvNo.setOnClickListener {
            listenerNo?.invoke(true)
            dismiss()
        }

        tvLeaveIt.setOnClickListener {
            Toast.makeText(context, "LEAVE IT", Toast.LENGTH_SHORT).show()
        }

        tvAskLater.setOnClickListener {
            Toast.makeText(context, "ASK LATER", Toast.LENGTH_SHORT).show()
        }

    }

    fun initListenerNo(data: (Boolean) -> Unit) {
        listenerNo = data
    }

    companion object {
        fun getInstance(): DialogDoYouLike {
            val fragment = DialogDoYouLike()
            return fragment
        }
    }


}