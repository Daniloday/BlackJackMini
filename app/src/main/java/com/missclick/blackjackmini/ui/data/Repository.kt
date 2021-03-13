package com.missclick.blackjackmini.ui.data

import android.util.Log
import com.missclick.blackjackmini.ui.data.local.ILocal

class Repository(private val local: ILocal) : IRepository {
    override suspend fun getGame(nameOfCategory: String): List<String> =
            localDataSource.getWords(nameOfCategory).map {
                it.word
            }
    //return listOf("Peace","Door","Ball")


    override suspend fun insertGame(wordModel: WordModel): Long {

        val a =  localDataSource.addWord(
                WordEntitity(
                        word = wordModel.word,
                        category = wordModel.category
                )
        )
        Log.e("Repository", a.toString())
        return a
    }



}