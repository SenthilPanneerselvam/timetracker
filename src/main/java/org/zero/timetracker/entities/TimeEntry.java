package org.zero.timetracker.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long userId;
	
	private Date date;
	
	private Long startMillis;
	
	private Long endMillis;
	
	private Integer duration;
	
	private String task;
	
	private String subTask;
	
	private String category;
	
	private Boolean isProductive;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getStartMillis() {
		return startMillis;
	}

	public void setStartMillis(Long startMillis) {
		this.startMillis = startMillis;
	}

	public Long getEndMillis() {
		return endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getSubTask() {
		return subTask;
	}

	public void setSubTask(String subTask) {
		this.subTask = subTask;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIsProductive() {
		return isProductive;
	}

	public void setIsProductive(Boolean isProductive) {
		this.isProductive = isProductive;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
