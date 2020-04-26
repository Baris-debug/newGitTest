import java.util.*;

class SortiereAngestelltenID implements Comparator<Angestellter> {

	@Override
	public int compare(Angestellter o1, Angestellter o2) {

		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}

	}
}

	class SortiereAngestelltenNamen implements Comparator<Angestellter> {

		@Override
		public int compare(Angestellter o1, Angestellter o2) {

			return o1.getName().compareTo(o2.getName());
		}

	}

	class SortiereAngestelltenGeburtsjahr implements Comparator<Angestellter> {

		@Override
		public int compare(Angestellter o1, Angestellter o2) {

			if (o1.getGeburtsJahr() > o2.getGeburtsJahr()) {
				return 1;
			} else if (o1.getGeburtsJahr() < o2.getGeburtsJahr()) {
				return -1;
			} else {
				return 0;
			}

		}
	}

public class AngestelltenListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Angestellter> angestelltenListe = new ArrayList<>();
		
		AngestelltenListe.addAngestellter(3, angestelltenListe);
		
		Collections.sort(angestelltenListe, new SortiereAngestelltenNamen());
		
		AngestelltenListe.getAngestellter(angestelltenListe);

	}

	public static void addAngestellter(int anzahl, Collection<Angestellter> col) {
		for (int i = 1; i <= anzahl; i++) {
			Scanner scanAngestellter = new Scanner(System.in);
			System.out.println("Bitte Namen eintippen: ");
			String name = scanAngestellter.next();
			System.out.println("Bitte id eintippen: ");
			int id = scanAngestellter.nextInt();
			System.out.println("Bitte Geburtsjahr eintippen: ");
			int geburtsJahr = scanAngestellter.nextInt();
			
			
			Angestellter angestellter = new Angestellter(id, name, geburtsJahr);
			col.add(angestellter);

		}
	}
	
	public static void getAngestellter(Collection<Angestellter> col) {
		for (Angestellter angestellter : col) {
			System.out.println("Angestellter" + angestellter);
			
		}
		
	}
	
	

}
