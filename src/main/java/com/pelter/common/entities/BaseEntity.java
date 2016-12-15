package com.pelter.common.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.id == null || obj == null || !this.getClass().equals(obj.getClass()))
			return false;
		return this.id.equals(((BaseEntity)obj).getId());
	}
	
	@Override
	public int hashCode(){
		return id == null ? 0 : id.hashCode();
	} 
	
    public boolean isNew() {
        return this.id == null;
    }
}
