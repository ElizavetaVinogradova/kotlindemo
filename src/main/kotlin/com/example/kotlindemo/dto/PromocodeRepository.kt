package com.example.kotlindemo.dto

import com.example.kotlindemo.domain.Promocode
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PromocodeRepository: JpaRepository<Promocode, Long>