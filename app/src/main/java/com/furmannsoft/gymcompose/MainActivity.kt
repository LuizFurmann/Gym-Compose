package com.furmannsoft.gymcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.furmannsoft.gymcompose.ui.theme.GymComposeTheme
import com.furmannsoft.gymcompose.view.OmboardingView
import com.furmannsoft.gymcompose.view.login.LoginView
import com.furmannsoft.gymcompose.view.register.RegisterView

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
