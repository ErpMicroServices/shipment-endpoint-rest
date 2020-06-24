package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static javax.persistence.CascadeType.ALL;

@Entity(name = "shipment_receipt")
public class ShipmentReceipt extends AbstractPersistable<UUID> {

 @Column(name = "received_at", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime receivedAt;

 private String description;

 private Long quantityAccepted;

 private Long quantityRejected;

 private UUID goodId;

 private UUID inventoryItemId;

 @OneToMany(orphanRemoval = true, cascade = ALL)
 @JoinColumn(name = "shipment_receipt_id")
 private List<ShipmentReceiptRole> shipmentReceiptRoles = new ArrayList<>();

 @ManyToOne
 @JoinColumn(name = "rejection_reason_id")
 private RejectionReason rejectionReason;

 private UUID orderItemId;

 public LocalDateTime getReceivedAt() {
	return receivedAt;
 }

 public void setReceivedAt(LocalDateTime receivedAt) {
	this.receivedAt = receivedAt;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public Long getQuantityAccepted() {
	return quantityAccepted;
 }

 public void setQuantityAccepted(Long quantityAccepted) {
	this.quantityAccepted = quantityAccepted;
 }

 public Long getQuantityRejected() {
	return quantityRejected;
 }

 public void setQuantityRejected(Long quantityRejected) {
	this.quantityRejected = quantityRejected;
 }

 public UUID getGoodId() {
	return goodId;
 }

 public void setGoodId(UUID goodId) {
	this.goodId = goodId;
 }

 public UUID getInventoryItemId() {
	return inventoryItemId;
 }

 public void setInventoryItemId(UUID inventoryItemId) {
	this.inventoryItemId = inventoryItemId;
 }

 public List<ShipmentReceiptRole> getShipmentReceiptRoles() {
	return shipmentReceiptRoles;
 }

 public void setShipmentReceiptRoles(List<ShipmentReceiptRole> shipmentReceiptRoles) {
	this.shipmentReceiptRoles = shipmentReceiptRoles;
 }

 public RejectionReason getRejectionReason() {
	return rejectionReason;
 }

 public void setRejectionReason(RejectionReason rejectionReason) {
	this.rejectionReason = rejectionReason;
 }

 public UUID getOrderItemId() {
	return orderItemId;
 }

 public void setOrderItemId(UUID orderItemId) {
	this.orderItemId = orderItemId;
 }
}
