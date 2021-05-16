package com.programs.exm;

import java.util.Arrays;

public class AnagramString {  
    static void isAnagram(String str1, String str2) {  
    	//1. Remove all the white spaces
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = false;  
        // 2.Compare length 
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            //3. If length are matching Convert the Strings to Char Arrays so that we can use Sorting function available
        	//in Arrays class
        	char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);
            //Use the equals function in the Arrays by passing the Array object.
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        isAnagram("Keep", "Peek");  
        isAnagram("Mother In Law", "Hitler Woman");  
    }  
} 
//Anagram means same characters are used to write different words.