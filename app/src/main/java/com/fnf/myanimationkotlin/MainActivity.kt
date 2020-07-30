package com.fnf.myanimationkotlin

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    var animation: AnimationDrawable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var parent = findViewById<RelativeLayout>(R.id.parentRelLayout)

        var animationDrawable = parent.background as AnimationDrawable?
        animationDrawable?.setEnterFadeDuration(2500)
        animationDrawable?.setExitFadeDuration(2500)
        animationDrawable?.start()
    }
}