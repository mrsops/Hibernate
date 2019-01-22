/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import model.Profesor;
import model.Seguro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mrsops
 */
public class AppSeguros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //CREAMOS CONEXION
        //SessionFactory sessionFactory;
        //Configuration configuration = new Configuration();
        //configuration.configure();
        //sessionFactory = configuration.buildSessionFactory();
        File config = new File("src/config/hibernateSeguros.cfg.xml");
        SessionFactory factory = new Configuration().configure(config).buildSessionFactory();

        // CREAMOS UN OBJETO
        Seguro seguro=new Seguro();
        seguro.setIdSeguro(104);
        seguro.setNombre("Antonio");
        seguro.setApe1("Malquiano");
        seguro.setApe2("Vazquez");
        
        
        
        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(seguro);
        
        Seguro nuevoSeguro = (Seguro) session.get(Seguro.class, 104);
        System.out.println(nuevoSeguro);
        
        session.delete(nuevoSeguro);
        
        
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();   
    }
    
}
