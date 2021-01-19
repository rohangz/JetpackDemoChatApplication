package com.rinfinity.oauth.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EnterPhoneNumberComposable(
    phoneNumber: String,
    onPhoneNumberChange: (number: String) -> Unit,
    onNextClick: () -> Unit
) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                text = "Enter Your Phone Number",
                textAlign = TextAlign.Start
            )
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp,top = 16.dp),
                value = phoneNumber,
                onValueChange = onPhoneNumberChange
            )
            Button(
                modifier = Modifier.padding(top = 16.dp),
                onClick = onNextClick,
            ) {
                Text(text = "Next")
            }
        }
    }
}

@Preview
@Composable
fun EnterPhoneNumberComposablePreview() {
    EnterPhoneNumberComposable(
        phoneNumber = "",
        onPhoneNumberChange = { },
        onNextClick = { })
}