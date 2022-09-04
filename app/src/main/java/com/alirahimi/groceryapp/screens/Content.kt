package com.alirahimi.groceryapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Content(paddingValues: PaddingValues){
    Column(modifier = Modifier.padding(paddingValues)) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        Promotions()
        Spacer(modifier = Modifier.height(16.dp))
        CategoriesSection()
    }
}