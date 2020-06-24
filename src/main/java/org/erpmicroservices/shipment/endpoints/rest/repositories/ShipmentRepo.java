package org.erpmicroservices.shipment.endpoints.rest.repositories;

import org.erpmicroservices.shipment.endpoints.rest.models.Shipment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface ShipmentRepo extends PagingAndSortingRepository<Shipment, UUID> {

}
