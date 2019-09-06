package locationvoiture.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Carburant {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Long id;
		public String nomCarburant;
		
		
		@OneToMany(mappedBy="carburant")
		@JsonIgnore
		private Set<Carburant> carburants = new HashSet<Carburant>();
		
		
		public Carburant() {}
		
		
}
