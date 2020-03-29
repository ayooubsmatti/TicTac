package com.example.tictac

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("ResourceAsColor")
    fun buttonSelect(view:View){
        var buchoice = view as Button
        var cellId:Int = 0
        when(buchoice.id){
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9
        }
        Log.d("cellId :",cellId.toString())
        playeGame(buchoice,cellId)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var token:Int=1

    fun playeGame(buchoice:Button,cellId:Int){
       if (token == 1){
           player1.add(cellId)
           buchoice.text = "x"
           buchoice.setBackgroundResource(R.color.colorAccent)
           token = 2
       }else{
            player2.add(cellId)
            buchoice.text = "o"
            buchoice.setBackgroundResource(R.color.colorPrimary)
            token = 1
        }

        buchoice.isEnabled = false
    }

}
