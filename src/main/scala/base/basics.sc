import java.time.{DayOfWeek, LocalDateTime}

1
1.1
"Hello"
true

1 + 2 * 3
1. + (2. * (3))

1 * 2 + 3
1. * (2). + (3 )

var v1: Int = 4
var v2 = 4

v2 = 8

val v3 = 45 // == const

val v4 = {
  val v1 = 1
  val v2 = v1 + 1
  v2 + 1
}

val v5 = {

}

v5 == ()

1.isInstanceOf[Any]
"".isInstanceOf[Any]

class MyClass
val c = new MyClass
c.isInstanceOf[Any]

c.isInstanceOf[AnyRef]
"Hello".isInstanceOf[AnyRef]

val v6: String = null

def error(message: String): Nothing =
  throw new IllegalStateException(message)

def dayOfWeek = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.MONDAY) d
  else error("it's Monday")
}

def f(a1: Int, a2: String): String = ???

def infiniteLoop(): Nothing = infiniteLoop()

class Any_AnyVal_AnyRef {
  val _ = {

    val int1: Int = 1
    val int2: AnyVal = int1
    val int3: Any = int1

    val str1: String = "str"
    val str2: AnyRef = str1
    val str3: Any = str1

  }
}

val q = (4,6)._2