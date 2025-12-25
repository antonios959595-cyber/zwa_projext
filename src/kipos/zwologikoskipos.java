package kipos;

import java.util.ArrayList;

public class zwologikoskipos {
	
	private ArrayList<Perifraxi> perifraxeis = new ArrayList();

	public zwologikoskipos() {
	}

	public void addPerifraxeis(Perifraxi per) {
		this.perifraxeis.add(per);
	}

	public void pleneteOlaTaZwa() {
		System.out.println("plusimo olws twn zwwn");
		for (Perifraxi per : perifraxeis) {
			for (Zwa z : per.getZwa()) {
				z.setCanBeWashed(true);
			}
		}
	}

}
