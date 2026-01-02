package kipos;

public class amfivia extends Zwa {
  private Integer auga;

	public amfivia(String name, String species, String sound, boolean canBeWashed, boolean hungry, Eidosfagitou fagito, Integer auga) {
        super(name, species, sound, hungry, canBeWashed , fagito);
        this.auga = auga;
	}
    public Integer getAuga() {
        return auga;
    }


	public void makeSound() {
        System.out.println(super.getName() + "i am penguin prrr");
    }

}
