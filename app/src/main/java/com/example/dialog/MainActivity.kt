package com.example.dialog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvGo.setOnClickListener {
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