/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma_webapp.resources;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import ma_webapp.entidades.Alumno;
import ma_webapp.negocio.DataService;

/**
 *
 * @author miltonahdz
 */

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/alumnos")
public class Recurso {
    @EJB DataService servicio;

    @GET
    public Response getAlumnos(){
        List<Alumno>alumnos = servicio.getAlumnos();
        return Response.ok(alumnos).build();
    }
    
   
    @POST
    public Response saveAlumno(Alumno alumno) {
        servicio.saveAlumno(alumno);
        return Response.ok("Alumno creado con exito").build();
    }

    @PUT
    public Response editAlumno(Alumno alumno){
        servicio.editAlumno(alumno);
        return Response.ok("Alumno editado con exito").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAlumno(@PathParam("id") Integer id) {
        servicio.deleteAlumno(new Alumno(id));
        return Response.ok("Alumno eliminado con exito").build();
    }
}
