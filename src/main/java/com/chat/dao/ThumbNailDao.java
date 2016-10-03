package com.chat.dao;

import com.chat.model.ThumbNail;

public interface ThumbNailDao {

	void saveThumbNail(ThumbNail thumb);

	ThumbNail getThumbByProductId(String productId);

	void deleteThumbNail(String productId);
}
