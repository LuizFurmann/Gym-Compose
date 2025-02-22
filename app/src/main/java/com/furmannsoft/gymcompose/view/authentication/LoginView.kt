package com.furmannsoft.gymcompose.view.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun LoginView(modifier: Modifier = Modifier, navController: NavHostController) {
    Column {
        Text(text = "Welcome to Login page!")
        Button(onClick = {
            // Navigate to the second screen
            navController.navigate("register")
        }) {
            Text("Register")
        }
    }
}