package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "document")
public class Document extends AbstractPersistable<UUID> {

 @ManyToOne
 private DocumentType type;

 @ManyToOne
 private ShipmentPackage shipmentPackage;

 @ManyToOne
 private ShipmentItem shipmentItem;

 @ManyToOne
 private Shipment shipment;

 public DocumentType getType() {
	return type;
 }

 public void setType(DocumentType type) {
	this.type = type;
 }

 public ShipmentPackage getShipmentPackage() {
	return shipmentPackage;
 }

 public void setShipmentPackage(ShipmentPackage shipmentPackage) {
	this.shipmentPackage = shipmentPackage;
 }

 public ShipmentItem getShipmentItem() {
	return shipmentItem;
 }

 public void setShipmentItem(ShipmentItem shipmentItem) {
	this.shipmentItem = shipmentItem;
 }

 public Shipment getShipment() {
	return shipment;
 }

 public void setShipment(Shipment shipment) {
	this.shipment = shipment;
 }
}
