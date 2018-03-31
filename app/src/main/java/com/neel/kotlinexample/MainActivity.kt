package com.neel.kotlinexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonWelcome.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,MessageOnButtonClick::class.java)
            startActivity(intent)
        })

        buttonRecyclerView.setOnClickListener(View.OnClickListener {

            val intentRec = Intent(this,RecyclerViewActivity::class.java)
            startActivity(intentRec)
        })

        buttonBottomNavigation.setOnClickListener(View.OnClickListener {

            val intentBNav = Intent(this,BottomNavigation::class.java)
            startActivity(intentBNav)
        })
    }
}
