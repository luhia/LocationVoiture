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
public class Gamme {

	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Long id;
		public String nomGamme;
		
		
		@OneToMany(mappedBy="gamme")
		@JsonIgnore
		private Set<Gamme> gammes = new HashSet<Gamme>();

		
		public Gamme() {}


		public Gamme(Long id, String nomGamme) {
			super();
			this.id = id;
			this.nomGamme = nomGamme;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNomGamme() {
			return nomGamme;
		}


		public void setNomGamme(String nomGamme) {
			this.nomGamme = nomGamme;
		}


		public Set<Gamme> getGammes() {
			return gammes;
		}


		public void setGammes(Set<Gamme> gammes) {
			this.gammes = gammes;
		}
		
		
		
}
