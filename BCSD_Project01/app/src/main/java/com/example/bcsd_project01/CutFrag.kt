package com.example.bcsd_project01

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.security.SecureRandom

class CutFrag : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              , savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_cut, container, false)
        val show_num = v.findViewById<TextView>(R.id.fragment_sohw_couningText)// 문장 텍스트 뷰의 주소 값
        val main_text =
            v.findViewById<TextView>(R.id.fragment_show_stringText)//랜덤된 숫자를 표시하는 텍스트 뷰의 주소 값


        val improtstr1 = getString(R.string.CutFrag_strText, 6)
        var random_number: Int? = 0

        show_num.text = improtstr1//변할 텍스트에 두개의 문자열을 합쳐서 넣는다.
        main_text.text = random_number.toString()//랜덤으로 얻은 숫자를 문자열로 변환해서 넣기
        val random = SecureRandom()//랜덤난수 생성

        random_number = random.nextInt(6)//랜덤된 숫자를 얻음 0~ number

        return v
    }

}
/*
    var number = intent.getIntExtra("main_num",-1) //* 메인 엑티비에서 가져온 카운트 횟수

    var number = intent.getIntExtra("main_num",-1) //* 메인 엑티비에서 가져온 카운트 횟수

    val show_num =findViewById<TextView>(R.id.textView2)// 문장 텍스트 뷰의 주소 값
    val main_text =findViewById<TextView>(R.id.maintext)//랜덤된 숫자를 표시하는 텍스트 뷰의 주소 값

    var random = SecureRandom()//랜덤난수 생성
    var random_number = random.nextInt(number)//랜덤된 숫자를 얻음 0~ number

    var improtstr1 = getString(R.string.mainstr, number)

    show_num.text = improtstr1//변할 텍스트에 두개의 문자열을 합쳐서 넣는다.
    main_text.text = random_number.toString()//랜덤으로 얻은 숫자를 문자열로 변환해서 넣기
 */