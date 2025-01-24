package com.example.projectbankai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.projectbankai.ui.components.common.MyBottomAppBar
import com.example.projectbankai.ui.theme.ProjectBankaiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectBankaiTheme {
                MyBottomAppBar()
            }
        }
    }
}

