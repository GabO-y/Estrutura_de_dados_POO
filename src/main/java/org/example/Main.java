package org.example;

import org.example.Struacts.List;

public class Main{

    public static void main(String[] args) {

        List list1 = new List(10,20,30);
        List list2 = new List(40,50,60);

        list1.concatenate(list2);

        list1.show();



    }

}
