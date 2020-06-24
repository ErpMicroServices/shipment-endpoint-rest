package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class RejectionReason extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

}
