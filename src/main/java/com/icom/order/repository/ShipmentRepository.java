package com.icom.order.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icom.order.model.Shipment;

/**
 * Rest Repository for Shipment resource
 */
@RepositoryRestResource(path = "shipment", itemResourceRel = "shipment", collectionResourceRel = "shipments")
public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, UUID> {

}
