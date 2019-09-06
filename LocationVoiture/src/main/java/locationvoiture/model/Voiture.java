package locationvoiture.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.tools.DocumentationTool.Location;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Voiture {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public long id;
		public String immatriculation;
		public String marque;
		public String photo;
		public LocalDate dateachat;
	
		@ManyToOne
		@JoinColumn(name="categorie")
		private Categorie categorie;
		
		@ManyToOne
		@JoinColumn(name="carburant")
		private Carburant carburant;
		
		@OneToMany(mappedBy="location")
		@JsonIgnore
		private Set<Location> locations = new HashSet<Location>();

		
		public Voiture() {}
		
		
		
		
		
		
		
}
