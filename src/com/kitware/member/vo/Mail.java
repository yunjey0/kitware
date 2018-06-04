package com.kitware.member.vo;

public class Mail {
	private String mail_num;
	private String emp_num;
	private String mail_title;
	private String mail_content;
	private String send_date;
	private String watch_yn;
	private Members members;
	
	public Mail() {
		super();
	}

	public Mail(String emp_num, String mail_title, String mail_content) {
		super();
		this.emp_num = emp_num;
		this.mail_title = mail_title;
		this.mail_content = mail_content;
	}

	public Mail(String emp_num, String mail_title, String mail_content, String watch_yn) {
		super();
		this.emp_num = emp_num;
		this.mail_title = mail_title;
		this.mail_content = mail_content;
		this.watch_yn = watch_yn;
	}

	public Mail(String mail_num, String emp_num, String mail_title, String mail_content, String send_date, String watch_yn) {
		super();
		this.mail_num = mail_num;
		this.emp_num = emp_num;
		this.mail_title = mail_title;
		this.mail_content = mail_content;
		this.send_date = send_date;
		this.watch_yn = watch_yn;
	}

	
	public String getMail_num() {
		return mail_num;
	}

	public void setMail_num(String mail_num) {
		this.mail_num = mail_num;
	}

	public String getEmp_num() {
		return emp_num;
	}

	public void setEmp_num(String emp_num) {
		this.emp_num = emp_num;
	}

	public String getMail_title() {
		return mail_title;
	}

	public void setMail_title(String mail_title) {
		this.mail_title = mail_title;
	}

	public String getMail_content() {
		return mail_content;
	}

	public void setMail_content(String mail_content) {
		this.mail_content = mail_content;
	}

	public String getSend_date() {
		return send_date;
	}

	public void setSend_date(String send_date) {
		this.send_date = send_date;
	}

	public String getWatch_yn() {
		return watch_yn;
	}

	public void setWatch_yn(String watch_yn) {
		this.watch_yn = watch_yn;
	}

	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Mail [mail_num=" + mail_num + ", emp_num=" + emp_num + ", mail_title=" + mail_title + ", mail_content="
				+ mail_content + ", send_date=" + send_date + ", watch_yn=" + watch_yn + ", members=" + members + "]";
	}

	
	
}
