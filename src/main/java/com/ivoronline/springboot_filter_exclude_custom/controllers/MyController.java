package com.ivoronline.springboot_filter_exclude_custom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //===================================================================
  // FILTERED
  //===================================================================
  @ResponseBody
  @RequestMapping("Filtered")
  String filtered() {
    System.out.println("CONTROLLER: Filtered");
    return "Hello from Filtered Endpoint";
  }

  //===================================================================
  // NOT FILTERED
  //===================================================================
  @ResponseBody
  @RequestMapping("NotFiltered")
  String notFiltered() {
    System.out.println("CONTROLLER: NOT Filtered");
    return "Hello from NOT Filtered Endpoint";
  }
}
