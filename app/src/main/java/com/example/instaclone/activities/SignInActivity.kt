package com.example.instaclone.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.instaclone.R

class SignInActivity : AppCompatActivity() {
    lateinit var emailText:TextView
    lateinit var passText:TextView
    lateinit var bSignIn:AppCompatButton
    lateinit var textSignUp:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initView()
    }

    private fun initView() {
        emailText = findViewById(R.id.inputEmail_id)
        passText = findViewById(R.id.inputPass_id)
        bSignIn = findViewById(R.id.signInButton_id)
        textSignUp = findViewById(R.id.signUpText_id)

        bSignIn.setOnClickListener {
            openHomeActivity()
        }
        textSignUp.setOnClickListener {
            openSignUpActivity()
        }

    }

    private fun openHomeActivity(){
        val intent = Intent(this@SignInActivity,HomePageActivity::class.java )
        startActivity(intent)
        finish()
    }

    private fun openSignUpActivity(){
        val intent = Intent(this@SignInActivity, SignUpAcitivity::class.java)
        startActivity(intent)
        finish()
    }
}