package classmorning;


public class Mail {
	private long id;
	private String to;
	private String from;
	private String subject;
	private String content;
	private java.util.Date recievedDate=new java.util.Date();
	private double size;
	
	// getter for id  
	public long getid() {
	    return id;
	 }

	 // Setter for id
	public void setid(long id) {
	    this.id = id;
	 }
	// getter for to
	public String getto() {
	    return to;
     }

	 // Setter for to
	public void setto(String to) {
		 this.to = to;
	}
	// getter for from
	public String getfrom() {
		 return to;
	}

	 // Setter for from
	public void setfrom(String from) {
		 this.from = from;
	}
	// getter for subject
	public String getsubject() {
		 return subject;
	}

	 // Setter for subject
	public void setsubject(String subject) {
		 this.subject = subject;
	}
	// getter for content
	public String getcontent() {
		 return subject;
	}

	 // Setter for content
	public void setcontent(String content) {
		 this.content = content;
	}
	// getter for date
	public java.util.Date getrecievedDate() {
		 return recievedDate;
	}

	// Setter for date
	public void setrecievedDate(java.util.Date recievedDate) {
		 this.recievedDate = recievedDate;
	}
	
	public Mail(){
		id=14;
		to="abhishekst308@gmail.com";
		from="abhishek@gmail.com";
		subject= "mail for job";
		content= "this is the main content of the mail";
		size= 45;
		
	}
	public Mail(long id,String to,String from,String subject,String content,double size){
		this.id=id;
		this.to=to;
		this.from=from;
		this.subject= subject;
		this.content= content;
		this.size= size;
	}
	
	void display() { 
		System.out.println("id " + id); 
		System.out.println("to " + to);
		System.out.println("from " + from);
		System.out.println("subject " + subject);
		System.out.println("content " + content);
		System.out.println("size "+ size);
		System.out.println("date"+ recievedDate);
	}
	public static void main(String[] args) {
		Mail m1 = new Mail();
		Mail m2 = new Mail(45, "newmail.com","oldmail.com","subject","content", 78 );
		m2.display();
		m1.display();
//		System.out.println(m1);
	}

	
		 
	
	
	
	

}
