package com.chat.dao;

import com.chat.model.Seller;

public interface SellerDao {

	Seller getSellerById(String sellerId);

	void updateSeller(Seller seller);

	void saveSeller(Seller seller);

}
