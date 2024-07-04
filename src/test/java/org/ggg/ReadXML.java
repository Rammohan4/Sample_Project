package org.ggg;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXML {
public static void main(String[] args) throws JAXBException {
	xmlRead();
}
	
	
	
	
	
	
	
	
	
	
	public static void xmlRead() throws JAXBException {
		JAXBContext jb = JAXBContext.newInstance(GGG.class);
		Unmarshaller aaa = jb.createUnmarshaller();
		File loc=new File ("C:\\Users\\ramrc\\Videos\\ABC\\src\\test\\resources\\xml\\samples.xml");
		Object obj = aaa.unmarshal(loc);
		GGG s=(GGG)obj;
		
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println("naresh");
		System.out.println("naresh");
		System.out.println("naresh");
		System.out.println("Ram");
	}
	
	
	
	
	
	
	
	
}
