package com.zlp.test;

import java.io.File;
import java.util.Iterator;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.helpers.DefaultHandler;
public class XMLRead extends DefaultHandler{

		/*
		 * dom4j
		 */
		public void Dom4jReadTest(){
			File f = new File("d:/test.xml");
			SAXReader saxReader = new SAXReader();
			org.dom4j.Document document = null;
			 try {
				document = saxReader.read(f);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			Element rootElement = document.getRootElement();
			Iterator iterator = rootElement.elementIterator("node");
			
			while(iterator.hasNext()) {
				Element other = (Element)iterator.next();
				System.out.println(other.elementTextTrim("name"));
			}
		}

	public static void main(String[] args) {
		new XMLRead().Dom4jReadTest();
	}
}
