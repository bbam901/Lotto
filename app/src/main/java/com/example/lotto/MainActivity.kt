package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CardView1 = findViewById<CardView>(R.id.CardView1)
        CardView1.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }
        val CardView2 = findViewById<CardView>(R.id.CardView2)
        CardView2.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        val CardView3 = findViewById<CardView>(R.id.CardView3)
        CardView3.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }



    fun getRandomLottoNumber():Int{
        return Random().nextInt(45)+1
    }
    fun getRandomLottoNumbers(): MutableList<Int>{
        val lottoNumbers = mutableListOf<Int>()

        while(true){
            var number:Int = getRandomLottoNumber()
            // var flag_existing: Int = 0
            //  for(j in 0..lottoNumbers.size){
            if(lottoNumbers.contains(number)){
                //        if(number.equals(lottoNumbers[j])){
                //            flag_existing =1
                //   break;
                continue

            }
//        if(flag_existing.equals(1))
//            continue
//        else
            lottoNumbers.add(number)
            if(lottoNumbers.size >= 6)
                break;
        }
        return lottoNumbers

    }
}