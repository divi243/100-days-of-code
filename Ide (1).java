/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   // ArrayList <Integer> array = new ArrayList <Integer>();
	    
	    int num =0;
	    String prime = " ";
	    for(int i =1;i<100;i++){
	        int count =0;
	        for( num =i;num>=1;num--){
	            if(i%num==0){
	                 count++;
	             }
	         }
	       if(count == 2){
	           prime = prime + i + " ";
	       }
	    }
	     System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(prime);
	}
		// your code goes here
	
}
