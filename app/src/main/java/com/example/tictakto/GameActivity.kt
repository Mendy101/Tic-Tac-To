package com.example.tictakto

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    var arrBottom: ArrayList<ImageButton> = ArrayList(9);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)




    }
}