import java.util.ArrayList;
import java.util.Formatter;

/**
 * Created with IntelliJ IDEA.
 * User: ccowdell
 * Date: 10/16/13
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
  public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter (System.out);


    //Holds the values of the width of text
    int qty = 10, priceWidth = 10, receiptPriceWidth = 15;

    //Ray
    static String[] receiptItems = { "Laptop", "Screen", "Desktop" };

    //Object
    String longestItemString = LongestStringItem(receiptItems);

    //Width of receiptItems
    int itemWidth = longestItemString.length();
    int nameWidth = longestItemString.length();


            public void printTitle() {

                f.format("%" + itemWidth + "s" + " %" + qty + "s" + " %"
                        + priceWidth + "s" + "\n", "Description", "Quantity", "Price");
                f.format("%" + itemWidth + "s" + " %" + qty + "s" + " %"
                        + priceWidth + "s" + "\n", "--------------", "----------",
                        "----------");
            }

            public void printItem() {

                f.format("%" + -nameWidth + "s" + " %" + qty + "d" + " %"
                        + receiptPriceWidth +  "s" + "\n", receiptItems[0], 567, 4576.36);
                f.format("%" + -nameWidth + "s" + " %" + qty + "d" + " %"
                        + receiptPriceWidth + "s" + "\n", receiptItems[1], 23, 565.43);
                f.format("%" + -nameWidth + "s" + " %" + qty + "d" + " %"
                        + receiptPriceWidth +"s" + "\n", receiptItems[2], 1, 145.80);

            }

            public static String LongestStringItem(String[] arrayOfItems) {
                int maxLength = 0;
                String longestString = null;
                for (String s : arrayOfItems) {
                    if (s.length() > maxLength) {
                        maxLength = s.length();
                        longestString = s;
                    }
                }
                return longestString;
            }

        }