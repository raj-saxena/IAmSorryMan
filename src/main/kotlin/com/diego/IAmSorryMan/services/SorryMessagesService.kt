package com.diego.IAmSorryMan.services

import com.diego.IAmSorryMan.models.SorryMessage

interface SorryMessagesService {
    fun add(sorryMessage: SorryMessage)
    fun getRandom() : SorryMessage
    fun getSorries() : List<SorryMessage>
}
