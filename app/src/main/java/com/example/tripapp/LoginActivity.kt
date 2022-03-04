package com.example.tripapp

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.example.tripapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    val TAG: String = "LoginActivity"

    private var mBinding: ActivityLoginBinding? = null
    private val binding get() = mBinding!!

    private var testId = "ml1010"
    private var testPw = "asdf"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 로그인 버튼
        binding.btnLogin.setOnClickListener {

            //editText로부터 입력된 값을 받아온다
            var id = binding.editId.text.toString()
            var pw = binding.editPw.text.toString()

            // 쉐어드로부터 저장된 id, pw 가져오기
            //val sharedPreference = getSharedPreferences("file name", Context.MODE_PRIVATE)
            //val savedId = sharedPreference.getString("id", "")
            //val savedPw = sharedPreference.getString("pw", "")

            var savedId = testId
            var savedPw = testPw
            // 유저가 입력한 id, pw값과 쉐어드로 불러온 id, pw값 비교
            if(id == savedId && pw == savedPw){
                // 로그인 성공 다이얼로그 보여주기
                dialog("success")
                val intent = Intent(this, MapActivity::class.java)
                startActivity(intent)
            }
            else{
                // 로그인 실패 다이얼로그 보여주기
                dialog("fail")
            }
        }

        // 회원가입 버튼
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

    // 로그인 성공/실패 시 다이얼로그를 띄워주는 메소드
    fun dialog(type: String){
        var dialog = AlertDialog.Builder(this)

        if(type.equals("success")){
            dialog.setTitle("로그인 성공")
            dialog.setMessage("로그인 성공!")
        }
        else if(type.equals("fail")){
            dialog.setTitle("로그인 실패")
            dialog.setMessage("아이디와 비밀번호를 확인해주세요")
        }

        var dialog_listener = object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                when(which){
                    DialogInterface.BUTTON_POSITIVE ->
                        Log.d(TAG, "")
                }
            }
        }

        dialog.setPositiveButton("확인",dialog_listener)
        dialog.show()
    }
}