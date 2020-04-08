package com.bklee.signuppractice_0408

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)

        okBtn.setOnClickListener {

            val inputName = nameEdt.text.toString()
//            String -> Int?
            val inputBirthYear = birthYearEdt.text.toString().toInt()

            val myIntent = Intent(this, MyPageActivity::class.java)
            myIntent.putExtra("userName", inputName)
            myIntent.putExtra("userAge", 2020-inputBirthYear+1)
            startActivity(myIntent)
        }

    }
}
