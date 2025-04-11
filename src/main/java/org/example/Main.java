package org.example;

import org.example.Struacts.List;

public class Main{

    public static void main(String[] args) {

        List list1 = new List();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        var list2 = list1.clone();

        list2.show();

        System.out.println(list2.size());



    }

}
