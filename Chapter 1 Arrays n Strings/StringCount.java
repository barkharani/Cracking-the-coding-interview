import java.io.*; 
import java.util.*; 
  
class StringCount{ 
      
    static int NO_OF_CHARS = 256; 
      
    
    static boolean arePermutation(char str1[], char str2[]) 
    { 
        
        int count1[] = new int [NO_OF_CHARS]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int [NO_OF_CHARS]; 
        Arrays.fill(count2, 0); 
        int i; 
   
        
        for (i = 0; i <str1.length && i < str2.length ; 
                                                 i++) 
        { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 
   
        
        if (str1.length != str2.length) 
            return false; 
   
        
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
   
        return true; 
    } 
   
    
    public static void main(String args[]) 
    { 
        char str1[] = ("geeksforgeeks").toCharArray(); 
        char str2[] = ("forgeeksgeeks").toCharArray(); 
          
        if ( arePermutation(str1, str2) ) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 