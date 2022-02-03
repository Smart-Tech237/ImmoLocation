package controleur;


import java.sql.*;

public class ConnexionBD {

	  static final String url = "jdbc:mysql://localhost:3306/immo_location";
	  static final String user = "root";
	  static final String pwd = "";
	  
	  Connection con;

	  public ConnexionBD(){
	    connexion();
	  }
     // connexion a la base de donnee
	  public void connexion(){
	    try{
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(url, user, pwd);
	      System.out.println("connexion a la BD!");
	    }catch(SQLException|ClassNotFoundException e){
	      System.out.println("Erreur de connexion a la BD!");
	      System.out.println(e.toString());
	    }
	  }

	  public ResultSet select(String query){
	    try{
	      Statement statement = con.createStatement();
	      ResultSet result = statement.executeQuery(query);
	      return result;
	    }catch(SQLException e){
	      System.out.println("ERROR while executing select query!");
	      System.out.println(e.toString());
	      return null;
	    }
	  }

	  public int update(String query){
	    try{
	      Statement statement = con.createStatement();
	      return statement.executeUpdate(query);
	    }catch(SQLException e){
	      System.out.println("ERROR while executing update query");
	      System.out.println(e.toString());
	      return -1;
	    }
	  }

	  public int delete(String query){
	    try{
	      Statement statement = con.createStatement();
	      return statement.executeUpdate(query);
	    }catch(SQLException e){
	      System.out.println("ERROR while deleting line!");
	      System.out.println(e.toString());
	      return -1;
	    }
	  }

	  public void close(){
	    try{
	      con.close();
	    }catch(SQLException e){
	      System.out.println("ERROR while closing connections!");
	      System.out.println(e.toString());
	    }
	  }
	  
	  public static void arret(String message) {
	      System.err.println(message);
	      System.exit(99);
	   }
	  


}


