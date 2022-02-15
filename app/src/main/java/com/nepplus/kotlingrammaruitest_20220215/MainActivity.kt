package com.nepplus.kotlingrammaruitest_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputid = edtID.text.toString()
            val inputpw = edtPW.text.toString()

//            [내가 한 풀이]
//            if(inputid != "admin") {
//                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            }else if (inputpw != "asdf") {
//                Toast.makeText(this, "비밀번호가 잘못되었습니다", Toast.LENGTH_SHORT).show()
//            }else {
//                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
//            }

            //            [강사님 풀이]
            if (inputid == "admin" && inputpw == "asdf"){
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            } else if (inputid != "admin") {
                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            } else if (inputpw != "asdf") {
                Toast.makeText(this, "비밀번호가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
            }



        }

    }
}