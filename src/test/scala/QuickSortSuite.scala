import munit.FunSuite

class QuickSortSuite extends FunSuite:

  test("menores: Devuelve los elementos menores al pivote"):
    val resultado = QuickSort.menores(List(8, 3, 10, 2, 5), 6)
    assertEquals(resultado, List(3, 2, 5))

  test("menores: Devuelve una lista vacía si no hay elementos menores"):
    val resultado = QuickSort.menores(List(8, 10, 7), 5)
    assertEquals(resultado, Nil)

  test("mayores: Devuelve los elementos mayores que el pivote"):
    val resultado = QuickSort.mayores(List(8, 3, 10, 2, 5), 6)
    assertEquals(resultado, List(8, 10))

  test("mayores: Devuelve una lista vacía si no hay elementos mayores"):
    val resultado = QuickSort.mayores(List(3, 5, 2), 5)
    assertEquals(resultado, Nil)

  test("appendTR: concatena dos listas"):
    assertEquals(QuickSort.appendTR(List(1, 2, 3), List(4, 5)), List(1, 2, 3, 4, 5))

  test("appendTR: funciona con una lista vacía"):
    assertEquals(QuickSort.appendTR(Nil, List(1, 2, 3)), List(1, 2, 3))

  test("separar: divide la lista según el pivote"):
    assertEquals(QuickSort.separar(List(8, 3, 10, 2, 5), 6, Nil, Nil), (List(3, 2, 5), List(8, 10)))

  test("separar: coloca los iguales al pivote en mayores"):
    assertEquals(QuickSort.separar(List(3, 5, 7, 5, 9), 5, Nil, Nil), (List(3), List(5, 7, 5, 9)))

  test("separar: funciona con lista vacía"):
    assertEquals(QuickSort.separar(Nil, 5, Nil, Nil), (Nil, Nil))

  test("quickSort: ordena una lista desordenada"):
    val resultado = QuickSort.quickSort(List(8, 3, 10, 2, 5))
    assertEquals(resultado, List(2, 3, 5, 8, 10))

  test("quickSort: funciona con lista vacía"):
    val resultado = QuickSort.quickSort(Nil)
    assertEquals(resultado, Nil)

  test("quickSort: funciona con un solo elemento"):
    val resultado = QuickSort.quickSort(List(7))
    assertEquals(resultado, List(7))

  test("quickSort: ordena una lista con elementos repetidos"):
    val resultado = QuickSort.quickSort(List(5, 3, 5, 2, 3, 1))
    assertEquals(resultado, List(1, 2, 3, 3, 5, 5))