/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boutiquejava;

import java.sql.Connection;

/**
 *
 * @author jeantonnerre
 */
public class BoutiqueJava {
	
	public static Connexion connect = new Connexion();
	
	public static void main(String[] args) {
		System.out.println("hello");
		connect.enregistrerPilote("com.mysql.jdbc.Driver");
		Connection conn = connect.connexionBD("jdbc:mysql:", "localhost", "3306", "boutique", "root", "root");
		
	}
	
}
