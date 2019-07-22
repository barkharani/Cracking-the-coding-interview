/* Brute force technique to find the unique characters in the string.
the complexity is O(n*n)*/

import java.util.*;
class StringUnique {
    boolean uniqueCharacters(String str)
    {
        for (int i=0; i<str.length(); i++)
        for(int j=i+1; j<str.length(); j++)
        if(str.charAt(i) == str.charAt(j))

        return false;
        return true;
    }


    public static void main(String[] args)
    {
        StringUnique sem = new StringUnique();

      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the string:   ");
      String ram = obj.next();
        

        if(sem.uniqueCharacters(ram))
        System.out.println("The String " + ram + " has all unique characters");

        else

        System.out.println("The String " + ram + " has all duplicate characters");

    }

}