package locationvoiture.services;

import java.util.List;

import locationvoiture.model.Location;

public interface LocationService {

	public List<Location> findAll();
	public Location save(Location location);
	public Location deleteById(Long id);
	public Location findById(Long id);
	
}
