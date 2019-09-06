package locationvoiture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import locationvoiture.model.Categorie;
import locationvoiture.repository.CategorieRepository;

public class CategorieServiceImp implements CategorieService{

		@Autowired
		private CategorieRepository categorieRepository;
	
	
		@Override
		public List<Categorie> findAll() {
			return categorieRepository.findAll();
		}
	
		@Override
		public Categorie save(Categorie categorie) {
			return categorieRepository.save(categorie);
		}
	
		@Override
		public Categorie deleteByid(Long id) {
			Categorie temp = findById(id);
			categorieRepository.deleteById(id);
			return temp;
		}
	
		@Override
		public Categorie findById(Long id) {
			return categorieRepository.findById(id).get();
		}

}
