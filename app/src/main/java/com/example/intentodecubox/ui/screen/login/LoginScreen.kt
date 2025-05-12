package com.example.intentodecubox.ui.screen.login
import com.example.intentodecubox.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.intentodecubox.ui.screen.login.components.FormScreen
import com.example.intentodecubox.ui.screen.login.components.OAuthFormScreen
import com.example.intentodecubox.ui.theme.IntentoDeCuboxTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    loginViewModel: LoginViewModel = viewModel(),
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageLogo(
            modifier = Modifier
        )
        FormScreen(
            modifier = Modifier
        )
        OAuthFormScreen(
            modifier = Modifier
        )

    }
}


@Composable
fun ImageLogo(
    modifier: Modifier = Modifier,
){
    Image(
        painter = painterResource(R.drawable.logoxd),
        contentDescription = "",
        modifier = modifier
    )
}



@Preview(showBackground = true, heightDp = 800, widthDp = 400)
@Composable
private fun LoginScreenPreview() {
    IntentoDeCuboxTheme {
        LoginScreen(
            modifier = Modifier.padding(10.dp)
        )
    }
}