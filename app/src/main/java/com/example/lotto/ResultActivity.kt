package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result") //?: return
        val strConstellation = intent.getStringExtra("constellation")

        val result_sorted = result?.sorted()

        /*result?.let {
            updateLottoBallImages(result.sortedBy { it })
        }*/

        strConstellation.let {
            val resulLabel = findViewById<TextView>(R.id.resultLabel)
            resulLabel.text = "${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())} 로또번호입니다"
        }

        //updateLottoBallImages (result_sorted)

        val lottoBallImageStartId = R.drawable.ball_01

            val imageView2 = findViewById<ImageView>(R.id.imageView2)
            val imageView3 = findViewById<ImageView>(R.id.imageView3)
            val imageView4 = findViewById<ImageView>(R.id.imageView4)
            val imageView5 = findViewById<ImageView>(R.id.imageView5)
            val imageView6 = findViewById<ImageView>(R.id.imageView6)
            val imageView7 = findViewById<ImageView>(R.id.imageView7)

            imageView2.setImageResource(lottoBallImageStartId + result_sorted?.get(0)!! - 1)
            imageView3.setImageResource(lottoBallImageStartId + result_sorted?.get(1) - 1)
            imageView4.setImageResource(lottoBallImageStartId + result_sorted?.get(2) - 1)
            imageView5.setImageResource(lottoBallImageStartId + result_sorted?.get(3) - 1)
            imageView6.setImageResource(lottoBallImageStartId + result_sorted?.get(4) - 1)
            imageView7.setImageResource(lottoBallImageStartId + result_sorted?.get(5) - 1)
    }

        /*private fun updateLottoBallImages(result_sorted : List<Int>) {
            val lottoBallImagesStartId = R.drawable.ball_01 //146
            //val lottoBallImagestId2 = R.drawable.ball_02
            //val lottoBallImagestId3 = R.drawable.ball_03

            val imageview2 = findViewById<ImageView>(R.id.imageView2)
            val imageview3 = findViewById<ImageView>(R.id.imageView3)
            val imageview4 = findViewById<ImageView>(R.id.imageView4)
            val imageview5 = findViewById<ImageView>(R.id.imageView5)
            val imageview6 = findViewById<ImageView>(R.id.imageView6)
            val imageview7 = findViewById<ImageView>(R.id.imageView7)

            imageview2.setImageResource(lottoBallImagesStartId + result_sorted[0]!! -1)
            imageview3.setImageResource(lottoBallImagesStartId + result_sorted[1] -1)
            imageview4.setImageResource(lottoBallImagesStartId + result_sorted[2] -1)
            imageview5.setImageResource(lottoBallImagesStartId + result_sorted[3] -1)
            imageview6.setImageResource(lottoBallImagesStartId + result_sorted[4] -1)
            imageview7.setImageResource(lottoBallImagesStartId + result_sorted[5] -1)




        }*/
}