package com.example.instaclone.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.instaclone.R

class SignUpAcitivity : AppCompatActivity() {
    lateinit var newName:TextView
    lateinit var newEmail:TextView
    lateinit var password:TextView
    lateinit var confirm:TextView
    lateinit var bSignUp:AppCompatButton
    lateinit var textSignIn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_acitivity)
        initView()
    }


    private fun initView(){
        newName = findViewById(R.id.newName_id)
        newName = findViewById(R.id.newEmail_id)
        password = findViewById(R.id.newPass_id)
        confirm = findViewById(R.id.confirmPass_id)
        bSignUp = findViewById(R.id.signUpButton_id)
        textSignIn = findViewById(R.id.signInText_id)


        bSignUp.setOnClickListener {
            openHomePageActivity()
        }

        textSignIn.setOnClickListener {
            openSignInActivity()
        }
    }

    private fun openHomePageActivity(){
        val intent = Intent(this@SignUpAcitivity, HomePageActivity::class.java)
        startActivity(intent)
        finish()
    }
    private fun openSignInActivity(){
        val intent = Intent(this@SignUpAcitivity, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }

}