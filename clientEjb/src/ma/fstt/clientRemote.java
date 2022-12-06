package ma.fstt;
import javax.naming.Context;
import javax.naming.InitialContext;

import ma.fstt.EtudiantRemote;
import ma.fstt.entities.Etudiant;


public class clientRemote {

	public static void main(String[] args) {
		try {
			Context cxt =new InitialContext();
			/*String appName="";
			String moduleName ="atelier3Ejb";
			String beanName="TarikLsi";
			String remoteInterface ="ma.fstt.EtudiantLocal";
			String name="ejb:"+appName+"/"+moduleName+"/"+beanName+"!"+remoteInterface;
			EtudiantLocal proxy=(EtudiantLocal) cxt.lookup(name);*/
			EtudiantRemote proxy=(EtudiantRemote) cxt.lookup("ejb:atelier3Ejb/TarikLsi!ma.fstt.EtudiantRemote");
            proxy.addEtudiant(new Etudiant());
            proxy.addEtudiant(new Etudiant());
            proxy.addEtudiant(new Etudiant());
            proxy.addEtudiant(new Etudiant());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
