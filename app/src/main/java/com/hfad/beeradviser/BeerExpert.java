package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<String>();

        if (color.equals("amber")) {
            brands.add("1-Jack amber");
            brands.add("2-Red Moose");

        }else if (color.equals("light")) {
            brands.add("1-Amstel Light");
            brands.add("2-Busch Light");
        }
        else if (color.equals("brown")) {
            brands.add("1-Brooklyn Brown Ale");
            brands.add("2-Genesee Honey Brown Ale");
        } else {
            brands.add("1-Jail Pale Ale");
            brands.add("2-Gout Stout");
        }
        return brands;
    }

}



