package com.sciul.recurly.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import com.sciul.recurly.model.n.Account;

public class Test {

  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
    Account a = new Account();
    a.setAccountCode("test234");
    a.setEmail("test@utest.com");

    XmlMapper mapper = new XmlMapper();
    String xml = mapper.writeValueAsString(a);
    System.out.println(xml);

    ObjectMapper o = new ObjectMapper();
    String s = o.writeValueAsString(a);

    System.out.println(s);
  }
}
