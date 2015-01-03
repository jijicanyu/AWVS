/**
 * 
 */
package com.zlp.listUtils;

/**
 * @author zhangliping
 * 2014年12月31日
 */
public class User {
	private String nameString;
	
	private String ageString;

	/**
	 * @return the nameString
	 */
	public String getNameString() {
		return nameString;
	}

	/**
	 * @param nameString the nameString to set
	 */
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	/**
	 * @return the ageString
	 */
	public String getAgeString() {
		return ageString;
	}

	/**
	 * @param ageString the ageString to set
	 */
	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ageString == null) ? 0 : ageString.hashCode());
		result = prime * result
				+ ((nameString == null) ? 0 : nameString.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (ageString == null) {
			if (other.ageString != null)
				return false;
		} else if (!ageString.equals(other.ageString))
			return false;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		return true;
	}
	
	
}
