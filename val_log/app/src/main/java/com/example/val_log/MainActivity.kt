package com.example.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var value = "여기는 Value입니다!"
        val value2 = "여기는 value2입니다!"

        //근데 위에서 이미 변수의 값들을 지정했는데, value의 값을 바꾸고 싶다면?

        value = "여기는 value가 아닙니다~!~!"
        //원래는 이 바로 윗줄의 value에 에러가 발생해야함. 근데 change to var을 하니까
        //에러가 사라졌다
        //val일때는 에러가 났는데, var일때는 에러가 발생하지 않는다!

        val test = "이인선 2학기 화이팅~!"
        Log.e("MainActivity",test) // 오류
        Log.w("MainActivity",test) //경고
        Log.i("MainActivity",test) //정보
        Log.d("MainActivity",test) //디버그 (버그 잡는거
        Log.v("MainActivity",test) //상세




    }
}