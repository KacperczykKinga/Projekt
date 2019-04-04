package Uczelnia;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Wpisywanie implements ActionListener{
	ZapisOdczyt mi=new ZapisOdczyt();
	PracownikUczelni[] pracownicy=new PracownikUczelni[500000];
	JFrame ramka=new JFrame();
JLabel notatka=new JLabel();
JLabel notatka1=new JLabel();
JLabel notatka2=new JLabel();
JLabel notatka3=new JLabel();
	JLabel notatka4=new JLabel();
	JLabel notatka5=new JLabel();
	JLabel notatka6=new JLabel();
	JLabel notatka7=new JLabel();
	JLabel notatka8=new JLabel();
	JLabel notatka9=new JLabel();
	JLabel notatka10=new JLabel();
	JLabel notatka11=new JLabel();
	JLabel notatka12=new JLabel();
	JLabel notatka13=new JLabel();
	JTextField tekst1=new JTextField(20);
	JTextField tekst2=new JTextField(20);
	JTextField tekst3=new JTextField(20);
	JTextField tekst4=new JTextField(20);
	JTextField tekst5=new JTextField(20);
	JTextField tekst6=new JTextField(20);
	JTextField tekst7=new JTextField(20);
	JTextField tekst8=new JTextField(20);
	JTextField tekst9=new JTextField(20);
	JTextField tekst10=new JTextField(20);
	JTextField tekst11=new JTextField(20);
	JTextField tekst12=new JTextField(20);
	JTextField tekst13=new JTextField(20);
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JButton przycisk1=new JButton();
	JButton przycisk2=new JButton();
	JButton przycisk3=new JButton();
	JButton przycisk4=new JButton();
	JButton przycisk5=new JButton();
	JButton przycisk6=new JButton();
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==przycisk1){
			doDziela2();
	}
		if(e.getSource()==przycisk2){
			doDziela3();
		}
		if(e.getSource()==przycisk3){
			doDziela4();
		}
		if(e.getSource()==przycisk4){
			doDziela5();
		}
		if(e.getSource()==przycisk5){
			doDziela6();
		}
		if(e.getSource()==przycisk6){
			doDziela7();
		}
		}
public void wpisz(){

     Wpisywanie wpis=new Wpisywanie();
     wpis.doDziela();
}

	//	Scanner dowszystkiego=new Scanner(System.in);
	//	String taknie="nie";
		
		
	//	while(taknie.equals("nie")){
			//pobiera dane osoby
		//	System.out.println(" ");
public void doDziela(){
	ramka.setSize(335,565);
	ramka.setVisible(true);
	ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ramka.getContentPane().add(BorderLayout.CENTER,panel);
			notatka.setText("Kogo chcesz wprowadzić?");
			przycisk1.setText("PracownikAdministaracji");
			przycisk2.setText("PracownikNaukowo-Dydaktyczny");
			przycisk3.setText("Studenta");
			panel.add(notatka);
			panel.add(przycisk1);
			panel.add(przycisk2);
			panel.add(przycisk3);
			przycisk1.addActionListener(this);
			przycisk2.addActionListener(this);
			przycisk3.addActionListener(this);
			ramka.pack();
}

//pobiera dane pracownika administracji

public void doDziela2(){
	panel.remove(notatka);
	panel.remove(przycisk1);
	panel.remove(przycisk2);
	panel.remove(przycisk3);
	panel.repaint();
	notatka1.setText("Imie");
	notatka2.setText("Nazwisko");
	notatka3.setText("RokUrodzenia");
	notatka4.setText("Plec");
	notatka5.setText("PESEL");
	notatka6.setText("Pensja");
	notatka7.setText("Zatrudnienie");
	notatka12.setText("Pokoj");
	notatka13.setText("Co robi");
	przycisk4.setText("Zapisz");
	przycisk4.addActionListener(this);
	//panel.add(notatka);
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	panel.add(panel1);
	panel.add(panel2);
	panel.add(panel3);
	panel1.add(notatka1);panel1.add(tekst1);
	panel1.add(notatka2);panel1.add(tekst2);
	panel1.add(notatka3);panel1.add(tekst3);
	panel2.add(notatka4);panel2.add(tekst4);
	panel2.add(notatka5);panel2.add(tekst5);
	panel2.add(notatka6);panel2.add(tekst6);
	panel3.add(notatka7);panel3.add(tekst7);
	panel3.add(notatka12);panel3.add(tekst12);
	panel3.add(notatka13);panel3.add(tekst13);
	panel3.add(przycisk4);
	ramka.pack();
}

//zapisuje dane pracownika administracji

public void doDziela5(){
	try{
	String imie=tekst1.getText();
	String nazwisko=tekst2.getText();
	String rokurodzenia=tekst3.getText();
	String plec=tekst4.getText();
	String PESEL=tekst5.getText();
	String pensja=tekst6.getText();
	System.out.println(nazwisko);
	String zatrudnienie=tekst7.getText();
	String pokoj=tekst12.getText();
	String CoRobi=tekst13.getText();
	Pracownik_Administracji a=new Pracownik_Administracji(imie,nazwisko,Integer.parseInt(rokurodzenia),plec,PESEL,Integer.parseInt(pensja),zatrudnienie,Integer.parseInt(pokoj),CoRobi);
	System.out.println(a.getimie());
	mi.odczytaj();
     mi.zapisz(a);
     
	}
	catch(NumberFormatException e){
		JFrame rama=new JFrame();
		rama.setSize(200,100);
		rama.setVisible(true);
		
		JLabel blad=new JLabel();
		blad.setText("Błąd.Musisz podać wartości.");
		rama.add(blad);
	}
	catch(InputMismatchException ex){
		JFrame rama=new JFrame();
		rama.setSize(200,100);
		rama.setVisible(true);
		
		JLabel blad=new JLabel();
		blad.setText("Błąd.Podałeś złe typy wartosci.");
		rama.add(blad);
	}

}
			

//pobiera dane pracownika naulowo-dyaktycznego
			public void doDziela3(){
				panel.remove(notatka);
				panel.remove(przycisk1);
				panel.remove(przycisk2);
				panel.remove(przycisk3);
				notatka1.setText("Imie");
				notatka2.setText("Nazwisko");
				notatka3.setText("Rok Urodzenia");
				notatka4.setText("Plec");
				notatka5.setText("PESEL");
				notatka6.setText("Pensja");
				notatka7.setText("Zatrudnienie");
				notatka10.setText("Sala do konsultacji");
				notatka11.setText("Podaj date dwóch pierwszych konsultacji(r m d g m) oraz czas ich trwania wyrażony w minutach(min 40 minut jednej konsultacji)");
				przycisk6.setText("Zapisz");
				panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
				panel.add(panel1);
				panel.add(panel2);
				panel.add(panel3);
				panel.add(panel4);
				panel1.add(notatka1);panel1.add(tekst1);
				panel1.add(notatka2);panel1.add(tekst2);
				panel1.add(notatka3);panel1.add(tekst3);
				panel2.add(notatka4);panel2.add(tekst4);
				panel2.add(notatka5);panel2.add(tekst5);
				panel2.add(notatka6);panel2.add(tekst6);
				panel3.add(notatka7);panel3.add(tekst7);
				panel3.add(notatka8);panel3.add(tekst8);
				panel3.add(notatka10);panel3.add(tekst10);
				panel4.add(notatka11);panel4.add(tekst11);
				panel4.add(przycisk6);
				przycisk6.addActionListener(this);
				ramka.pack();
							}
			
	//		zapisuje dane pracownika naulowo-dyaktycznego
			
			public void doDziela7(){
				try{
			String imie=tekst1.getText();
			String nazwisko=tekst2.getText();
			int rokurodzenia=Integer.parseInt(tekst3.getText());
			String plec=tekst4.getText();
			String PESEL=tekst5.getText();
			int pensja=Integer.parseInt(tekst6.getText());
			String zatrudnienie=tekst7.getText();
			String stopiennaukowy=tekst8.getText();
			int sala=Integer.parseInt(tekst10.getText());
			String konsultacje=tekst11.getText();
			String[] elementy2=konsultacje.split(" ");
			PracownikNaukowo_Dydaktyczny aa=new PracownikNaukowo_Dydaktyczny(imie,nazwisko,rokurodzenia,plec,PESEL,pensja,zatrudnienie,stopiennaukowy,sala);
			aa.setGodziny(Integer.parseInt(elementy2[0]),Integer.parseInt(elementy2[1]),
			Integer.parseInt(elementy2[2]),Integer.parseInt(elementy2[3]),Integer.parseInt(elementy2[4]),
			Integer.parseInt(elementy2[5]),Integer.parseInt(elementy2[6]),Integer.parseInt(elementy2[7]),
			Integer.parseInt(elementy2[8]),	Integer.parseInt(elementy2[9]),Integer.parseInt(elementy2[10]),
					Integer.parseInt(elementy2[11]));
			mi.odczytaj();
			mi.zapisz(aa);
				}
				catch(NumberFormatException e){
					JFrame rama=new JFrame();
					rama.setSize(200,100);
					rama.setVisible(true);
					
					JLabel blad=new JLabel();
					blad.setText("Błąd.Musisz podać wartości");
					rama.add(blad);
					
				}
				catch(InputMismatchException ex){
					JFrame rama=new JFrame();
					rama.setSize(300,100);
					rama.setVisible(true);
					
					JLabel blad=new JLabel();
					blad.setText("Błąd.Podałeś złe typy wartosci.");
					rama.add(blad);
				}
				
			}
			
			
			
			public void doDziela4(){
				panel.remove(notatka);
				panel.remove(przycisk1);
				panel.remove(przycisk2);
				panel.remove(przycisk3);
				notatka1.setText("Imie");
				notatka2.setText("Nazwisko");
				notatka3.setText("Rok Urodzenia");
				notatka4.setText("Plec");
				notatka5.setText("PESEL");
				notatka6.setText("Podaj rok studiów");		
				notatka7.setText("Podaj jaki kierunek");
				przycisk5.setText("Zapisz");
				przycisk5.addActionListener(this);
				panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
				panel.add(panel1);
				panel.add(panel2);
				panel.add(panel3);
				panel1.add(notatka1);panel1.add(tekst1);
				panel1.add(notatka2);panel1.add(tekst2);
				panel1.add(notatka3);panel1.add(tekst3);
				panel2.add(notatka4);panel2.add(tekst4);
				panel2.add(notatka5);panel2.add(tekst5);
		        panel2.add(notatka6);panel2.add(tekst6);
		        panel3.add(notatka7);panel3.add(tekst7);
		        panel3.add(przycisk5);
		        ramka.pack();
			}
			
			//zapisuje dame studenta
			
			public void doDziela6(){
			
				try{
				String imie=tekst1.getText();
				String nazwisko=tekst2.getText();
				int rokurodzenia=Integer.parseInt(tekst3.getText());
				String plec=tekst4.getText();
				String PESEL=tekst5.getText();
				int roks=Integer.parseInt(tekst6.getText());
		    	String kierunek=tekst7.getText();
				Student b=new Student(imie,nazwisko,rokurodzenia,plec,PESEL,roks,kierunek);
				b.losujwykladowcow();
				mi.odczytajStudenta();
				mi.zapiszStudenta(b);
				System.out.println(b.getimie());
				}
				catch(InputMismatchException ex){
					JFrame rama=new JFrame();
					rama.setSize(400,200);
					rama.setVisible(true);
					
					JLabel blad=new JLabel();
					blad.setText("Błąd.Podałeś złe typy wartosci.");
					rama.add(blad);
				}
				catch(NumberFormatException e){
					JFrame rama=new JFrame();
					rama.setSize(300,200);
					rama.setVisible(true);
					
					JLabel blad=new JLabel();
					blad.setText("Błąd.Musisz podać wartości");
					rama.add(blad);
					
				}
				
			}	

}