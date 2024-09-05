package com.example.swemwbs

var scale = mutableListOf<Int>()

fun updateScale(point: Int) {
    scale.add(point)
}

fun previous(point: Int) {
    scale.removeLast()
}

fun calculateScale(scale: List<Int>): Int {
    val scoredPoints = scale.sum()
    return scoredPoints
}

