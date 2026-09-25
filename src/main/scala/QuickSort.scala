
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@main
def QuickSort(): Unit = {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  (1 to 5).map(println)

  for (i <- 1 to 5) {
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    println(s"i = $i")
  }
}

def menores(inputList: List[Int], p: Int): List[Int]
def mayores(inputList: List[Int], p: Int): List[Int]
def appendTR(inputL1: List[Int], inputL2: List[Int]): List[Int]
def separar(
                inputList: List[Int],
                p: Int,
                menoresAcc: List[Int],
                mayoresAcc: List[Int]
              ): (List[Int], List[Int])
def quickSort(inputList: List[Int]): List[Int]