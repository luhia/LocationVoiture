package locationvoiture.services;

import java.util.List;

import locationvoiture.model.Voiture;

public interface VoitureService {

	public List<Voiture> findAll();
	public Voiture save(Voiture voiture);
	public Voiture deleteById(Long id);
	public Voiture findById(Long id);
	
}
