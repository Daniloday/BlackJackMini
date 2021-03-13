package com.missclick.blackjackmini.ui.data.local

import com.missclick.blackjackmini.ui.data.local.entities.GameEntity

class Locale(private val gameDB: GameDB) : ILocal{
    override suspend fun addGame(word : GameEntity) =
            gameDB.dao().insertGame(word)

    override suspend fun getGame(category : String): GameEntity {
        return gameDB.dao().getIdBy(5)
    }

}