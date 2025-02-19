package br.com.tvflix.utils.extensions

fun String.getYear(): String {
    return try {
        this.split("-")[0]
    } catch (_: Exception) {
        this
    }
}