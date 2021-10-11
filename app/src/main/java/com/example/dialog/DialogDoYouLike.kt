package com.example.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.dialog.databinding.DialogDoYouLikeBinding

class DialogDoYouLike : DialogFragment() {
    private var _binding: DialogDoYouLikeBinding? = null
    private val binding get() = _binding!!

    private var listenerNo: ((Boolean) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = DialogDoYouLikeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvYes.setOnClickListener {
            dismiss()
        }

        binding.tvNo.setOnClickListener {
            listenerNo?.invoke(true)
            dismiss()
        }

        binding.tvLeaveIt.setOnClickListener {
            Toast.makeText(context, "LEAVE IT", Toast.LENGTH_SHORT).show()
        }

        binding.tvAskLater.setOnClickListener {
            Toast.makeText(context, "ASK LATER", Toast.LENGTH_SHORT).show()
        }

    }

    fun initListenerNo(data: (Boolean) -> Unit) {
        listenerNo = data
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    companion object {
        fun getInstance(): DialogDoYouLike {
            val fragment = DialogDoYouLike()
            return fragment
        }
    }


}