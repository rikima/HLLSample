package com.rikima.ds

import org.apache.datasketches.memory.{Memory, WritableMemory}
import org.junit
import org.junit.Assert.assertEquals
import org.junit.Test


class HLLSampleTest {

  @Test
  def testTest(): Unit = {
    assertEquals(1, 1)
  }

  @Test
  def testExecute(): Unit = {
    val hll:HLLSample = new HLLSample()
    hll.execute()
  }
}
