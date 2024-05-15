package com.example.geminiapp

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.geminiapp.util.apiKey
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch

class ChatBoatViewmodel : ViewModel() {
    val lisst by lazy {
        mutableStateListOf<ChatData>()
    }
    val genAI by lazy {
        GenerativeModel(
            // For text-only input, use the gemini-pro model
            modelName = "gemini-pro",
            // Access your API key as a Build Configuration variable (see "Set up your API key" above)
            apiKey = apiKey
        )
    }

    /*
        val prompt = "Write a story about a magic backpack."
        val response = generativeModel.generateContent(prompt)
        print(response.text)*/
    fun sendMessage(message: String) {
     /*   sendMessage is suspend function so we use coroutine of viewmodel scope*/
        viewModelScope.launch {
            val chat = genAI.startChat()
            lisst.add(ChatData(message = message , role = ChatRoleEnum.USER.role))
            chat.sendMessage(content(ChatRoleEnum.USER.role) {
                text(message)
            }).text?.let {
                /*getting the response of gemini is saved in list*/
                lisst.add(ChatData(it,ChatRoleEnum.MODEL.role))
            }
        }
    }
}