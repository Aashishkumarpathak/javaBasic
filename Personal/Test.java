import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Map;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) throws Exception {
    	//Write a  Program To Print All Possible Substrings Of A String : java
    	
    	String inputString = "java";
    	for(int i = 0;i<inputString.length();i++) {
    		
    		for(int j=i+1; j<=inputString.length();j++){
    			
    			System.out.println(inputString.substring(i,j));
    		}
    	}	
	}
}


J
Ja
Jav
Java
a
av
ava
v
va
a
