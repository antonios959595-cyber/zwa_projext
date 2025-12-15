package kipos;

import java.util.Arraylist;

public class Perifraxi {
	
	private string name;
	private string tupos;
	
	private Arraylist<Zwo> Zwa = new Arraylist<>();
	
	public Perifraxi (string name, string tupos) {
		this.name = name;
		this.tupos = tupos;
		
	}
	
	public Zwo vresZwo(string name) throws ZwoNotFoundException {
		
		for(Zwo z : Zwa) {
			if (z.getName().equalsIgnoreCase(name)) {
				return z;
			}
		}
		
		throw new ZwoNotFoundException("zwo" + name + "den yparxei");
	}
	
	public string getName() {
		return name;
		
		
	}
	
	public string getTupos() {
		return tupos;
		
	}
	
	


}

