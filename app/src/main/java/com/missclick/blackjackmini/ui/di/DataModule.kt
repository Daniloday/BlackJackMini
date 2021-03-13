package com.missclick.blackjackmini.ui.di

import android.content.Context
import androidx.room.Room
import com.missclick.blackjackmini.ui.data.IRepository
import com.missclick.blackjackmini.ui.data.Repository
import com.missclick.blackjackmini.ui.data.local.GameDB
import com.missclick.blackjackmini.ui.data.local.ILocal
import com.missclick.blackjackmini.ui.data.local.Locale
import org.koin.dsl.module

val dataModule = module {
    single {
        provideDb(get())
    }
    single {
        provideLocalDataSource(get())
    }
    single {
        provideRepository(get())
    }

}

fun provideDb(context: Context) : GameDB {
    return Room.databaseBuilder(context, GameDB::class.java, "db")
            .fallbackToDestructiveMigration()
            .build()
}

fun provideLocalDataSource(wordsDB: GameDB) : ILocal{
    return Locale(wordsDB)
}

fun provideRepository(localDataSource: ILocal): IRepository {
    return Repository(localDataSource)
}