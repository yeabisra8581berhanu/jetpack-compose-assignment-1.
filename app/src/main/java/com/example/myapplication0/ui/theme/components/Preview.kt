package com.example.myapplication0.ui.theme.components

import androidx.compose.runtime.Composable

import com.example.myapplication0.ui.theme.components.MyApp
import com.example.myapplication0.ui.theme. MyApplication0Theme
import com.example.myapplication0.ui.theme.components.CourseCard



import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication0.model.Course


@Preview(showBackground = true)
@Composable
fun CourseCardPreview() {
    val course = Course(
        title = "Software Engineering",
        code = "SE304",
        creditHours = 3,
        description = "Covers SDLC and agile methodologies.",
        prerequisites = "CS101"
    )

    MyApplication0Theme {
        CourseCard(
            course = course,
            isExpanded = true,
            onClick = {} // state management
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FullAppPreview() {
    MyApplication0Theme {
        MyApp()
    }
}