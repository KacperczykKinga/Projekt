package Uczelnia;
//import Uczelnia.Osoba;
import java.io.Serializable;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
 public class PracownikUczelni extends Osoba implements Serializable{
	private int pensja;
	private String zatrudnienie;
	
	
	public PracownikUczelni(String imie,String nazwisko,int rokurodzenia,String plec, String PESEL,int pensja, String zatrudnienie)
	{
		super(imie,nazwisko,rokurodzenia,plec,PESEL);
		this.pensja=pensja;
		this.zatrudnienie=zatrudnienie;
	}
	public int getpensja()
	{
		return this.pensja;
	}
	public String getzatrudnienie()
	{
		return this.zatrudnienie;
	}
	public String getwszystko()
	{
		super.getwszystko();
		System.out.println(" zatrudniony na stanowisku "+this.zatrudnienie+" pensja "+this.pensja);
		return super.getwszystko()+" zatrudniony na stanowisku "+this.zatrudnienie+" pensja "+this.pensja;
	} 
	public void setPensja(int pensja){
		this.pensja=pensja;
	}
	public void setZatrudnienie(String zatrudnienie){
		this.zatrudnienie=zatrudnienie;
	}

}
