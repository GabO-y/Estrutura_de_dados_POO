package org.example;

import org.example.Struacts.*;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(0);

     list.add(15, 3);
     list.add(25, 5);

     list.add(35,   1);

     list.remove(1);
     list.remove(list.size());


        list.show();







    }
}
