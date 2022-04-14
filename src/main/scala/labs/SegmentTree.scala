package labs

abstract class TreeNode


case class Node(l: Int, r: Int, value: Int, leftChild: TreeNode, rightChild: TreeNode) extends TreeNode


case class Leaf(idx: Int, value: Int) extends TreeNode


object SegmentTree {

  private def mid (l: Int, r: Int): Int = (l + r) / 2

  def min(a:Int, b:Int): Int = if (a < b) a else b

  def max(a:Int, b:Int): Int = if (a > b) a else b

  def initTree(points: List[Int], default:Int, f:(Int, Int) => Int): TreeNode = {
    var root = SegmentTree.buildTree(0, points.length-1, default)
    points.zipWithIndex.foreach{case (p, idx) => root = SegmentTree.insertPoint(root, idx, p, f)._1}
    root
  }

  def buildTree(l: Int, r: Int, default: Int): TreeNode = {
    if (l != r) Node(l, r, default, buildTree(l, mid(l, r), default), buildTree(mid(l, r) + 1, r, default)) else Leaf(l, default)
  }

  def insertPoint(rootNode: TreeNode, idx: Int, value: Int, g:(Int, Int) => Int): (TreeNode, Int) = rootNode match {
    case Node(l, r, prevValue, leftChild, rightChild) if idx <= mid(l, r) =>
      val (updatedLeft, leftValue) = insertPoint(leftChild, idx, value, g)
      val aggrValue = g(prevValue, leftValue)
      (Node(l, r, aggrValue, updatedLeft, rightChild), aggrValue)
    case Node(l, r, prevValue, leftChild, rightChild) =>
      val (updatedRight, rightValue) = insertPoint(rightChild, idx, value, g)
      val aggrValue = g(prevValue, rightValue)
      (Node(l, r, aggrValue, leftChild, updatedRight), g(prevValue, aggrValue))
    case Leaf(i, prevValue) => (Leaf(i, value), value)
  }

  def get(rootNode: TreeNode, i: Int, j: Int, g:(Int, Int) => Int): Int = rootNode match {
    case Node(l, r, value, leftChild, rightChild) if l == i & j == r => value
    case Node(l, r, value, leftChild, rightChild) if j <= mid(l, r) => get(leftChild, i, j, g)
    case Node(l, r, value, leftChild, rightChild) if i > mid(l, r) => get(rightChild, i, j, g)
    case Node(l, r, value, leftChild, rightChild) =>
      g(get(leftChild, i, mid(l, r), g), get(rightChild, mid(l, r) + 1, j, g))
    case Leaf(idx, value) => value
  }

}
