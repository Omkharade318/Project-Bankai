package com.example.projectbankai.ui.components.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.projectbankai.ui.theme.DarkBlue

@Composable
fun StatisticsItem(label: String, count: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.toString(), style = MaterialTheme.typography.headlineSmall, color = DarkBlue)
        Text(text = label, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)
    }
}