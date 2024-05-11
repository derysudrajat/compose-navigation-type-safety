package id.derysudrajat.navsafetycompose.ui.screen.withdata

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import id.derysudrajat.navsafetycompose.ui.component.MainTopBar

@Composable
fun SearchScreen(
    searchParameters: SearchParameters,
    onBack: () -> Unit
) {
    MainTopBar(title = "Search Screen", onBack = onBack) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "You are in Search Screen\nHere the data:\n",
                textAlign = TextAlign.Center
            )
            Text(text = "Query: ${searchParameters.searchQuery}")
            Text(text = "Filter:")
            searchParameters.filters.forEach { dependency ->
                Text(text = "\t\t- $dependency")
            }
        }
    }
}