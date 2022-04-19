package labs
import scala.util._

object PrimaryFunc {

  def factorial(n: Int): Try[BigInt] = n match {
    case n if n < 0 => Failure(new Exception( s"Number must be higher then 0. Received ${n}"))
    case n if n > 50000 => Failure(new Exception(s"Number must be less then 50 000. Received ${n}"))
    case 0 => Success(BigInt(1))
    case _ => Success((BigInt(1) to BigInt(n)).product)
  }

  def binPow(x: Int, n: Int): BigInt = {
    val pow: BigInt => BigInt = a => a * a
    val multiply: (Int, Int) => Int = (m, a) => if (m % 2 == 0) 1 else a
    if (n > 0) pow( binPow(x, n / 2) ) * multiply(n, x) else 1
  }

  def fibonacci(n : Int): Try[Int] = n match {
    case n if n < 0 => Failure(new Exception(s"Number must be higher then 0. Received ${n}"))
    case _ =>
      @scala.annotation.tailrec
      def fib_tail(n: Int, a:Int, b:Int): Int = n match {
        case 0 => a
        case _ => fib_tail( n-1, b, a+b)
      }
      Success(fib_tail( n, 0, 1))
  }

  @scala.annotation.tailrec
  def gcd(a: Int, b: Int): Int =
    if (b != 0) gcd(b, a % b) else a

  def lcm(a: Int, b: Int): Int =
    a / gcd(a, b) * b

}