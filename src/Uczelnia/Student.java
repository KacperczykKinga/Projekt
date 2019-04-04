package Uczelnia;
import Uczelnia.Osoba;
//import Uczelnia.Uczelnia2;
import Uczelnia.PracownikNaukowo_Dydaktyczny;
//import Uczelnia.Pracownik_Administracji;
import java.io.*;
import java.util.*;
public class Student extends Osoba implements Serializable {
    private int rokstudiow;
    private String kierunek;
    private PracownikNaukowo_Dydaktyczny[] wykladowcy=new PracownikNaukowo_Dydaktyczny[10];
    private Object[] konsultacje=new Object[7];
    private Object[] konsultacje3=new Object[3];
   
    public Student(String imie,String nazwisko,int rokurodzenia,String plec, String PESEL,int rokstudiow,String kierunek){
    	super(imie,nazwisko,rokurodzenia,plec,PESEL);
    	this.rokstudiow=rokstudiow;
    	this.kierunek=kierunek;
    }
    //gettery
	public int getrokstudiow(){
		return rokstudiow;
	}
	public String getkieunek(){
		return kierunek;
	}
	//settery
	public void setrokstudiow(int rokstudiow){
		this.rokstudiow=rokstudiow;
	}
	public void setkierunek(String kierunek){
		this.kierunek=kierunek;
	}
	//tworzy liste wykładowców, którzy uczą tego studenta
	public void losujwykladowcow(){
		 PracownikUczelni[] wszyscy=new PracownikUczelni[10000000];
		ZapisOdczyt nowy=new ZapisOdczyt();
		wszyscy=nowy.odczytaj();
		int lwykladowcow=0;
		while(wszyscy[lwykladowcow]!=null) lwykladowcow++;
		System.out.println(lwykladowcow);
		int j=0;
		for(int i=0;i<10;i++){
			int a=(int)(Math.random()*lwykladowcow);
			if(wszyscy[a] instanceof PracownikNaukowo_Dydaktyczny){
				wykladowcy[j]=(PracownikNaukowo_Dydaktyczny)wszyscy[a];
				System.out.println(wykladowcy[j]);
				j++;
			}
		}
	}
	//losowo dobiera parametry konultacji
		public void potrzebakonsultacji(){
			int lwykladowcow=1;
			while(wykladowcy[lwykladowcow-1]!=null && lwykladowcow<wykladowcy.length) {lwykladowcow++; }
			lwykladowcow--;
			int a=(int)(Math.random()*lwykladowcow);
			System.out.println(a);
			
			System.out.println(wykladowcy[a]);
			konsultacje[0]=wykladowcy[a];
			int czasmin=(int)(Math.random()*5)+10;
			System.out.println(czasmin);
			konsultacje[1]=czasmin;
			int czasmax=(int)(Math.random()*20)+czasmin;
			System.out.println(czasmax);
			konsultacje[2]=czasmax;
			int b=(int)(Math.random()*4);
			if(b==0) {System.out.println("Małe"); konsultacje[3]="Małe";}
			if(b==1) {System.out.println("Średnie"); konsultacje[3]="Średnie";}
			if(b==2) {System.out.println("Duże"); konsultacje[3]="Duże";}
			if(b==3) {System.out.println("Bardzo duże");konsultacje[3]="Bardzo duże";}
			konsultacje[4]=0;
			konsultacje[5]=0;
			konsultacje[6]=null;
			
		}
		//settery parametrów konsultacji
		public void setczasmin(int czas){
			this.konsultacje[1]=czas;
		}
		public void setczasmax(int czas){
			this.konsultacje[2]=czas;
		}
		public void setpriorytet(String prio){
			this.konsultacje[3]=prio;
		}
		public void setczasdany(int czas){
			this.konsultacje[4]=czas;
		}
		public void setdziendany(Object a){
			this.konsultacje[5]=((Calendar)a).getTime();
			this.konsultacje[6]=(Calendar)a;
		}
		//gettery parametrów konsultacji
		public int getczasmin(){
			return (int)konsultacje[1];
		}
		public int getczasmax(){
			return (int)konsultacje[2];
		}
		public String getpriorytet(){
			return (String)konsultacje[3];
		}
		public PracownikNaukowo_Dydaktyczny getwykladowca0(){
			return ((PracownikNaukowo_Dydaktyczny)konsultacje[0]);
		}
		public PracownikNaukowo_Dydaktyczny getwykladowca(){
			//if((((PracownikNaukowo_Dydaktyczny)konsultacje[0]).getPESEL())!=null)
			//{
			return (PracownikNaukowo_Dydaktyczny)konsultacje[0];}
			////if((((PracownikNaukowo_Dydaktyczny)konsultacje[0]).getPESEL())==null)
			//{return null;}
	//	}
		public int getczasdany(){
			return (int)konsultacje[4];
		}
/*		public int getroznica(){
			konsultacje[6]=getczasmax()-getczasdany();
			return (int)konsultacje[6];
		}*/
		public long getdziendany(){
			if(konsultacje[6]!=null)
			return (long)(((Calendar)konsultacje[6]).getTimeInMillis());
			return 0;
		}
		//gettery całych konsultacji
		public String getKons(){
			for(int i=0;i<6;i++){
				System.out.println(konsultacje[i]);
			}
			if(konsultacje[0]==null) return "Nie masz konsultacji";
			return " Czas minimalny "+
			Integer.toString((Integer)konsultacje[1])+
			" czas maksymalny "+ Integer.toString((Integer)konsultacje[2])+
			" priorytet "+konsultacje[3]+" czas przyznany "+
			Integer.toString((Integer)konsultacje[4])+" dzien przyznany "+konsultacje[5];
		}
		public void getTab(){
			for(int i=0;i<6;i++){
				System.out.println(konsultacje[i]);
			}
			
		}
	
	public static void main(String[] args) {
		Student a= new Student("Karol","Misiek",1997,"m","97081543753",1,"inzynieria środowiska");
		a.losujwykladowcow();
		a.potrzebakonsultacji();
		
        
	}

}
