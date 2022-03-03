package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roll_page)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }
        rollDice()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll){
            1-> (R.drawable.dice_1)
            2-> (R.drawable.dice_2)
            3-> (R.drawable.dice_3)
            4-> (R.drawable.dice_4)
            5-> (R.drawable.dice_5)
            else-> (R.drawable.dice_6)
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = diceRoll.toString()
    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}