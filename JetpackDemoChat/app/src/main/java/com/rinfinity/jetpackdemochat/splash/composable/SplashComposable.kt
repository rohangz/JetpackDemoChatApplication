package com.rinfinity.jetpackdemochat.splash.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rinfinity.jetpackdemochat.R

@Preview
@Composable
fun SplashComposable() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        val drawable = vectorResource(id = R.drawable.ic_splash)
        Image(
            modifier = Modifier.padding(horizontal = 16.dp),
            imageVector = drawable,
        )
    }
}