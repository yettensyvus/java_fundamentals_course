import java.sql.*;

public class Task {

    //toate filmele de categoria comedy
    public static void task_1(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;

        try {
            rs = statement.executeQuery(
                        "SELECT Film_Category_Film.name_film\n" +
                            "FROM Film_Category_Film INNER JOIN\n" +
                            "Category ON Film_Category_Film.id_category = Category.id_category\n" +
                            "WHERE (Category.name_category = 'Comedy')");


            while (rs.next()) {

                System.out.println( rs.getString("name_film"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //cel mai nou film
    public static void task_2(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;

        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film\n" +
                            "WHERE release_date = \n" +
                            "(SELECT MAX(release_date)\n" +
                            "FROM Film);");


            while (rs.next()) {

                System.out.println( rs.getString("name_film"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //cel mai vechi film
    public static void task_3(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;

        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film\n" +
                            "WHERE release_date = \n" +
                            "(SELECT MIN(release_date)\n" +
                            "FROM Film);");


            while (rs.next()) {

                System.out.println( rs.getString("name_film"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Filmele filmate in America
    public static void task_4(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;

        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film_Country\n" +
                            "WHERE (ncountry = 'America');\n");


            while (rs.next()) {

                System.out.println( rs.getString("name_film"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Filmul cu cel mai mare buget
    public static void task_5(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film\n" +
                            "WHERE budget_film = \n" +
                            "(SELECT MAX(budget_film)\n" +
                            "FROM Film);\n");


            while (rs.next()) {
                System.out.println( rs.getString("name_film"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Nr. total de filme in baza de date
    public static void task_6(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                        "SELECT COUNT(id_film) AS numar\n" + "FROM Film");


            while (rs.next()) {
                System.out.println( rs.getInt("numar"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Filmele dublate in limba data
    public static void task_7(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                        "SELECT Film.name_film\n" +
                            "FROM Dubbing_Language INNER JOIN\n" +
                            "Film ON Dubbing_Language.id_film = Film.id_film\n" +
                            "WHERE (Dubbing_Language.nlanguage = 'German')");


            while (rs.next()) {
                System.out.println( rs.getString("name_film"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Toate filmele filmate de compania data
    public static void task_8(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film_Company\n" +
                            "WHERE(name_company = 'Castle Rock Entertaintment')\n");

            while (rs.next()) {
                System.out.println( rs.getString("name_film"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Cel mai lung film dupa durata
    public static void task_9(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                            "SELECT name_film\n" +
                                "FROM Film\n" +
                                "WHERE length_film = \n" +
                                "(SELECT MAX(length_film)\n" +
                                "FROM Film);");

            while (rs.next()) {
                System.out.println( rs.getString("name_film"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Cel mai scurt film dupa durata
    public static void task_10(Connection connect) throws SQLException {

        Statement statement = connect.createStatement();
        ResultSet rs;
        try {
            rs = statement.executeQuery(
                        "SELECT name_film\n" +
                            "FROM Film\n" +
                            "WHERE length_film = \n" +
                            "(SELECT MIN(length_film)\n" +
                            "FROM Film);");

            while (rs.next()) {
                System.out.println( rs.getString("name_film"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}