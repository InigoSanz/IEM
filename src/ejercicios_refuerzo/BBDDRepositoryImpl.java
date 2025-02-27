package ejercicios_refuerzo;

import java.util.List;

public class BBDDRepositoryImpl implements AirplaneRepositoryInterface {

	@Override
	public List<Airplane> findAll() {
		// TODO ACCEDEMOS A LA BBDD A POR LOS AVIONES
		return null;
	}

	@Override
	public Airplane findOne(int id) {
		// TODO ACCEDEMOS A LA BBDD A POR EL AVION CON ID X
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO ELIMINAMOS UN AVION DE LA BBDD CON ID X
		
	}

	@Override
	public List<Airplane> findByMarca(String marca) {
		// TODO ACCEDEMOS A LA BBDD A POR UN AVION SEGUN SU MARCA
		return null;
	}
}