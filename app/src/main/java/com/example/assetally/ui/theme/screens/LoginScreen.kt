package com.example.assetally.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.assetally.ui.theme.model.LoginViewModel

@Composable
fun ShowToast(message: String) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    loginViewModel: LoginViewModel = viewModel(),
    navController: NavController
) {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val loginSuccessful = remember { mutableStateOf(false) }
    var loginFailureMessage by remember { mutableStateOf<String?>(null) }
    if (loginSuccessful.value) {
        ShowToast("Logged In")
        navController.navigate("assetViewScreen")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text("Username") }
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") }
        )
        Button(onClick = {
            //your onclick code here

            if (userName == "admin" && password == "admin") {
                loginSuccessful.value = true
            } else {
                loginFailureMessage = "Login Failure" // Store login failure message
            }
        }) {
            Text(text = "Login")
        }
    }
}