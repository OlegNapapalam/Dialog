package com.example.dialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvGo.setOnClickListener {
            dialogDoYouLike()
        }
    }

    fun dialogDoYouLike() {
        val dialog = DialogDoYouLike.getInstance()
        dialog.show(supportFragmentManager, "")

        dialog.initListenerNo {
            dialogWhatCanWe()
        }
    }

    fun dialogWhatCanWe() {
        val dialog = DialogWhatCanWe.getInstance()
        dialog.show(supportFragmentManager, "")

        dialog.initListenerConfirm {
            dialogThankYou()
        }
    }

    fun dialogThankYou() {
        val dialog = DialogThankYou.getInstance()
        dialog.show(supportFragmentManager, "")
    }

}