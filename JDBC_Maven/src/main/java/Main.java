import java.sql.*;
import java.util.*;

public class Main extends Task {

    public static void cls() {
        for (int i = 0; i < 80 * 300; i++)
            System.out.println("\b");
    }

    public static Connection connect = null;
    public static Statement statement = null;

    public static Scanner in = new Scanner(System.in);
    public static Scanner exit = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        int input;

        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "");
            statement = connect.createStatement();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        do {
            cls();
            System.out.println("Alegeti un punct din menu:");
            System.out.println(" ");
            System.out.println("1)   Toate filmele de genul <Comedy>");
            System.out.println("2)   Cel mai nou film");
            System.out.println("3)   Cel mai vechi film ");
            System.out.println("4)   Filmele filmate in <America>");
            System.out.println("5)   Filmul cu cel mai mare buget");
            System.out.println("6)   Numarul total de filme");
            System.out.println("7)   Filmele dublate in limba <Germana>");
            System.out.println("8)   Filmele regizate de compania <Castle Rock Entertaintment>");
            System.out.println("9)   Cel mai lung film dupa durata");
            System.out.println("10)  Cel mai scurt film dupa durata");
            System.out.println(" ");
            System.out.print("\r\nSelectati o optiune: ");

            do {
                input = in.nextInt();

                if (input < 0 || input > 10)
                {
                    System.out.println(input + ") Nu este inclus in lista de functii! ");
                    System.out.println(" ");
                    System.out.print("Reintroduceti: ");
                }

            }while(input < 0 || input > 10 );

            switch (input) {
                case 1:
                {
                    cls();
                    task_1(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 2:
                {
                    cls();
                    task_2(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 3:
                {
                    cls();
                    task_3(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 4:
                {
                    cls();
                    task_4(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 5:
                {
                    cls();
                    task_5(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;

                case 6:
                {
                    cls();
                    task_6(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;
                case 7:
                {
                    cls();
                    task_7(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                case 8:
                {
                    cls();
                    task_8(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;
                case 9:
                {
                    cls();
                    task_9(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;
                case 10:
                {
                    cls();
                    task_10(connect);
                    System.out.println(" ");
                    System.out.print("\r\n<< Tastati Enter pentru a reveni la meniul principal >>");
                    exit.nextLine();
                }
                break;
            }
        } while (input != 0);
    }

}