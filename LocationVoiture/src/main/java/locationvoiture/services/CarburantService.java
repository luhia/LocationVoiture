package locationvoiture.services;

import java.util.List;

import locationvoiture.model.Carburant;

public interface CarburantService {
	
	public List<Carburant> findAll();
	public Carburant save(Carburant carburant);
	public Carburant deleteByid(Long id);
	public Carburant findById(Long id);

}
