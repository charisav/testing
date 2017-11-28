package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class DeviceGroup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;

	@ManyToMany
	@JoinTable(name = "device_deviceGroup", 
			joinColumns = @JoinColumn(name = "device_id", referencedColumnName = "device_id", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "deviceGroup_id", referencedColumnName = "deviceGroup_id", nullable = false))
	private Set<Device> deviceGroups = new HashSet<Device>();
	
	public DeviceGroup() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
