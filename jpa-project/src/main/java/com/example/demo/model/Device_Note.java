package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "device_notes")
public class Device_Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "device_note_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "device_id", nullable = false)
	private Device device;
	private String note;

	public Device_Note() {
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
