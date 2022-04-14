class MyInt(val value: Int) extends AnyVal {
  def add(other: MyInt) = new MyInt(value + other.value)

  def subtract(other: MyInt) = new MyInt(value - other.value)

  def divide(other: MyInt) = new MyInt(value / other.value)

  def multiply(other: MyInt) = new MyInt(value * other.value)

  override def toString: String = s"MyInt($value)"
}

val a = new MyInt(10)
val b = new MyInt(20)
val c = new MyInt(15)

Console println "Hehe"

a add b multiply c
a add (b multiply c)

class MyInt1(val value: Int) extends AnyVal {
  def +(other: MyInt1) = new MyInt1(value + other.value)

  def -(other: MyInt1) = new MyInt1(value - other.value)

  def /(other: MyInt1) = new MyInt1(value / other.value)

  def *(other: MyInt1) = new MyInt1(value * other.value)

  def ::(other: MyInt1) = new MyInt1(s"${other.value}$value".toInt)

  override def toString: String = s"MyInt1($value)"
}

val a1 = new MyInt1(10)
val b1 = new MyInt1(20)
val c1 = new MyInt1(15)

a1 + b1 * c1
a1 + (b1 * c1)

a1 :: b1
a1 :: b1 :: c1
(a1 :: b1) :: c1

1 :: 2 :: 3 :: Nil
1 :: 3 :: 2 :: Nil