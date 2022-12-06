package service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ma.fstt.EtudiantLocal;
import ma.fstt.entities.Etudiant;

@WebService
public class EtudiantService {
@EJB
	EtudiantLocal metier;
@WebMethod 
public Etudiant addEtudiant(@WebParam(name="e")  Etudiant e) {
	return metier.addEtudiant(e);}

	@WebMethod 
	public void deleteEtudiant(@WebParam(name="codeEtudiant")  Long codeEtudiant) {
		metier.deleteEtudiant(codeEtudiant);}
	@WebMethod 
	public Etudiant updateEtudiant(@WebParam(name="e")  Etudiant e) {
		return metier.updateEtudiant(e);}

	@WebMethod 
	public Etudiant getEtudiant(@WebParam(name="codeEtudiant")  Long codeEtudiant ) {
		return metier.getEtudiant(codeEtudiant);}
	@WebMethod 
	public List<Etudiant> listEtudiant(@WebParam(name="codeEtudiant")  Etudiant Etudiant ) {
		return metier.listEtudiant(Etudiant);}
}
