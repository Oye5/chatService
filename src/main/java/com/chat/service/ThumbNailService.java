package com.chat.service;

import com.chat.model.ThumbNail;


public interface ThumbNailService {
	void saveThumbNail(ThumbNail thumb);

	ThumbNail getThumbByProductId(String productId);

	void deleteThumbNail(String productId);
}