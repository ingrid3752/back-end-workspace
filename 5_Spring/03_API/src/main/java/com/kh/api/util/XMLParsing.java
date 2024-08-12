package com.kh.api.util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParsing {

	/*
	 * url과 서비스키 String으로 지정 ( url은 서비스키 부분에 + serviceKey +)
	 * DocumentBuilderFactory 생성
	 * DocumentBuilder와 Document 생성 
	 * DocumentBuilder는 try-catch하고 import는 org.w3c.dom.Document로 임포트
	 * getElementsByTagName생성
	 * import org.w3c.dom.Document;
	 * import org.w3c.dom.Node;
     * import org.w3c.dom.NodeList;
	 * */
	
	public static void main(String[] args) {
		String serviceKey = "UNmnLkcNtzgMKivBzvyb3TdrsqmthwquJWOHYpkKXK6aXtSdhG1gbTQ6EOqATL5t3ApCJ2hySkej4pCTXuaAZg%3D%3D";
		String url = "https://apis.data.go.kr/6260000/FoodService/getFoodKr?serviceKey=" + serviceKey + "&numOfRows=396";
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			doc.getDocumentElement().normalize();
			System.out.println(doc.getDocumentElement().getNodeName()); // response
			
			NodeList nList = doc.getElementsByTagName("item");
			System.out.println("파싱할 데이터 수 : " + nList.getLength());
			
			for(int i = 0; i < nList.getLength(); i++) {
				Node nNode = nList.item(i);
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("MAIN_TITLE : " + getTagValue("MAIN_TITLE", eElement));
					System.out.println("ADDR1 : " + getTagValue("ADDR1" , eElement).trim());
					System.out.println("---------------------------------");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getTagValue(String tag, Element eElement) {
		NodeList nList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		Node nValue = nList.item(0);
		if(nValue == null) return null;
		return nValue.getNodeValue();
		
	}

}









