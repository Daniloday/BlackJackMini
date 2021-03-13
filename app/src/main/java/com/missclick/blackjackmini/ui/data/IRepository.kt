package com.missclick.blackjackmini.ui.data

interface IRepository {
    interface IRepository {
        suspend fun getGame(player : String)
        suspend fun insertGame(game : String)
    }
}