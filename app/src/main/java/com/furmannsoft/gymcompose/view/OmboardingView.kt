package com.furmannsoft.gymcompose.view

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.LineHeightStyle.Alignment.Companion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.furmannsoft.gymcompose.R
import com.furmannsoft.gymcompose.ui.theme.LoraFontFamily
import com.furmannsoft.gymcompose.ui.theme.LoraFontFamilyBold

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun OmboardingView(modifier: Modifier = Modifier, navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        //Background image
        Image(
            painter = painterResource(id = R.drawable.omboard_img), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
        )

        //Content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.run { fillMaxSize().padding(horizontal = 24.dp) }
        ) {
            Spacer(modifier = Modifier.weight(15f))
            // Button at the bottom
            Text(
                "Build your new being",
                fontSize = 32.sp,
                fontFamily = LoraFontFamilyBold,
                fontWeight = FontWeight(760),
                color = Color.White,
            )

            Text(
                "Word hard Dream BIG",
                fontSize = 22.sp,
                fontFamily = LoraFontFamily,
                fontWeight = FontWeight(560),
                color = Color.White,
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {
                    navController.navigate("login")
                },
                shape = MaterialTheme.shapes.large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF014863)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
            ) {
                Text(
                    text = "Get start!",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontFamily = LoraFontFamilyBold,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    )
                )
            }

            Row(
                modifier = Modifier.padding(top = 25.dp, bottom = 52.dp)
            ) {
                Text(
                    "Create an account",
                    fontSize = 18.sp,
                    fontFamily = LoraFontFamily,
                    color = Color.White
                    )
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
fun OmboardingViewPreview() {
    val navController = rememberNavController()

    OmboardingView(
        modifier = Modifier.fillMaxSize(),
        navController = navController
    )
}