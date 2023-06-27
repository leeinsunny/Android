package com.example.twice

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageView>(R.id.member1)
        btn1.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            //intent로 데이터 전달하기
            //activity가 이동할 때 data라는 박스 안에 1이라는 값을 넣어서 보낸다
            //이렇게 MainActivity에서 data를 보내면, ImageInsideActivity에서 데이터를 받아준다
            startActivity(intent)
        }

        val btn2 = findViewById<ImageView>(R.id.member2)
        btn2.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }

        val btn3 = findViewById<ImageView>(R.id.member3)
        btn3.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }


        val btn4 = findViewById<ImageView>(R.id.member4)
        btn4.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }

        val btn5 = findViewById<ImageView>(R.id.member5)
        btn5.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }

        val btn6 = findViewById<ImageView>(R.id.member6)
        btn6.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            startActivity(intent)
            intent.putExtra("data","6")
        }

        val btn7 = findViewById<ImageView>(R.id.member7)
        btn7.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }

        val btn8 = findViewById<ImageView>(R.id.member8)
        btn8.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)
        }


        val btn9 = findViewById<ImageView>(R.id.member9)
        btn9.setOnClickListener {
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","9")
            startActivity(intent)
        }
    }
}