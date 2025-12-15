package kipos;

public class main {

	public static void main(String[] args) {
		
	 L1= new thilastika("lion", "babis", true , true);
     P1 = new amfivia("penguin", "jhon", false , true);
     
     System.out.println(lion);
     System.out.println(penguin);
     System.out.println("taizoume to liontari","taizoume ton pingouino");
     
     lion.feed();
     penguin.feed();
     
     lion.makeSound();
     penguin.makesound();
     
     System.out.println(lion);
     System.out.println(penguin);
     
     zwologikoskipos ZK = new zwologikoskipos("PER");
     
     L1.addzwologikoskipos(ZK);
     P1.addzwologikoskipos(ZK);
     
     zwologikoskipos.pleneteOlaTaZwa();
     


	}
	private Arraylist<Zwa> zwa = new Arraylist<Zwa>() {
		
	}
     
	lion.add(Zwa);
     penguin.add(Zwa);
}
