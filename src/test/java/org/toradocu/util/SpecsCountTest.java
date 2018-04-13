package org.toradocu.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpecsCountTest {

  @Test
  public void provideWithNoArgumentTest() throws Exception {
    boolean thrown = false;
    try {
      SpecsCount.main(new String[] {"1", "2", "3"});
    } catch (IllegalArgumentException e) {
      thrown = true;
    }
    assertTrue(thrown);
  }
}
