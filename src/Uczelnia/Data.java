package Uczelnia;
import java.util.*;
public class Data {
//ustawia date dnia dzisiejszego	
	  Calendar dzis=Calendar.getInstance(); 
	  long cyfry;
	public Data(int r,int m,int d,int g,int min){
		dzis.set(r,m-1,d,g,min);
	}
	public long getdzisinmillis(){
		   cyfry=dzis.getTimeInMillis();
		   return cyfry;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
