package com.example.demo.model;

public class MapSettings {
	private Customer customer;
	private String defaultMapLayer;
	private String coordinateSystem;
	private String positionOffset;
	private boolean showAccuracyCircleForPosition;
	
	public MapSettings() {}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDefaultMapLayer() {
		return defaultMapLayer;
	}

	public void setDefaultMapLayer(String defaultMapLayer) {
		this.defaultMapLayer = defaultMapLayer;
	}

	public String getCoordinateSystem() {
		return coordinateSystem;
	}

	public void setCoordinateSystem(String coordinateSystem) {
		this.coordinateSystem = coordinateSystem;
	}

	public String getPositionOffset() {
		return positionOffset;
	}

	public void setPositionOffset(String positionOffset) {
		this.positionOffset = positionOffset;
	}

	public boolean isShowAccuracyCircleForPosition() {
		return showAccuracyCircleForPosition;
	}

	public void setShowAccuracyCircleForPosition(boolean showAccuracyCircleForPosition) {
		this.showAccuracyCircleForPosition = showAccuracyCircleForPosition;
	}
	
	
}
