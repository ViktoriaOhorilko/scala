package labs

import org.junit.Test

class TestSegmentTree {

  @Test
  def testSegmentTreeMin1(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMin = SegmentTree.initTree(values, 1000000, SegmentTree.min)
    val minRes1 = SegmentTree.get(rootNodeMin, 0, 5, SegmentTree.min)
    assert(minRes1 == 4)
  }

  @Test
  def testSegmentTreeMin2(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMin = SegmentTree.initTree(values, 1000000, SegmentTree.min)
    val minRes2 = SegmentTree.get(rootNodeMin, 0, 2, SegmentTree.min)
    assert(minRes2 == 4)
  }

  @Test
  def testSegmentTreeMin3(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMin = SegmentTree.initTree(values, 1000000, SegmentTree.min)
    val minRes3 = SegmentTree.get(rootNodeMin, 2, 5, SegmentTree.min)
    assert(minRes3 == 7)
  }

  @Test
  def testSegmentTreeMin4(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMin = SegmentTree.initTree(values, 1000000, SegmentTree.min)
    val minRes4 = SegmentTree.get(rootNodeMin, 1, 2, SegmentTree.min)
    assert(minRes4 == 44)
  }

  @Test
  def testSegmentTreeMin5(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMin = SegmentTree.initTree(values, 1000000, SegmentTree.min)
    val minRes5 = SegmentTree.get(rootNodeMin, 3, 4, SegmentTree.min)
    assert(minRes5 == 47)
  }

  @Test
  def testSegmentTreeMax1(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMax = SegmentTree.initTree(values, -1, SegmentTree.max)
    val maxRes1 = SegmentTree.get(rootNodeMax, 0, 5, SegmentTree.max)
    assert(maxRes1 == 77)
  }

  @Test
  def testSegmentTreeMax2(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMax = SegmentTree.initTree(values, -1, SegmentTree.max)
    val maxRes2 = SegmentTree.get(rootNodeMax, 1, 5, SegmentTree.max)
    assert(maxRes2 == 77)
  }

  @Test
  def testSegmentTreeMax3(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMax = SegmentTree.initTree(values, -1, SegmentTree.max)
    val maxRes3 = SegmentTree.get(rootNodeMax, 4, 5, SegmentTree.max)
    assert(maxRes3 == 47)
  }

  @Test
  def testSegmentTreeMax4(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMax = SegmentTree.initTree(values, -1, SegmentTree.max)
    val maxRes4 = SegmentTree.get(rootNodeMax, 0, 2, SegmentTree.max)
    assert(maxRes4 == 74)
  }

  @Test
  def testSegmentTreeMax5(): Unit = {
    val values = List(4, 74, 44, 77, 47, 7)
    val rootNodeMax = SegmentTree.initTree(values, -1, SegmentTree.max)
    val maxRes5 = SegmentTree.get(rootNodeMax, 3, 4, SegmentTree.max)
    assert(maxRes5 == 77)
  }

}
