package com.example.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding_ex.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1번 방식 - findViewById
        //val btn = findViewById<Button>(R.id.testBtnId)

        //btn.setOnClickListener {
          //  Toast.makeText(this,"클릭이 되었다!", Toast.LENGTH_LONG).show()
        //}

        //2번 방식 - 데이터바인딩 이용
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.testBtnId.setOnClickListener{
            Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
        }

        //차이점은 코드가 줄어든 부분
        //데이터 바인딩을 사용하면 코드의 길이를 줄일 수 있다
    }
}