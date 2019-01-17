/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // CREAMOS UN OBJETO
        Profesor profesor=new Profesor(2,"Carlos","Molina","Marco");
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
