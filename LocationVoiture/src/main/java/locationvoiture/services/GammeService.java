package locationvoiture.services;

import java.util.List;

import locationvoiture.model.Gamme;


public interface GammeService {

	public List<Gamme> findAll();
	public Gamme save(Gamme gamme);
	public Gamme deleteById(Long id);
	public Gamme findById(Long id);
	
}
