package com.missclick.blackjackmini.ui.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.missclick.blackjackmini.ui.data.local.entities.GameEntity

@Database(entities = [GameEntity::class], version = 1)
abstract class GameDB : RoomDatabase(){
    abstract fun dao() : GameDao
}