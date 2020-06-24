package org.erpmicroservices.shipment.endpoints.rest.repositories;

import org.erpmicroservices.shipment.endpoints.rest.models.ShipmentReceiptRoleType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface ShipmentReceiptRoleTypeRepo extends PagingAndSortingRepository<ShipmentReceiptRoleType, UUID> {

}
