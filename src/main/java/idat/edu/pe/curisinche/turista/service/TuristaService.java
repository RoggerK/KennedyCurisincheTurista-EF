package idat.edu.pe.curisinche.turista.service;

import java.util.List;

import idat.edu.pe.curisinche.turista.dto.TuristaDTO;

public interface TuristaService {
	public List<TuristaDTO> lista();
	public void guardar(TuristaDTO dto);
}
