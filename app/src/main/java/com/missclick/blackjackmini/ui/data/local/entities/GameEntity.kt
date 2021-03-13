package com.missclick.blackjackmini.ui.data.local.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "db")
data class GameEntity(
        @PrimaryKey(autoGenerate = true)
        @NonNull
        @ColumnInfo(name = "id")
        var id : Int? = null,

        @ColumnInfo(name = "game")
        var game : String,


)
