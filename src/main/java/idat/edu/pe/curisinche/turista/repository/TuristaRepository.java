package idat.edu.pe.curisinche.turista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.curisinche.turista.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
