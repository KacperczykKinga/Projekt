package Uczelnia;
//import Uczelnia.PracownikUczelni;
import java.io.Serializable;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
abstract public class Osoba implements Serializable  {

	 private String imie;
		private String nazwisko;
		private int rokurodzenia;
		private String plec;
		private String PESEL;
		
		
		public Osoba(String imie,String nazwisko,int rokurodzenia,String plec, String PESEL)
		{
			this.imie=imie;
			this.nazwisko=nazwisko;
			this.rokurodzenia=rokurodzenia;
			this.plec=plec;
			this.PESEL=PESEL;
		}
	//gettery	
		public String getimie()
		{
			return imie;
		}
		public String getnazwisko()
		{
			return nazwisko;
		}
		public int getrokurodzenia()
		{
			return rokurodzenia;
		}
		public String getplec()
		{
			return plec;
		}
		public String getwszystko()
		{
			System.out.println(imie+" "+ nazwisko+" urodzony w roku "+rokurodzenia+" plci "+plec);
			return imie+" "+ nazwisko+" urodzony w roku "+rokurodzenia+" plci "+plec;
		}
		public String getwiek()
		{   String wiek=Integer.toString((2017-rokurodzenia));
			return wiek;
		}
		public String getPESEL()
		{
			return PESEL;
		}
		//settery
		public void setImie(String imie){
			this.imie=imie;
		}
		public void setNazwisko(String nazwisko){
			this.nazwisko=nazwisko;
		}
		public void setplec(String plec){
			this.plec=plec;
		}
		public void setRok(int rok){
			this.rokurodzenia=rok;
		}
		public void setPESEL(String PESEL){
			this.PESEL=PESEL;
		}

}
