package com.bonuspoint.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bp_customer_balance_table", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"customer_ID", "project_ID"})})
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class CustomersBalanceTables {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cb_Id")
	private long cbId;

	@Column(name = "project_ID")
	private String projectID;

	@Column(name = "customer_ID")
	private String customerID;

	@Column(name = "total_points_awarded")
	private int totalPointsAwarded = 0;

	@Column(name = "total_amount_awarded", precision = 20, scale = 2)
	private BigDecimal totalAmountAwarded = new BigDecimal(0);

	@Column(name = "total_points_redeemed")
	private int totalPointsRedeemed = 0;

	@Column(name = "totalAmountRedeemed", precision = 20, scale = 2)
	private BigDecimal totalAmountRedeemed = new BigDecimal(0);
	
	@Column(name="final_points")
	private int finalPoints =0;
	
	@Column(name="final_amount", precision = 20, scale = 2)
	private BigDecimal finalAmount = new BigDecimal(0);

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public long getCbId() {
		return cbId;
	}

	public void setCbId(long cbId) {
		this.cbId = cbId;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getTotalPointsAwarded() {
		return totalPointsAwarded;
	}

	public void setTotalPointsAwarded(int totalPointsAwarded) {
		this.totalPointsAwarded = totalPointsAwarded;
	}

	public BigDecimal getTotalAmountAwarded() {
		return totalAmountAwarded;
	}

	public void setTotalAmountAwarded(BigDecimal totalAmountAwarded) {
		this.totalAmountAwarded = totalAmountAwarded;
	}

	public int getTotalPointsRedeemed() {
		return totalPointsRedeemed;
	}

	public void setTotalPointsRedeemed(int totalPointsRedeemed) {
		this.totalPointsRedeemed = totalPointsRedeemed;
	}

	public BigDecimal getTotalAmountRedeemed() {
		return totalAmountRedeemed;
	}

	public void setTotalAmountRedeemed(BigDecimal totalAmountRedeemed) {
		this.totalAmountRedeemed = totalAmountRedeemed;
	}
	public int getFinalPoints() {
		return finalPoints;
	}

	public void setFinalPoints(int finalPoints) {
		this.finalPoints = finalPoints;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
