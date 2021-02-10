package com.example.kotlindemo.domain

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "kotlindemo")
data class Promocode(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id:Long,
                     @Column(name = "promocode") val promocode: Int,
                     @Column(name = "expiring_date")val expiringDate: LocalDate? = null)