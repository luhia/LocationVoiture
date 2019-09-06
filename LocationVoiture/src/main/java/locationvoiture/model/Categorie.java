package locationvoiture.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Categorie {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Long id;
		public String nomCategorie;
		
		
		@OneToMany(mappedBy="categorie")
		@JsonIgnore
		private Set<Voiture> voitures = new HashSet<Voiture>();
		
		@ManyToOne
		@JoinColumn(name="gamme")
		private Gamme gamme;
		
	
		Categorie() {}


		public Categorie(Long id, String nomCategorie) {
			super();
			this.id = id;
			this.nomCategorie = nomCategorie;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNomCategorie() {
			return nomCategorie;
		}


		public void setNomCategorie(String nomCategorie) {
			this.nomCategorie = nomCategorie;
		}


		public Set<Voiture> getVoitures() {
			return voitures;
		}


		public void setVoitures(Set<Voiture> voitures) {
			this.voitures = voitures;
		}


		public Gamme getGamme() {
			return gamme;
		}


		public void setGamme(Gamme gamme) {
			this.gamme = gamme;
		}
		
		
}
