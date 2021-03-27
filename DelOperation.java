package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书籍名");
        String name = scanner.nextLine();
        int j = 0;
        for (; j <bookList.getUsedSize() ; j++) {
            Book book = bookList.getBook(j);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(j >= bookList.getUsedSize()){
            System.out.println("没有要删除的这本书");
            return;
        }
        int pos = j;
        for (int i = pos; i <bookList.getUsedSize()-1 ; i++) {
            Book book = bookList.getBook(i + 1);
            bookList.setBooks(i,book);
        }
        int currentSize = bookList.getUsedSize();
        bookList.setUsedSize(currentSize - 1);
        System.out.println("删除完毕");
    }
}
