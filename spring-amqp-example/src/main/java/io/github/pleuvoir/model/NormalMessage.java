package io.github.pleuvoir.model;

import io.github.pleuvoir.kit.ToJSON;

public class NormalMessage implements ToJSON {

	/**
	 * 编号
	 */
	private String id;

	// getter and setter
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
