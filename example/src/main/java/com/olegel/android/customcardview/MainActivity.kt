package com.olegel.android.customcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener({
            custom_card_view.setShadows(resources.getColor(R.color.colorGreen), resources.getColor(R.color.colorBlue))
        })
    }
}
