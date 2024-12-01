package in.admin.api.dao;

public class AdminDao {
	
	private Integer aid;
	
	private String emailId;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public AdminDao(Integer aid, String emailId) {
		super();
		this.aid = aid;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "AdminDao [aid=" + aid + ", emailId=" + emailId + "]";
	}
	
	

}
