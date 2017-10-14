package com.diego.IAmSorryMan.services

import com.diego.IAmSorryMan.models.SorryMessage
import org.springframework.stereotype.Component
import java.util.*

@Component
class SorryMessagesServiceImpl : SorryMessagesService {

    private var sorryMessageStore : HashSet<SorryMessage> = HashSet()

    override fun add(sorryMessage: SorryMessage) {
        sorryMessageStore.add(sorryMessage)
    }

    override fun getRandom(): SorryMessage {
        return sorryMessageStore.elementAt(Random().nextInt(sorryMessageStore.size))
    }

    override fun getSorries(): List<SorryMessage> {
        return sorryMessageStore.toList()
    }
}
