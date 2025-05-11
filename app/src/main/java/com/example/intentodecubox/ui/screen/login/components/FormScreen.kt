package com.example.intentodecubox.ui.screen.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormScreen(){
    Column (

    ){
        Text(
            text = "Iniciar Sesion",
            style = MaterialTheme.typography.headlineLarge
        )
        InputField(
            value = "Correo electronico"
        )
        InputField(
            value = "Contraseña"
        )

        Text(
            text = "Olvidaste la contraseña?",
            style = MaterialTheme.typography.bodySmall
        )

        ButtonSubmit(
            text = "Iniciar Sesion"
        )


    }

}

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit = {},
    label: @Composable () -> Unit = {}
){
    TextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = label
    )
}

@Composable
fun ButtonSubmit(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit = {}
){
    Button(
        modifier = modifier,
        onClick = onClick
    )
    {
        Text(text = text)
    }

}