package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "shipment")
public class Shipment extends AbstractPersistable<UUID> {

 @Column(name = "estimated_ship_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate estimatedShipDate;

 @Column(name = "estimated_ready_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate estimatedReadyDate;

 @Column(name = "estimated_arrival_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate estimatedArrivalDate;

 private BigDecimal estimatedShipCost;

 private BigDecimal actualShipCost;

 @Column(name = "latest_cancel_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate latestCancelDate;

 private String handlingInstructions;

 @Column(name = "last_update", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate lastUpdate;

 @ManyToOne
 private ShipmentType type;

 private UUID shippedFromContactMechanismId;

 private UUID shippedToContactMechanismId;

 private UUID shippedFromPartyId;

 private UUID shippedToPartyId;

 private UUID inquiredAboutViaContactMechanismId;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_id")
 private List<ShipmentItem> items = new ArrayList<>();

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_id")
 private List<ShipmentStatus> statuses = new ArrayList<>();

 public List<ShipmentItem> getItems() {
	return items;
 }

 public void setItems(List<ShipmentItem> items) {
	this.items = items;
 }

 public List<ShipmentStatus> getStatuses() {
	return statuses;
 }

 public void setStatuses(List<ShipmentStatus> statuses) {
	this.statuses = statuses;
 }

 public LocalDate getEstimatedShipDate() {
	return estimatedShipDate;
 }

 public void setEstimatedShipDate(LocalDate estimatedShipDate) {
	this.estimatedShipDate = estimatedShipDate;
 }

 public LocalDate getEstimatedReadyDate() {
	return estimatedReadyDate;
 }

 public void setEstimatedReadyDate(LocalDate estimatedReadyDate) {
	this.estimatedReadyDate = estimatedReadyDate;
 }

 public LocalDate getEstimatedArrivalDate() {
	return estimatedArrivalDate;
 }

 public void setEstimatedArrivalDate(LocalDate estimatedArrivalDate) {
	this.estimatedArrivalDate = estimatedArrivalDate;
 }

 public BigDecimal getEstimatedShipCost() {
	return estimatedShipCost;
 }

 public void setEstimatedShipCost(BigDecimal estimatedShipCost) {
	this.estimatedShipCost = estimatedShipCost;
 }

 public BigDecimal getActualShipCost() {
	return actualShipCost;
 }

 public void setActualShipCost(BigDecimal actualShipCost) {
	this.actualShipCost = actualShipCost;
 }

 public LocalDate getLatestCancelDate() {
	return latestCancelDate;
 }

 public void setLatestCancelDate(LocalDate latestCancelDate) {
	this.latestCancelDate = latestCancelDate;
 }

 public String getHandlingInstructions() {
	return handlingInstructions;
 }

 public void setHandlingInstructions(String handlingInstructions) {
	this.handlingInstructions = handlingInstructions;
 }

 public LocalDate getLastUpdate() {
	return lastUpdate;
 }

 public void setLastUpdate(LocalDate lastUpdate) {
	this.lastUpdate = lastUpdate;
 }

 public ShipmentType getType() {
	return type;
 }

 public void setType(ShipmentType type) {
	this.type = type;
 }

 public UUID getShippedFromContactMechanismId() {
	return shippedFromContactMechanismId;
 }

 public void setShippedFromContactMechanismId(UUID shippedFromContactMechanismId) {
	this.shippedFromContactMechanismId = shippedFromContactMechanismId;
 }

 public UUID getShippedToContactMechanismId() {
	return shippedToContactMechanismId;
 }

 public void setShippedToContactMechanismId(UUID shippedToContactMechanismId) {
	this.shippedToContactMechanismId = shippedToContactMechanismId;
 }

 public UUID getShippedFromPartyId() {
	return shippedFromPartyId;
 }

 public void setShippedFromPartyId(UUID shippedFromPartyId) {
	this.shippedFromPartyId = shippedFromPartyId;
 }

 public UUID getShippedToPartyId() {
	return shippedToPartyId;
 }

 public void setShippedToPartyId(UUID shippedToPartyId) {
	this.shippedToPartyId = shippedToPartyId;
 }

 public UUID getInquiredAboutViaContactMechanismId() {
	return inquiredAboutViaContactMechanismId;
 }

 public void setInquiredAboutViaContactMechanismId(UUID inquiredAboutViaContactMechanismId) {
	this.inquiredAboutViaContactMechanismId = inquiredAboutViaContactMechanismId;
 }
}
