package ejercicios_refuerzo;

import java.util.List;

public class AirplaneFileRepository implements AirplaneRepositoryInterface {

	@Override
	public List<Airplane> findAll() {
		// TODO ACCEDEMOS AL FICHERO AL FICHERO A POR LOS AVIONES
		return null;
	}

	@Override
	public Airplane findOne(int id) {
		// TODO ACCEDEMOS AL FICHERO A POR UN AVION SEGUN SU ID X
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO ELIMINAMOS UN AVION DEL FICHERO SEGUN SU ID X
		
	}

	@Override
	public List<Airplane> findByMarca(String marca) {
		// TODO ACCEDEMOS AL FICHERO A POR UN AVION SEGUN SU MARCA
		return null;
	}
}