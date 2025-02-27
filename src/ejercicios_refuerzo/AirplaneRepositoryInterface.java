package ejercicios_refuerzo;

import java.util.List;

public interface AirplaneRepositoryInterface {
	
	public List<Airplane> findAll();
	
	public Airplane findOne(int id);
	
	public void delete(int id);
	
	public List<Airplane> findByMarca(String marca);
}