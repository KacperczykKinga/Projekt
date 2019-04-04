package Uczelnia;
import java.io.Serializable;
import java.util.*;
import java.io.*;
public class PracownikNaukowo_Dydaktyczny extends PracownikUczelni implements Serializable{
	private String stopiennaukowy;
	private int sala;
	private Konsultacje godziny;
	private Calendar[][] tabGodziny=new Calendar[50][2];
	private Object[][] tabDat=new Object[50][2];
	private int j=0;
	//private Student cache;
	
	public PracownikNaukowo_Dydaktyczny(String imie,String nazwisko,int rokurodzenia,String plec, String PESEL,int pensja, String zatrudnienie,String stopiennaukowy, int sala)
	{
		super(imie,nazwisko,rokurodzenia,plec,PESEL,pensja,zatrudnienie);
		this.stopiennaukowy=stopiennaukowy;
		this.sala=sala;
		
	}
	//gettery
	public String getstopiennaukowy()
	{
		return this.stopiennaukowy;
	}
	public int getsala()
	{
		return this.sala;
	}
	
	public String getwszystko()
	{
		super.getwszystko();
		System.out.println(" stopien naukowy "+this.stopiennaukowy+" przyjmuje w sali "+this.sala);
		return super.getwszystko()+" stopien naukowy "+this.stopiennaukowy+" przyjmuje w sali "+this.sala;
	}
	//settery
    public void setStopiennaukowy(String stopiennaukowy){
    	this.stopiennaukowy=stopiennaukowy;
    }
    public void setSala(int sala){
    	this.sala=sala;
    }
    public void setGodziny(int x, int y, int z,int w, int q,int minuty1 ,int k, int l, int m, int n, int o,  int minuty2){
    	this.godziny=new Konsultacje();
    	godziny.setpid( x,  y, z, w,  q,  k, l,  m,  n,  o,  minuty1,  minuty2);
    	tabGodziny=godziny.wypelnijTab();
    	for(int a=0;a<30;a++){
    		//System.out.println(((Calendar)(tabGodziny[a][0])).getTime() + " "+tabGodziny[a][1].getTime());
    		tabDat[a][0]=tabGodziny[a][0];
    		tabDat[a][1]=(tabGodziny[a][1].getTimeInMillis()-tabGodziny[a][0].getTimeInMillis())/60000;
    		System.out.println(((Calendar)tabDat[a][0]).getTime()+ "czas"+(long)(tabDat[a][1]) );
    	}
  
   
    }
 /*   public void ulep(Student [] studenci, int j, int i){
	  int a=0;
	  while(studenci[a]!=null && a<i){
		  if(studenci[i].getwykladowca().getPESEL().equals(getPESEL()) &&  studenci[a].getdziendany()==((Calendar)tabDat[j][0]).getTimeInMillis() && studenci[a].getczasdany()<studenci[a].getczasmax()){
			 	  while((int)tabDat[j][1]>0 && studenci[a].getczasdany()<studenci[a].getczasmax()){
					  studenci[a].setczasdany(studenci[a].getczasdany()+1);
					  tabDat[j][1]=(int)tabDat[j][1]-1;
				  
			  }
		  }
		  a++;
	  }

    }*/
    public void ktorydzien(long sekundy){
    	while(sekundy>((Calendar)tabDat[j][0]).getTimeInMillis())
			j++; 
    }
    public void podzialKonsultacji(){
    	Student[] studenci=new Student[200];
    	ZapisOdczyt nowe= new ZapisOdczyt();
    	studenci=nowe.odczytajStudenta();
    	int i=0;
    	while(studenci[i]!=null){
    		System.out.println(getPESEL());
    		if(studenci[i].getwykladowca()!=null
    				&&
    				studenci[i].getwykladowca().getPESEL().equals(getPESEL()) && 
    				studenci[i].getczasdany()==0) 
    		{System.out.println("Jest potrzeba konsultacji" +" ktore"+ j + "minut"+(long)tabDat[j][1]);
    		System.out.println(studenci[i].getczasmax());
    		System.out.println(studenci[i].getczasmin());
    		
    		if(studenci[i].getpriorytet().equals("Małe")){
    			int min=studenci[i].getczasmin();
    			if((long)tabDat[j][1]>=min)
    			{
    			studenci[i].setczasdany(min);
    			studenci[i].setdziendany(tabDat[j][0]);
    			nowe.zapiszdaneStudenta(studenci[i],i);
    			tabDat[j][1]=(long)tabDat[j][1]-(long)min;
    			if((long)tabDat[j][1]<=10){
        			while(min<studenci[i].getczasmax() && (long)tabDat[j][1]>0)
        				{min++;tabDat[j][1]=(long)tabDat[j][1]-1;}
        			studenci[i].setdziendany(tabDat[j][0]);
        			nowe.zapiszdaneStudenta(studenci[i],i);
        			j++;
        			}
    			
    			}
    		/*	if((long)tabDat[j][1]<min){
    				j++;
    			}*/
    			}
    		if(studenci[i].getpriorytet().equals("Średnie")){
    			int cza=(studenci[i].getczasmax()+studenci[i].getczasmin())/2;
    			/*if((long)tabDat[j][1]-cza<0 && (long)tabDat[j][1]>studenci[i].getczasmin()){
    				cza=(int)tabDat[j][1];
    			}*/
    			if((long)tabDat[j][1]>=cza)
    			{
    			studenci[i].setczasdany(cza);
    			studenci[i].setdziendany(tabDat[j][0]);
    			nowe.zapiszdaneStudenta(studenci[i],i);
    			tabDat[j][1]=(long)tabDat[j][1]-(long)cza;
    			if((long)tabDat[j][1]<=10){
        			while(cza<studenci[i].getczasmax() && (long)tabDat[j][1]>0) 
        				{cza++;tabDat[j][1]=(long)tabDat[j][1]-1;}
        	    studenci[i].setczasdany(cza);
        	    nowe.zapiszdaneStudenta(studenci[i],i);
        	    j++;
        		}
    			}
    		//studenci=nowe.odczytajStudenta();
    			if((long)tabDat[j][1]<15 && (long)tabDat[j][1]>=studenci[i].getczasmin()&& studenci[i].getczasdany()==0){
    				studenci[i].setczasmin(studenci[i].getczasmin());
    				nowe.zapiszdaneStudenta(studenci[i],i);
    				//tabDat[j][1]=(int)tabDat[j][1]-studenci[i].getczasmin();
    				j++;
    			}
    			if((long)tabDat[j][1]<17){
    				//ulep(studenci,j,i);
    				j++;
    			}
    			/*if((long)tabDat[j][1]<cza){
    			
    				j++;
    			}*/
    			}
    		if(studenci[i].getpriorytet().equals("Duże")){
    			int czacza=(studenci[i].getczasmax()+studenci[i].getczasmin())/2+3;
    			/*if((long)tabDat[j][1]-czacza<0 && (long)tabDat[j][1]>studenci[i].getczasmin()){
    				czacza=(int)tabDat[j][1];
    			}*/
    			if((long)tabDat[j][1]>=czacza){
    				if(czacza>studenci[i].getczasmax()){
    					System.out.println("jejej");
    					studenci[i].setczasdany(studenci[i].getczasmax());
    					nowe.zapiszdaneStudenta(studenci[i],i);
    				}
    			studenci[i].setczasdany(czacza);
    			studenci[i].setdziendany(tabDat[j][0]);
    			nowe.zapiszdaneStudenta(studenci[i],i);
    			tabDat[j][1]=(long)tabDat[j][1]-(long)czacza;
                if((long)tabDat[j][1]<=10){
        			while(czacza<studenci[i].getczasmax() && (long)tabDat[j][1]>0)
        				{czacza++;tabDat[j][1]=(long)tabDat[j][1]-1;}
        	    studenci[i].setczasdany(czacza);
        	    nowe.zapiszdaneStudenta(studenci[i],i);
        	    j++;
        		}
    			}
    			//studenci=nowe.odczytajStudenta();
    			if((long)tabDat[j][1]<15 && (long)tabDat[j][1]>=studenci[i].getczasmin() && studenci[i].getczasdany()==0){
    				studenci[i].setczasmin(studenci[i].getczasmin());
    				nowe.zapiszdaneStudenta(studenci[i],i);
    				//tabDat[j][1]=(int)tabDat[j][1]-studenci[i].getczasmin();
    				j++;
    			}
    			/*if((long)tabDat[j][1]<czacza){
    				j++;
    			}*/
    			if((long)tabDat[j][1]<17){
    				//ulep(studenci,j,i);
    				j++;
    			}
                }
    		if(studenci[i].getpriorytet().equals("Bardzo duże")){
    			int max=studenci[i].getczasmax();
    			if((long)tabDat[j][1]>=max){
    			studenci[i].setczasdany(max);
    			studenci[i].setdziendany(tabDat[j][0]);
    			nowe.zapiszdaneStudenta(studenci[i],i);
    			tabDat[j][1]=(long)tabDat[j][1]-(long)max;
    			}
    		//	studenci=nowe.odczytajStudenta();
    			if((long)tabDat[j][1]<15 && (long)tabDat[j][1]>=studenci[i].getczasmax()/2 && studenci[i].getczasdany()==0){
    				studenci[i].setczasmin(studenci[i].getczasmax()/2);
    				nowe.zapiszdaneStudenta(studenci[i],i);
    				j++;
    				
    			}
    			if((long)tabDat[j][1]<17){
    			//	ulep(studenci,j,i);
    				j++;
    			}
    		}
    	
    		nowe.zapiszStudentow();
    		}
    		
    			i++;
    	}
    }
	
    
}
