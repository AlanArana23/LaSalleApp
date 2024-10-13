package com.example.lasalleapp.utils

sealed class Screens(val route: String) {
    data object Home : Screens("home")
    data object Calendar : Screens("calendar")
    data object Settings : Screens("settings")
    data object NewsDetail : Screens("news-detail")
    data object Payment : Screens("payments")
    data object ChangePassword : Screens("change_password")
    data object ChangeTheme : Screens("change_theme")
    data object SubjectDetail : Screens("subject_detail")
    data object Grades : Screens("grades")

}
