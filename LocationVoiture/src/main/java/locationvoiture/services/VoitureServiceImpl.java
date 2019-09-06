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
			return null;
		}
	
		@Override
		public Voiture save(Voiture voiture) {
			return null;
		}
	
		@Override
		public Voiture deleteById(Long id) {
			return null;
		}
	
		@Override
		public Voiture findById(Long id) {
			return null;
		}

}
