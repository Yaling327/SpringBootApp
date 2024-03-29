package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataObjectController {
	String[] names = {
			"tuyano", "hanako", "taro", "sachiko", "ichiro"};
	String[] mails = {
			"syoda@tuuyano.com", "hanako@flower", "taro@yamada", "sachiko@happy","ichiro@baseball"};

	@RequestMapping("/da/{id}")
	public DataObject index(@PathVariable int id) {
		return new DataObject(id,names[id],mails[id]);
	}
}

class DataObject {
	private int id;
	private String name;
	private String value;
	
	public DataObject (int id, String name, String value) {
		super();
		this.setId(id);
		this.setName(name);
		this.setValue(value);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}