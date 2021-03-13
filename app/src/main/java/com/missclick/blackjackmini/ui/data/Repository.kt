package com.missclick.blackjackmini.ui.data

import android.util.Log
import com.missclick.blackjackmini.ui.data.local.ILocal
import com.missclick.blackjackmini.ui.data.local.entities.GameEntity

class Repository(private val local: ILocal) : IRepository {

    override suspend fun getGame(player : String){
        val a = local.getGame("yes")
    }

    override suspend fun insertGame(game : String) {
        val a =  local.addGame(
                GameEntity(
                        1,"game"
                )
        )
        Log.e("Repository", a.toString())
    }

}