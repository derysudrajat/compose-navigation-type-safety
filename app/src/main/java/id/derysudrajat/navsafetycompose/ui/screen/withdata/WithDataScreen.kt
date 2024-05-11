package id.derysudrajat.navsafetycompose.ui.screen.withdata

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
import id.derysudrajat.navsafetycompose.ui.component.ItemSearchCard
import id.derysudrajat.navsafetycompose.ui.component.MainTopBar
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme
import id.derysudrajat.navsafetycompose.utils.DataUtils

@Composable
fun WithDataScreen(
    navController: NavController
) {
    MainTopBar(title = "Just Move Screen", onBack = { navController.navigateUp() }) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(DataUtils.listWithDataNavigation) {
                ItemMainCard(text = it) { text ->
                    when (DataUtils.listWithDataNavigation.indexOf(text)) {
                        0 -> navController.navigate(WithDataRoute.MoveWithString(DataUtils.randomStringData.random()))
                        1 -> navController.navigate(
                            WithDataRoute.AndroidLibraryScreen(DataUtils.listOfAndroidLib.random())
                        )
                        else -> {}
                    }
                }
            }
            item {
                ItemSearchCard { query, listFilter ->
                    navController.navigate(
                        WithDataRoute.SearchScreen(SearchParameters(query, listFilter))
                    )
                }
            }
        }
    }
}


@Preview
@Composable
private fun PreviewWithDataScreen() {
    NavTypeSafetyTheme {
        WithDataScreen(navController = rememberNavController())
    }
}