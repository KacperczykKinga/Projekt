package Uczelnia;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.*;
import java.util.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Uczelnia.ZapisOdczyt;

public class Wyszukiwanie implements ActionListener {
	 PracownikUczelni[] pracownicy=new PracownikUczelni[10000000];
	 ZapisOdczyt odczyt=new ZapisOdczyt();
	ZapisOdczyt nowy = new ZapisOdczyt();
	//pracownicy=odczytyaj.odczytaj();
	//pracownicy=odczyt.odczytaj();
	JLabel notatka=new JLabel("");
	JLabel notatka2=new JLabel();
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
	JPanel panel3=new JPanel();
	JTextField tekst1=new JTextField(20);
	JTextArea arena1=new JTextArea(50,50);
    JFrame ramka2=new JFrame();
	public int lwykladowcow(){
		pracownicy=odczyt.odczytaj();
		int lwyk=0;
		while(pracownicy[lwyk]!=null) lwyk++;
		return lwyk;
	}
	 
	 public void actionPerformed(ActionEvent e){
		 if(e.getSource()==przycisk1){
			 czysc();
			 doDziela1();
		 }
		 if(e.getSource()==przycisk2){
			 czysc();
			 doDziela2();
		 }
         if(e.getSource()==przycisk3){
        	 czysc();
			 doDziela3();
		 }
		 if(e.getSource()==przycisk4){
			 czysc();
			 doDziela4();
		 }
         if(e.getSource()==przycisk5){
			 czysc();
			 doDziela5();
		 }
		 if(e.getSource()==przycisk6){
			 czysc();
			 doDziela6();
		 }
         if(e.getSource()==przycisk7){
			 czysc();
			 doDziela7();
		 }
		 if(e.getSource()==przycisk8){
			 czysc();
			 doDziela8();
		 }
         if(e.getSource()==przycisk9){
			 czysc();
			 doDziela9();
		 }
		 if(e.getSource()==przycisk10){
			 czysc();
			 doDziela10();
		 }
		 if(e.getSource()==przycisk11){
			 czysc();
			 doDziela11();
		 }
	 }
	public void doDziela(){
		//JFrame ramka2=new JFrame();
		ramka2.getContentPane().add(BorderLayout.CENTER,panel3);
		ramka2.setSize(335,385);
		ramka2.setVisible(true);
		ramka2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		notatka.setText("Wedlug czego chcesz wyszukac pracownika?");
		//panel.remove(przycisk12);
		//panel.remove(przycisk3);
		//panel.remove(przycisk21);
		notatka2.setText("Wpisz po jakiej wartosci chcesz szukać");
		przycisk1.setText("Imie");
		przycisk2.setText("Nazwisko");
		przycisk3.setText("Wiek");
		przycisk4.setText("Plec");
		przycisk5.setText("PESEL");
		przycisk6.setText("Pensja");
		przycisk7.setText("Zatrudnienie");
		przycisk8.setText("Stopien naukowy");
		przycisk9.setText("Pokoj pracy");
		przycisk10.setText("Sala do konsultacji");
		przycisk11.setText("Zakres obowiązków");
		panel3.add(notatka2);
		panel3.add(tekst1);
		panel3.add(notatka);
		panel3.add(przycisk1);
		panel3.add(przycisk2);
		panel3.add(przycisk3);
		panel3.add(przycisk4);
		panel3.add(przycisk5);
		panel3.add(przycisk6);
		panel3.add(przycisk7);
		panel3.add(przycisk8);
		panel3.add(przycisk9);
		panel3.add(przycisk10);
		panel3.add(przycisk11);
		przycisk1.addActionListener(this);
		przycisk2.addActionListener(this);
		przycisk3.addActionListener(this);
		przycisk4.addActionListener(this);
		przycisk5.addActionListener(this);
		przycisk6.addActionListener(this);
		przycisk7.addActionListener(this);
		przycisk8.addActionListener(this);
		przycisk9.addActionListener(this);
		przycisk10.addActionListener(this);
		przycisk11.addActionListener(this);
		ramka2.pack();
	}
	
	public void czysc(){
		panel3.remove(notatka);
		panel3.remove(przycisk1);
		panel3.remove(przycisk2);
		panel3.remove(przycisk3);
		panel3.remove(przycisk4);
		panel3.remove(przycisk5);
		panel3.remove(przycisk6);
		panel3.remove(przycisk7);
		panel3.remove(przycisk8);
		panel3.remove(przycisk9);
		panel3.remove(przycisk10);
		panel3.remove(przycisk11);
		panel3.remove(notatka2);
	}
	
	//szukanie pracowników o zadaanym imieniu
	public void doDziela1(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getimie()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szukanie pracowników o zadanym nazwisku
	public void doDziela2(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getnazwisko()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	
	//szukanie pracownikow o zadanym wieku
	public void doDziela3(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getwiek()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();
		}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	
	//szukanie pracownikow o zadanej płci
	public void doDziela4(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getplec()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();
		}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szukanie pracownika o zadanym PESELu
	public void doDziela5(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getPESEL()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();
		}catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szukanie pracownikow o zadanej pensji
	public void doDziela6(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getpensja())==Integer.parseInt(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szuaknie pracownikow o zadanym zatrudnieniu
	public void doDziela7(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if ( (pracownicy[a].getzatrudnienie()).equals(wartosc))
			{
			arena1.append(pracownicy[a].getwszystko());
			arena1.append("\n");
			}
		
		}
		ramka2.pack();
		}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szukanie pracownikow dydaktyczno-naukowych o zadanym stopniu naukowym
	public void doDziela8(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{
			if(pracownicy[a] instanceof PracownikNaukowo_Dydaktyczny) {
				PracownikNaukowo_Dydaktyczny jeden=(PracownikNaukowo_Dydaktyczny)pracownicy[a];if(jeden.getstopiennaukowy().equals(wartosc)){
					arena1.append(pracownicy[a].getwszystko());
					arena1.append("\n");
					
				}
		}
		}
		ramka2.pack();}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	
	//szukanie pracownikow administracji po zadanym pokoju
	public void doDziela9(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if(pracownicy[a] instanceof Pracownik_Administracji) {
			Pracownik_Administracji jeden=(Pracownik_Administracji)pracownicy[a];
			if(jeden.getPokoj()==Integer.parseInt(wartosc)){
					arena1.append(pracownicy[a].getwszystko());
					arena1.append("\n");
					
				}
		}
		}
		ramka2.pack();}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szuaknie pracownikow naukowo-dydaktyznych po zadanej sali
	public void doDziela10(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{
			if(pracownicy[a] instanceof PracownikNaukowo_Dydaktyczny) {
				PracownikNaukowo_Dydaktyczny jeden=(PracownikNaukowo_Dydaktyczny)pracownicy[a];if(jeden.getsala()==Integer.parseInt(wartosc)){
					arena1.append(pracownicy[a].getwszystko());
					arena1.append("\n");
					
				}
		}
		}
		ramka2.pack();
		}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(300,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
	
	//szukanie pracownikow administarcji o zadanym zajęciu
	public void doDziela11(){
		try{
		String wartosc=tekst1.getText();
		panel3.remove(tekst1);
		panel3.repaint();
		JScrollPane przewijanie=new JScrollPane(arena1);
		arena1.setLineWrap(true);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.add(przewijanie);
		for(int a=0;a<lwykladowcow();a++)
		{if(pracownicy[a] instanceof Pracownik_Administracji) {
			Pracownik_Administracji jeden=(Pracownik_Administracji)pracownicy[a];
			if(jeden.getCoRobi().equals(wartosc)){
					arena1.append(pracownicy[a].getwszystko());
					arena1.append("\n");
				}
		}
		}
		ramka2.pack();
		}
		catch(NumberFormatException e){
			JFrame rama=new JFrame();
			rama.setSize(100,100);
			rama.setVisible(true);
			
			JLabel blad=new JLabel();
			blad.setText("Błąd.Musisz podać wartości");
			rama.add(blad);
			
		}
	}
/*public void wyszukaj(int wybor, String wartosc){
	
	
	for(int i=0;i<10;i++){
		System.out.println(pracownicy[i]);
	}

}*/
public PracownikUczelni[] getTab(){
	return pracownicy;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Wyszukiwanie nowy=new Wyszukiwanie();
	
	}

}
