package com.laptrinhjavaweb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CateEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cate_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name="cate_name", nullable = false)
	private String cname;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
		
	@Override
	public String toString() {
		return "CateEntity [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
