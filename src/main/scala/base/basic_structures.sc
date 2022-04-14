import scala.util.Random

var result = 0
if(Random.nextBoolean()){
  println(1)
  result = 1
} else {
  println(2)
  result = 2
}

// =>

val result1 = if (Random.nextBoolean()) 1 else 2

for (i <- 0 until 10 by(2)) {
  println(i)
}

for (i <- 0 to (10, 2)) {
  println(i)
}

val a = for (i <- 0 until (10, 2)) {
  println(i)
  i
}

println(a)

val a1 = for (i <- 0 until (10, 2)) yield {
  println(i)
  s"element${i}"
}

val col1 = List('a', 'b', 'c')
val col2 = Array(1, 2, 3, 4)

for (v1 <- col1) {
  for(v2 <- col2) {
    println(s"$v1 - $v2")
  }
}

val res = for (v1 <- col1) yield {
  for(v2 <- col2) yield {
    s"$v1 - $v2"
  }
}

res.flatten

val res1 = for (v1 <- col1; v2 <- col2) yield s"$v1 - $v2"

val res1 = for {
  v1 <- col1 if v1 > 'a' if v1 < 'd'
  v = v1.toInt
  col3 = col2 map(_ * v)
  v2 <- col3
} yield s"$v1 - $v2"


def factorial(n: Int) = {
  assert(n>0, "must be higher then 0")
  assert(n<50000, "must be less then 50 000")
  var a = 1
  var acc: BigInt = 1
  while (a <= n) {
    acc *= a
    a += 1
  }
  acc
}
factorial(50)

var name = ""
do name = "455" while (name.length < 2)

def fact(n: Int): BigInt =
  if (n > 1) n  * fact(n - 1) else 1

fact(50)

def factorial1(n: Int) = {
  assert(n>0, "must be higher then 0")
  assert(n<50000, "must be less then 50 000")
  def fact1(n: Int, acc: BigInt = 1): BigInt =
    if (n > 1) fact1(n - 1,  acc * n) else acc
  fact1(n)
}

factorial1(40)
def factorial2(n: Int) = {
  assert(n>0, "must be higher then 0")
  assert(n<50000, "must be less then 50 000")
  if (n == 0) 1
  else (1 to n).foldLeft(BigInt(1))((acc, e) => acc * e)
  // else (1 to n).foldLeft(BigInt(1))(_ * _)
  // else (BigInt(1) to BigInt(n)).product
}

factorial2(10)
