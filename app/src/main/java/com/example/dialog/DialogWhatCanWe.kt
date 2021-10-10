package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_what_can_we.*


class DialogWhatCanWe : DialogFragment() {

    private var listenerConfirm: ((Boolean) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.dialog_what_can_we, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvConfirm.setOnClickListener {
            listenerConfirm?.invoke(true)
            dismiss()
        }

        tvStepBack.setOnClickListener {
            Toast.makeText(context, "tvStepBack", Toast.LENGTH_SHORT).show()
        }

        tvCancel.setOnClickListener {
            Toast.makeText(context, "tvCancel", Toast.LENGTH_SHORT).show()
        }

    }

    fun initListenerConfirm(data: (Boolean) -> Unit) {
        listenerConfirm = data
    }

    companion object {
        fun getInstance(): DialogWhatCanWe {
            val fragment = DialogWhatCanWe()
            return fragment
        }
    }


}