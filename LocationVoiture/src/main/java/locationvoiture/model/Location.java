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


		public Location(long id, int prix, int duree, LocalDate debutlocation) {
			super();
			this.id = id;
			this.prix = prix;
			this.duree = duree;
			this.debutlocation = debutlocation;
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public int getPrix() {
			return prix;
		}


		public void setPrix(int prix) {
			this.prix = prix;
		}


		public int getDuree() {
			return duree;
		}


		public void setDuree(int duree) {
			this.duree = duree;
		}


		public LocalDate getDebutlocation() {
			return debutlocation;
		}


		public void setDebutlocation(LocalDate debutlocation) {
			this.debutlocation = debutlocation;
		}


		public Voiture getVoiture() {
			return voiture;
		}


		public void setVoiture(Voiture voiture) {
			this.voiture = voiture;
		}
		
		
		
		
}