package ejercicios_refuerzo;

public class AirplaneTest {

	public static void main(String[] args) {
		
		AirplaneRepositoryInterface airplaneBBDD = new BBDDRepositoryImpl();
		AirplaneRepositoryInterface airplaneFile = new AirplaneFileRepository();
	}
}