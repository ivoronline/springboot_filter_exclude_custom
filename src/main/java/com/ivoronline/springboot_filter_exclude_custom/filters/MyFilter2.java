package com.ivoronline.springboot_filter_exclude_custom.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Order(2)
@Component
public class MyFilter2 extends OncePerRequestFilter {

  //===================================================================
  // DO FILTER INTERNAL
  //===================================================================
  @Override
  public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    throws IOException, ServletException {
    System.out.println("FILTER2: Request");
    chain.doFilter(request, response);
    System.out.println("FILTER2: Response");
  }

}



