package locationvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import locationvoiture.model.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
