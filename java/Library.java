import java.util.Scanner;

interface LibraryUser {

  void registerAccount(int age);

  void requestBook(String bookType);

}

// KidUser class implementing LibraryUser

class KidUser implements LibraryUser {

  private int age;

  private String bookType;

  public void registerAccount(int age) {

    this.age = age;

    if (age < 12) {

      System.out.println("You have successfully registered under a Kids Account");

    } else {

      System.out.println("Sorry, Age must be less than 12 to register as a kid");

    }

  }

  public void requestBook(String bookType) {

    this.bookType = bookType;

    if (bookType.equals("Kids")) {

      System.out.println("Book Issued successfully, please return the book within 10 days");

    } else {

      System.out.println("Oops, you are allowed to take only kids books");

    }

  }

}

class AdultUser implements LibraryUser {

  private int age;

  private String bookType;

  public void registerAccount(int age) {

    this.age = age;

    if (age > 12) {

      System.out.println("You have successfully registered under an Adult Account");

    } else {

      System.out.println("Sorry, Age must be greater than 12 to register as an adult");

    }

  }

  public void requestBook(String bookType) {

    this.bookType = bookType;

    if (bookType.equals("Fiction")) {

      System.out.println("Book Issued successfully, please return the book within 7 days");

    } else {

      System.out.println("Oops, you are allowed to take only adult Fiction books");

    }

  }

}

public class Library {

  public static void main(String[] args) {

    LibraryUser kid = new KidUser();

    Scanner S = new Scanner(System.in);

    String str = S.nextLine();

    kid.registerAccount(Integer.parseInt(str));

    str = S.nextLine();

    kid.requestBook(str);

    System.out.println();

    kid = new AdultUser();

    str = S.nextLine();

    kid.registerAccount(Integer.parseInt(str));

    str = S.nextLine();

    kid.requestBook(str);

  }

}