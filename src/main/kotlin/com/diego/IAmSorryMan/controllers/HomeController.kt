package com.diego.IAmSorryMan.controllers;

import com.diego.IAmSorryMan.models.SorryMessage
import com.diego.IAmSorryMan.services.SorryMessagesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Autowired
    private lateinit var sorryMessagesService : SorryMessagesService

    @GetMapping("/")
    fun getSorryMessage() : ResponseEntity<SorryMessage>  {
        return ResponseEntity(sorryMessagesService.getRandom(), HttpStatus.OK)
    }

    @GetMapping("/list")
    fun getAllSorryMessages() : ResponseEntity<List<SorryMessage>>  {
        return ResponseEntity(sorryMessagesService.getSorries(), HttpStatus.OK)
    }

    @PostMapping("/")
    fun addSorryMessage(sorryMessage: SorryMessage) {
        sorryMessagesService.add(sorryMessage)
    }
}
