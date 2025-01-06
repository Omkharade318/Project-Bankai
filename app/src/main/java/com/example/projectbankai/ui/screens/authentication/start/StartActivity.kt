package com.example.projectbankai.ui.screens.authentication.start


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projectbankai.R
import com.example.projectbankai.ui.components.common.MyBottomAppBar
import com.example.projectbankai.ui.navigation.auth.AuthNavigation
import com.example.projectbankai.ui.navigation.auth.AuthScreens
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple


class StartActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.Transparent.toArgb(), Color.White.toArgb())
        )
        super.onCreate(savedInstanceState)
        setContent {
            AuthNavigation()
        }
    }
}


@Composable
fun StartUI(
    navController : NavController,
){

    var showBottomAppBar by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if(showBottomAppBar) MyBottomAppBar()

        Text(
            text = "Skip",
            modifier = Modifier
                .padding(end = 26.dp)
                .align(Alignment.End)
                .clickable(
                    onClick ={
                        showBottomAppBar = true
                    }
                ),
            textAlign = TextAlign.End,
            fontSize = 24.sp,
            color = Color.Gray
        )

        Image(
            painter = painterResource(id = R.drawable.design_circle),
            contentDescription = "design",
            modifier = Modifier
                .align(Alignment.Start)
                .rotate(90f)
                .size(90.dp),
        )

        Image(
            painter = painterResource(id = R.drawable.person),
            contentDescription = "person"
        )

        Text(
            text = "Discover, learn, grow – all in one place",
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            color = DarkPurple,
            fontFamily = FontFamily.SansSerif
        )

        Text(
            text = "Discover the joy of learning, where knowledge becomes your " +
                    "greatest companion. In this space, learning is not just a journey " +
                    "but a pathway to personal growth.",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(6.dp),
            color = LightPurple,
            fontFamily = FontFamily.SansSerif,
        )
            Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(AuthScreens.Login.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 16.dp, horizontal = 32.dp)
                .clip(shape = RoundedCornerShape(30.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = LightPurple,
                contentColor = Color.White
            )
        ) {

            Text(
                text = "Get Started",
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 2.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StartPreview(){
    AuthNavigation()
}