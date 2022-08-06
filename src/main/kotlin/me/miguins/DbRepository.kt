package me.miguins

import jakarta.inject.Singleton

@Singleton
class DbRepository {

    fun findAllProducts(): List<Product> {
        return products
    }

    companion object {
        private val products = listOf(
            Product("1", "Harry Potter and the Philosopher's Stone", 223.00),
            Product("2", "Moby Dick", 635.00),
            Product("3", "Interview with the vampire", 371.00)
        )
    }
}