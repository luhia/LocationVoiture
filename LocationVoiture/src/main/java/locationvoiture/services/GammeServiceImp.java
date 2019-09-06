package locationvoiture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import locationvoiture.model.Gamme;
import locationvoiture.repository.GammeRepository;

public class GammeServiceImp implements GammeService{

	
		@Autowired
		public GammeRepository gammeRepository;
	
		@Override
		public List<Gamme> findAll() {
			return gammeRepository.findAll();
		}
	
		@Override
		public Gamme save(Gamme gamme) {
			return gammeRepository.save(gamme);
		}
	
		@Override
		public Gamme deleteById(Long id) {
			Gamme temp = findById(id);
			gammeRepository.deleteById(id);
			return temp;
		}
	
		@Override
		public Gamme findById(Long id) {
			return gammeRepository.findById(id).get();
		}

}
