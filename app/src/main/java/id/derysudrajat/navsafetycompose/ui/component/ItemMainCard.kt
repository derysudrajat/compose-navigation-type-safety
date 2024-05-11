package id.derysudrajat.navsafetycompose.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemMainCard(text: String, onClick: (text: String) -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { onClick.invoke(text) }
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = text
        )
    }
}

@Preview
@Composable
private fun PreviewItemMainCard() {
    NavTypeSafetyTheme {
        ItemMainCard("Hellow World!") {

        }
    }
}