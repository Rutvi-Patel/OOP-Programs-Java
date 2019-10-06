package ArraysAndList;
import java.util.Arrays;
import java.util.Scanner; 
public class ContactList {
	 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int arraySize;
	      String personName;
	      String[] nameList = new String [20];
	      String [] numberList = new String [20];
	      arraySize = scnr.nextInt();
	      for (int i = 0;i<arraySize; ++i) {
	    	  nameList[i]=scnr.next();
	    	  numberList[i]= scnr.next();
	      }
	      personName = scnr.next();

	      System.out.println(getPhoneNumber(nameList, numberList, personName, arraySize));
	 }
 
	   
	 public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize){
		 String num = "";
	      for (int i=0 ; i< arraySize; ++i){
	         if (nameVec[i].equals(contactName)){
	            num = num + phoneNumberVec[i];
	         	}//if
	      }//for
	      return num;
	   }//method
	 }//class
	 

