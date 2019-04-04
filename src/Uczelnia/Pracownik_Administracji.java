package Uczelnia;
import java.io.Serializable;
//i//mport java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import Uczelnia.Osoba;
import Uczelnia.PracownikUczelni;
public class Pracownik_Administracji extends PracownikUczelni implements Serializable{

	private int pokoj;
	private String CoRobi;
	
	public Pracownik_Administracji(String imie,String  nazwisko,int rokurodzenia, String plec,String PESEL, int pensja, String zatrudnienie,int  pokoj, String CoRobi){
		super(imie,nazwisko,rokurodzenia,plec,PESEL,pensja,zatrudnienie);
		this.pokoj=pokoj;
		this.CoRobi=CoRobi;
	}
	//gettery
	public int  getPokoj(){
		return pokoj;
	}
	public String getCoRobi(){
		return CoRobi;
	}
	//settery
	public void setPokoj(int pokoj){
		this.pokoj=pokoj;
	}
	public void setCoRobi(String CoRobi){
		this.CoRobi=CoRobi;
	}
	public String getwszystko(){
		return super.getwszystko()+ " pracuje w pokoju "+ pokoj+ " praca polega na "+CoRobi;
	}

}
