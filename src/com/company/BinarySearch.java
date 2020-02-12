package com.company;

import java.util.List;

public class BinarySearch {

    private List<String> list;
    private List<String> untouchedList;
    private int counter = 0;

    public BinarySearch(List<String> listToSearchIn) {
        this.list = listToSearchIn;
        this.untouchedList = listToSearchIn;
    }

    public String search(String stringToSearch) {
        counter++;

        if(list.size() == 1) {
            if(list.get(0).equals(stringToSearch)) {
//                System.out.println("String '" + stringToSearch + "' was found by binary search at index " + untouchedList.indexOf(stringToSearch) + "! \nIt took " + counter + " iterations");
                return stringToSearch;
            } else {
//                System.out.println("String '" + stringToSearch + "' not found");
                return stringToSearch;
            }
        }

        if(stringToSearch.compareTo(this.list.get(list.size()/2)) < 0) {
            this.list = this.list.subList(0, list.size()/2);
        } else if(stringToSearch.compareTo(this.list.get(list.size()/2)) == 0) {
//            System.out.println("String '" + stringToSearch + "' was found by binary search at index " + untouchedList.indexOf(stringToSearch) + "! \nIt took " + counter + " iterations");
            return stringToSearch;
        } else {
            this.list = this.list.subList(list.size()/2, list.size());
        }

        return search(stringToSearch);
    }

}
