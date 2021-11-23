package com.example.bcsd_project01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = findViewById<Button>(R.id.button_toast)
        val count = findViewById<Button>(R.id.button_count)
        val random = findViewById<Button>(R.id.button_random)

        val senterTxet = findViewById<TextView>(R.id.sentertxet)
        var number = 0



        toast.setOnClickListener() {
            Toast.makeText(this@MainActivity, " toast", Toast.LENGTH_SHORT).show()
        }

        count.setOnClickListener() {
            number++
            senterTxet.text = number.toString()
        }

        random.setOnClickListener() {
           showCutFrag()
        }

    }

    fun showCutFrag(){
        val transaction = manager.beginTransaction()
        val frament = cutFragment()
        transaction.replace(R.id.frameLayoutMainAt, frament)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
