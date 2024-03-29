package com.tuyano.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDataRestController {

	@Autowired
	private MyDataService service;
	@Autowired
	MySampleBean bean;

	@RequestMapping("/count")
	  public int count() {
	  	  return bean.count();
	  }
	
	@RequestMapping("/rest") // p.354
	public List<MyData> restAll() {
		return service.getAll();
	}

	@RequestMapping("/rest/{num}")
    public MyData restBy(@PathVariable int num) {
	  return service.get(num);
    }
}
