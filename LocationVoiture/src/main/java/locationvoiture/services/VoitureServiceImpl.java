package locationvoiture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import locationvoiture.model.Voiture;
import locationvoiture.repository.VoitureRepository;


@Service
public class VoitureServiceImpl implements VoitureService{
	
		@Autowired
		private VoitureRepository voitureRepository;

		@Override
		public List<Voiture> findAll() {
			return voitureRepository.findAll();
		}
	
		@Override
		public Voiture save(Voiture voiture) {
			return voitureRepository.save(voiture);
		}
	
		@Override
		public Voiture deleteById(Long id) {
			Voiture temp = findById(id);
			voitureRepository.deleteById(id);
			return temp;
		}
	
		
		@Override
		public Voiture findById(Long id) {
			return voitureRepository.findById(id).get();
		}

}
