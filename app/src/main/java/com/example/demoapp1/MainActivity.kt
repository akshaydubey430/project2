package com.example.demoapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layouta)
            }

            fun demo3(view: View) {
                val packageName = "com.example.demo3" // Replace with the actual package name from build.gradle
                val launchIntent = packageManager.getLaunchIntentForPackage(packageName)

                if (launchIntent != null) {
                    startActivity(launchIntent)
                } else {
                    Toast.makeText(this, "Second project not installed", Toast.LENGTH_SHORT).show()
                }
            }
        }

