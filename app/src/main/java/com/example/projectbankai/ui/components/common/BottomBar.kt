package com.example.projectbankai.ui.components.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projectbankai.ui.theme.DarkPurple
import com.example.projectbankai.ui.theme.LightPurple


@Composable
fun BottomMenu(
    items : List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighlightColor : Color = DarkPurple,
    activeTextColor: Color = DarkPurple,
    activeIconColor: Color = Color.White,
    inactiveTextColor : Color = LightPurple,
    initialSelectedItemIndex : Int = 0
) {
    var selectedItemIndex by remember {
        mutableIntStateOf(initialSelectedItemIndex)
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(Color.White)
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(start = 16.dp, end = 16.dp, top = 12.dp)
        ) {
            items.forEachIndexed { index, item ->
                BottomMenuItem(
                    item = item,
                    isSelected = index == selectedItemIndex,
                    activeHighlightColor = activeHighlightColor,
                    activeTextColor = activeTextColor,
                    activeIconColor = activeIconColor,
                    inactiveTextColor = inactiveTextColor
                ) {
                    selectedItemIndex = index
                    item.onClick()
                }
            }
        }
    }
}

@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeHighlightColor: Color = DarkPurple,
    activeTextColor: Color = DarkPurple,
    activeIconColor: Color = Color.White,
    inactiveTextColor: Color = LightPurple,
    onItemClick: () -> Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }

    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighlightColor else Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(
                    id = item.iconId
                ),
                contentDescription = item.title,
                tint = if (isSelected) activeIconColor else LightPurple,
                modifier = Modifier.size(24.dp)
            )
        }
        Text(
            text = item.title,
            color = if (isSelected) activeTextColor else inactiveTextColor
        )
    }
}


data class BottomMenuContent(
    val title : String,
    @DrawableRes val iconId : Int,
    val onClick : () -> Unit
)