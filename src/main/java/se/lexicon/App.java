package se.lexicon;

import java.util.*;
public class App {
    public static void main(String... k) {
        NameRepository obj = new NameRepository();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name :- ");
        int n = sc.nextInt();
        String s[] = new String[n];


        //Set the Array names :-

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        obj.setNames(s);

        // Get the size of Array:-
        System.out.println("---SIZE---");
        System.out.println(obj.getSize());

        //Display Array:-

        System.out.println("---DISPLAY ALL---");
        String a[] = obj.findAll();
        obj.display(a);

        //Clear Arrays:_

       System.out.println("---CLEAR ALL---");
        obj.clear();
        //obj.display(names);


       //Search Name
        System.out.println(obj.find("A B"));
        System.out.println(obj.find("ZA ZA"));

       //Add Name if not present
        System.out.println(obj.add("A B"));
        System.out.println(obj.add("ZA ZA"));

        //obj.display(names);



    }
}