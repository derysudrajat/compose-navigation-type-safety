package id.derysudrajat.navsafetycompose.ui.screen.justmove

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.derysudrajat.navsafetycompose.ui.component.MainTopBar
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme

@Composable
fun JustMoveScreen(
    navController: NavController
) {
    MainTopBar(title = "Just Move Screen", onBack = { navController.navigateUp() }) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "You are in Just Move Screen")
        }
    }
}

@Preview
@Composable
private fun PreviewJustMoveScreen() {
    NavTypeSafetyTheme {
        JustMoveScreen(rememberNavController())
    }
}