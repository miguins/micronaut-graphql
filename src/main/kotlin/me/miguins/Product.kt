package me.miguins

import io.micronaut.core.annotation.Introspected

@Introspected
class Product(val id: String, val name: String, val price: Double)