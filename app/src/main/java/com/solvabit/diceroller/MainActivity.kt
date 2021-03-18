package com.solvabit.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.solvabit.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dice_no:Dataclass=Dataclass("1")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.dicetext=dice_no
        binding.rollthedice.setOnClickListener {
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
        binding.apply {
            invalidateAll()
            binding.diceImage.setImageResource(dice_drawable)
            dice_no.text = random.toString()
        }
    }

}