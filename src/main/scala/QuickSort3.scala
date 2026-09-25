
def separar3(
              inputList: List[Int],
              p: Int,
              menoresAcc: List[Int],
              igualesAcc: List[Int],
              mayoresAcc: List[Int]
            ): (List[Int], List[Int], List[Int]) =
  inputList match
    case Nil => (menoresAcc, igualesAcc, mayoresAcc)
    case head :: tail => if head < p then
      separar3(tail, p, head :: menoresAcc, igualesAcc, mayoresAcc) else
      separar3(tail, p, menoresAcc, igualesAcc, head :: mayoresAcc)

def quickSort3(inputList: List[Int]): List[Int] =
  inputList match
    case Nil => Nil
    case x :: Nil => List(x)
    case p :: t =>
      val (men, ig, may) = separar3(t, p, Nil, Nil, Nil)
        appendTR(quickSort(men), appendTR(p:: ig, quickSort3(may)))
end quickSort3
