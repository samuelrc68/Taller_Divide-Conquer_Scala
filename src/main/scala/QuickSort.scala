import scala.annotation.tailrec

object QuickSort {
  def menores(inputList: List[Int], p: Int): List[Int] = {
    inputList match {
      case Nil => Nil
      case head :: tail =>
        if head < p then
          head :: menores(tail, p)
        else
          menores(tail, p)
    }
  }

  def mayores(inputList: List[Int], p: Int): List[Int] = {
    inputList match {
      case Nil => Nil
      case head :: tail =>
        if head >= p then
          head :: mayores(tail, p)
        else
          mayores(tail, p)
    }
  }

  def appendTR(inputL1: List[Int], inputL2: List[Int]): List[Int] =
    inputL1 match
      case Nil => inputL2
      case head :: tail =>
        head :: appendTR(tail, inputL2)

  @tailrec
  def separar(inputList: List[Int], p: Int, menoresAcc: List[Int], mayoresAcc: List[Int]): (List[Int], List[Int]) =
    inputList match
      case Nil => (menoresAcc, mayoresAcc)
      case head :: tail =>
        if head < p then
          separar(tail, p, appendTR(menoresAcc, List(head)), mayoresAcc)
        else
          separar(tail, p, menoresAcc, appendTR(mayoresAcc, List(head)))

  def quickSort(inputList: List[Int]): List[Int] = {
    inputList match
      case Nil => Nil
      case x :: Nil => List(x)
      case p :: t => appendTR(appendTR(quickSort(menores(t, p)), List(p)), quickSort(mayores(t, p)))
  }
}