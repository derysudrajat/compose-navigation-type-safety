package id.derysudrajat.navsafetycompose.ui.screen.withdata.androidlib

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import id.derysudrajat.navsafetycompose.ui.component.MainTopBar

@Composable
fun AndroidLibraryScreen(
    onBack: () -> Unit,
    viewModel: AndroidLibraryViewModel = hiltViewModel()
) {

    val androidLib by viewModel.libraries.collectAsStateWithLifecycle()
    
    MainTopBar(title = "Android Library Screen", onBack = onBack) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "You are in Android Library Screen\nHere Android Library:\n",
                textAlign = TextAlign.Center
            )
            Text(text = "Name: ${androidLib.name}")
            Text(text = "Version: ${androidLib.version}")
            Text(text = "Dependencies:")
            androidLib.dependencies.forEach { dependency ->
                Text(text = "\t\t- $dependency")
            }
        }
    }
}