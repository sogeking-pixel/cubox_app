package com.example.intentodecubox.ui.screen.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.intentodecubox.ui.theme.IntentoDeCuboxTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    loginViewModel: LoginViewModel = viewModel(),
) {


}


@Preview(showBackground = true,)
@Composable
private fun LoginScreenPreview() {
    IntentoDeCuboxTheme {
        LoginScreen()
    }
}