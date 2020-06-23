package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity(name = "document_type")
public class DocumentType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private DocumentType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public DocumentType getParent() {
	return parent;
 }

 public void setParent(DocumentType parent) {
	this.parent = parent;
 }
}
