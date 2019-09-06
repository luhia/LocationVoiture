package locationvoiture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import locationvoiture.model.Carburant;
import locationvoiture.repository.CarburantRepository;

public class CarburantServiceImp implements CarburantService{

		@Autowired
		private CarburantRepository carburantRepository;
		
		
		@Override
		public List<Carburant> findAll() {
			return carburantRepository.findAll();
		}
	
		@Override
		public Carburant save(Carburant carburant) {
			return carburantRepository.save(carburant);
		}
	
		@Override
		public Carburant deleteById(Long id) {
			Carburant temp = findById(id);
			carburantRepository.deleteById(id);
			return temp;
		}
	
		@Override
		public Carburant findById(Long id) {
			return carburantRepository.findById(id).get();
		}

}
