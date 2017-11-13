/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
//Paso 10 -Necesario para conexion con MYSQL
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ceduc
 */
public class ConexionBD 
        
{//Paso 11-Declarando objeto para la conexion
  private static Connection conex;//Objeto tipo connection 
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String USER = "root";
  private static final String PASS = "";
  private static final String URL = "jdbc:mysql://localhost:330/Conexion";
  //Paso 12 - Constructor de la clase
  public ConexionBD()
  {
      conex = null; //Inicializar la variable
     //Metodo para manejar excepciones 
      try 
  {
      Class.forName(DRIVER);
      conex =DriverManager.getConnection(URL, USER,PASS);
      if(conex != null)
  {
         System.out.println("Conexion Establecida");
   }
  
  }
       catch(ClassNotFoundException |SQLException event)
  { 
       System.out.println("Error en la conexion");
  }  
  }
       //Paso 13 -Definicion metodos para conectar y desconectar
        public Connection conectar()
        
    {
        return conex;//Retorna el objeto conex 
           
     }
        public void desconectar()
     {
        conex=null;
        if (conex==null)
     {
         System.out.println("Conexion Finalizada");
                
     }
     }
    
     }

   
