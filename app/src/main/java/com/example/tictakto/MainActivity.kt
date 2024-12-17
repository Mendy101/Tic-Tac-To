package com.example.tictakto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startGame:Button=findViewById(R.id.mainActivity_btn)
        startGame.setOnClickListener(::login)

        
    }




    private fun login(view:View){

        val player1:String=findViewById<EditText?>(R.id.mainActivity_playe1).text.toString()
        val player2:String=findViewById<EditText?>(R.id.mainActivity_player2).text.toString()
        if(player1.isNotEmpty()&&player2.isNotEmpty()){
            val intent=Intent(this,GameActivity::class.java)
         startActivity(intent)
        }


    }

}