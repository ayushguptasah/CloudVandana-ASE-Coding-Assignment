package com.pangramornot.java;

public class PangramOrNot {
	public static void Pangram(String str)
	{
		str=str.toLowerCase();

		String nstr="";

		for(char i='a';i<='z';i++){

			if(str.indexOf(i)!=-1){

				nstr=nstr+i;
			}
		}
		if(nstr.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println("Not Pangram");
		}
	}
}