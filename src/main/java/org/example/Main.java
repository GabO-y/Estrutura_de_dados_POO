package org.example;

import org.example.Struacts.List;

public class Main{

    public static void main(String[] args) {

        List list1 = new List();

        list1.add(10, 1);
        list1.add(10, 1);
        list1.add(10, 1);
        list1.add(10, 1);


        list1.show();

        list1.removeDuplicate();

        System.out.println("------------");

        list1.show();



    }

}
