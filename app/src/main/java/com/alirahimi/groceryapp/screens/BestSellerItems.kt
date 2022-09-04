package com.alirahimi.groceryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.alirahimi.groceryapp.R

@Composable
fun BestSellerItems() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {
            BestSellerItem(
                title = "Iceberg Lettuce",
                price = "1.99",
                imagePainter = painterResource(id = R.drawable.item_lettuce),
                discount = 10
            )
        }

        item {
            BestSellerItem(
                title = "Apple",
                price = "2.23",
                imagePainter = painterResource(id = R.drawable.item_apple),
                discount = 5
            )
        }

        item {
            BestSellerItem(
                title = "Meat",
                price = "3.73",
                imagePainter = painterResource(id = R.drawable.ic_meat),
                discount = 15
            )
        }
    }
}

@Composable
fun BestSellerItem(
    title: String,
    price: String,
    discount: Int = 0,
    imagePainter: Painter
) {
    Card(
        modifier = Modifier
            .width(160.dp)
    ) {
        Column(modifier = Modifier.padding(bottom = 32.dp)) {

            Image(
                painter = imagePainter,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )
            Column(
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text(text = title, fontWeight = FontWeight.Bold)

                Row {
                    Text(
                        text = "$$price",
                        textDecoration = if (discount > 0) TextDecoration.LineThrough else TextDecoration.None,
                        color = if (discount > 0) Color.Black else Color.Gray
                    )
                    if (discount > 0) {
                        Text(text = "[$discount%]", color = MaterialTheme.colors.primary)
                    }
                }
            }
        }
    }
}