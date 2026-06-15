package in.kgcoding.challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique=new HashSet<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Plese enter your string:");
        String userStr=input.next();

      for(char ch:userStr.toCharArray()){
       unique.add(ch);
      }
      System.out.println(unique.size());
    }
    
}
