package com.example.dice_app

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2
        //지금 diceImage1이랑 diceImage2에는 Imageview가 담겨 있다

        binding.diceStartbtn.setOnClickListener {

            Toast.makeText(this,"주사위를 돌렸습니다!",Toast.LENGTH_LONG).show()
            Log.d("MainActivity", Random.nextInt(1,6).toString())
            Log.d("MainActivity", Random.nextInt(1,6).toString())
            //Log를 찍어서 주사위 돌리기를 눌렀을 때 잘 나오는지를 확인해볼 수 있다

            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            if(number1==1){
                diceImage1.setImageResource(R.drawable.dice_1)
            }else if(number1==2){
                diceImage1.setImageResource(R.drawable.dice_2)
            }else if(number1==3){
                diceImage1.setImageResource(R.drawable.dice_3)
            }else if(number1==4){
                diceImage1.setImageResource(R.drawable.dice_4)
            }else if(number1==5){
                diceImage1.setImageResource(R.drawable.dice_5)
            }else{
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if(number2==1){
                diceImage2.setImageResource(R.drawable.dice_1)
            }else if(number2==2){
                diceImage2.setImageResource(R.drawable.dice_2)
            }else if(number2==3){
                diceImage2.setImageResource(R.drawable.dice_3)
            }else if(number2==4){
                diceImage2.setImageResource(R.drawable.dice_4)
            }else if(number2==5){
                diceImage2.setImageResource(R.drawable.dice_5)
            }else{
                diceImage2.setImageResource(R.drawable.dice_6)
            }

        }
    }
}