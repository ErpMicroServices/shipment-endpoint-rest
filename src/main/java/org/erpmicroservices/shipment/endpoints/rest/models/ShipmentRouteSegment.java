package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "shipment_route_segment")
public class ShipmentRouteSegment extends AbstractPersistable<UUID> {

 @Column(name = "actual_start", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime actualStart;

 @Column(name = "actual_arrival", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime actualArrival;

 @Column(name = "estimated_start", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime estimatedStart;

 @Column(name = "estimated_arrival", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime estimatedArrival;

 private Long startMileage;

 private Long endMileage;

 private BigDecimal fuelUsed;

 private UUID shipped_via;

 private UUID fixedAssetId;

 private UUID fromFacilityId;

 private UUID toFacilityId;

 private UUID shippedBy;

 public LocalDateTime getActualStart() {
	return actualStart;
 }

 public void setActualStart(LocalDateTime actualStart) {
	this.actualStart = actualStart;
 }

 public LocalDateTime getActualArrival() {
	return actualArrival;
 }

 public void setActualArrival(LocalDateTime actualArrival) {
	this.actualArrival = actualArrival;
 }

 public LocalDateTime getEstimatedStart() {
	return estimatedStart;
 }

 public void setEstimatedStart(LocalDateTime estimatedStart) {
	this.estimatedStart = estimatedStart;
 }

 public LocalDateTime getEstimatedArrival() {
	return estimatedArrival;
 }

 public void setEstimatedArrival(LocalDateTime estimatedArrival) {
	this.estimatedArrival = estimatedArrival;
 }

 public Long getStartMileage() {
	return startMileage;
 }

 public void setStartMileage(Long startMileage) {
	this.startMileage = startMileage;
 }

 public Long getEndMileage() {
	return endMileage;
 }

 public void setEndMileage(Long endMileage) {
	this.endMileage = endMileage;
 }

 public BigDecimal getFuelUsed() {
	return fuelUsed;
 }

 public void setFuelUsed(BigDecimal fuelUsed) {
	this.fuelUsed = fuelUsed;
 }

 public UUID getShipped_via() {
	return shipped_via;
 }

 public void setShipped_via(UUID shipped_via) {
	this.shipped_via = shipped_via;
 }

 public UUID getFixedAssetId() {
	return fixedAssetId;
 }

 public void setFixedAssetId(UUID fixedAssetId) {
	this.fixedAssetId = fixedAssetId;
 }

 public UUID getFromFacilityId() {
	return fromFacilityId;
 }

 public void setFromFacilityId(UUID fromFacilityId) {
	this.fromFacilityId = fromFacilityId;
 }

 public UUID getToFacilityId() {
	return toFacilityId;
 }

 public void setToFacilityId(UUID toFacilityId) {
	this.toFacilityId = toFacilityId;
 }

 public UUID getShippedBy() {
	return shippedBy;
 }

 public void setShippedBy(UUID shippedBy) {
	this.shippedBy = shippedBy;
 }
}
