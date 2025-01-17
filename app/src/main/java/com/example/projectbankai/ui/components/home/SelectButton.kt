package com.example.projectbankai.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectbankai.ui.theme.DarkPurple

@Composable
fun SelectButton(
    modifier: Modifier = Modifier,
    width : Dp = 160.dp,
    size : Dp = 50.dp,
    onclick: () -> Unit,
    colors: ButtonColors,
    circleColor: Color,
    iconColor: Color,
    text: String,
    icon: Painter,
    iconSize: Dp = 40.dp
) {
    Button(
        onClick = onclick, // Trigger the provided click action
        modifier = modifier.width(width),
        shape = RoundedCornerShape(30.dp),
        contentPadding = PaddingValues(end = 16.dp, top = 8.dp, bottom = 8.dp, start = 8.dp),
        colors = colors
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            // Circular icon with a background
            Box(
                modifier = Modifier
                    .size(size)
                    .background(color = circleColor, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = icon,
                    contentDescription = text,
                    tint = iconColor,
                    modifier = modifier.size(iconSize)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = text,
                color = if (circleColor == Color.White) Color.White else DarkPurple, // Dynamic text color
                fontSize = 18.sp
            )
        }
    }
}