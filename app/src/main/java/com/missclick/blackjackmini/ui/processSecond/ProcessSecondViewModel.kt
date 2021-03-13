package com.missclick.blackjackmini.ui.processSecond

import androidx.lifecycle.ViewModel
import com.missclick.blackjackmini.ui.data.IRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ProcessSecondViewModel(private val repository: IRepository) : ViewModel() {

    fun go(){
        GlobalScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main){
                repository.insertGame(
                        "String"
                )
                repository.getGame("Result")
            }
        }
    }

}