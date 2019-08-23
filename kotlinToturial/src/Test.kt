fun main(args: Array<String>) {
    var a = "fish"
    a.toCharArray()

    a.forEach { println(it) }
    var rawString = """
        hjfhg >>> I name is fit.
        >>>     She love com sci.
    """.trimMargin(">>>")

    println(rawString)

}