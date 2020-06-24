package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class ShipmentItem extends AbstractPersistable<UUID> {

 private Long sequence;

 private Long quantity;

 private String contentDescription;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "parent_id")
 private List<ShipmentItem> items = new ArrayList<>();

 private UUID shipmentOfGoodId;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_item_id")
 private List<ShipmentItemFeature> shippedWithFeatures = new ArrayList<>();

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "shipment_item_id")
 private List<OrderShipment> shipmentOf = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "shipment_item_id")
 private List<Document> documents = new ArrayList<>();

 public Long getSequence() {
	return sequence;
 }

 public void setSequence(Long sequence) {
	this.sequence = sequence;
 }

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public String getContentDescription() {
	return contentDescription;
 }

 public void setContentDescription(String contentDescription) {
	this.contentDescription = contentDescription;
 }

 public List<ShipmentItem> getItems() {
	return items;
 }

 public void setItems(List<ShipmentItem> items) {
	this.items = items;
 }

 public UUID getShipmentOfGoodId() {
	return shipmentOfGoodId;
 }

 public void setShipmentOfGoodId(UUID shipmentOfGoodId) {
	this.shipmentOfGoodId = shipmentOfGoodId;
 }
}
