package locationvoiture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import locationvoiture.model.Location;
import locationvoiture.repository.LocationRepository;

public class LocationServiceImp implements LocationService{

	
		@Autowired
		public LocationRepository locationRepository;
	
		@Override
		public List<Location> findAll() {
			return locationRepository.findAll();
		}
	
		@Override
		public Location save(Location location) {
			return locationRepository.save(location);
		}
	
		@Override
		public Location deleteById(Long id) {
			Location temp = findById(id);
			locationRepository.deleteById(id);
			return temp;
		}
	
		@Override
		public Location findById(Long id) {
			return locationRepository.findById(id).get();
		}

}
