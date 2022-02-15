package org.example;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Address[] adressen = new Address[]{new Address("Professor Molkenboerstraat", 20), new Address("Professor Bromstraat", 39), new Address("Professor Molkenboerstraat", 19)};
        Arrays.sort(adressen);
        for (Address address : adressen) {
            System.out.println(address.toString());
        }
    }
}
