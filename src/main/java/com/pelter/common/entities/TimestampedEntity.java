package com.pelter.common.entities;

import java.util.Date;

public class TimestampedEntity extends NamedEntity {
	private Date timestamp;

	public TimestampedEntity() {
	}

	public TimestampedEntity(Long id, String name) {
		setId(id);
		setName(name);
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
