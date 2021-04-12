import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class ContactManager {
    private static Connection connection;
    public static void main(String[] args) throws SQLException {
        int count = 1;
        do {
            getUserDo();
            count += 1;
        } while (count < 5);

    }

    public static void getUserDo() throws SQLException {
        Scanner scann = new Scanner(System.in);
        System.out.println("Que voulez-vous faire ? \n" +
                "Pour ajouter un contact: add \n " +
                "Pour afficher tous les contacts: showAll \n" +
                "Pour afficher un seul contact: showOne \n" +
                "Pour supprimer un contact: delete \n" +
                "Pour modifier un contact: update \n" +
                "Pour quitter: exit \n");
        String input = scann.next();
        switch (input) {
            case "add" -> addContact();
            case "showAll" -> showAllContacts();
            case "showOne" -> showOneContact();
            case "delete" -> deleteContact();
            case "update" -> updateContact();
        }
    }

    public static String getId() {
        Scanner scann = new Scanner(System.in);
        System.out.println("tapez l'id de la personne que vous souhaitez afficher: ");
        String input = scann.next();
        return input;
    }

    public static void getConnect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:database.db");
    }

    public static void addContact() throws SQLException {
        Scanner scann = new Scanner(System.in);
        System.out.println("veuillez remplir les champs suiavnts: \n" +
                "nom : ");
        String name = scann.next();
        System.out.println("prenom: ");
        String firstName = scann.next();
        System.out.println("tel: ");
        String tel = scann.next();
        System.out.println("email: ");
        String email = scann.next();

        getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into contactManager (nom, prenom, tel, email) values (?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,firstName);
        preparedStatement.setString(3,tel);
        preparedStatement.setString(4,email);
        preparedStatement.executeUpdate();
    }

    public static void showAllContacts() throws SQLException {
        getConnect();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM contactManager");
        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("nom");
            String fname = result.getString("prenom");
            System.out.println("id : " + id + "\n" +
                    "nom:" + name + "\n"+
                    "prenom:" + fname + "\n"
            );
        }
    }

    public static void showOneContact() throws SQLException {
        String getId = getId();
        getConnect();
//        Scanner scann = new Scanner(System.in);
//        System.out.println("tapez l'id de la personne que vous souhaitez afficher: ");
//        String input = scann.next();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from contactManager where id = ?");
        preparedStatement.setString(1,getId);
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("nom");
            String fname = result.getString("prenom");
            String tel = result.getString("tel");
            String email = result.getString("email");

            System.out.println("id : " + id + "\n" +
                    "nom:" + name + "\n"+
                    "prenom:" + fname + "\n"+
                    "tel:" + tel + "\n"+
                    "email:" + email + "\n"
            );
        }
    }

    public static void deleteContact() throws SQLException {
        String getId = getId();
        getConnect();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from contactManager where id = ?");
        preparedStatement.setString(1,getId);
        preparedStatement.executeUpdate();
        System.out.println("delete contact");
    }

    public static void updateContact() {
        System.out.println("update conatct");
    }

}
