package se.lexicon;


import java.util.Arrays;

public class NameRepository {

    /**
     * THis method stores in a String array
     * Under the name repository its a global variable
     */
    private static String[] names = new String[0];

    /**
     * This returns length of the elements in array
     */
    public static int getsize() {
        return names.length;

    }


    /**
     * This  copy all the existing name
     *
     * @param names this is an array of names..
     */
    public static void setNames(String[] names) {
        NameRepository.names = names;
    }

    /**
     * This method empty the array
     * @return
     */
    public static boolean clear() {

        names = new String[0];
        return false;
    }

    /**
     * This method  return all the names in a new Array.
     *
     * @return String[] :-this returns all array elements.
     */
    public static String[] findall() {
        return Arrays.copyOf(names, names.length);
    }

    /**
     * compare the element with fullName or use if condition and return the result
     *
     * @param fullname is the variable of find method
     * @return the elements which find from Array.
     */
    public static String find(final String fullname) {

        for (String element : names) {
            if (element.equalsIgnoreCase(fullname)) {
                return element;
            }
        }
        return null;
    }

    /**
     * Adding name to Array
     * Return true if the name added and false if the array contain name already
     */
    public static boolean add(final String fullname) {
//Reuse the find method
        String result = find(fullname);
        if (result != null) {
            return false;
        }
        names = addToArray(names, fullname);//Add fullname to Array
        return true;

    }

    /**
     * @param source
     * @param newName replace new array to existing array
     * @return
     */
    private static String[] addToArray(String[] source, String newName) {
        String[] tmp = Arrays.copyOf(source, source.length + 1);
        tmp[tmp.length - 1] = newName;
        return tmp;
    }

    /**
     * @param firstName to find all names that has passed in first name.
     * @return Returns a String array containing all matches.
     */
    public static String[] findByFirstName(final String firstName) {
        String[] result = {};
        for (String element : names) {
            String[] fullNameArray = element.split(" "); //["sudipta", "Mishra"]
            String fName = fullNameArray[0];
            if (fName.equalsIgnoreCase(firstName)) {
                result = addToArray(result, element);
            }
        }
        return result;
    }

    public static String[] findByLastName(final String lastName) {
        String[] result = {};
        for (String element : names) {
            String[] fullNameArray = element.split(" "); //["Mishra", "Sudipta"]
            String fName = fullNameArray[0];
            if (fName.equalsIgnoreCase(lastName)) {
                result = addToArray(result, element);
            }
        }
        return null;
    }


    /**
     *
     * @param original find a name and replace it with new fullName if available
     * @param updatedName If false, existing name matching the updatedName already exists.
     *
     * @return true if name was found and updated with the new name
     */

    public static boolean update(final String original, final String updatedName) {
        int originalIndex = -1;
        for (int i = 0; i < names.length; i++) {
            String content = names[i];
            if (content.equalsIgnoreCase(original)) {
                originalIndex = i;
            }
        }
        if (originalIndex == -1) {
            return false;
        }

        int updatedIndex = -1;
        for (int i = 0; i < names.length; i++) {
            String content = names[i];
            if (content.equalsIgnoreCase(updatedName)) {
                updatedIndex = i;
            }
        }

        if (updatedIndex != -1) {
            return false;
        }
        names[originalIndex] = updatedName;

        return true;
    }

    public static boolean remove(String fullName) {

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        int findIndex = Arrays.binarySearch(names, fullName);
        if (findIndex < 0) {
            return false;
        }
        String[] anotherArray = new String[names.length - 1];
        int sequencer = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == findIndex) {
                continue;
            }
            anotherArray[sequencer++] = names[i];
        }
        names = anotherArray;
        return true;
    }


}



