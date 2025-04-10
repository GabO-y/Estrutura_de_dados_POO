package org.example;

import org.example.Struacts.*;

public class Main {
    public static void main(String[] args) {

      List list = new List();

      //10 13 15 20 30 40 50 16

      list.add(10);
      list.add(20, 5);
      list.add(30, 10);
      list.add(40, 15);
      list.add(50, 20);
      list.add(60, 25);


      list.removeLast();


      list.show();

        System.out.println("------------------------");


      list.showAll();

        System.out.println("-------------");

      list.show(true);




    }
}
