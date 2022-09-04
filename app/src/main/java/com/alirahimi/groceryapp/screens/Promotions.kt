package com.alirahimi.groceryapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alirahimi.groceryapp.R

@Composable
fun Promotions() {
    LazyRow(
        modifier = Modifier
            .height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            ShopItems(
                title = "Fruit",
                subTitle = "Start @",
                header = "$1",
                imagePainter = painterResource(id = R.drawable.promotion),
                backgroundColor = MaterialTheme.colors.primary
            )
        }

        item {
            ShopItems(
                title = "Meat",
                subTitle = "Discount",
                header = "20%",
                imagePainter = painterResource(id = R.drawable.promotion),
                backgroundColor = Color(0xFF6EB6F5)
            )
        }
    }
}