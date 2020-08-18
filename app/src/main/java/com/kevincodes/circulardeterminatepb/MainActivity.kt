package com.kevincodes.circulardeterminatepb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var prog = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateProgressBar()
        initialize()
    }

    private fun initialize(){
        incrementBtn.setOnClickListener {
            if (prog <=90){
                prog+=10
                updateProgressBar()
            }
        }
        decrementBtn.setOnClickListener {
            if (prog >= 10){
                prog -=10
                updateProgressBar()
            }
        }
    }

    private fun updateProgressBar(){
        progressBar.progress = prog
        progressText.text = "$prog%"
    }
}