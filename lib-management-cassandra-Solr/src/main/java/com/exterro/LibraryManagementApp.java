//package com.exterro;
//
////LibraryManagementApp.java - User interface and application logic
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//import com.exterro.databases.BookSearch;
//import com.exterro.databases.BorrowedBooksDatabase;
//import com.exterro.databases.UserDatabase;
//import com.exterro.entity.Book;
//
//public class LibraryManagementApp {
// public static void main(String[] args) {
//     // Initialize database connections and other components
//     UserDatabase userDatabase = new UserDatabase();
//     BookSearch bookSearch = new BookSearch();
//     BorrowedBooksDatabase borrowedBooksDatabase = new BorrowedBooksDatabase();
//
//     // Implement the user interface and application logic
//     Scanner scanner = new Scanner(System.in);
//
//     while (true) {
//         System.out.println("1. Search Books");
//         System.out.println("2. Borrow Book");
//         System.out.println("3. Return Book");
//         System.out.println("4. Exit");
//         System.out.print("Enter your choice: ");
//         int choice = scanner.nextInt();
//
//         switch (choice) {
//             case 1:
//                 System.out.print("Enter search query: ");
//                 scanner.nextLine();
//                 String query = scanner.nextLine();
//                 List<Book> searchResults = bookSearch.searchBooks(query);
//                 // Display search results
//                 break;
//
//             case 2:
//                 System.out.print("Enter user ID: ");
//                 int userId = scanner.nextInt();
//                 System.out.print("Enter book ID: ");
//                 scanner.nextLine();
//                 String bookId = scanner.nextLine();
//                 Date borrowDate = new Date(); // Current date as borrow date
//                 borrowedBooksDatabase.borrowBook(userId, bookId, borrowDate);
//                 // Print success message
//                 break;
//
//             case 3:
//                 System.out.print("Enter user ID: ");
//                 userId = scanner.nextInt();
//                 System.out.print("Enter book ID: ");
//                 scanner.nextLine();
//                 bookId = scanner.nextLine();
//                 Date returnDate = new Date(); // Current date as return date
//                 borrowedBooksDatabase.returnBook(userId, bookId, returnDate);
//                 // Print success message
//                 break;
//
//             case 4:
//                 System.out.println("Exiting application.");
//                 scanner.close();
//                 System.exit(0);
//                 break;
//
//             default:
//                 System.out.println("Invalid choice. Please try again.");
//         }
//     }
// }
//}
