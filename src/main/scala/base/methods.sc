def max(a:Int, b: Int): Int = if (b > a) b else a

max(5, 6)

def  sumSqr(a: Int, b: Int): Int = {
  def sqr(x: Int) = x * x
  if(a + b > 100) return -1
  sqr(a) + sqr(b)
}

sumSqr(4, 5)
sumSqr(40, 50)

// better form
def  sumSqr1(a: Int, b: Int): Int = {
  def sqr(x: Int) = x * x
  if(a + b > 100) -1
  else sqr(a) + sqr(b)
}