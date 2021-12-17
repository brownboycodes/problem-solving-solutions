fun stripComments(input: String, markers: CharArray): String {
   return input.lines().map { line ->
       line.split(*markers).first().trimEnd()
   }.joinToString("\n")
}