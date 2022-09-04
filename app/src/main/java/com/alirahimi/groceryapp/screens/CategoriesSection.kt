package com.alirahimi.groceryapp.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alirahimi.groceryapp.R

@Composable
fun CategoriesSection() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Category", style = MaterialTheme.typography.h6)
            TextButton(onClick = {}) {
                Text(text = "More", color = MaterialTheme.colors.primary)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CategoryButton(
                text = "Fruits",
                icon = painterResource(id = R.drawable.ic_orange),
                backgroundColor = Color(0xFFFEF4E7)
            )

            CategoryButton(
                text = "Vegetables",
                icon = painterResource(id = R.drawable.ic_veg),
                backgroundColor = Color(0xFFF6FBF3)
            )

            CategoryButton(
                text = "Dairy",
                icon = painterResource(id = R.drawable.ic_cheese),
                backgroundColor = Color(0xFFFFFBF3)
            )

            CategoryButton(
                text = "Meats",
                icon = painterResource(id = R.drawable.ic_meat),
                backgroundColor = Color(0xFFF6E6E9)
            )
        }
    }
}