
abstract class Gebaeude {

	private String typ, klingelanlage, alarmanlage, automatischerTueroffner;
	
	public Gebaeude(String klingelanlage, String alarmanlage, String automatischerTueroffner) {
		this.klingelanlage = klingelanlage;
		this.alarmanlage = alarmanlage;
		this.automatischerTueroffner = automatischerTueroffner;
	}

	public String getTyp() {
		return typ;
	}

	void setTyp(String typ) {
		this.typ = typ;
	}

	public String getKlingelanlage() {
		return klingelanlage;
	}

	void setKlingelanlage(String klingelanlage) {
		this.klingelanlage = klingelanlage;
	}

	public String getAlarmanlage() {
		return alarmanlage;
	}

	void setAlarmanlage(String alarmanlage) {
		this.alarmanlage = alarmanlage;
	}

	public String getAutomatischerTueroffner() {
		return automatischerTueroffner;
	}

	void setAutomatischerTueroffner(String automatischerTueroffner) {
		this.automatischerTueroffner = automatischerTueroffner;
	}
	
	public void typAusgabe() {
		System.out.println(typ);
	}
	
}
