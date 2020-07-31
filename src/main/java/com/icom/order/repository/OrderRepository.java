/**
 * 
 */
package com.icom.order.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icom.order.model.Order;

/**
 * Rest Repository for Order resource
 */
@RepositoryRestResource(path = "order", itemResourceRel = "order", collectionResourceRel = "orders")
public interface OrderRepository extends PagingAndSortingRepository<Order, UUID> {

}
