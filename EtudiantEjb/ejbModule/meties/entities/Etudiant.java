package meties.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {

	   
	@Id
	
	private String code_etudiant;
	private String nom;
	private String prenom;
	private Date date_naissance;
	private String ville_naissance;
	private String email;
	private static final long serialVersionUID = 1L;

	public Etudiant(String code_etudiant, String nom, String prenom, Date date_naissance, String ville_naissance,
			String email) {
		super();
		this.code_etudiant = code_etudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.ville_naissance = ville_naissance;
		this.email = email;
	}
	public Etudiant() {
		super();
	}   
	public String getCode_etudiant() {
		return this.code_etudiant;
	}

	public void setCode_etudiant(String code_etudiant) {
		this.code_etudiant = code_etudiant;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Date getDate_naissance() {
		return this.date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}   
	public String getVille_naissance() {
		return this.ville_naissance;
	}

	public void setVille_naissance(String ville_naissance) {
		this.ville_naissance = ville_naissance;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
