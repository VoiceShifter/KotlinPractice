package com.example.kotlin_practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val FirstFragmentVariable = PasswordFragment()
    val SecondFragmentVariable = TodoList()
    val ThirdFragmentVariable = Schedule()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        supportFragmentManager.beginTransaction().apply {
            replace(R.id.ContainerFragment, FirstFragmentVariable)
            commit()

        }

    }

    fun FragmentMovementButton(view: View)
    {
        val currentFragment = supportFragmentManager.fragments.last()

        if(currentFragment ==  FirstFragmentVariable)
        {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.ContainerFragment, SecondFragmentVariable)
                commit()

            }
        }
        else if (currentFragment == SecondFragmentVariable) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.ContainerFragment, ThirdFragmentVariable)
                commit()

            }
        }
        else
        {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.ContainerFragment, FirstFragmentVariable)
                commit()

            }

        }

    }


}