import javax.swing.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		String authorName;
		String email;
		
		String bookName = JOptionPane.showInputDialog("Input book name");
		int publishedYear = Integer.parseInt(
				JOptionPane.showInputDialog("Input published Year"));
		
		FictionBook book = new FictionBook(bookName,publishedYear);
		
		do {
		authorName = JOptionPane.showInputDialog("Input author name");
		email = JOptionPane.showInputDialog("Input email");
		book.setAuthorName(authorName);
		book.setEmail(email);
		} while(!book.checkFormatName()||!(book.checkEmail()));

		JOptionPane.showMessageDialog(null, book);
	}

}
