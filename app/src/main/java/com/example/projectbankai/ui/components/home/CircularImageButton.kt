package com.example.projectbankai.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CircularImageButton(
    imageId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    size: Dp = 60.dp
) {
    Surface(
        shape = CircleShape,
        modifier = modifier
            .size(size)
            .clickable(onClick = onClick),
        color = Color.White, // Optional background for transparency effect
        shadowElevation = 4.dp // Optional elevation for shadow
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(CircleShape)
        )
    }
}
