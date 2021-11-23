package com.example.bcsd_project01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {


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
           showCutFrag(cutFragment())
        }

    }

    fun showCutFrag(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayoutMainAt, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
