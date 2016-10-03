package com.chat.service;

import java.util.List;

import com.chat.model.ProductStatus;


public interface ProductStatusService {

	ProductStatus getProductStatus(String productId);

	void deleteProductStatus(String productId);

	void saveProductStatus(ProductStatus productStatus);

	List<ProductStatus> getFavouriteProducts();

	void updateProductStatus(ProductStatus status);
}
