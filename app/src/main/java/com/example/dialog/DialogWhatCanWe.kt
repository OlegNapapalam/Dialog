package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.dialog.databinding.DialogWhatCanWeBinding


class DialogWhatCanWe : DialogFragment() {
    private var _binding: DialogWhatCanWeBinding? = null
    private val binding get() = _binding!!

    private var listenerConfirm: ((Boolean) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DialogWhatCanWeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvConfirm.setOnClickListener {
            listenerConfirm?.invoke(true)
            dismiss()
        }

        binding.tvStepBack.setOnClickListener {
            Toast.makeText(context, "tvStepBack", Toast.LENGTH_SHORT).show()
        }

        binding.tvCancel.setOnClickListener {
            Toast.makeText(context, "tvCancel", Toast.LENGTH_SHORT).show()
        }

    }

    fun initListenerConfirm(data: (Boolean) -> Unit) {
        listenerConfirm = data
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun getInstance(): DialogWhatCanWe {
            val fragment = DialogWhatCanWe()
            return fragment
        }
    }


}