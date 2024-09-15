fun main() {
    var array  = arrayOf(
        arrayOf(1,2,3,45),
        arrayOf(445,35,243,78),
        arrayOf(564,345,24,65),
    )

    for (i in array){
        println(i.sorted())
    }
}