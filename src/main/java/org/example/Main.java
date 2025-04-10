package org.example;

import org.example.Struacts.*;

public class Main {
    public static void main(String[] args) {

      List list = new List();

      //10 13 15 20 30 40 50 16

      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);

      list.add(100, 100);
      list.add(100, 100);
      list.add(100, 100);

      list.remove(4);
      list.add(40, 4);

      list.show();

      System.out.println("----------------");



    }
}
