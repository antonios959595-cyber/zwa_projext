package kipos;

public class Entoma extends Zwa {

    private boolean canBeFly;
    private int avga;

     public Entoma(String name, String species, String sound, boolean canBeWashed , boolean isHungry , Eidosfagitou fagito, boolean canBeFly, int avga) {
         super(name, species, sound, canBeWashed , isHungry , fagito);
         this.canBeFly = canBeFly;
         this.avga = avga;
     }

    public int getAvga() {
        return avga;
    }

    public void setAvga(int avga) {
        this.avga = avga;
    }

    public boolean isCanBeFly() {
        return canBeFly;
    }

    public void setCanBeFly(boolean canBeFly) {
        this.canBeFly = canBeFly;
    }
    public void makeSound() {
         if(canBeFly) {
             System.out.println("petadw dipla apo to afti soy kai kanw : " + getSound());
         }
         else {
             System.out.println("den petaw panw apo to afti soy kai den kanw hxo");
         }
    }
}
