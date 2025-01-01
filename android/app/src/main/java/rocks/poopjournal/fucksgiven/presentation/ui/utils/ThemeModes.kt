package rocks.poopjournal.fucksgiven.presentation.ui.utils

import kotlinx.coroutines.flow.StateFlow
import rocks.poopjournal.fucksgiven.R

enum class AppTheme(val nameTheme : String){
    LIGHT("Light"),
    DARK( "Dark"),
    FOLLOW_SYSTEM( "Follow System");

    companion object{
        fun fromOrdinal(ordinal : Int) = entries[ordinal]
    }
    fun getStringResId(): Int {
        return when (this) {
            LIGHT -> R.string.theme_light
            DARK -> R.string.theme_dark
            FOLLOW_SYSTEM -> R.string.theme_follow_system
        }
    }
}


interface ThemeSetting {
    val themeFlow : StateFlow<AppTheme>
    var theme : AppTheme
}