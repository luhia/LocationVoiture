package locationvoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import locationvoiture.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
