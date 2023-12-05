package com.example.tp3splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_splash_screen)

        //Animacion
        var ANIMATION_DURATION = 4500L
        var icono : ImageView = findViewById(R.id.imageView)
        val r: RotateAnimation =
            RotateAnimation(0F, 360F, Animation.RELATIVE_TO_SELF, .5f,
                Animation.RELATIVE_TO_SELF, .5f)
        r.duration = ANIMATION_DURATION
        r.repeatCount = 0
        icono.startAnimation(r)
        val f: TextView = findViewById(R.id.textView)
        f.animate().alpha(0F).duration = ANIMATION_DURATION
        //

        Handler().postDelayed({
            val i = Intent(this, MainActivity::class.java)
            finish()
            startActivity(i)
        }, 5000)
    }
}