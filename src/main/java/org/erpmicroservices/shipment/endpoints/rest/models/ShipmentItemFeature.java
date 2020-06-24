package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "shipment_item_feature")
public class ShipmentItemFeature extends AbstractPersistable<UUID> {
 private UUID productFeatureId;

 public UUID getProductFeatureId() {
	return productFeatureId;
 }

 public void setProductFeatureId(UUID productFeatureId) {
	this.productFeatureId = productFeatureId;
 }
}
