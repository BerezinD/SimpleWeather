package com.tommy.simpleweather.storage.mapper

interface Mapper<in From, out To> {

    fun map(from: From): To

    fun map(from: List<From>) = from.map { map(it) }
}