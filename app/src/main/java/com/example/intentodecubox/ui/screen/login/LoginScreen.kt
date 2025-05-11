package com.example.intentodecubox.ui.screen.login
import com.example.intentodecubox.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.intentodecubox.ui.screen.login.components.FormScreen
import com.example.intentodecubox.ui.theme.IntentoDeCuboxTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    loginViewModel: LoginViewModel = viewModel(),
) {
    Column {
        ImageLogo()
        FormScreen()

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



@Preview(showBackground = true,)
@Composable
private fun LoginScreenPreview() {
    IntentoDeCuboxTheme {
        LoginScreen()
    }
}