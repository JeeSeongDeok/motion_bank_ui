package com.example.bank_ui.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.bank_ui.R
import com.example.bank_ui.ui.theme.Theme

/**
 * 디자인
 * https://dribbble.com/shots/16116630-Bank-mobile-app
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
                MainScreen()
            }
        }
    }
}