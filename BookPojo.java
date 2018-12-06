package ObjectArray;

import java.util.Scanner;

public class BookPojo {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Book b[]=new Book[10]; // Object Array
		String BookName,Author,Publisher  ;              
		int i,BookID,NoOfCopies,count=0,choice=0;		
		do
		{

			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search Book");
			System.out.println("5.View all Books");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:

				System.out.println("Enter a BookName");
				BookName=sc.next();
				System.out.println("Enter a Author");
				Author=sc.next();
				System.out.println("Enter a Publisher");
				Publisher=sc.next();
				System.out.println("Enter a BookId");
				BookID=sc.nextInt();
				System.out.println("Enter a NoofCopies");
				NoOfCopies=sc.nextInt();
				b[count]=new Book(BookName, BookID, Author, Publisher,NoOfCopies);
				count++;
				break;
			case 2:

				System.out.println("Enter the Book id");
				BookID=sc.nextInt();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getBookID()==BookID);
					{
						System.out.println("Enter the Book Name");
						BookName=sc.next();
						b[i].setBookName(BookName);

						System.out.println("Enter the Book ID");
						BookID=sc.nextInt();
						b[i].setBookID(BookID);

						System.out.println("Enter the Author");
						Author=sc.next();
						b[i].setAuthor(Author);

						System.out.println("Enter the Publisher");
						Publisher=sc.next();
						b[i].setPublisher(Publisher);

						System.out.println("Enter the NoOfCopies");
						NoOfCopies=sc.nextInt();
						b[i].setNoOfCopies(NoOfCopies);
					}
				}
				System.out.println("Update Successfully!");
				break;
			case 3:
				System.out.println("Enter the Book id");
				BookID=sc.nextInt();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getBookID()==BookID);
					{
						b[i]=null;
					}
				}
				System.out.println("Deleted Successfully");
				break;

			case 4:
				System.out.println("Enter the Book id");
				BookID=sc.nextInt();
				for(i=0;i<count;i++)
				{
					if(b[i]==null && b[i].getBookID()==BookID);
					{
						System.out.println(b[i]); 
					}
				}
				System.out.println("Book Search Successfully");
				break;

			case 5:
				for(i=0;i<count;i++)
				{
					if(b[i]!=null)
					{
						System.out.println(b[i]);
						System.out.println(b[i].toString());
					}
				}

				System.out.println("List of Books");
				break;
			case 6:
				System.out.println("Exit");
			default:
				break;
			}
		}while(choice!=6);
	}
}

