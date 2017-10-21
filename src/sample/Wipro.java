package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wipro {
	public static char[] ch;
 public static void main(String args[]) {
	/* try {
	 boolean output=validPassword();
	  
	 if(output) {
		 System.out.println("Password is STRONG");
	 }
	 else {
		 System.out.println("Password is WEEK");
	 }}
	 catch(Exception e) {
		 
	 }*/
	Scanner read=new Scanner(System.in);
	 System.out.println("enter valuesa string");
	 String str=read.nextLine();
	  
	 str=str.replaceAll("\\s", "");
	 System.out.println(str);
	  ch=str.toCharArray();
	  
	 Map<Character,Integer> map=new HashMap<Character,Integer>();
	 
	 
	 map=collection_duplicate(map);
	 Set<Character> keys = map.keySet();
     for (Character character : keys) {
         System.out.println("Non -duplicate values are: Key = "+character+ " Value : " + map.get(character));
     }
	 
 }
	 public static Map<Character,Integer> collection_duplicate(Map<Character,Integer> newmap) {
		 
		/* Scanner read=new Scanner(System.in);
		 System.out.println("enter valuesa string");
		 String str=read.nextLine();
		  
		 str=str.replaceAll("\\s", "");
		 System.out.println(str);
		 char[] ch=str.toCharArray();*/
		  
		  newmap=new HashMap<Character,Integer>();
		 for(char CH:ch)
		 {
		 if(newmap.containsKey(CH)){
		 newmap.remove(CH);
		 }
		 else{
		 newmap.put(CH,1);
		 }
		  
		 }
		 return newmap;
		 /*for (Map.Entry<Character, Integer> entry : newmap.entrySet()) {
			 if(newmap.containsKey(entry.getKey()))
			 {
				 newmap.remove(entry.getKey());
			 }
			 else {
				 newmap.put(entry.getKey(), 1);
			 }
		 }*/
		  
		
		     
		 }
		 public static  void nocollection_duplicate(){

		  

		 int n,flag=0,count=0;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter no.of values to be there ");
		 n=sc.nextInt();
		 int[] val=new int[n];
		 System.out.println("enter values");
		 for (int i=0;i<n;i++)
		 {
		 val[i]=sc.nextInt();
		  
		 }
		 System.out.print("Non repeated elements are:");
		 for (int i=0;i<n;i++){
		 for (int j=0;j<n;j++){
		 if(i!=j){
		 if(val[i]!=val[j]){
		 flag=1;
		 }
		 else{
		 flag=0;
		 break;
		 }
		 }
		 }
		 if(flag==1){
		 count++;
		 System.out.println(val[i]+" ");
		 }

		  
		 }
		 System.out.println("no of non repeated are"+count);
		  
		 }
		 public  static int d,e;
		 public  static boolean validPassword() throws Exception{
		     String password;
		     boolean con = true;

		     Pattern[] passRegex = new Pattern[6];

		     {
		         passRegex[0] = Pattern.compile(".*[A-Z].*");
		         passRegex[1] = Pattern.compile(".*[a-z].*");
		         passRegex[2] = Pattern.compile(".*\\d.*");
		         passRegex[3] = Pattern.compile("[A-Za-z0-9]*");
		         
		         passRegex[4] = Pattern.compile(
	            		    "(?<! \n" + " &\\#  \n" +" [0-9A-F]{0,3} \n" +")   \n" +"\\d{3} .", Pattern.COMMENTS);
		         passRegex[5] = Pattern.compile("([0-9])\\1*$");	

		     }

		     
		         System.out.println("Enter Your Password Using Correct Format:");
		       //  password = input.next();
		 password = "456^";
		  System.out.println(password.length());
		             if(password.length() < 4 || password.length() > 12){
		                 System.out.println("Your Password Should Be 4 To 11 Characters Long");
		                 con=false;
		             }
		             if(!passRegex[0].matcher(password).matches()){
		                 System.out.println("Your Password Must Contain Atleast One UpperCase Letter");
		                 con=false;
		                 }
		             if(!passRegex[1].matcher(password).matches()){
		                 System.out.println("Your Password Must Contain Atleast One LowerCase Letter");
		                 con=false;
		                 }
		             if(!passRegex[2].matcher(password).matches()){
		                 System.out.println("Your Password Must Contain Atleast One Digit");
		                 con=false;
		                 }
		             if(passRegex[3].matcher(password).matches()){
		                 System.out.println("Your Password Must Contain Atleast One Special Character");
		                 con=false;
		                 }
		           /*  if(passRegex[4].matcher(password).matches()){
		                 System.out.println("Your Password Must not Contain consecutive 3 digits ");
		                 con=false;
		                 }*/
		      
		             for (int i = 0; i < password.length()-1; i++)
		             {
		                char charAtPos = password.charAt(i);
		                char charAtNextPos = password.charAt(i+1);
		                char charAtthenPos = password.charAt(i+2);
		               if(Character.isDigit(charAtPos)&&Character.isDigit(charAtNextPos)&&Character.isDigit(charAtthenPos))
		               {
		            	int a=Character.getNumericValue(charAtPos);
		            	int b=Character.getNumericValue(charAtNextPos);
		            	int c=Character.getNumericValue(charAtthenPos);
		            	 d=b-a;e=c-b;
		            	System.out.println(d+"    "+e);
		               }
		               System.out.println(d+"    "+e);
			             if (d == 1&& e==1)
			               {
			            	   System.out.println("Your Password Must not Contain consecutive 3 digits ");
			            	   con=false;
			               }   
		            
		           }
		             
		            
		           //  System.out.println("Your Password Must not Contain consecutive 3 digits "+d);
		             
		            		//Matcher regexMatcher = regex.matcher(password);
		            		//return regexMatcher.find(); 
		            	
							
		             
		    
			return con;
		 }
		 
		 
		 public static void passwordvalidate()
		 
		   {
		 
		  
		 
		     Scanner scan = new Scanner(System.in);
		 
		     System.out.println("Enter your password: ");
		 
		     String str = scan.nextLine();
		 
		  
		 
		     int len = str.length();
		 
		     int digit = 0;
		 
		     int lowerCase = 0;
		 
		     int upperCase = 0;
		 
		     int count = 0;
		 
		  
		 
		     char ch;
		 
		  
		 
		  
		 
		       if(len >= 7)
		 
		       {
		 
		         while(count < len)
		 
		         {
		 
		           ch = str.charAt(count);
		 
		           if(Character.isDigit(ch))
		 
		           {
		 
		             digit = digit + 1;
		 
		           }
		 
		           if(Character.isLowerCase(ch))
		 
		           {
		 
		             lowerCase = lowerCase + 1;
		 
		           }
		 
		           if(Character.isUpperCase(ch))
		 
		           {
		 
		             upperCase = upperCase + 1;
		 
		           }
		 
		             count = count + 1;
		 
		         }
		 
		       }
		 
		  
		 
		     if(digit >=1 && lowerCase >=1 && upperCase >= 1)
		 
		       System.out.println("Acceptable PW.");
		 
		     else
		 
		       System.out.println("Unacceptable PW.");
		 
		  
		 
		  
		 
		  
		 
		   }
		 
		 }

 

