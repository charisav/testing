package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "deviceReportCalendar")
public class DeviceReportCalendar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "deviceReportCalendar_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "deviceConfiguration_id", nullable = false)
	private DeviceConfiguration deviceConfiguration;
	
	private Date fromDate;
	private Date toDate;
	private String actionType;

	public DeviceReportCalendar() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DeviceConfiguration getDeviceConfiguration() {
		return deviceConfiguration;
	}

	public void setDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
		this.deviceConfiguration = deviceConfiguration;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
