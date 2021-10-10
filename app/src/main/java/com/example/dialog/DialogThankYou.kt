package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dialog_thank_you.*

class DialogThankYou : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.dialog_thank_you, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvClose.setOnClickListener {
            Toast.makeText(context, "tvClose", Toast.LENGTH_SHORT).show()
            dismiss()
        }

    }


    companion object {
        fun getInstance(): DialogThankYou {
            val fragment = DialogThankYou()
            return fragment
        }
    }


}