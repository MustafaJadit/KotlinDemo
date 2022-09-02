fun main() {
    println(GetSetDemo1().a)
}

class GetSetDemo1 {
    var a: Int = 3
        get() {
            return if (field > 2) {
                field
            } else -1
        }
        set(valu) {
            a = 2
            field = valu
            println(valu)
        }
}