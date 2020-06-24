package org.erpmicroservices.shipment.endpoints.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity(name = "item_issuance_role")
public class ItemIssuanceRole extends AbstractPersistable<UUID> {

 private UUID partyId;

 @ManyToOne
 @JoinColumn(name = "type_id")
 private ItemIssuanceRoleType type;

}
