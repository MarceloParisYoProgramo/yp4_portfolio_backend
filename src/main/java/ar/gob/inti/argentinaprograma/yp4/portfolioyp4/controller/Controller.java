package ar.gob.inti.argentinaprograma.yp4.portfolioyp4.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity.Experiencia;
import ar.gob.inti.argentinaprograma.yp4.portfolioyp4.entity.Persona;
import ar.gob.inti.argentinaprograma.yp4.portfolioyp4.to.Portfolio;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

//	@Autowired
//	private PortfolioServices portfolioServices ;

	private static Portfolio PORTFOLIO ;
	
	static {
		PORTFOLIO = new Portfolio();
		PORTFOLIO.setPersona(new Persona(1,"Marcelo","Paris","Yo Programo 4"));
		
	    List<Experiencia> lista = new ArrayList<Experiencia>();
	    lista.add(new Experiencia(1L, "java", null,1L));
	    lista.add(new Experiencia(2L, "HTML", new Date(1000L) ,1L));
	    PORTFOLIO.setExperiencias(lista);
	}
	
    @GetMapping("/ping")
	public String ping() {
		return "haciendo ping";
	}

    
    @GetMapping("/persona/{id}")
    @ResponseBody
	Persona getPersona( @PathVariable int id) {
    	return PORTFOLIO.getPersona();
//		return portfolioServices.getPersona(id);
	}

    @GetMapping("/persona/{id}/experiencias")
    @ResponseBody
	List<Experiencia> getExperienciaPersona(@PathVariable int id ) {
    return PORTFOLIO.getExperiencias();
    	
//		return portfolioServices.getPersonaExperiencias(id);
	}
    
//    
//    @GetMapping("/personas")
//    @ResponseBody
//	List<Persona> getPersonas( ) {
//		return portfolioServices.getPersonas();
//	}
//    
    @GetMapping("/portfolio/{id}")
    @ResponseBody
	Portfolio getPortfolio( @PathVariable int id) {
    	return PORTFOLIO;
		//return portfolioServices.getPortfolio(id);
	}
	
//    @PostMapping("/portfolio/persona/actualizar")
//    @ResponseBody
//    Rstdo actualizarDatosPersona( @RequestBody Persona p ) {
//    	return portfolioServices.actualizarDatosPersona(p);
//    }
//
//    @PostMapping("/portfolio/experiencia/agregar")
//    @ResponseBody
//    
//    Rstdo agregarExperiencia( Experiencia e ) {
//    	System.out.println(e);
//    	// aca hay capa de servicios que realice la operacion
//    	return new Rstdo(false,"No implementado!");
//    }
//    
//    @PostMapping("/portfolio/experiencia/actualizar")
//    @ResponseBody
//    Rstdo actualizarExperiencia( Experiencia e ) {
//    	System.out.println(e);
//    	// aca hay capa de servicios que realice la operacion
//    	return new Rstdo(false,"No implementado!");
//    }
//
//    @PostMapping("/portfolio/experiencia/eliminar/{experienciaId}")
//    @ResponseBody
//    Rstdo eliminarExperiencia( @PathVariable int experienciaId ) {
//    	System.out.println(experienciaId);
//    	// aca hay capa de servicios que realice la operacion
//    	return new Rstdo(false,"No implementado!");
//    }

}
