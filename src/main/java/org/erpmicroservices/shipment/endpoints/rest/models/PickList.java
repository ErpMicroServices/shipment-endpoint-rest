package org.erpmicroservices.shipment.endpoints.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "picklist")
public class PickList extends AbstractPersistable<UUID> {

 @Column(name = "date_create", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate created;

 @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
 @JoinColumn(name = "picklist_id")
 private List<PickListItem> items = new ArrayList<>();

 public LocalDate getCreated() {
	return created;
 }

 public void setCreated(LocalDate created) {
	this.created = created;
 }

 public List<PickListItem> getItems() {
	return items;
 }

 public void setItems(List<PickListItem> items) {
	this.items = items;
 }
}
