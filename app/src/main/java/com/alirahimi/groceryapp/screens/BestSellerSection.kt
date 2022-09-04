package com.alirahimi.groceryapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BestSellerSection() {
    Column(

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Best Sellers", style = MaterialTheme.typography.h6)
            TextButton(onClick = {}) {
                Text(text = "More", color = MaterialTheme.colors.primary)
            }
        }
        BestSellerItems()
    }
}