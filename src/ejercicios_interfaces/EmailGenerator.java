package ejercicios_interfaces;

/**
 * @author Inigo Sanz
 * 
 * Segundo apellido, primer apellido y nombre de:
 * - smithdoejhon@iembs.com
 */
public class EmailGenerator implements EmailGeneratorInterface{
	
	@Override
	public String generate(User user) {
		
		String email = user.getSecondSurname() + user.getFirstSurname() + user.getName() + "@iembs.com";
		
		return email;
	}
}