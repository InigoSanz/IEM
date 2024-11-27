package ejemplosClases;

import java.util.Date;

/**
 * Clase para los medicamentos.
 */
public class Medicamento {
	
	private String name;
	private int labCode;
	private Date dischargeDate;
	private String activeIngredient;
	
	public Medicamento(String name) {
		this.name = name;
	}
	
	public Medicamento(String name, int labCode) {
		this.name = name;
		this.labCode = labCode;
	}
	
	public Medicamento(String name, int labCode, String activeIngredient) {
		this.name = name;
		this.labCode = labCode;
		this.activeIngredient = activeIngredient;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLabCode(int labCode) {
		this.labCode = labCode;
	}
	
	public int getLabCode() {
		return this.labCode;
	}
	
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
	public Date getDischargeDate() {
		return this.dischargeDate;
	}

	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}
	
	public String getActiveIngredient() {
		return this.activeIngredient;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Medicamento)) {
			return false;
		}
		
		Medicamento m = (Medicamento) obj;
		
		if (this.activeIngredient == null) {
			return false;
		}
		
		boolean isTrue = m.activeIngredient.equals(this.activeIngredient);
		
		return isTrue;
	}
	
	@Override
	public String toString() {
		
		return "El medicamento se llama: " + this.name + "\n" +
		"Su código de laboratorio es: " + this.labCode + "\n" + 
/*				"Se dio de alta el " + this.dischargeDate + "\n" + */
		"Y el principio activo que lo compone es el/la " + this.activeIngredient + "\n";		
	}
}