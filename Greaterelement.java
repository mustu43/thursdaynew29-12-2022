package learn;

import java.util.Scanner;

public class Greaterelement {
  
    public static void main(String[] args) {  
  
    	int n;  
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("Enter the number of elements yo want to store: ");  
    	 
    	n=sc.nextInt();  
    	  
    	int[] array = new int[10];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++)  
    	{  
     
    	array[i]=sc.nextInt();  
    	}  

        int max = array[0];  
       
        for (int i = 0; i < array.length; i++) {  
          
           if(array[i] > max)  
               max = array[i];  
        }  
        System.out.println("Gratest element present in given array is: " + max);  
    }  
}  