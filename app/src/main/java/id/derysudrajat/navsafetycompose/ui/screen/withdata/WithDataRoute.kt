package id.derysudrajat.navsafetycompose.ui.screen.withdata

import android.os.Parcelable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.toRoute
import id.derysudrajat.navsafetycompose.ui.route.BaseRoute
import id.derysudrajat.navsafetycompose.ui.screen.withdata.androidlib.AndroidLibraryScreen
import id.derysudrajat.navsafetycompose.utils.parcelableType
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable
import kotlin.reflect.typeOf

@Serializable
object WithDataRoute: BaseRoute {

    override val defaultRoute: Any get() = WithDataScreen
    override val routeName: Any get() = WithDataRoute

    @Serializable
    data object WithDataScreen

    @Serializable
    data class MoveWithString(val text: String)

    @Serializable
    data class AndroidLibraryScreen(val library: AndroidLibrary)

    @Serializable
    data class SearchScreen(val searchParameters: SearchParameters)

}

@Serializable
@Parcelize
data class SearchParameters(
    val searchQuery: String,
    val filters: List<String>
) : Parcelable

@Serializable
@Parcelize
data class AndroidLibrary(
    val name: String,
    val version: String,
    val dependencies: List<String>
) : Parcelable


fun NavGraphBuilder.withDataModuleRoute(navController: NavController){
    navigation<WithDataRoute>(startDestination = WithDataRoute.defaultRoute){
        composable<WithDataRoute.WithDataScreen> { 
            WithDataScreen(navController = navController)
        }
        composable<WithDataRoute.MoveWithString> { backStack ->
            val moveWithString = backStack.toRoute<WithDataRoute.MoveWithString>().text
            MoveWithStringScreen(text = moveWithString) { navController.navigateUp() }
        }
        composable<WithDataRoute.AndroidLibraryScreen>(
            typeMap = mapOf(typeOf<AndroidLibrary>() to parcelableType<AndroidLibrary>())
        ) {
            AndroidLibraryScreen(onBack = { navController.navigateUp() })
        }
        composable<WithDataRoute.SearchScreen>(
            typeMap = mapOf(typeOf<SearchParameters>() to parcelableType<SearchParameters>())
        ) { backStack ->
            val query = backStack.toRoute<WithDataRoute.SearchScreen>().searchParameters
            SearchScreen(searchParameters = query) { navController.navigateUp() }
        }
    }
}