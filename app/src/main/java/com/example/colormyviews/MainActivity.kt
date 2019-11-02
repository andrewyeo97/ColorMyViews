package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_three_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_four_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_six_text -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box_seven_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_eight_text -> view.setBackgroundColor(Color.RED)
            R.id.box_nine_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_ten_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_12_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_13_text -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box_14_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_15_text -> view.setBackgroundColor(Color.RED)
            R.id.box_16_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_17_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_18_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_19_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_20_text -> view.setBackgroundColor(Color.LTGRAY)




            else ->
                view.setBackgroundColor(Color.LTGRAY)

        }


        }


    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_12_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_13_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_14_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_15_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_16_text)
        val boxSeventeenText = findViewById<TextView>(R.id.box_17_text)
        val boxEighteenText = findViewById<TextView>(R.id.box_18_text)
        val boxNineteenText = findViewById<TextView>(R.id.box_19_text)
        val boxTwentyText = findViewById<TextView>(R.id.box_20_text)


        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText,boxSixText,boxSevenText,boxEightText,boxNineText,boxTenText,boxElevenText,boxTwelveText,boxThirteenText,boxFourteenText,boxFifteenText,
                boxSixteenText,boxSeventeenText,boxEighteenText,boxNineteenText,boxTwentyText,rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

}