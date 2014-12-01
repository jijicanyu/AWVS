/**
 * 
 */
package com.zlp.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @author zhangliping
 *
 */
public class XmlUtil {

	/**
     * 将订单信息写入xml文件
     * @param map
     * @throws DocumentException
     * @throws IOException
     */
    public void writeXML(Map map) throws DocumentException, IOException {

		if (map != null && map.get("respCode").equals("0000")) {// 订单提交成功，未付款
			// 将订单信息写入文件
			File inputXML = new File("d:/report/orderList.xml");
			// 使用 SAXReader 解析 XML 文档 orderList.xml
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(inputXML);

			Element orders = document.getRootElement();// 根节点

			Element order = orders.addElement("order");// 订单节点

			Element merchantId = order.addElement("merchantId");// 商户ID
			merchantId.addAttribute("name", "sitinspring");    
			merchantId.setText(map.get("merchantId").toString());

			Element transType = order.addElement("transType");// 订单状态
			transType.setText(map.get("transType") == null ? "00" : map.get(
					"transType").toString());

			Element merchantOrderId = order.addElement("merchantOrderId");// 订单ID
			merchantOrderId.setText(map.get("merchantOrderId").toString());

			Element merchantOrderTime = order.addElement("merchantOrderTime");// 订单时间
			merchantOrderTime.setText(map.get("merchantOrderTime").toString());

			Element merchantOrderAmt = order.addElement("merchantOrderAmt");// 订单金额
			merchantOrderAmt.setText(map.get("merchantOrderAmt").toString());

			Writer writer = new FileWriter(inputXML);
			OutputFormat format = OutputFormat.createPrettyPrint();// 格式化
			XMLWriter xmlWriter = new XMLWriter(writer, format);
			xmlWriter.write(document);
			xmlWriter.close();
		}
	}
    
    /**
	 * 读取订单列表xml文件 放入map，多个返回list
	 * 
	 * @param fileName
	 * @return
	 * @throws DocumentException
	 */
    private List readXML(String fileName) throws DocumentException {
		List orderList = new ArrayList();
		// 读取文件
		File inputXML = new File(fileName);
		// 使用SAXReader解析xml
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(inputXML);
		Element orders = document.getRootElement();
		for (Iterator i = orders.elementIterator(); i.hasNext();) {
			Element order = (Element) i.next();

			Element merchantId = order.element("merchantId");
			Element transType = order.element("transType");
			Element merchantOrderId = order.element("merchantOrderId");
			Element merchantOrderTime = order.element("merchantOrderTime");
			Element merchantOrderAmt = order.element("merchantOrderAmt");
			Map map = new HashMap();
			map.put("merchantId", merchantId.getText());
			map.put("transType", transType.getText());
			map.put("merchantOrderId", merchantOrderId.getText());
			map.put("merchantOrderTime", merchantOrderTime.getText());
			map.put("merchantOrderAmt", merchantOrderAmt.getText());
			orderList.add(map);
		}
		return orderList;
	}
	
	
	/**
	 * @param args
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static void main(String[] args) throws DocumentException,
			IOException {
		XmlUtil xmlUtil = new XmlUtil();
		HashMap map = new HashMap();
		map.put("respCode", "0000");
		map.put("merchantId", "merchantId");
		map.put("transType", "transType");
		map.put("merchantOrderId", "merchantOrderId");
		map.put("merchantOrderTime", "merchantOrderTime");
		map.put("merchantOrderAmt", "merchantOrderAmt");
		xmlUtil.writeXML(map);
	}

}
