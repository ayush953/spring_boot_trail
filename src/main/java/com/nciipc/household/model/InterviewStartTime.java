package com.nciipc.household.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interview_start_time")
public class InterviewStartTime {
	@Id
	private Integer state_id;
	private BigInteger slot_6am_7_59am;
	private BigInteger slot_8am_8pm;
	private BigInteger slot_8_01pm_5_59am;
	private BigInteger all_elibible_women;
	@Override
	public String toString() {
		return "InterviewStartTime [state_id=" + state_id + ", slot_6am_7_59am=" + slot_6am_7_59am + ", slot_8am_8pm="
				+ slot_8am_8pm + ", slot_8_01pm_5_59am=" + slot_8_01pm_5_59am + ", all_elibible_women="
				+ all_elibible_women + "]";
	}
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public BigInteger getSlot_6am_7_59am() {
		return slot_6am_7_59am;
	}
	public void setSlot_6am_7_59am(BigInteger slot_6am_7_59am) {
		this.slot_6am_7_59am = slot_6am_7_59am;
	}
	public BigInteger getSlot_8am_8pm() {
		return slot_8am_8pm;
	}
	public void setSlot_8am_8pm(BigInteger slot_8am_8pm) {
		this.slot_8am_8pm = slot_8am_8pm;
	}
	public BigInteger getSlot_8_01pm_5_59am() {
		return slot_8_01pm_5_59am;
	}
	public void setSlot_8_01pm_5_59am(BigInteger slot_8_01pm_5_59am) {
		this.slot_8_01pm_5_59am = slot_8_01pm_5_59am;
	}
	public BigInteger getAll_elibible_women() {
		return all_elibible_women;
	}
	public void setAll_elibible_women(BigInteger all_elibible_women) {
		this.all_elibible_women = all_elibible_women;
	}
	public InterviewStartTime(Integer state_id, BigInteger slot_6am_7_59am, BigInteger slot_8am_8pm,
			BigInteger slot_8_01pm_5_59am, BigInteger all_elibible_women) {
		super();
		this.state_id = state_id;
		this.slot_6am_7_59am = slot_6am_7_59am;
		this.slot_8am_8pm = slot_8am_8pm;
		this.slot_8_01pm_5_59am = slot_8_01pm_5_59am;
		this.all_elibible_women = all_elibible_women;
	}
	public InterviewStartTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
