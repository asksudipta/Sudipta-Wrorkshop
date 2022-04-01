package se.lexicon;


import java.util.*;

public class NameRepository {


     private static String[] names = new String[20];




    //Method getsize():

    public static int getSize(){
        int i=0;
        while(names[i]!=null && i<20){
            i++;
        }
        return i;
    }



    //Replace existing names:

    public static String[] setNames(String[] names) {

        for (int i = 0; i < names.length; i++) {
            NameRepository.names[i] = names[i];
        }
       return names;
    }
        //Empty the Array:
        public static void clear() {
            Arrays.fill(names, null);
        }


        //Return all names in the Array:

    public static String[] findAll(){
        int l=getSize();
        String s[] = new String[l];
        for(int i=0;i<l;i++){
            s[i]=names[i];
        }
        return s;
    }

    public void display(String[] s){
            for(int i=0; i<s.length;i++)
            {
                System.out.println(s[i]);
            }


        }
 // Return name to find statement:

    public static boolean search(final String fullName){
        int l=getSize();
        for(int i=0;i<l;i++){
            if(names[i].equals(fullName))
            {
                return true;
            }
        }
        return false;
    }
    public static String find ( final String fullName){

        if(search(fullName)==true){
            return fullName;
        }
        else return null;

    }

 //Add the new name in Array:-

    public static boolean add(final String fullName){
        if(search(fullName)==true){
            return false;
        }
        else{
            int l = getSize();
            String[] s = new String[l+1];
            s=names;
            s[l]=fullName;
            names=s;
            return true;
        }
    }

}










