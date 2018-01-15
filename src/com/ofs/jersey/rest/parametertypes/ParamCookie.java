package com.ofs.jersey.rest.parametertypes;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Cookie;

@Path("/cookie")
public class ParamCookie {

  //localhost:8080/SunJerseySample/rest/cookie/cookieParamString
  @GET
  @Path("/cookieParamString")
  public String readCookie1(@CookieParam("myStrCookie") String strCookie) {
      return "myStrCookie value = " + strCookie;
  }
  
  //localhost:8080/SunJerseySample/rest/cookie/cookieParamInt
  @GET
  @Path("/cookieParamInt")
  public String readCookie2(@CookieParam("myIntCookie") int intCookie) {
      return "myIntCookie value  = " + intCookie;
  }
  
  //localhost:8080/SunJerseySample/rest/cookie/cookieParamDate
  @GET
  @Path("/cookieParamDate")
  public String readCookie5(@CookieParam("myDateCookie") Cookie cookie) {
      return "Cookie object :" + cookie;
  }
  
}