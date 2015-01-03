/**
 * 
 */
package com.zlp.listUtils;

/**
 * @author zhangliping
 * 2014年12月30日
 */
public class Version {

	private String du;
	
	private String pdu;
	
	private String product;
	
	private String versionName;

	/**
	 * @return the du
	 */
	public String getDu() {
		return du;
	}

	/**
	 * @param du the du to set
	 */
	public void setDu(String du) {
		this.du = du;
	}

	/**
	 * @return the pdu
	 */
	public String getPdu() {
		return pdu;
	}

	/**
	 * @param pdu the pdu to set
	 */
	public void setPdu(String pdu) {
		this.pdu = pdu;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the versionName
	 */
	public String getVersionName() {
		return versionName;
	}

	/**
	 * @param versionName the versionName to set
	 */
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Version [du=" + du + ", pdu=" + pdu + ", product=" + product
				+ ", versionName=" + versionName + "]";
	}
	
	
}
