package com.chat.dao;

import java.util.List;

import com.chat.model.ProductImages;


public interface ProductImageDao {

	void updateImageDetails(ProductImages productImages);

	void saveUploadedImage(ProductImages productImages);

	void deleteProductImages(String productId);

	List<ProductImages> getProductImagesByProductId(String productId);
}
