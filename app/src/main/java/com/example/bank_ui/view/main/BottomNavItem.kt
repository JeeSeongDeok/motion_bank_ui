package com.example.bank_ui.view.main

sealed class BottomNavItem(val title: String, val screenRoute: String) {
    object Home : BottomNavItem("홈", "HOME")
    object Setting : BottomNavItem("설정", "SETTINGS")
}
