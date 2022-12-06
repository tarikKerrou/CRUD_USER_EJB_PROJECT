package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ma.fstt.EtudiantLocal;
import ma.fstt.entities.Etudiant;
@Path("/")
public class EtudiantRestService {
@EJB
	private EtudiantLocal rest;
@POST
@Path("/etudiant")
@Produces(MediaType.APPLICATION_JSON) 
public Etudiant addEtudiant(Etudiant e) {
	return rest.addEtudiant(e);
}
@GET
@Path("/etudiant/{id}")
@Produces(MediaType.APPLICATION_JSON) 
public Etudiant getEtudiant(@PathParam(value="id") Long id) {
	return rest.getEtudiant(id);
}
@GET
@Path("/etudiants")
@Produces(MediaType.APPLICATION_JSON)

public List<Etudiant> listEtudiant(Etudiant e) {
	return rest.listEtudiant(e);
}
@PUT
@Path("/editetudiants")
@Produces(MediaType.APPLICATION_JSON)
public Etudiant updateEtudiant(@FormParam(value="e")Etudiant e) {
	return rest.updateEtudiant(e);
}
@DELETE
@Path("/deletetudiants")
@Produces(MediaType.APPLICATION_JSON)
public void deleteEtudiant(@PathParam(value="id")Long id) {
	rest.deleteEtudiant(id);
}

}
