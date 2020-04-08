package com.bklee.signuppractice_0408

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name = intent.getStringExtra("userName")
        val age = intent.getIntExtra("userAge", -1)

        userNameTxt.text = "${name} : ${age}세"



    }
}
