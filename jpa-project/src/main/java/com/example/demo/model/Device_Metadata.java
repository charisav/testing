package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Device_Metadata {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "device_id", nullable = false)
	private Device device;
	private String key;
	private int value;
	private String sortIndex;
	private boolean isVisible;

	public Device_Metadata() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(String sortIndex) {
		this.sortIndex = sortIndex;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

}
