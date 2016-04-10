package org.redcenter.entity;

import java.io.Serializable;
import java.util.Date;

public class MapGenHistPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8935415596465384955L;

	private String waferId;

	private String sortNo;

	private Date claimTime;

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

	public String getSortNo() {
		return sortNo;
	}

	public void setSortNo(String sortNo) {
		this.sortNo = sortNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claimTime == null) ? 0 : claimTime.hashCode());
		result = prime * result + ((sortNo == null) ? 0 : sortNo.hashCode());
		result = prime * result + ((waferId == null) ? 0 : waferId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapGenHistPK other = (MapGenHistPK) obj;
		if (claimTime == null) {
			if (other.claimTime != null)
				return false;
		} else if (!claimTime.equals(other.claimTime))
			return false;
		if (sortNo == null) {
			if (other.sortNo != null)
				return false;
		} else if (!sortNo.equals(other.sortNo))
			return false;
		if (waferId == null) {
			if (other.waferId != null)
				return false;
		} else if (!waferId.equals(other.waferId))
			return false;
		return true;
	}
}
