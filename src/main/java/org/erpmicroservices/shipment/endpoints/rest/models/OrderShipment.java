package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "order_shipment")
public class OrderShipment extends AbstractPersistable<UUID> {

 private Long quantity;

 private UUID orderItemId;

 public Long getQuantity() {
	return quantity;
 }

 public void setQuantity(Long quantity) {
	this.quantity = quantity;
 }

 public UUID getOrderItemId() {
	return orderItemId;
 }

 public void setOrderItemId(UUID orderItemId) {
	this.orderItemId = orderItemId;
 }
}
