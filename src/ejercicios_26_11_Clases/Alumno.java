package ejercicios_26_11_Clases;

/**
 * - Nombre
 * - Edad
 * - Es online o presencial
 * - Años de experiencia
 * - Nacionalidad
 */
public class Alumno {
	
	private String name;
	private int age;
	private boolean isOnline;
	private int yearsOfExperience;
	private String nationality;
	// private String esOnline;
	public String wifiPassword;
	
	public Alumno(String name) {
		this.name = name;
	}
	
	public Alumno(String name, String nationality) {
		this.name = name;
		this.nationality = nationality;
	}
	
	public Alumno(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setIsOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	
	public boolean getIsOnline() {
		return this.isOnline;
	}
	
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public int getYearsOfExperience() {
		return this.yearsOfExperience;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return this.nationality;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Alumno)) {
			return false;
		}
		
		Alumno alu = (Alumno) obj;
		
		if (alu.name == null || alu.nationality == null) {
			return false;			
		}
		
		boolean isTrue = alu.name.equals(this.name) && alu.nationality.equals(this.nationality);
		
		return isTrue;
	}
	
	@Override
	public String toString() {
		
		return "Hola, me llamo " + this.name + "\n" +
		"Tengo " + this.age + " años\n" +
				"Y mi nacionalidad es " + this.nationality;
	}
}