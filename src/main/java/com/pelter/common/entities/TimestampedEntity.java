package com.pelter.common.entities;

import java.util.Date;

public class TimestampedEntity extends NamedEntity {
	private Date timestamp;
	private Date createDate;

	/* ===== Constructor ==== */
	public TimestampedEntity(Date createDate) {
		this.createDate = createDate;
	}

	public TimestampedEntity(Long id, String name) {
		setId(id);
		setName(name);
	}

	/* ==== Operations ==== */
	/* getCreationDate Immutale (defensive copy)*/
	public Date getCreateDate(){
		return new Date(this.createDate.getTime());
	}
	
	/* Date used as lastModified/update time */
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
