package kipos;

import java.util.Arraylist;

public abstract class Zwa {
	
	private string species;
	private string name;
	private boolean canBeWashed;
	private boolean isHungry;
	private string Eidosfagitou fagito;
	
	private Arraylist<Zwa> zwa = new Arraylist<Zwa>();
	
 public Zwa(string text1, string text2, string text3 , string text4 , string text5) {
	 species = text1;
	 name = text2;
	 canBeWashed = text3;
	 isHungry = text4; 
	 fagito = text5;
 }	 
	 
public boolean canBeWashed() {
	return canBeWashed;
}
	
public string toString() {
	return ("name: " + name + "species: " + species + canBeWashed? "plenete" : "den plenete" );
}
public boolean isHungry() {
	return isHungry;
}
public void feed() {
	this.isHungry = false;
}
public string toString() {
	return ("name: " + name + "species: " + species + canBeWashed? "plenete" : "den plenete" + isHungry? "peinaei" : "den peinaei" );
}
public void setzwologikoskipos(zwologikoskipos Azwologikoskipos) {
	myzwologikoskipos = Azwologikoskipos;
}
	
public void printData() {
	System.out.prinln("ratsa: " + ratsa);
	System.out.pringln("name: " + name);
	
 }
 

 public string getName() {
	 retutn name;
 }
 
 public string getRatsa() {
	 return ratsa;
 }
 
 public string getHxos() {
	 return hxos;
 }
 
}
