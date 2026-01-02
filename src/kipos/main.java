package kipos;

public class main {

    public static void main(String[] args) {
        // ο ορισμος ενος instance ειναι της μορφης Class name = new Class();
//        thilastika L2 = new thilastika("skilos", "skilliiii", true);

        // Σε ολες τις γλωσσες υπαρχει ενας ατυπος κανονας
        // Οι κλασεις ξεκινανε με κεφαλαιο
        // τα instances με μικρο
        //Παντα ακολουθουμε camelCase δηλαδη oParisLeeiOtiHKatheLejiJekinaMeKefailaio
        Eidosfagitou eidosfagitou = new Eidosfagitou("skata");
        thilastika lion = new thilastika("babis", "lion", "grrr", false, true, eidosfagitou);
        lion.makeSound();
        thilastika cat = new thilastika("pepa", "cat", "meow", false, true ,eidosfagitou);
        cat.makeSound();

        Perifraxi perifraxi = new Perifraxi("gates", "atsali");
        perifraxi.setZwo(lion);
        perifraxi.setZwo(cat);

        Perifraxi perifraxi2 = new Perifraxi("pingouinoi" , "giali");


        zwologikoskipos myzwologiskos = new zwologikoskipos();
        myzwologiskos.addPerifraxeis(perifraxi);

        myzwologiskos.pleneteOlaTaZwa();
        try {
            Zwa find = perifraxi.vresZwo("pepa");
            System.out.println(find.isCanBeWashed());
        } catch (ZwoNotFoundException e) {
            System.out.println("sorry mallon aplito");
        }
        Eidosfagitou fagitoPeng = new Eidosfagitou("fish");

        amfivia peg = new amfivia("jhon" , "penguin" , "mprr" , true , false , fagitoPeng , 5);
        perifraxi2.setZwo(peg);
        System.out.println("is it hungry?" + peg.isHungry());
        System.out.println(peg.getAuga());
        System.out.println("trwi " + peg.getEidosFagitou().getfagito());

        System.out.println("trwi " + cat.getEidosFagitou().getfagito());


        Entoma muga =new Entoma("stelios", "iptamena", "bzzzz", false, true, eidosfagitou, true, 10);
        muga.makeSound();

        Entoma mirmigi =new Entoma("mitsos", "edafous", "krrr", false, true, eidosfagitou, false, 0);
        mirmigi.makeSound();


//     P1 = new amfivia("penguin", "jhon", false , true);

//     System.out.println(lion);
//     System.out.println(penguin);
//     System.out.println("taizoume to liontari","taizoume ton pingouino");
//
//     lion.feed();
//     penguin.feed();
//
//     lion.makeSound();
//     penguin.makesound();
//
//     System.out.println(lion);
//     System.out.println(penguin);
//
//     zwologikoskipos ZK = new zwologikoskipos("PER");
//
//     L1.addzwologikoskipos(ZK);
//     P1.addzwologikoskipos(ZK);
//
//     zwologikoskipos.pleneteOlaTaZwa();
//

//
//	}
//	private Arraylist<Zwa> zwa = new Arraylist<Zwa>() {
//
//	}
//
//	lion.add(Zwa);
//     penguin.add(Zwa);
    }
}
