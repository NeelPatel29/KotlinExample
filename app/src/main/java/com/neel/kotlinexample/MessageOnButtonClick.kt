package com.neel.kotlinexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_message_on_button_click.*

class MessageOnButtonClick : AppCompatActivity() {
    var message = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_on_button_click)

        btnShowMessage.setOnClickListener(View.OnClickListener {
            message = etMessage.text.toString()

            if (message == "") {
                message = "Kotlin"
                Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
            }
        })
    }
}
