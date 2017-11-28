package com.example.demo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class DeviceConfiguration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	@JoinColumn(name = "device_id", nullable = false)
	private Device device;
	private String description;
	private String reportType;
	private String reportInterval;
	private Date reportFromDate;
	private Date reportToDate;
	private String alarmInterval;
	
	@OneToMany(mappedBy = "deviceConfiguration")
	@Column(nullable = false)
	private Set<DeviceReportCalendar> deviceReportCalendars = new HashSet<DeviceReportCalendar>();

	public DeviceConfiguration() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportInterval() {
		return reportInterval;
	}

	public void setReportInterval(String reportInterval) {
		this.reportInterval = reportInterval;
	}

	public Date getReportFromDate() {
		return reportFromDate;
	}

	public void setReportFromDate(Date reportFromDate) {
		this.reportFromDate = reportFromDate;
	}

	public Date getReportToDate() {
		return reportToDate;
	}

	public void setReportToDate(Date reportToDate) {
		this.reportToDate = reportToDate;
	}

	public String getAlarmInterval() {
		return alarmInterval;
	}

	public void setAlarmInterval(String alarmInterval) {
		this.alarmInterval = alarmInterval;
	}

	public Set<DeviceReportCalendar> getDeviceReportCalendar() {
		return deviceReportCalendars;
	}

	public void setDeviceReportCalendar(Set<DeviceReportCalendar> deviceReportCalendar) {
		this.deviceReportCalendars = deviceReportCalendar;
	}

	
}
