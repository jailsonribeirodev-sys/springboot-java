package com.jailsondev.course.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jailsondev.course.entities.OrderItem;
import com.jailsondev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
