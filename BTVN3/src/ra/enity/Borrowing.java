package ra.enity;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Borrowing implements IApp{
    private static int idSequence = 0;
    private int id;
    private Member member;
    private List<Book> borrowedBooks;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private Boolean status;

    public Borrowing(int id, Member member, List<Book> borrowedBooks, LocalDate borrowDate, LocalDate dueDate, Boolean status){
        this.id = ++idSequence;
        this.member = member;
        this.borrowedBooks = borrowedBooks;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Borrowing(){
        this.id = ++idSequence;
    }

    public int getId(){
        return id;
    }

    public Member getMember(){
        return member;
    }

    public void setMember(Member member){
        this.member = member;
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks;
    }

    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate){
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " | Member: [" + this.member + "]" + "Borrowed books: " + this.borrowedBooks + "Due: " + this.dueDate + "Status: " + (this.status? "Returned" : "Not Returned");
    }

    @Override
    public void inputData(Scanner input){

    }

    private void memberBorrowedBooks(Scanner input){
//        if()
    }
}
