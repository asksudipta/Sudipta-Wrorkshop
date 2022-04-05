package se.lexicon;

import java.util.*;
public class App {

    public static void main(String[] args) {


        // Get the size of Array:-

        System.out.println("Initial Name size:- "+NameRepository.getsize());
        String[] names={"Linda Anderson", "Sarah Hill","Jenny Anderson"};
        NameRepository.setNames(names);
        System.out.println("The Size of the Array name is :-"+NameRepository.getsize());
        //Display Array:-

        System.out.println(names);
        System.out.println(Arrays.toString(NameRepository.findall()));
        //Clear Arraay:-

        System.out.println(NameRepository.clear());

        //obj.display(names);


        //Search Name
        System.out.println(NameRepository.find("Sudipta Mishra"));

        //Add Name if not present
        System.out.println(NameRepository.add("Simon Elbrink"));
        //obj.display(names);

        System.out.println(Arrays.toString(NameRepository.findall()));
        boolean newName = NameRepository.add("Sudipta Mishra");
        if (newName){
            System.out.println("Name is Added to Array");
        } else {
            System.out.println("Name is Duplicate!");
        }
        System.out.println(Arrays.toString(NameRepository.findByFirstName("Sudipta")));

    }
}