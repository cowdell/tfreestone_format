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
    private int W1 = 15, W2 = 5, W3 = 10;

    //Holds the values of the string
    private String s1 = "%-" + W1 + "s %" + W2 + "s %" + W3 + "s\n";
    //private String s2 = "%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n";
    private String s3 = "%-" + W1 + "s %" + W2 + "s %" + W3 + ".2f\n";

    public void printTitle() {
        f.format(s1, "Item", "Qty", "Price");
        f.format(s1, "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {

        for(int count = 0; count <=0; count ++)
        {

        f.format("%-" + W1 + ".15s %" + W2 + "d %" + W3 + ".2f\n", name, qty, price);
        total += price * qty;
        }
    }
    public void printTotal() {
        f.format(s3, "Tax", "", total * 0.06);
        f.format(s1, "", "", "-----");
        f.format(s3, "Total", "", total * 1.06);
    }

}
