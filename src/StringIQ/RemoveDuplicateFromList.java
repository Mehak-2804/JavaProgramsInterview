package StringIQ;

import java.util.ArrayList;
import java.util.LinkedHashSet;

class RemoveDuplicateFromList {
    public static void main( String args[] ) {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(1);
      numbers.add(3);
      numbers.add(1);
      numbers.add(4);
      numbers.add(1);
      numbers.add(5);

      System.out.println("Array list with duplicates");
      System.out.println(numbers);

      LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
      ArrayList<Integer> uniqueList = new ArrayList<>(uniqueNumbers);
      System.out.println("Array list without duplicates");
      System.out.println(uniqueList);
    }
    }	
    