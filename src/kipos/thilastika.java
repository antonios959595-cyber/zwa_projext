package kipos;

public class thilastika extends Zwa {
	
	public thilastika(String name, String species, String sound, boolean canBeWashed, boolean hungry, Eidosfagitou fagito) {
		super(name, species, sound, hungry, canBeWashed , fagito);
	}
	
public void makeSound() {
	System.out.println(super.getName() + " i am a "+ super.getRatsa() + " " + super.getHxos());
}

}
