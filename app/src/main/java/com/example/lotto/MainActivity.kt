package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import kotlin.collections.ArrayList



fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while(true){
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0
  //      for(j in 0..lottoNumbers.size){
  //          if(number.equals(lottoNumbers[j])) {
        if(lottoNumbers.contains(number)) {
                //flag_existing = 1

            }
        if (flag_existing.equals(1))
            continue
        else
            lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break
    }
    return lottoNumbers
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CardView1 = findViewById<View>(R.id.CardView1)
            CardView1.setOnClickListener {
            val intent = IntentputIntegerArrayListExtra("result", ArrayList(getRandomLottoNumber()))
            startActivity(Intent(this, ResultActivity::class.java))
        }
        findViewById<View>(R.id.CardView2).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        findViewById<View>(R.id.CardView3).setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
}