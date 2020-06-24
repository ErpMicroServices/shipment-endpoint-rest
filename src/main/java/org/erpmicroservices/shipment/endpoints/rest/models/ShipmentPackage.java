package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "shipment_package")
public class ShipmentPackage extends AbstractPersistable<UUID> {

 @Column(name = "date_created", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime dateCreated;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_package_id")
 private List<ShipmentReceipt> receipts = new ArrayList<>();

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_package_id")
 private List<PackagingContent> packagingContents = new ArrayList<>();

 public LocalDateTime getDateCreated() {
	return dateCreated;
 }

 public void setDateCreated(LocalDateTime dateCreated) {
	this.dateCreated = dateCreated;
 }

 public List<ShipmentReceipt> getReceipts() {
	return receipts;
 }

 public void setReceipts(List<ShipmentReceipt> receipts) {
	this.receipts = receipts;
 }

 public List<PackagingContent> getPackagingContents() {
	return packagingContents;
 }

 public void setPackagingContents(List<PackagingContent> packagingContents) {
	this.packagingContents = packagingContents;
 }
}
