package jp.techacademy.takaya.oosaki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("映画", "大崎", 49)

        human1.say();
        human1.think();

        val human2 = Human("Rugby", "Peter", 30)

        human2.say();
        human2.think();
    }
}
