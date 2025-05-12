package com.example.intentodecubox.ui.screen.login.components
import com.example.intentodecubox.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun OAuthFormScreen(
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = ""
            )
            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = ""
            )
        }
        Text(
            text = "¿No tienes cuenta? Registrate",
            style = MaterialTheme.typography.bodyMedium

        )
        Text(
            text = "Continuar como invitado",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(vertical = 20.dp)
        )
    }
}