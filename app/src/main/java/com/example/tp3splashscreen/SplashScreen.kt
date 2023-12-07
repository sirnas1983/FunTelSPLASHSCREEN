package com.example.tp3splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configuraciones para ocultar la barra de notificaciones
        actionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_splash_screen)
        // Metodo para atrasar el inicio del MainActivity
        Handler().postDelayed({
            val i = Intent(this, MainActivity::class.java)
            finish()
            startActivity(i)
        }, 5000)

        // Animacion de ImageView y TextView
        var icono : ImageView = findViewById(R.id.imageView)

        var animation = AnimationUtils.loadAnimation(
            getApplicationContext(),
            R.anim.splash_screen_icon_animation
        );

        icono.startAnimation(animation)

        val f: TextView = findViewById(R.id.textView)
        f.animate().alpha(0F).duration = 4500


    }
}