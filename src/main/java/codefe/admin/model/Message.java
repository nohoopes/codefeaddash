package codefe.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String conname;
	private String conphone;
	private String conmail;
	private String message;
	public Message() {
		super();
		id = 0;
		conname = "";
		conphone ="";
		conmail = "";
		message = "";
	}
	
	public Message(int id, String name, String phone, String email,String message) {
		super();
		this.id = id;
		this.conname = name;
		this.conphone = phone;
		this.conmail = email;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}

	public String getConphone() {
		return conphone;
	}

	public void setConphone(String conphone) {
		this.conphone = conphone;
	}

	public String getConmail() {
		return conmail;
	}

	public void setConmail(String conmail) {
		this.conmail = conmail;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

