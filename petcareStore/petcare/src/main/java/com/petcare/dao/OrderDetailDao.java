package com.petcare.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petcare.entity.OrderDetail;
import com.petcare.entity.User;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>
{

	public List<OrderDetail> findByUser(User user);
	
	public List<OrderDetail> findByOrderStatus(String status);
}
