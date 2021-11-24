package com.example.bcsd_project01

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private lateinit var transaction: FragmentTransaction

    //메인엑티비티 내에서 가변되는 카운팅 변수
    var countNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transaction= fragmentManager.beginTransaction()
        transaction.add(R.id.frame_Layout_Main)
        transaction.commit()

        //mainActivity의 레이아웃주소들
        val toastBtnId = findViewById<Button>(R.id.button_toast)
        val countBtnId = findViewById<Button>(R.id.button_count)
        val randomBtnId = findViewById<Button>(R.id.button_random)
        val countingText = findViewById<TextView>(R.id.show_counting_Text)

        // 다이얼로그 만들기
        val getDlg: AlertDialog.Builder = AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth)
        getDlg.setTitle("다이얼로그활성화")
        getDlg.setMessage("하나를 선택해주세요.\n 카운트초기화 \n toast출력 \n 종료")
        getDlg.setPositiveButton("초기화", DialogInterface.OnClickListener {dialog, which ->
            countNumber = 0
        })
        getDlg.setNeutralButton("출력", DialogInterface.OnClickListener {dialog, which ->
            Toast.makeText(this@MainActivity, " 토스트먹고싶다", Toast.LENGTH_SHORT).show()
        })

        //각 버튼별 기능
        toastBtnId.setOnClickListener {
            getDlg.show()
        }

        countBtnId.setOnClickListener {
            countNumber++
            countingText.text = countNumber.toString()
        }

        randomBtnId.setOnClickListener {
        transaction.replace(R.id.frame_Layout_Main, CutFrag())
        transaction.commit()
        }

        fun driverNumber(): Int{
            return countNumber
        }
    }
}