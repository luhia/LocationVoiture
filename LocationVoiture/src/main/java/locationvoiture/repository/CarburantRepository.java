package locationvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import locationvoiture.model.Carburant;

public interface CarburantRepository extends JpaRepository<Carburant, Long>{

}
