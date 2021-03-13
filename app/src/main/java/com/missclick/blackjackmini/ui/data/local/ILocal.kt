package com.missclick.blackjackmini.ui.data.local

import com.missclick.blackjackmini.ui.data.local.entities.GameEntity

interface ILocal{
    suspend fun addGame(game : GameEntity)
    suspend fun getGame(game : String) : GameEntity
}