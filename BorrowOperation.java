package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借出书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书籍");
        String name = scanner.nextLine();
        for (int i = 0; i <bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(true);
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你借阅的书籍");
    }
}
