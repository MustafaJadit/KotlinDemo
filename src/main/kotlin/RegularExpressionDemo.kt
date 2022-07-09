import java.util.regex.Pattern

fun main() {
    var compile = Pattern.compile("\\d+")
    var matcher = compile.matcher("5108268861 and 5107663199 ")
    if (matcher.matches()) {
        println("matcher.matches()")
    }
    while (matcher.find()) {
        println(matcher.group())
    }
}