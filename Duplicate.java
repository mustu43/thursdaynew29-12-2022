package learn;

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) { 
    	String s;
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter a String: ");  
    	s=sc.nextLine();    
       int count;  
         
     
       char string[] = s.toCharArray();  
         
       System.out.println("Duplicate characters in a given string are: ");  
     
       for(int i = 0; i <string.length; i++) {  
           count = 1;  
           for(int j = i+1; j <string.length; j++) {  
               if(string[i] == string[j] && string[i] != ' ') {  
                   count++;  
                   //Set string[j] to 0 to avoid printing visited character  
                   string[j] = '0';  
               }  
           }  
           //A character is considered as duplicate if count is greater than 1  
           if(count > 1 && string[i] != '0')  
               System.out.println(string[i]);  
       }  
   }  
}  