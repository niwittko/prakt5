
public class Haus extends Gebaeude implements Einbau {

	public Haus(String alarmanlage, String automatischerTueroffner) {
		super("eingebaut", alarmanlage, automatischerTueroffner);
		super.setTyp("Haus");
	}

	@Override
	public void typAusgabe() {
		System.out.println("Das Objekt hat folgenden Typ: ");
		super.typAusgabe();
		
	}
	
	@Override
	public String einbauen(String gebaeudeElement) {
		switch(gebaeudeElement) {
		case "Alarmanlage":
			super.setAlarmanlage("eingebaut");
			break;
		case "Klingelanlage":
			super.setKlingelanlage("eingebaut");
			break;
		case "automatischerTueroffner":
			super.setAutomatischerTueroffner("eingebaut");
			break;
		default: gebaeudeElement = "Unbekanntes Objekt";
		}
		return gebaeudeElement + " wurde eingebaut";
	}

}
