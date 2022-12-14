package idat.edu.pe.curisinche.turista.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.curisinche.turista.dto.TuristaDTO;
import idat.edu.pe.curisinche.turista.model.Turista;
import idat.edu.pe.curisinche.turista.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> lista() {
		return repository.findAll().stream()
						.map(t -> new TuristaDTO(t.getIdTurista(), t.getNombreTurista(), t.getNroCelular(), t.getDireccion()))
						.collect(Collectors.toList());
	}

	@Override
	public void guardar(TuristaDTO dto) {
		Turista turista = new Turista(0, dto.getNom(), dto.getCel(), dto.getDirec());
		repository.save(turista);
	}

}
