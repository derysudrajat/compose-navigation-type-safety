package id.derysudrajat.navsafetycompose.ui.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import id.derysudrajat.navsafetycompose.ui.route.BaseRoute
import id.derysudrajat.navsafetycompose.ui.screen.justmove.JustMoveScreen
import kotlinx.serialization.Serializable

@Serializable
object MainRoute: BaseRoute {

    @Serializable
    data object MainScreen

    @Serializable
    data object JustMoveScreen

    override val defaultRoute: Any get() = MainScreen
    override val routeName: Any get() = MainRoute

}


fun NavGraphBuilder.onlyMoveModuleRoute(navController: NavController) {
    navigation<MainRoute>(startDestination = MainRoute.defaultRoute) {
        composable<MainRoute.MainScreen> {
            MainScreen(navController)
        }
        composable<MainRoute.JustMoveScreen> {
            JustMoveScreen(navController)
        }
    }
}


