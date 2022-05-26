package com.ivoronline.springboot_filter_exclude_custom;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order(1)
@Component
public class MyFilter1 extends OncePerRequestFilter {

  //===================================================================
  // DO FILTER INTERNAL
  //===================================================================
  @Override
  public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //EXCLUDE ENDPOINTS
    String path = request.getRequestURI();
    if ("/NotFiltered".equals(path)) {
    	chain.doFilter(request, response);
    	return;
    }

    //FILTER CODE
    System.out.println("FILTER1: Request");
    chain.doFilter(request, response);
    System.out.println("FILTER1: Response");
  }

}



