import logic._

object InvivogenReport {

  def main(args: Array[String]) {
    val latexTemplate = "Template.tex"
    
    // Print greeting
    printGreeting()
    


  }

  /** Startup greeting to the user */
  def printGreeting(): Unit = {
    val greeting = 
      """
      |-----------------------------
      ||                           |
      ||   Invivogen TDS Printer   |
      ||                           |
      |-----------------------------
      || version: 1.0              |
      || author : shaido987        |
      || source : @github          |
      |-----------------------------
      """

    println(greeting.stripMargin)
  }
}
