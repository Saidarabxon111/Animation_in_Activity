package uz.saidarabxon.animationinactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dars.setOnClickListener {
            val anim =  AnimationUtils.loadAnimation(this,R.anim.rotate_anim)

            dars.startAnimation(anim)
        }
    }
}