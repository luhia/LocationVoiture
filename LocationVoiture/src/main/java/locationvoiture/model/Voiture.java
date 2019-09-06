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


		public Voiture(long id, String immatriculation, String marque, String photo, LocalDate dateachat) {
			super();
			this.id = id;
			this.immatriculation = immatriculation;
			this.marque = marque;
			this.photo = photo;
			this.dateachat = dateachat;
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getImmatriculation() {
			return immatriculation;
		}


		public void setImmatriculation(String immatriculation) {
			this.immatriculation = immatriculation;
		}


		public String getMarque() {
			return marque;
		}


		public void setMarque(String marque) {
			this.marque = marque;
		}


		public String getPhoto() {
			return photo;
		}


		public void setPhoto(String photo) {
			this.photo = photo;
		}


		public LocalDate getDateachat() {
			return dateachat;
		}


		public void setDateachat(LocalDate dateachat) {
			this.dateachat = dateachat;
		}


		public Categorie getCategorie() {
			return categorie;
		}


		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}


		public Carburant getCarburant() {
			return carburant;
		}


		public void setCarburant(Carburant carburant) {
			this.carburant = carburant;
		}


		public Set<Location> getLocations() {
			return locations;
		}


		public void setLocations(Set<Location> locations) {
			this.locations = locations;
		}




		
		
		
		
		
		
}
