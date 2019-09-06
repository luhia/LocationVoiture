package locationvoiture.services;

import java.util.List;

import locationvoiture.model.Categorie;

public interface CategorieService {
	
	public List<Categorie> findAll();
	public Categorie save(Categorie categorie);
	public Categorie deleteById(Long id);
	public Categorie findById(Long id);

}
