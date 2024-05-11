package id.derysudrajat.navsafetycompose.ui.screen.withdata.androidlib

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import id.derysudrajat.navsafetycompose.ui.screen.withdata.WithDataRoute
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AndroidLibraryViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {
    private val _libraries = MutableStateFlow(savedStateHandle.toRoute<WithDataRoute.AndroidLibraryScreen>().library) // not safe, still bug
    // in 2.8.0-beta01 will be like this
    // private val _libraries = MutableStateFlow(savedStateHandle.toRoute<MainRoute.AndroidLibraryScreen>(mapOf(typeOf<AndroidLibrary>() to parcelableType<AndroidLibrary>()).library)
    val libraries = _libraries.asStateFlow()
}