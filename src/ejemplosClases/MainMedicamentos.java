package ejemplosClases;

//import java.util.Date;

/**
 * Clase Main para los medicamentos.
 */
public class MainMedicamentos {

	public static void main(String[] args) {
		
		System.out.println("MEDICAMENTOS");
		
		Medicamento m1 = new Medicamento("LIPLAT 10MG 28 COMPRIMIDOS");
		Medicamento m2 = new Medicamento("TILAVIST 20MG 5ML COLIRIO", 7017);
		Medicamento m3 = new Medicamento("OLANZAPINA FLAS CINFA 15 MG COMPRIMIDOS BUCODISPERSABLES , 28 comprimidos", 111, "OLANZAPINA");
		// Medicamento m4 = new Medicamento("OLANZAPINA FLAS CINFA 15 MG COMPRIMIDOS BUCODISPERSABLES , 28 comprimidos", 111, "OLANZAPINA");
		
		String medicamentoTexto = m3.toString();
		String nameMed = m1.getName();
		String nameMed1 = m2.getName();
		
		boolean isTrue = m1.equals(m2);
		
		System.out.printf("%s\n", medicamentoTexto);	
		System.out.printf("-> El medicamento %s es igual al medicamento %s: %b\n", nameMed, nameMed1, isTrue);
		
		int codLab = m2.getLabCode();
		
		System.out.printf("-> El codigo de laboratorio de %s es %d\n", nameMed, codLab);
		
		m2.setLabCode(1209);
		int codLab2 = m2.getLabCode();
		
		System.out.printf("-> Y luego es %d", codLab2);	
	}
}