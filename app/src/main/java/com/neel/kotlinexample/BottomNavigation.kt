package com.neel.kotlinexample

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_android -> {
                setAndroidFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_java -> {
                setJavaFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_kotlin -> {
                setKotlinFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun setAndroidFragment() {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        val androidFragment = AndroidFragment.newInstance()
        ft.replace(R.id.framelayout, androidFragment)
        ft.commit()
    }

    fun setJavaFragment() {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        val javaFragment = JavaFragment.newInstance()
        ft.replace(R.id.framelayout, javaFragment)
        ft.commit()
    }

    fun setKotlinFragment() {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        val kotlinFragment = KotlinFragment.newInstance()
        ft.replace(R.id.framelayout, kotlinFragment)
        ft.commit()
    }
}
