package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fiboPrime {

	    
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter positive number :");
	         
	        int size = sc.nextInt();
	        
	          int flag =0;
	          List<String> answer = new ArrayList<>();
	          List<Integer> N= new ArrayList<>();
	          for(int u=0;u<size;u++) {
	        	  int input = sc.nextInt();
	              N.add(input);
	          }
	          
	          for(int y=0;y<size;y++)
	          {
	        	  int firstTerm = 0;
	  	        int secondTerm = 1;
	  	        int thirdTerm = 0;
	        while (thirdTerm < N.get(y))
	        {
   		  System.out.println("Adding the numbers to get fibo series");
	            thirdTerm = firstTerm + secondTerm;
	             
	            firstTerm = secondTerm;
	             
	            secondTerm = thirdTerm;
	        }
	         
	        if(thirdTerm == N.get(y))
	        {
	            for(int i=2;i<((N.get(y))/2);i++) {
	            	flag =0;
	            	if(N.get(y)%i==0) {
	            		flag =1;
	            		break;
	            	}
	            }
	            if(flag == 0) {
	            	answer.add("y");
	            }
	            else {
	            	answer.add("n");
	            }
	        }
	        else
	        {
	        	answer.add("n");
	        }
	          }
	          System.out.println(answer);
	    }   
	}
