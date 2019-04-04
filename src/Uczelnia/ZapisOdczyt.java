package Uczelnia;
import Uczelnia.Uczelnia2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ZapisOdczyt {
	PracownikUczelni[] Tab=new PracownikUczelni[10000000];
	Student[] Tab2=new Student[10000000];
	//deserializuje pracowników
	public PracownikUczelni[] odczytaj(){
		ObjectInputStream os=null;
		try{ int i=0;
			FileInputStream strumienPlik2=new FileInputStream("PlikPracownikow.ser");
			os=new ObjectInputStream(strumienPlik2);
			Object a;
			PracownikUczelni aa;
			while((aa=(PracownikUczelni)(os.readObject()))!=null)
				
				{
				//pracownicy[i]=aa;
					Tab[i]=aa;
					i++;
						System.out.println(" Zserializowany"+aa+" waga"+aa.getimie());
						//a=os.readObject();
						}
				os.close();
				}
				catch(Exception ex){
					
					System.out.println("koniec");
					
					
				}
		return Tab;
		
	}
	//serializuje pracownikow
	public void zapisz(){
		try{
		FileOutputStream strumienPlik=new FileOutputStream("PlikPracownikow.ser");
		ObjectOutputStream so=new ObjectOutputStream(strumienPlik);
		int i=0;
		while(Tab[i]!=null){
			so.writeObject(Tab[i]);
			i++;
			
		}
		so.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

}	
	//serializuje pracowników z jednym nowym
		public void zapisz(PracownikUczelni b){
			try{
			FileOutputStream strumienPlik=new FileOutputStream("PlikPracownikow.ser");
			ObjectOutputStream so=new ObjectOutputStream(strumienPlik);
			int i=0;
			while(Tab[i]!=null){
				so.writeObject(Tab[i]);
				i++;
				
			}
		    so.writeObject(b);
			so.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
	
	}	
		//deserializuje studentów
		public Student[] odczytajStudenta(){
			ObjectInputStream os2=null;
			try{ int i=0;
				FileInputStream strumienPlik22=new FileInputStream("PlikStudentow.ser");
				os2=new ObjectInputStream(strumienPlik22);
				Object a2;
				Student aa2;
				while((aa2=(Student)(os2.readObject()))!=null)
					
					{
					//pracownicy[i]=aa;
						Tab2[i]=aa2;
						i++;
							System.out.println(" Zserializowany"+aa2+" waga"+aa2.getimie()+"PESEL"+aa2.getPESEL());
							aa2.getTab();
							//aa2.potrzebakonsultacji();
							//a=os.readObject();
							}
					os2.close();
					}
					catch(Exception ex){
						System.out.println("koniec");
						
					}
			return Tab2;
			
		}
		//zmienia zawartosc tablicy do serializacji
		public void zapiszdaneStudenta(Student b,int i){
			Tab2[i]=b;
		}
		//serializuje studentów
		public void zapiszStudentow(){
			try{
				FileOutputStream strumienPlik=new FileOutputStream("PlikStudentow.ser");
				ObjectOutputStream so=new ObjectOutputStream(strumienPlik);
				int i=0;
				while(Tab2[i]!=null){
					so.writeObject(Tab2[i]);
					i++;
					
				}
				so.close();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
		}
		//serializuje studentów z jednym nowym
		public void zapiszStudenta(Student b2){
			try{
				FileOutputStream strumienPlik=new FileOutputStream("PlikStudentow.ser");
				ObjectOutputStream so=new ObjectOutputStream(strumienPlik);
				int i=0;
				while(Tab2[i]!=null){
					so.writeObject(Tab2[i]);
					i++;
					
				}
			    so.writeObject(b2);
				so.close();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student a= new Student("Karol","Misiek",1997,"m","97081543753",1,"inzynieria środowiska");
		ZapisOdczyt mi=new ZapisOdczyt();
		mi.odczytajStudenta();
		mi.zapiszStudenta(a);
		System.out.println(" ");
	
		

	}

}
