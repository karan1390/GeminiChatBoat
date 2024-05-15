package com.example.geminiapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

import com.example.geminiapp.component.ChatFooter
import com.example.geminiapp.component.ChatHeader
import com.example.geminiapp.component.ChatList
import com.google.ai.client.generativeai.type.Content

@Composable
fun ChatBoat(viewmodel: ChatBoatViewmodel = viewModel()) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ChatHeader()
        Box(
            modifier = Modifier.weight(1f),
        ) {
            ChatList(list =viewmodel.lisst)
        }
        ChatFooter(onClick = {
            if (it.isNotEmpty()) {
                viewmodel.sendMessage(it)
            }
        })
    }

}