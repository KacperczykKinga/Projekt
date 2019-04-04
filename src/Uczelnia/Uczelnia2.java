package Uczelnia;
import Uczelnia.Student;
import Uczelnia.Osoba;
import Uczelnia.PracownikUczelni;
import Uczelnia.Pracownik_Administracji;
import Uczelnia.PracownikNaukowo_Dydaktyczny;
import Uczelnia.Konsultacje;
import Uczelnia.ZapisOdczyt;

import java.util.InputMismatchException;
import java.util.Scanner;
import Uczelnia.PracownikNaukowo_Dydaktyczny;
import java.io.*;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Uczelnia2  implements ActionListener{
	PracownikUczelni[] pracownicy=new PracownikUczelni[500000];
	Student[] studenci=new Student[1000000];
	ZapisOdczyt raz=new ZapisOdczyt();
	int taknie=0;
	JFrame ramka=new JFrame();
	JLabel notatka=new JLabel("");
	JButton przycisk1= new JButton();
	JButton przycisk2= new JButton();
	JButton przycisk3=new JButton();
	JButton przycisk4= new JButton();
	JButton przycisk5= new JButton();
	JButton przycisk6=new JButton();
	JButton przycisk7=new JButton();
	JButton przycisk8= new JButton();
	JButton przycisk9= new JButton();
	JButton przycisk10=new JButton();
	JButton przycisk11=new JButton();
	JButton przycisk12=new JButton();
	JButton przycisk21=new JButton();
	JButton przycisk13=new JButton();
	JButton przycisk14=new JButton();
	JButton przycisk15= new JButton();
	JButton przycisk16= new JButton();
	JButton przycisk17=new JButton();
	JTextField tekst2=new JTextField(20);
	JTextField tekst3=new JTextField(20);
	JLabel notatka2=new JLabel();
	JLabel notatka3=new JLabel();
	JTextArea arena1=new JTextArea(30,20);
	JButton przycisk18=new JButton();
	JButton przycisk19=new JButton();
	JButton przycisk20=new JButton();
	JButton przycisk22=new JButton();
	JButton przycisk25=new JButton();
	JPanel panel= new JPanel();
	JPanel panel1= new JPanel();
	JPanel panel2= new JPanel();
	JTextField tekst1=new JTextField(12);
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==przycisk1 && przycisk1.getText().equals("Pracownik")){
			doDziela2();
		}
		if(e.getSource()==przycisk2 && przycisk2.getText().equals("Student")){
			panel.remove(przycisk1);
			panel.remove(przycisk2);
			System.out.println("Robie sie");
			doDziela15();
		}
		if (e.getSource()==przycisk21 && przycisk21.getText().equals("Wprowadzić Pracownika/Studenta")){
			doDziela4();
		}
		if(e.getSource()==przycisk12 && przycisk12.getText().equals("Znaleźć pracownika ")){
			panel.remove(przycisk1);
			panel.remove(przycisk2);
			panel.remove(notatka);
			doDziela5();
		}
		if(e.getSource()==przycisk3 && przycisk3.getText().equals("Zatwierdzic konsultacje")){
			doDziela8();
		}
		if(e.getSource()==przycisk14 && przycisk14.getText().equals("Zaloguj")){
			doDziela9();
		}
		if(e.getSource()==przycisk13)
		{
			doDziela11();
		}
		if(e.getSource()==przycisk15){
			doDziela3();
		}
		if(e.getSource()==przycisk16){
				doDziela14();
		}
			//przycisk16.addActionListener(this);
			if(e.getSource()==przycisk17){
				doDziela17();
			}
			if(e.getSource()==przycisk18){
				doDziela18();
			}	
			if(e.getSource()==przycisk19){
				doDziela19();
			}
			if(e.getSource()==przycisk20){
				doDziela12();
			}
			if(e.getSource()==przycisk22){
				doDziela20();
			}
			if(e.getSource()==przycisk25){
				doDziela6();
			}
	}

	 
	public static void main(String[] args){
		Uczelnia2 uczelnia=new Uczelnia2();
		uczelnia.doDziela();}
		
	  //dzieli dalszy prgram na dostępny dla studenta i pracownika
		
		public void doDziela(){
			ramka.setSize(975,465);
			ramka.setVisible(true);
			ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ramka.getContentPane().add(BorderLayout.CENTER,panel);
		    notatka.setText("Zaloguj się jako");
		    przycisk1.setText("Pracownik");
		   	przycisk2.setText("Student");
		  	przycisk1.addActionListener(this);
		  	przycisk2.addActionListener(this);
		   	panel.add(notatka);
		   	panel.add(przycisk1);
		   	panel.add(przycisk2);
		   	ramka.pack();
		}
		
		//wyswietla 3 możliwości działań jakie moze podjąć pracownik
		public void doDziela2(){
			notatka.setText(" Co chcesz zrobić?");
			przycisk21.setText("Wprowadzić Pracownika/Studenta");
			przycisk12.setText("Znaleźć pracownika ");
			przycisk3.setText("Zatwierdzic konsultacje");
			przycisk3.addActionListener(this);
			przycisk12.addActionListener(this);
			przycisk21.addActionListener(this);
			panel.repaint();
			panel.remove(przycisk1);
			panel.remove(przycisk2);
			panel.add(notatka);
			panel.add(przycisk21);
			panel.add(przycisk12);
			panel.add(przycisk3);
			ramka.pack();
			
		}
			
			
			//prosi o podanie PESELu w celu ustalenia tożssamości
			public void doDziela3(){
				panel.remove(przycisk13);
				panel.remove(przycisk15);
				notatka.setText("Podaj swój PESEL");
				panel.add(notatka);
				panel.add(tekst1);
				przycisk14.addActionListener(this);
				panel.add(przycisk14);
				przycisk14.setText("Zaloguj");
				ramka.pack();
				
			}
			
			//pyta o to czy ktoś chce umówic konsultacje
			public void doDziela15(){
				panel.repaint();
				notatka.setText("Chcesz umówic się na konsultacje?");
				przycisk13.setText("Nie");
				przycisk15.setText("Tak");
				panel.add(notatka);
				panel.add(przycisk13);
				panel.add(przycisk15);
				przycisk13.addActionListener(this);
				przycisk15.addActionListener(this);
				ramka.pack();
				
			}
			
			//pyta o to czy ktoś chce zmienić zapotrzebowanie na konsultacje
			public void doDziela11(){
				panel.remove(notatka);
				panel.remove(przycisk13);
				panel.remove(przycisk15);
				panel.repaint();
				notatka.setText("Chcesz coś zmienić w zapotrzebwaniu na konsultacje?");
				panel.add(notatka);
				przycisk16.setText("Nie");
				przycisk16.addActionListener(this);
				przycisk17.setText("Tak");
				przycisk17.addActionListener(this);
				panel.add(przycisk16);
				panel.add(przycisk17);
				ramka.pack();
			}
			
			//jeśli student nie narzucił programowi wykonania żadnej wcześniej wymienionej czynnosci wyświetla tą informacje 
			public void doDziela12(){
				panel.remove(notatka);
				panel.remove(przycisk13);
				panel.remove(przycisk15);
				panel.repaint();
				notatka.setText("Dziękujemy");
				panel.add(notatka);
				ramka.pack();
			}
			
		//pyta studenta czy chce wyświetlic swoja konsultacje	
	public void doDziela14(){
		panel.remove(notatka);
		panel.remove(przycisk16);
		panel.remove(przycisk17);
		panel.repaint();
		notatka.setText("Chcesz wyswietlic konsultację?");
		przycisk19.setText("Tak");
		przycisk20.setText("Nie");
		panel.add(notatka);
		panel.add(przycisk19);
		panel.add(przycisk20);
		przycisk19.addActionListener(this);
		przycisk20.addActionListener(this);
		ramka.pack();
	}
			
		//losuje parametry konsultacji jeśli student chce umówic konsultacje
			public void doDziela9(){
				String pesel=tekst1.getText();
				System.out.println(tekst1.getText());
				studenci=raz.odczytajStudenta();
				int i=0;
				while(studenci[i]!=null){
					if(studenci[i].getPESEL().equals(pesel)){
						panel.remove(przycisk14);
						panel.remove(notatka);
						panel.remove(tekst1);
						System.out.println(studenci[i]);
						studenci[i].potrzebakonsultacji();
						raz.zapiszStudentow();
						studenci[i].getKons();
						JScrollPane przewijanie=new JScrollPane(arena1);
						arena1.setLineWrap(true);
						przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						panel.add(przewijanie);
						arena1.append(studenci[i].getKons());

						
						}
					i++;
				}
				ramka.pack();
			}
			
			//sprawdza PESEL w celu zidenytyfikowania studenta
			public void doDziela19(){
				panel.remove(przycisk20);
				panel.remove(przycisk19);
				panel.remove(notatka);
				panel.repaint();
				notatka.setText("Podaj PESEL");
				panel.add(notatka);
				panel.add(tekst1);
				przycisk22.setText("Zapisz");
				panel.add(przycisk22);
				przycisk22.addActionListener(this);
				ramka.pack();
			}
			
			
			//wyświetla konultacje studenta
			public void doDziela20(){
				String pesel=tekst1.getText();
				System.out.println(tekst1.getText());
				studenci=raz.odczytajStudenta();
				int i=0;
				while(studenci[i]!=null){
					if(studenci[i].getPESEL().equals(pesel)){
						JScrollPane przewijanie=new JScrollPane(arena1);
						arena1.setLineWrap(true);
						przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						panel.add(przewijanie);
						arena1.append(studenci[i].getKons());
					}
					i++;
					}
		        ramka.pack();
			
			}
			
			//pyta jakie parametry konsultacji student chce zmienić i na jakie wartosci
			public void	doDziela17(){
				
				panel.remove(przycisk16);
				panel.remove(przycisk17);
				panel.remove(notatka);
				panel.repaint();
				panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
				panel.add(panel1);
				panel.add(panel2);
				notatka.setText("Podaj PESEL");
				notatka2.setText("Co chcesz zmienic w zapotrzebowaniu? 1.Czas minimalny, 2.Czas maksymalny, 3.Priorytet");
				notatka3.setText("Na jaką wartość chcesz zmienić? (minuty>10 oraz <35, priotytet:Duze, Bardzo duże, Średnie, Małe");
				panel1.add(notatka);
				panel1.add(tekst1);
				panel1.add(notatka2);
				panel1.add(tekst2);
				panel2.add(notatka3);
				panel2.add(tekst3);
				przycisk18.setText("Zapisz");
				panel2.add(przycisk18);
				przycisk18.addActionListener(this);
				ramka.pack();
			}
			
			//zamienia dane wylosowane na dane wpisane przes studenta
			public void doDziela18(){
				try{
				String pesel=tekst1.getText();
				System.out.println(tekst1.getText());
				studenci=raz.odczytajStudenta();
				String wart=tekst3.getText();
				System.out.println(wart);
				String numer=tekst2.getText();
				int i=0;
				while(studenci[i]!=null){
					if(studenci[i].getPESEL().equals(pesel)){
						
						if(numer.equals("1")){int a=Integer.parseInt(wart);studenci[i].setczasmin(a);raz.zapiszdaneStudenta(studenci[i],i);}
						if(numer.equals("2")){int a=Integer.parseInt(wart);studenci[i].setczasmax(a); raz.zapiszdaneStudenta(studenci[i],i);}
						if(numer.equals("3")){studenci[i].setpriorytet(wart);raz.zapiszdaneStudenta(studenci[i],i);}
						raz.zapiszStudentow();
					
						JScrollPane przewijanie=new JScrollPane(arena1);
						arena1.setLineWrap(true);
						przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						panel.add(przewijanie);
						arena1.append(studenci[i].getKons());
					}
					i++;
					}
		        ramka.pack();
				}
				catch(NumberFormatException e){
					JFrame rama=new JFrame();
					rama.setSize(300,200);
					rama.setVisible(true);
					
					JLabel blad=new JLabel();
					blad.setText("Błąd.Musisz podać inne wartości");
					rama.add(blad);
					
				}
				}
        //przenosi do wpisywania pracownikow i studentow
			public void doDziela4(){
		Wpisywanie nowe=new Wpisywanie();
		nowe.doDziela();
		}
			
			
			
			
		//przenosi do wyszukiwania pracownikow
		public void doDziela5(){
			Wyszukiwanie szukaj=new Wyszukiwanie();
			szukaj.doDziela();
		}
		
		
		//łączy zapotrzebowanie na konsultacje z czasem wykłądowcy
		public void doDziela6(){
			String dzien=tekst1.getText();
			String [] elementy=dzien.split(" ");
			Data dzisiaj = new Data(Integer.parseInt(elementy[0]),Integer.parseInt(elementy[1]),Integer.parseInt(elementy[2]),Integer.parseInt(elementy[3]),Integer.parseInt(elementy[4]));
			long sekundy=dzisiaj.getdzisinmillis();
			Wyszukiwanie nowy=new Wyszukiwanie();
			ZapisOdczyt dwa=new ZapisOdczyt();
			pracownicy=dwa.odczytaj();
			int j=0;
			while(pracownicy[j]!=null && pracownicy[j] instanceof PracownikNaukowo_Dydaktyczny ){
				((PracownikNaukowo_Dydaktyczny)pracownicy[j]).ktorydzien(sekundy);
				((PracownikNaukowo_Dydaktyczny)pracownicy[j]).podzialKonsultacji();
				dwa.zapisz();
				j++;
			
			}
			ramka.pack();
			
		}
	
		
		
		//nakazuje wpisać date by umawiac konsultacje na terminy późniejsze niż ta data
		public void doDziela8(){
			panel.remove(przycisk21);
			panel.remove(przycisk12);
			panel.remove(przycisk3);
			panel.remove(notatka);
			panel.repaint();
			notatka.setText("Który dzisiaj jest dzień?(r m d g m)");
            panel.add(notatka);
            panel.add(tekst1);
            panel.add(przycisk25);
            przycisk25.setText("Zatwierdź");
            przycisk25.addActionListener(this);

            ramka.pack();
}}