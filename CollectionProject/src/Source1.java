import java.util.Scanner;

import javax.swing.text.Document;

class Documents{
	private String emailText;

	@Override
	public String toString() {
		return "Documents [emailText=" + emailText + "]";
	}
	
}
class Email{
	private String sender;
	private String recipient;
	private String title;
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(String sender, String recipient, String title) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + "]";
	}
	
}
public class Source1 {
	boolean a;
	static boolean ContainsKeyword(Document docObject,String keyword)
	{

		if(a==true) {
			System.out.println("");
		}
		else{
			System.out.println("");
		}
		return a;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String sender=sc.next();
		System.out.println("sender"+sender);
		
		String recipient=sc.next();
		System.out.println("recipient"+recipient);
		
		String title=sc.next();
		System.out.println("title"+title);
		
		
		Source1 cd=new Source1();
		cd.ContainsKeyword();
		System.out.println(cd);
		Documents docObject =new Document();
		docObject.ContainsKeyword(docObject,keyword);
		if(a==true)
		{
			System.out.println("Email contains the word:question");
		}
		else
		{
			System.out.println("Email doesnot contains the word :coding test");
		}
		
		Email e=new Email(sender,recipient,title);
		System.out.println(e);
		System.out.println(docObject);
		
	}
	}