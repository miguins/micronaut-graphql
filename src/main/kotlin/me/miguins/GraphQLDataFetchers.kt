package me.miguins

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import java.util.function.Predicate
import jakarta.inject.Singleton

@Singleton
class GraphQLDataFetchers(private val dbRepository: DbRepository) {

    fun getProductsDataFetcher(): DataFetcher<List<Product>> {
        return DataFetcher {
            dbRepository.findAllProducts()
        }
    }
}