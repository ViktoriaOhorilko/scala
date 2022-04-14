(x: Int) => x * x

(x: Int, y: Int) => x + y

res0(2)
res1(2, 3)

val sqr: Int => Int = (x: Int) => x * x
val add = (x: Int, y: Int) => x + y

sqr(2)
add(2, 5)

sqr.isInstanceOf[Any]
sqr.isInstanceOf[AnyRef]

val sqr1 = new Function1[Int, Int] {
  override def apply(v1: Int) = v1 * v1
}

val add1 = new Function2[Int, Int, Int] {
  override def apply(v1: Int, v2: Int) = v1 + v2
}

add1(4, 5)
add1.apply(4, 5)

val sqr2: Int => Int = x => x * x
val add2: (Int, Int) => Int = (x, y) => x + y
val add3: (Int, Int) => Int = _ + _
val add2 = (_: Int) + (_: Int)

val factorial: Int => Int =
  n => if (n == 0) 1 else n * factorial(n - 1)

factorial(5)

val addSqr = (x: Int, y: Int) => {
  val f: Int => Int = a => a * a
  val v1 = f(x)
  val v2 = f(y)
  add(v1, v2)

}

val addSqr1: (Int, Int) => Int = {
  (x, y) => add(sqr(x), sqr(y))
}

addSqr(3, 5)