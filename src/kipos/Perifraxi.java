package kipos;

import java.util.ArrayList;

public class Perifraxi {
	
	private String name;
	private String tupos;
	
	private ArrayList<Zwa> Zwa = new ArrayList<>();
	
	public Perifraxi (String name, String tupos) {
		this.name = name;
		this.tupos = tupos;
	}
	
	public Zwa vresZwo(String name) throws ZwoNotFoundException {
		for(Zwa z : Zwa) {
			if (z.getName().equalsIgnoreCase(name)) {
				return z;
			}
		}
		
		throw new ZwoNotFoundException("zwo" + name + "den yparxei");
	}
	
	public String getName() {
		return name;
	}
	
	public String getTupos() {
		return tupos;
	}

	public ArrayList<Zwa> getZwa() {
		return Zwa;
	}

	public void setZwa(ArrayList<Zwa> zwa) {
		Zwa = zwa;
	}
	public void setZwo(Zwa zwa) {
		this.Zwa.add(zwa);
	}
}

