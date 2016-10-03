package com.chat.service;

import com.chat.model.Seller;

public interface SellerService {

	Seller getSellerById(String sellerId);

	void updateSeller(Seller seller);

	void saveSeller(Seller seller);
}
