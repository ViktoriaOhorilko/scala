package labs

import org.junit.Test
import org.scalatest.Assertions._

import scala.util._

class TestPrimaryFunc {

  @Test
  def testFactorialLess(): Unit = {
    val N = -1
    PrimaryFunc.factorial(N) match {
      case Failure(e) =>
        assert(e.getMessage.endsWith(s"Number must be higher then 0. Received ${N}"))
      case _ => ???
    }
  }

  @Test
  def testFactorialMuch(): Unit = {
    val N = 5000000
    PrimaryFunc.factorial(N) match {
      case Failure(e) =>
        assert(e.getMessage.endsWith(s"Number must be less then 50 000. Received ${N}"))
      case _ => ???
    }
  }

  @Test
  def testFactorial1(): Unit = {
    val N = 5
    PrimaryFunc.factorial(N) match {
      case Success(value) => assert(value == 120)
      case _ => ???
    }
  }

  @Test
  def testFactorial2(): Unit = {
    val N = 10
    PrimaryFunc.factorial(N) match {
      case Success(value) => assert(value == 3628800)
      case _ => ???
    }
  }


  @Test
  def testBinPow(): Unit = {
    val N = 5
    val X = 2
    val res = PrimaryFunc.binPow(X, N)
    assert(res == 32)
  }

  @Test
  def testFibonacciLess(): Unit = {
    val N = -1
    PrimaryFunc.fibonacci(N) match {
      case Failure(e) =>
        assert(e.getMessage.endsWith(s"Number must be higher then 0. Received ${N}"))
      case _ => ???
    }
  }

  @Test
  def testFibonacci1(): Unit = {
    val N = 0
    PrimaryFunc.fibonacci(N) match {
      case Success(value) => assert(value == 0)
      case _ => ???
    }
  }

  @Test
  def testFibonacci2(): Unit = {
    val N = 8
    PrimaryFunc.fibonacci(N) match {
      case Success(value) => assert(value == 21)
      case _ => ???
    }
  }

  @Test
  def testGCD(): Unit = {
    val N = (55, 121)
    val res = PrimaryFunc.gcd(N._1, N._2)
    assert(res == 11)
  }

  @Test
  def testLCM(): Unit = {
    val N = (3, 22)
    val res = PrimaryFunc.lcm(N._1, N._2)
    assert(res == 66)
  }

}
