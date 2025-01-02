package com.example.projectbankai.ui.screens.authentication.auth

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.projectbankai.R
import com.example.projectbankai.ui.navigation.auth.AuthScreens
import com.example.projectbankai.ui.navigation.home.HomeScreens
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple

@Composable
fun LogIn(
    navController: NavController
){

    var userEmail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var showPassword by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ){

        LazyColumn {
            item{
                Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {

                Text(
                    text = "Sign In",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 32.dp),
                    color = DarkPurple,
                    fontSize = 30.sp
                )

                Image(
                    painter = painterResource(id = R.drawable.lady),
                    contentDescription = "lady",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 16.dp)
                )

                Text(
                    text = "Email",
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 52.dp),
                    color = DarkPurple,
                    fontSize = 20.sp
                )

                OutlinedTextField(
                    value = userEmail,
                    onValueChange = {
                        userEmail = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 2.dp),

                    placeholder = { Text(text = "Enter Email", color = LightPurple) },
                    label = { Text(text = "Email", color = LightPurple) },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = LightPurple,
                        focusedBorderColor = DarkPurple
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    shape = RoundedCornerShape(30.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Password",
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(start = 52.dp),
                    color = DarkPurple,
                    fontSize = 20.sp
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp, vertical = 2.dp),

                    placeholder = { Text(text = "Enter Password", color = LightPurple) },
                    label = { Text(text = "Password", color = LightPurple) },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = LightPurple,
                        focusedBorderColor = DarkPurple
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = if (!showPassword) PasswordVisualTransformation() else VisualTransformation.None,
                    shape = RoundedCornerShape(30.dp),
                    trailingIcon = {
                        Icon(
                            painter = if(showPassword)
                                painterResource(id = R.drawable.ic_eye_open)
                            else
                                painterResource(id = R.drawable.ic_eye_closed),
                            contentDescription = "visibility",
                            tint = LightPurple,
                            modifier = Modifier
                                .size(34.dp)
                                .padding(end = 12.dp)
                                .clickable(
                                    onClick = {
                                        showPassword = !showPassword
                                    }
                                )
                        )
                    }
                )

                Text(
                    text = "Forgot Password?",
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(end = 42.dp, top = 8.dp)
                        .clickable(
                            enabled = true,
                            onClick = {

                            }
                        ),
                    color = DarkPurple,
                    fontSize = 16.sp
                )

                val context = LocalContext.current

                Button(
                    onClick = {

                        if(userEmail.isNotEmpty() && password.isNotEmpty()){
                            navController.navigate(HomeScreens.Home.route)
                            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                        }
                        else if (userEmail.isEmpty() && password.isEmpty()){
                            Toast.makeText(context, "Please enter both email and password", Toast.LENGTH_SHORT).show()
                        }

                    },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(32.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        containerColor = LightPurple
                    )
                ) {
                    Text(
                        text = "Sign In",
                        fontSize = 24.sp,
                        modifier = Modifier
                            .padding(vertical = 4.dp, horizontal = 60.dp)
                    )
                }


                Image(
                    painter = painterResource(id = R.drawable.orline),
                    contentDescription = "line",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    contentScale = ContentScale.FillWidth
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp)
                        .align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google_logo),
                        contentDescription = "Google logo",
                        modifier = Modifier
                            .clickable(
                                onClick ={

                                }
                            )
                    )
                    Spacer(modifier = Modifier.width(24.dp))

                    Image(
                        painter = painterResource(id = R.drawable.facebook_logo),
                        contentDescription = "Google logo",
                        modifier = Modifier
                            .clickable(
                                onClick ={

                                }
                            )
                    )
                }

                Text(
                    text = "Don’t have an account? SIGN UP",
                    fontSize = 18.sp,
                    color = LightPurple,
                    modifier = Modifier
                        .padding(bottom = 52.dp)
                        .clickable(
                            onClick = {
                                navController.navigate(AuthScreens.Register.route)
                            }
                        )
                )

                Spacer(modifier = Modifier.height(24.dp))

              }
            }
        }
    }
}

