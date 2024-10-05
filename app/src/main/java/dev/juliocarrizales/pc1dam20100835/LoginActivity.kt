package dev.juliocarrizales.pc1dam20100835

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        title = "Sign In"
        val emailSucess : String = "invitado@android.com"
        val passwordSucess : String = "invitado123"

        val etEmail: EditText = findViewById<EditText>(R.id.emailText)
        val etPassword: EditText = findViewById<EditText>(R.id.passwordText)
        val btnLogin: Button = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val email: String = etEmail.text.trim().toString()
            val password: String = etPassword.text.trim().toString()
            if (email == emailSucess && password == passwordSucess) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales inválidas", Snackbar.LENGTH_LONG).show()

        }
    }
}