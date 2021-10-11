package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.dialog.databinding.DialogThankYouBinding

class DialogThankYou : DialogFragment() {

    private var _binding: DialogThankYouBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogThankYouBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvClose.setOnClickListener {
            Toast.makeText(context, "tvClose", Toast.LENGTH_SHORT).show()
            dismiss()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    companion object {
        fun getInstance(): DialogThankYou {
            val fragment = DialogThankYou()
            return fragment
        }
    }


}