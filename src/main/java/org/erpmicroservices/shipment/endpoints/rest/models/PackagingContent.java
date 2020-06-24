package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "packaging_content")
public class PackagingContent extends AbstractPersistable<UUID> {

 private Long quantity;

 @ManyToOne
 @JoinColumn(name = "shipment_item_id")
 private ShipmentItem shipmentItem;

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public ShipmentItem getShipmentItem() {
	return shipmentItem;
 }

 public void setShipmentItem(ShipmentItem shipmentItem) {
	this.shipmentItem = shipmentItem;
 }
}
