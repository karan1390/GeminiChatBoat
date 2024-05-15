package com.example.geminiapp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.geminiapp.ChatData
import com.example.geminiapp.ChatRoleEnum

@Composable
fun ChatList(list: MutableList<ChatData>) {
    LazyColumn(horizontalAlignment = Alignment.Start) {
        items(list) { chatData ->
            //   ChatListItem(chatData = chatData)
            if (chatData.role == ChatRoleEnum.USER.role) {
                Text(
                    text = chatData.message,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    )

            } else {
                Text(
                    text = chatData.message,
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                )
            }
        }
    }
}

@Composable
fun ChatListItem(chatData: ChatData) {
    // Display the chat data in a list item, such as:
    Text(text = chatData.message)
}