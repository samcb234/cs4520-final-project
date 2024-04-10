package com.example.assetally.ui.theme.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class AssetViewModel : ViewModel() {


    @Composable
    fun assetScreen() {

    }

    @Composable
    fun plusIcon(
        modifier: Modifier = Modifier,
        color: Color
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
            modifier = modifier,
            tint = color
        )
    }

}