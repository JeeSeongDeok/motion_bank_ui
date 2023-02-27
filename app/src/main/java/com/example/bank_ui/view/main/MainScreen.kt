package com.example.bank_ui.view.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bank_ui.R
import com.example.bank_ui.ui.theme.Theme
import com.example.bank_ui.ui.theme.color_background
import com.example.bank_ui.ui.theme.white

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    Theme {
        Surface(
            color = color_background,
            modifier = Modifier.fillMaxSize()
        ) {
            Column {
                Profile()
                CardProfile()
            }
        }
    }
}

@Composable
fun Profile() {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.kb_01),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "프로필 타이틀", color = white
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "이름", color = white
            )
        }
    }
}

@Preview
@Composable
fun CardProfile() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.hana_02),
            contentDescription = "Miss Card Image",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .requiredSize(300.dp)
                .align(Alignment.Center)
        )
    }
}