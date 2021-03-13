package com.solvabit.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage: ImageView
    lateinit var dicetext: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceimage=findViewById(R.id.dice_image)
        dicetext = findViewById(R.id.dice_text)
        val roll_the_dice = findViewById<Button>(R.id.rollthedice)
        roll_the_dice.setOnClickListener {
            rolldice()
        }
    }

    private fun rolldice() {
        val random = java.util.Random().nextInt(6)+1
        val dice_drawable = when(random){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else-> R.drawable.dice_6
        }
        diceimage.setImageResource(dice_drawable)
        dicetext.text=random.toString()
    }

}