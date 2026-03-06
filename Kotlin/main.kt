fun main() {
    val words = listOf(
        "apple", "cat", "banana", "dog", "elephant"
    )
    val wordLengths: Map<String, Int> =
        words.associateWith { it.length }

    wordLengths
        .filter  { (_, length) -> length > 4 }
        .forEach { (word, length) ->
            println("$word has length $length")
        }
}