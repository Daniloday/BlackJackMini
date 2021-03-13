package com.missclick.blackjackmini.ui.data.local

import androidx.room.*
import com.missclick.blackjackmini.ui.data.local.entities.GameEntity

@Dao
interface GameDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGame(game: GameEntity)

    @Query("SELECT * FROM db WHERE id = :id")
    fun getIdBy(id : Int) : GameEntity

    @Query("SELECT * FROM db")
    fun get() : List<GameEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(words : List<GameEntity>)

    @Delete
    fun remove(word: GameEntity)



}