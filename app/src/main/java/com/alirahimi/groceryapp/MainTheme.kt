package com.alirahimi.groceryapp

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.alirahimi.groceryapp.ui.theme.GroceryAppTheme

@Composable
fun MainTheme(content: @Composable () -> Unit) {
    GroceryAppTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}