package com.bklee.signuppractice_0408

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextBtn.setOnLongClickListener {

            // MyPageActivity로 이동

            val myIntent = Intent(this, MyPageActivity::class.java)
            startActivity(myIntent)
        }
    }
}
