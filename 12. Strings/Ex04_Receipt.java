/**
 * Modify Receipt.java so that the widths are all controlled by a single set of constant values. The goal
 * is to allow you to easily change a width by changing a single value in one place.
 */

import java.util.*;

public class Ex04_Receipt {
  private double total = 0;
  private int itemWidth = 15;
  private int qtyWidth = 5;
  private int priceWidth = 10;
  private int precision = 15;
  private int precisionPrice = 2;

  //"%-15s %5s %10s\n"
  private String templateText = "%-" + itemWidth + "s %" + qtyWidth +  "s %" + priceWidth + "s\n";

  //%-15s %5s %10.2f\n
  private String templateMisc = "%-" + itemWidth + "s %" + qtyWidth + "s %" + priceWidth + "." + precisionPrice + "f\n";

  //"%-15.15s %5d %10.2f\n"
  private String templateItem = "%-" + itemWidth + "." + precision + "s %" + qtyWidth + "d %" + priceWidth + "." + precisionPrice + "f\n";

    private Formatter f = new Formatter(System.out);
  public void printTitle() {
    f.format(templateText, "Item", "Qty", "Price");
    f.format(templateText, "----", "---", "-----");
  }
  public void print(String name, int qty, double price) {
    f.format(templateItem, name, qty, price);
    total += price;
  }
  public void printTotal() {
    f.format(templateMisc, "Tax", "", total*0.06);
    f.format(templateText, "", "", "-----");
    f.format(templateMisc, "Total", "", total*1.06);
  }
  public static void main(String[] args) {
    Ex04_Receipt receipt = new Ex04_Receipt();
    receipt.printTitle();
    receipt.print("Jack's Magic Beans", 4, 4.25);
    receipt.print("Princess Peas", 3, 5.1);
    receipt.print("Three Bears Porridge", 1, 14.29);
    receipt.printTotal();
  }
}
