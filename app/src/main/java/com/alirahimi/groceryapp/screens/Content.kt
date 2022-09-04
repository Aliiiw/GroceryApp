package com.alirahimi.groceryapp.screens

import android.preference.PreferenceActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Content(paddingValues: PaddingValues){
    Column(modifier = Modifier.padding(paddingValues)) {
        Header()
    }
}