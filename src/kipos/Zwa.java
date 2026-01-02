package kipos;


public abstract class Zwa {
	
	private String species;
	private String name;
	private boolean canBeWashed;
	private boolean isHungry;
	private String sound;
//	private String Eidosfagitou fagito; //Ενας τυπος ανα πεδιο
	private Eidosfagitou fagito;
	
 public Zwa(String name, String species, String sound, boolean text3 , boolean text4 , Eidosfagitou text5) {
	 //Οι μεταβλητες σου να εχουν παντα νοημα δηλαδη οχι text1 αλλα species
	 this.species = species;
	 this.sound = sound;
	 this.name = name;
	 canBeWashed = text3;
	 isHungry = text4; 
	 fagito = text5;
 }


public void setCanBeWashed(boolean washed) {
	this.canBeWashed = washed;
}

public String toString() {
	return ("name: " + name + "species: " + species + (canBeWashed? "plenete" : "den plenete") );
}

public boolean isHungry() {
	return isHungry;
}
public void feed() {
	this.isHungry = false;
}
public String toString2() {
	 String plenete = canBeWashed? "plenete" : "den plenete";
	return ("name: " + name + "species: " + species + plenete + (isHungry? "peinaei" : "den peinaei") );
}

public Eidosfagitou getEidosFagitou() {
	 return fagito;
	}
//public void setzwologikoskipos(zwologikoskipos Azwologikoskipos) {
//	myzwologikoskipos = Azwologikoskipos;
//}
	
//public void printData() {
//	System.out.prinln("ratsa: " + ratsa);
//	System.out.pringln("name: " + name);
//
// }
 

 public String getName() {
	 return name;
 }
 
 public String getRatsa() {
	 return species;
 }
 
 public String getSound() {
	 return sound;
 }

 public boolean isCanBeWashed() {
		return canBeWashed;
	}
}
