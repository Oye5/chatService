package com.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.SellerDao;
import com.chat.model.Seller;

@Repository
@Transactional
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerDao sellerDao;

	@Override
	public Seller getSellerById(String sellerId) {
		return sellerDao.getSellerById(sellerId);
	}

	@Override
	public void updateSeller(Seller seller) {
		sellerDao.updateSeller(seller);

	}

	@Override
	public void saveSeller(Seller seller) {
		sellerDao.saveSeller(seller);

	}

}
