package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

import StringBuffer.STB;

public class LargeString {
    public static void main(String[] args) {
        // Constructor 1
        StringBuffer sb = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer("My name is Vikram Ranjan");

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Vikram Ranjan");
        int r = sb3.capacity();

        String str = sb.toString();
        sb.insert(2, "Rahul");
        sb.replace(1, 4, "Ram Lal");
        sb.delete(1, 5);

        // Reverse
        System.out.println(sb.reverse());

        System.out.println("Capacity: " + r);
        System.out.println(str);
        System.out.println(sb);
        System.out.println(sb2);

        int n = 20;
        String name = STB.generate(n);
        System.out.println(name);

        // remove white space
        String spacedStr = "gh hj yu gh ";
        System.out.println(spacedStr);
        System.out.println(spacedStr.replaceAll("\\s", ""));

        // Split

        String newName = "this is my name";
        String[] names = newName.split(" ");
        System.out.println(Arrays.toString(names));

        // roundoff
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.2));

    }

}
