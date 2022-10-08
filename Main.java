import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner lib_input = new Scanner(System.in);
        Scanner auth_input = new Scanner(System.in);
        Scanner tubag = new Scanner(System.in);


        List<Book> recommendations = new ArrayList<Book>();

        System.out.println("Sail the ocean of ink with me!");

        try{
            System.out.println("How many books would you want to recommend to me?");
            Integer object = tubag.nextInt();

            if (object <= 0){
                tubag.close();
                lib_input.close();
                auth_input.close();
                throw new BookException("We do not accept zeros and negative number.");

            }

            for(int t = 0; t < object; t++){
                System.out.println("The Book Title: ");
                String libro = lib_input.nextLine();

                System.out.println("Author: ");
                String may_akda = auth_input.nextLine();

                recommendations.add(new Book(libro, may_akda));
            }
            System.out.println("I think we got your recommendation/s right. You can check below.");
            for (Book list : recommendations){
                System.out.println("The books is entitled " + list.getBookTitle() + ". It is written by " + list.getAuthor() + ".");
            }

            tubag.close();
            lib_input.close();
            auth_input.close();
        }

        catch(BookException c){
            System.out.println(c.getMessage());
        }

        catch (InputMismatchException ct){
            System.out.println("Your input is not a number.");
        }


    }
}
