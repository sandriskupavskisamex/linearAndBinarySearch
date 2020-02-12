package com.company;

import java.util.List;

public class LinearSearch {

    private List<String> list;
    private int counter = 0;

    public LinearSearch(List<String> listToSearchIn) {
        this.list = listToSearchIn;
    }

    public String search(String stringToSearch) {
        for (int i = 0; i < this.list.size(); i++) {
            counter++;
            if(stringToSearch.equals(this.list.get(i))) {
//                System.out.println("String '" + stringToSearch + "' was found by linear search at index " + list.indexOf(stringToSearch) + "! \nIt took " + counter + " iterations");
                return stringToSearch;
            }
        }

//        System.out.println("String '" + stringToSearch + "' not found");
        return stringToSearch;
    }


}
