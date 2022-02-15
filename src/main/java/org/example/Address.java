package org.example;

public class Address implements Comparable<Address> {
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber){
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        if(o.street.equals(street)){
            return houseNumber - o.houseNumber;
        }
        return street.compareTo(o.street);
    }
}
