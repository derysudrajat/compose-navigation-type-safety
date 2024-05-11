package id.derysudrajat.navsafetycompose.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.derysudrajat.navsafetycompose.ui.component.ItemMainCard
import id.derysudrajat.navsafetycompose.ui.screen.withdata.WithDataRoute
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme
import id.derysudrajat.navsafetycompose.utils.DataUtils

@Composable
fun MainScreen(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { parentPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(parentPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(DataUtils.listMainNavigation) {
                ItemMainCard(text = it) { text ->
                    when (DataUtils.listMainNavigation.indexOf(text)) {
                        0 -> navController.navigate(MainRoute.JustMoveScreen)
                        1 -> navController.navigate(WithDataRoute.routeName)
                        else -> {}
                    }
                }
            }
        }
    }
}



@Preview
@Composable
private fun PreviewMainScreen() {
    NavTypeSafetyTheme {
        MainScreen(navController = rememberNavController())
    }
}

