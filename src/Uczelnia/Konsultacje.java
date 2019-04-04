
package Uczelnia;
import java.util.*;
import java.io.*;

public class Konsultacje implements Serializable {
	 Calendar koniecsem=Calendar.getInstance(); 
		Calendar [][] tablicaDat=new Calendar[50][2];
		Object [][] tabDat=new Object[55][2];
		int s;
		int ss;
		int rok1, rok2, mie1, mie2,godz1, godz2, min1, min2, ilmin1, ilmin2;
		public void setpid(int x, int y, int z,int w, int q, int k, int l, int m, int n, int o, int minuty1, int minuty2 )
		{
	    koniecsem.set(2018, 0, 12, 23,59);
	    s=z;
	    ss=m;
	    rok1=x;
	    mie1=y-1;
	    godz1=w;
	    min1=q;
	    ilmin1=minuty1;
	    rok2=k;
	    mie2=l-1;
	    godz2=n;
	    min2=o;
	    ilmin2=minuty2;}
	  //wypełnia tablice data i liczba minut
	public Calendar[][] wypelnijTab(){
		int l=0;
		   while (l<32)
	       {tablicaDat[l][0]=Calendar.getInstance();
	       tablicaDat[l+1][0]=Calendar.getInstance();
	       tablicaDat[l][1]=Calendar.getInstance();
	       tablicaDat[l+1][1]=Calendar.getInstance();
	       l++;}
		int i=0;
	
	     while(i<30){
	      	tablicaDat[i][0].set(rok1,mie1,s,godz1,min1);
	 s+=7;
	i++;
	tablicaDat[i][0].
	set(rok2,mie2,ss,godz2,min2);
	tablicaDat[i][1].set(rok2,mie2,ss,godz2,min2+ilmin2);
	ss+=7;
	i++;
	      
	     }
	     return tablicaDat;}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
