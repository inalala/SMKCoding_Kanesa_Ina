package id.ina.barbershop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_activity.*

class Login: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        login_layout_button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}