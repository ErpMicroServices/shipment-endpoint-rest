package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "item_issuance")
public class ItemIssuance extends AbstractPersistable<UUID> {

 @Column(name = "issued", columnDefinition = "DATETIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDateTime issued;

 private Long quantity;

 @ManyToOne
 @JoinColumn(name = "picklist_item_id")
 private PickListItem pickListItem;

 public LocalDateTime getIssued() {
	return issued;
 }

 public void setIssued(LocalDateTime issued) {
	this.issued = issued;
 }

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public PickListItem getPickListItem() {
	return pickListItem;
 }

 public void setPickListItem(PickListItem pickListItem) {
	this.pickListItem = pickListItem;
 }
}
