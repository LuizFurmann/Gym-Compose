package com.furmannsoft.gymcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.furmannsoft.gymcompose.ui.theme.GymComposeTheme
import com.furmannsoft.gymcompose.view.OmboardingView
import com.furmannsoft.gymcompose.view.authentication.LoginView
import com.furmannsoft.gymcompose.view.authentication.RegisterView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GymComposeTheme {
                // Create a NavController for navigation
                val navController = rememberNavController()

                // Set up the NavHost for navigation
                NavHost(navController = navController, startDestination = "main") {
                    composable("main") {
                        OmboardingView(modifier = Modifier ,navController)
                    }

                    composable("login") {
                        LoginView(modifier = Modifier ,navController)
                    }

                    composable("register") {
                        RegisterView(modifier = Modifier ,navController)
                    }

                }
            }
        }
    }
}
