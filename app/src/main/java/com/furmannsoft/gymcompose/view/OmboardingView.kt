package com.furmannsoft.gymcompose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun OmboardingView(modifier: Modifier = Modifier, navController: NavHostController) {

    Column {
        Text(text = "Welcome to the Main Screen!")
        Button(onClick = {
            // Navigate to the second screen
            navController.navigate("login")
        }) {
            Text("Login")
        }
    }
}