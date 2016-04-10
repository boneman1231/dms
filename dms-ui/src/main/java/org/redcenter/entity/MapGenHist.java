package org.redcenter.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(MapGenHistPK.class)
public class MapGenHist {
	
	@Id
	private String waferId;
	@Id
	private String sortNo;
	@Id
	private Date claimTime;

	private String part6;
	private String accessApplication;
	private String claimUser;
	private String claimMemo;
	
	public String getWaferId() {
		return waferId;
	}

	public void setWaferId(String waferId) {
		this.waferId = waferId;
	}

	public Date getClaimTime() {
		return claimTime;
	}

	public void setClaimTime(Date claimTime) {
		this.claimTime = claimTime;
	}

	public String getPart6() {
		return part6;
	}

	public void setPart6(String part6) {
		this.part6 = part6;
	}

	public String getSortNo() {
		return sortNo;
	}

	public void setSortNo(String sortNo) {
		this.sortNo = sortNo;
	}

	public String getAccessApplication() {
		return accessApplication;
	}

	public void setAccessApplication(String accessApplication) {
		this.accessApplication = accessApplication;
	}

	public String getClaimUser() {
		return claimUser;
	}

	public void setClaimUser(String claimUser) {
		this.claimUser = claimUser;
	}

	public String getClaimMemo() {
		return claimMemo;
	}

	public void setClaimMemo(String claimMemo) {
		this.claimMemo = claimMemo;
	}
}
