package id.derysudrajat.navsafetycompose.ui.screen.withdata

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import id.derysudrajat.navsafetycompose.ui.component.MainTopBar
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme

@Composable
fun MoveWithStringScreen(
    text: String,
    onBack: () -> Unit
) {
    MainTopBar(title = "Move with String Screen", onBack = onBack) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "You are in MoveWithString Screen\nString data = $text",
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
private fun PreviewMoveWithStringScreen() {
    NavTypeSafetyTheme {
        MoveWithStringScreen( "Anyeong"){

        }
    }
}