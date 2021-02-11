package com.example.kotlindemo;

import com.example.kotlindemo.domain.Promocode
import com.example.kotlindemo.dto.PromocodeRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/promocodes")
class DemoController(val repo: PromocodeRepository) {

    @GetMapping
    fun getAllPromocodes(): List<Promocode>{
        return repo.findAll()
    }

    @GetMapping("/details/{id}")
    fun getPromocodeById(@PathVariable(value = "id") id: Long): ResponseEntity<*> {
        return ResponseEntity.ok(repo.getOne(id))
    }

    /*@GetMapping("/create/{promocode}")
        fun createPromocode(@PathVariable promocode: Promocode): ResponseEntity<*> {
        return ResponseEntity.ok(repo.save()))
    }*/
}

@RestController
class WelcomeController {
    @RequestMapping("/")
    fun welcome(): String? {
        return Date().toString() + ": welcome to Kotlin Demo application!"
    }
}
