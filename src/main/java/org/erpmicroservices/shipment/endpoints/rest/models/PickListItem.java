package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "picklist_item")
public class PickListItem extends AbstractPersistable<UUID> {

 private Long quantity;

 @ManyToOne
 @JoinColumn(name = "picklist_id")
 private PickList pickList;

 private UUID inventoryItemId;

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public PickList getPickList() {
	return pickList;
 }

 public void setPickList(PickList pickList) {
	this.pickList = pickList;
 }

 public UUID getInventoryItemId() {
	return inventoryItemId;
 }

 public void setInventoryItemId(UUID inventoryItemId) {
	this.inventoryItemId = inventoryItemId;
 }
}
