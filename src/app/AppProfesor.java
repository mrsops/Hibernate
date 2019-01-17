/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import model.CorreoElectronico;
import model.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author toure19_notebook
 */
public class AppProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        File config = new File("src/hibernate.cfg.xml");
        SessionFactory factory = new Configuration().configure(config).buildSessionFactory();

        // CREAMOS UN OBJETO
        Profesor profesor=new Profesor(9,"Juan","Ramon","De los Olmos");
        Set<CorreoElectronico> correosElectronicos = new HashSet<>();
        correosElectronicos.add(new CorreoElectronico(6, "andros@gmail.com", profesor));
        correosElectronicos.add(new CorreoElectronico(5, "mariandros@gmail.com", profesor));
        correosElectronicos.add(new CorreoElectronico(4, "remariandros@gmail.com", profesor));
        profesor.setCorreosElectronicos(correosElectronicos);
        
        
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(profesor);
        
        
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();   
        
        
        
        /*
        //CREAMOS CONEXION
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        //configuration.addClass(model.Profesor.class);
        //configuration.addResource("model/Profesor.hbm.xml");
        sessionFactory = configuration.buildSessionFactory();

        //CREAMOS UN OBJETO
        Profesor profesor = new Profesor(1, "Carlos", "Molina", "Marco");

        //CREAMOS UNA SESSION
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(profesor);

        //CERRAR CONEXIÓN
        session.getTransaction().commit();
        session.close();

*/
    }

}
