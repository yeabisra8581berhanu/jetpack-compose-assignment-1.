package com.example.myapplication0.ui.theme.components


import androidx.compose.runtime.Composable
import com.example.myapplication0.model.Course

@Composable
fun MyApp() {
    val courses = listOf(
        Course("Mobile App Development", "CS402", 4, "Build apps with Android using Jetpack Compose", "Java, OOP"),
        Course("AI Fundamentals", "CS450", 3, "Intro to AI techniques including search, logic, and ML basics", "Linear Algebra, Python"),
        Course("Computer Graphics", "CS360", 3, "Rendering, transformations, and graphical modeling", "Linear Algebra"),
        Course("Compiler Design", "CS430", 3, "Compiler phases, parsing, and code generation", "Theory of Computation"),
            )

    CourseListScreen(courses = courses)
}
