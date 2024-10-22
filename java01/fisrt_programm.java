package java01;

public class fisrt_programm {
	//String args;
	public static void main(String[] args) {
		// main ->μέθοδος
		//public -> η μέθοδος main είναι προσβάσιμη από οποιαδήποτε άλλη κλάση
		// static-> η μέθοδος main ανήκει στην κλάση first_programm και όχι 
		// σε κάποιο αντικείμενο
		//(String[] args) -> Δημιουργείται ένας πίνακας από συμβολοσειρές
		
        // Εμφάνιση ενός μηνύματος στην κονσόλα
		 System.out.println("Γειά σου, Κόσμε!");

        // Ανάγνωση επιχειρημάτων από τη γραμμή εντολών
        for (String arg : args) {
            System.out.println("Επιχείρημα: " + arg);
        }
    }
}
