package com.namkuzo.animationcodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.namkuzo.animationcodelab.ui.home.Home
import com.namkuzo.animationcodelab.ui.theme.AnimationCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimationCodelabTheme {
                Home()
            }
        }
    }
}
