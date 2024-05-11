package id.derysudrajat.navsafetycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import id.derysudrajat.navsafetycompose.ui.screen.MainRoute
import id.derysudrajat.navsafetycompose.ui.screen.onlyMoveModuleRoute
import id.derysudrajat.navsafetycompose.ui.screen.withdata.withDataModuleRoute
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavTypeSafetyTheme {
                MainRouter()
            }
        }
    }
}

@Composable
fun MainRouter() {
    val navController = rememberNavController()
    BackHandler {
        navController.navigateUp()
    }
    NavHost(
        navController = navController, startDestination = MainRoute.routeName,
    ) {
        onlyMoveModuleRoute(navController)
        withDataModuleRoute(navController)
    }
}