package book;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		System.out.println("Anne借书还书");
		Member stu1 = new Member("1","Anne");
		Book book1 = new Book("1","001", "网络技术");
		Loan loan1 = stu1.loan(book1);
		
		stu1.Return(book1);

		System.out.println("Anne借书2");
		Book book2 = new Book("2","002", "供应链");
		Loan loan2 = stu1.loan(book2);
		Book book3 = new Book("3","003", "高数");
		Loan loan3 = stu1.loan(book3);
		
		Book book4 = new Book("3","003", "高数");
		Loan loan4 = stu1.loan(book4);
		
		System.out.println("Tim借书");
		
		
		Member stu2 = new Member("2","Tim");
		Book book5 = new Book("5","005", "英语");
		Loan loan5 = stu2.loan(book5);
		Book book6 = new Book("6","006", "美术");
		Loan loan6 = stu2.loan(book6);
		Book book7 = new Book("7","007", "心理");
		Loan loan7 = stu2.loan(book7);
		Book book8 = new Book("8","008", "疯传");
		Loan loan8 = stu2.loan(book8);
	
	    	
		
	}

}
