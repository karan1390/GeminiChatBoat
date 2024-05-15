package com.example.geminiapp

sealed interface ChatBoatState {
    data object Idel:ChatBoatState
    data object Loading:ChatBoatState
    data class   Success(val chatData:String):ChatBoatState
   data class   Error(val error:String):ChatBoatState

}
