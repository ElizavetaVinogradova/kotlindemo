package com.example.kotlindemo;

import com.example.kotlindemo.domain.Promocode
import com.example.kotlindemo.dto.PromocodeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val repo: PromocodeRepository) {

    @GetMapping("/send")
    fun getAll(): List<Promocode>{
        return repo.findAll()
    }

    /*@PostMapping("/crt")
    fun crtPrmcd(){

    }*/
}
