package com.example.intentodecubox.ui.screen.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun FormScreen(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            text = "Iniciar Sesion",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.primary
        )
        InputField(
            placeholder = "Correo electronico",
            icon = Icons.Default.Email
        )
        InputField(
            placeholder = "Contraseña",
            icon = Icons.Default.Lock
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
    placeholder: String,
    onValueChange: (String) -> Unit = {},
    label: @Composable () -> Unit = {},
    icon:  ImageVector
){
    TextField(
        value = "",
        modifier = modifier.padding(vertical = 10.dp),
        shape = RoundedCornerShape(40.dp),
        placeholder = {
            Text(text = placeholder)
        },
        onValueChange = onValueChange,
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = ""
            )
        },


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