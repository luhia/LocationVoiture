package locationvoiture.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Location {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public long id;
		public int prix;
		public int duree;
		public LocalDate debutlocation;
	
		@ManyToOne
		@JoinColumn(name="voiture")
		private Voiture voiture;

		
		public Location() {}
		
		
		
		
}