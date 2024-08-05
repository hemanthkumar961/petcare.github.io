package com.petcare.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.petcare.entity.Cart;
import com.petcare.entity.User;

public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
