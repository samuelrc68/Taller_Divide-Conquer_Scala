class QuickSort3Suite extends munit.FunSuite:

  import QuickSort3._

 
  test("separar3 - lista vacía retorna los acumuladores tal cual") {
    assertEquals(separar3(Nil, 5, Nil, Nil, Nil), (Nil, Nil, Nil))
  }

  test("separar3 - clasifica correctamente en menores, iguales y mayores") {
    val (men, ig, may) = separar3(List(3, 5, 1, 9, 5, 2, 5), 5, Nil, Nil, Nil)
    assertEquals(men.sorted, List(1, 2, 3))
    assertEquals(ig, List(5, 5, 5))
    assertEquals(may.sorted, List(9))
  }

  test("separar3 - todos los elementos son iguales al pivote") {
    val (men, ig, may) = separar3(List(4, 4, 4, 4), 4, Nil, Nil, Nil)
    assertEquals(men, Nil)
    assertEquals(ig, List(4, 4, 4, 4))
    assertEquals(may, Nil)
  }
  
  test("quickSort3 - lista vacía") {
    assertEquals(quickSort3(Nil), Nil)
  }

  test("quickSort3 - lista de un elemento") {
    assertEquals(quickSort3(List(42)), List(42))
  }

  test("quickSort3 - lista ya ordenada") {
    assertEquals(quickSort3(List(1, 2, 3, 4, 5)), List(1, 2, 3, 4, 5))
  }

  test("quickSort3 - lista en orden inverso") {
    assertEquals(quickSort3(List(5, 4, 3, 2, 1)), List(1, 2, 3, 4, 5))
  }

  test("quickSort3 - lista con elementos repetidos") {
    assertEquals(quickSort3(List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)), List(1, 1, 2, 3, 3, 4, 5, 5, 6, 9))
  }

  test("quickSort3 - muchos valores iguales al pivote") {
    assertEquals(
      quickSort3(List(5, 5, 5, 5, 5, 5, 5, 5)),
      List(5, 5, 5, 5, 5, 5, 5, 5)
    )
  }

  test("quickSort3 - muchos valores repetidos mezclados con otros distintos") {
    assertEquals(
      quickSort3(List(7, 7, 3, 7, 1, 7, 7, 9, 7)),
      List(1, 3, 7, 7, 7, 7, 7, 7, 9)
    )
  }

end QuickSort3Suite
