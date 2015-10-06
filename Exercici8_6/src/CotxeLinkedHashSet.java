
import java.util.LinkedHashSet;

/*
 * CotxeLinkedHashSet.java        1.0 22/09/2015
 *
 * class CotxeLinkedHashSet
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
public class CotxeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <Cotxe> car = new LinkedHashSet<Cotxe>();
		//Creem els 5 objectes 
		Cotxe cAlfa = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		Cotxe cDacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		Cotxe cFord = new Cotxe("Ford", "Focus", 2000, 4);
		Cotxe cOpel = new Cotxe("Opel", "Insignia", 2200, 4);
		Cotxe cIbiza = new Cotxe("Seat", "Ibiza", 1600, 4);
		//Omplim el hashSet amb els objectes
		car.add(cAlfa);
		car.add(cDacia);
		car.add(cFord);
		car.add(cOpel);
		car.add(cIbiza);
		//Imprimim
		for ( Cotxe carHash : car){
			System.out.println(carHash.toString());
		}
		System.out.println("\n");
		//Afegim dos objectes més
		Cotxe cHyundai = new Cotxe("Hyundai", "Atos", 1500, 3);
		Cotxe cFord2 = new Cotxe("Ford", "Focus", 2000, 4);
		car.add(cHyundai);
		car.add(cFord2);
		//Imprimim
		for ( Cotxe carHash : car){
			System.out.println(carHash.toString());
		}
		//Provem si es pot duplicar
		Cotxe cAlfa2 = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		car.add(cAlfa2);
		if(car.add(cAlfa2)){
			System.out.println("\nL'objecte ha estat insertat\n");
		} else {
			System.out.println("\nL'objecte no ha estat insertat, llavors no es pot duplicar un objecte!\n");
		}
		System.out.println("La cua surt ordenada tal com hem insertat els objectes, llavors és una FIFO");
	}

}
