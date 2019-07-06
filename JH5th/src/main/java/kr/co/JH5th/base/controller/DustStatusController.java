package kr.co.JH5th.base.controller;

import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.tobesoft.xplatform.data.PlatformData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.base.to.DustStatusTO;
import kr.co.JH5th.common.mapper.DatasetBeanMapper;

@Controller
public class DustStatusController {
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	@RequestMapping("base/dust.do")
	public void findDustStatus(HttpServletRequest request, HttpServletResponse response) throws Exception{
	PlatformData outData = (PlatformData) request.getAttribute("outData");	
	new ArrayList<>();
    StringBuilder urlBuilder = new StringBuilder(
          "http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?sidoName=%EA%B2%BD%EB%82%A8&pageNo=1&numOfRows=10&ServiceKey=KWjrsSd29m%2FLf5vIUFNd%2BlFGme5Wh3TkfONi9967WnBGq41Sf%2BjURdfxewPgHod6O%2FRP6q9%2FpA9CPYYn5zsG4A%3D%3D&ver=1.3\r\n" + 
          ""); 
                                                                                         // URL

    URL url = new URL(urlBuilder.toString());

    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    // conn.setRequestProperty("Content-type", "application/json");
    System.out.println("Response code: " + conn.getResponseCode());
    System.out.println("getResponseMessage: " + conn.getResponseMessage());
    Document doc = null;
    List<DustStatusTO> dustStatusList = new ArrayList<>();
    
    try {
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       doc = builder.parse(conn.getInputStream());
       NodeList descNodes = doc.getElementsByTagName("item");
       System.out.println(descNodes.getLength());
       for (int i = 0; i < descNodes.getLength(); i++) {
          DustStatusTO dustTO = new DustStatusTO();
          for(Node node = descNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()){ //첫번째 자식을 시작으로 마지막까지 다음 형제를 실행

                 if(node.getNodeName().equals("stationName")){

                     System.out.println(node.getTextContent());
                     dustTO.setStationName(node.getTextContent());
                 }
                
                 if(node.getNodeName().equals("mangName")){

                     System.out.println(node.getTextContent());
                     dustTO.setMangName(node.getTextContent());

                 }
                 if(node.getNodeName().equals("dataTime")){

                     System.out.println(node.getTextContent());
                     dustTO.setDataTime(node.getTextContent());

                 }
                 if(node.getNodeName().equals("pm10Grade")){

                     System.out.println(node.getTextContent());
                     dustTO.setPm10Grade(node.getTextContent());
                 }
                 if(node.getNodeName().equals("o3Grade")){

                     System.out.println(node.getTextContent());
                     dustTO.setO3Grade(node.getTextContent());
                 }
                 if(node.getNodeName().equals("khaiGrade")){
                	 
                	 System.out.println(node.getTextContent());
                	 dustTO.setKhaiGrade(node.getTextContent());
                 }
                 if(node.getNodeName().equals("stationName")){
                	 
                	 System.out.println(node.getTextContent());
                	 dustTO.setStationName(node.getTextContent());
                 }
                 if(node.getNodeName().equals("pm10Value")){
                	 
                	 System.out.println(node.getTextContent());
                	 dustTO.setPm10Value(node.getTextContent());
                 }

          }
            dustStatusList.add(dustTO);
       }
    } catch (Exception ex) {
       throw ex;
    }

    datasetBeanMapper.beansToDataset(outData, dustStatusList, DustStatusTO.class);
	}

}
