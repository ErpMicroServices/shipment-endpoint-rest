package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "shipment_receipt_role")
public class ShipmentReceiptRole extends AbstractPersistable<UUID> {

 @ManyToOne
 @JoinColumn(name = "shipment_receipt_role_type_id")
 private ShipmentReceiptRoleType type;

 private UUID partyId;

 public ShipmentReceiptRoleType getType() {
	return type;
 }

 public void setType(ShipmentReceiptRoleType type) {
	this.type = type;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }
}
