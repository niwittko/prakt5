
public class app {

	public static void main(String[] args) {
		
		Haus haus = new Haus("nicht eingebaut", "nicht eingebaut");
		haus.typAusgabe();
		System.out.println(haus.einbauen("Alarmanlage"));
		System.out.println();
		System.out.println("Klingelanlage: " + haus.getKlingelanlage());
		System.out.println("Alarmanlage: " + haus.getAlarmanlage());
		System.out.println("Türöffner: " + haus.getAutomatischerTueroffner());

	}

}
