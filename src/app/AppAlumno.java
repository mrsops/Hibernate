/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import model.instituto.Alumno;
import model.instituto.CorreoElectronico;
import model.instituto.Nombre;
import model.instituto.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mrsops
 */
public class AppAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File config = new File("src/config/hibernateInstituto.cfg.xml");
        SessionFactory factory = new Configuration().configure(config).buildSessionFactory();

        // CREAMOS UN OBJETO
        Date fechaNacimiento = new Date();
        fechaNacimiento.setYear(1990-1900); //Quitamos 1900 por que viene asi los años
        fechaNacimiento.setMonth(12-1); //Mes 12 (diciembre) le quitamos uno por el rango de los meses 0-11
        fechaNacimiento.setDate(14); // El dia es tal cual
        Date horaTutoria = new Date(0, 0, 0, 11, 10, 0);// establecemos la hora a las 11:10 el dia , mes y año lo ponemos a 0 por que no interesa
        Date fechaRegistro = new Date();
        Alumno alumno=new Alumno("Julio Iglesias", 1500, true, fechaNacimiento, horaTutoria, fechaRegistro, "Ninguna observacion" );
     
        
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(alumno);
        
        
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();   
    }
    
}
