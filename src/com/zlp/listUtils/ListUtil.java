/**
 * 
 */
package com.zlp.listUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangliping
 * 2014年12月30日
 */
public class ListUtil {

	List<Version> versionList = new ArrayList<Version>();
	
	public List<Version> getVersionList() {
		Version version = new Version();
		version.setDu("研发管理部");
		version.setPdu("解决方案开发部");
		version.setProduct("解决方案开发部");
		version.setVersionName("loadspace6");
		versionList.add(version);
		
		version = new Version();
		version.setDu("研发管理部");
		version.setPdu("开发部");
		version.setProduct("ewind load");
		version.setVersionName("loadspace7");
		versionList.add(version);
		
		version = new Version();
		version.setDu("研发管理部");
		version.setPdu("开发部");
		version.setProduct("ewind");
		version.setVersionName("loadspace7");
		versionList.add(version);
		
		version = new Version();
		version.setDu("研发管理部");
		version.setPdu("开发部");
		version.setProduct("ewind");
		version.setVersionName("applo");
		versionList.add(version);
		
		version = new Version();
		version.setDu("SingleAS");
		version.setPdu("SingleAS");
		version.setProduct("解决方案开发部");
		version.setVersionName("SDP");
		versionList.add(version);
		
		version = new Version();
		version.setDu("数字业务部");
		version.setPdu("VNP");
		version.setProduct("VMP");
		version.setVersionName("VMP30");
		versionList.add(version);
		version = new Version();
		version.setDu("数字业务部");
		version.setPdu("VNP1");
		version.setProduct("VMP");
		version.setVersionName("VMP30");
		versionList.add(version);
		
		return versionList;
	}
	
//			Version [du=研发管理部, pdu=解决方案开发部, product=解决方案开发部, versionName=loadspace6]
//			Version [du=研发管理部, pdu=开发部, product=解决方案开发部, versionName=loadspace7]
//			Version [du=SingleAS, pdu=SingleAS, product=解决方案开发部, versionName=SDP]
//			Version [du=数字业务部, pdu=VNP, product=VMP, versionName=VMP30]

	/**
	 * 获得DU
	 * @param versionList
	 * @return
	 */
	public List<DU> getDUList(List<Version> versionList) {
		
		List<DU> duList = new ArrayList<DU>();
		DU du = null;
		
		for (Version version : versionList) {
			du = new DU();
			du.setName(version.getDu());
			duList.remove(du);
			duList.add(du);
		}
		return duList;
	}
	
	public List<PDU> getPduList(List<Version> versionList, String du)
	{
		List<PDU> pduList = new ArrayList<PDU>();
		PDU pdu = null;
		
		for (Version version : versionList) {
			
			if(du.equalsIgnoreCase(version.getDu()))
			{
				pdu = new PDU();
				pdu.setName(version.getPdu());
				pduList.remove(pdu);
				pduList.add(pdu);
			}
		}
		return pduList;
	}
	
	public List<Product> getProductList(List<Version> versionList, String du, String pdu)
	{
		List<Product> productList = new ArrayList<Product>();
		Product product = null;
		for (Version version : versionList) {
			
			if(du.equalsIgnoreCase(version.getDu()))
			{	
				if (pdu.equalsIgnoreCase(version.getPdu()))
				{
					product = new Product();
					product.setProductName(version.getProduct());
					productList.remove(product);
					productList.add(product);
				}
			}
		}
		return productList;
	}
	
	
	public List<CVersionName> getCVersionNameList(List<Version> versionList, String du, String pdu, String product)
	{
		List<CVersionName> cVersionNameList = new ArrayList<CVersionName>();
		CVersionName cVersionName = null;
		for (Version version : versionList) {
			
			if(du.equalsIgnoreCase(version.getDu()))
			{	
				if (pdu.equalsIgnoreCase(version.getPdu()))
				{
					cVersionName = new CVersionName();
					cVersionName.setName(version.getVersionName());
					cVersionNameList.remove(cVersionName);
					cVersionNameList.add(cVersionName);
				}
			}
		}
		return cVersionNameList;
	}
	
	
	public static void main(String[] args) {
		
		ListUtil mearsh = new ListUtil();
		
		List<Version> versionList = mearsh.getVersionList();
		
		List<DU> duList = mearsh.getDUList(versionList);
		System.out.println("~~~~~~~~~du~~~~~~~~~~~~");
		for (DU du1 : duList) {
			System.out.println(du1.getName());
		}
		
		System.out.println("~~~~~~~~~pdu~~~~~~~~~~~~");
		List<PDU> pduList = mearsh.getPduList(versionList, "数字业务部");
		
		for (PDU pdu1 : pduList) {
			System.out.println(pdu1.getName());
		}
		
		
		System.out.println("~~~~~~~~~product~~~~~~~~~~~~");
		List<Product> productList = mearsh.getProductList(versionList, "研发管理部","开发部");
		
		for (Product product : productList) {
			System.out.println(product.getProductName());
		}
		
		System.out.println("~~~~~~~~~versionName~~~~~~~~~~~~");
		List<CVersionName> VersionNameList = mearsh.getCVersionNameList(versionList, "研发管理部","开发部","ewind");
		
		for (CVersionName cVersionName : VersionNameList) {
			System.out.println(cVersionName.getName());
		}
	}
}
