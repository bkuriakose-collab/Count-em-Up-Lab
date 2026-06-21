package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AppTest {
  @Test
  void counterStartsAtZero() {
    GroceryCounter counter = new GroceryCounter();
    assertEquals("$0.00", counter.total());
    assertEquals(0, counter.overflows());
  }
  @Test
  void tensButtonIncrementsTensDigit() {
    GroceryCounter counter = new GroceryCounter();
    counter.tens();
    assertEquals("$10.00", counter.total());
  }
  @Test
  void onesButtonIncrementsOnesDigit() {
    GroceryCounter counter = new GroceryCounter();
    counter.ones();
    assertEquals("$1.00", counter.total());
  }
  @Test
  void tenthsButtonIncrementsTenthsDigit() {
    GroceryCounter counter = new GroceryCounter();
    counter.tenths();
    assertEquals("$0.10", counter.total());
  }
  @Test
  void hundrethsButtonIncrementsHundrethsDigit() {
    GroceryCounter counter = new GroceryCounter();
    counter.hundreths();
    assertEquals("$0.01", counter.total());
  }
  @Test
  void counterTracksOverflow() {
    GroceryCounter counter = new GroceryCounter();
    for (int i = 0; i < 100; i++) {
      counter.tens();
    }
    assertEquals("$0.00", counter.total());
    assertEquals(10, counter.overflows());
  }
  @Test
  void clearResetsCounterAndOverflows() {
    GroceryCounter counter = new GroceryCounter();
    for (int i = 0; i < 100; i++) {
      counter.tens();
    }
    counter.clear();
    assertEquals("$0.00", counter.total());
    assertEquals(0, counter.overflows());
  }
}
