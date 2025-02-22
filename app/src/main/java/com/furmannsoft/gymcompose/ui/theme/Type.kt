package com.furmannsoft.gymcompose.ui.theme

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.furmannsoft.gymcompose.R

//set fonts
@RequiresApi(Build.VERSION_CODES.Q)
val LoraFontFamily = FontFamily(
    Font(R.font.lora_regular, FontWeight.Normal),
    Font(R.font.lora_medium, FontWeight.Medium),
)

val LoraFontFamilyBold = FontFamily(
    Font(R.font.lora_bold, FontWeight.Bold),
    Font(R.font.lora_semi_bold, FontWeight.SemiBold),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)