package com.fluko.cloud.randomservice.entity;

public class RobotEntity {
	
	 private final long id;
	    private final String model;

	    public RobotEntity(long id, String model) {
	        this.id = id;
	        this.model = model;
	    }

		public long getId() {
			return id;
		}

		public String getModelo() {
			return model;
		}
		
}
