package org.example;


public class GroceryCounter {
    private int count;
    private int overflowCount;
    public GroceryCounter() {
        count = 0;
        overflowCount = 0;
    }
    public void tens() {
        addToCount(1000);
    }
    public void ones() {
        addToCount(100);
    }
    public void tenths() {
        addToCount(10);
    }
    public void hundreths() {
        addToCount(1);
    }
    public String total() {
        int dollars = count / 100;
        int cents = count % 100;
        if (cents < 10) {
            return "$" + dollars + ".0" + cents;
        }
        return "$" + dollars + "." + cents;
    }
    public int overflows() {
        return overflowCount;
    }
    public void clear() {
        count = 0;
        overflowCount = 0;
    }
    private void addToCount(int amount) {
        count = count + amount;


        while (count > 9999) {
            count = count - 10000;
            overflowCount++;
        }
    }
}
