package com.shajar.springdatarest.repository.order;

import com.shajar.springdatarest.model.order.OrderMaster;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "order", path = "order")
public interface OrderMasterRepository extends PagingAndSortingRepository<OrderMaster, Long> {

}
