package locationvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import locationvoiture.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
