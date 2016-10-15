package com.chat.dao;

import java.util.List;

import com.chat.model.ProductChat;

public interface ProductChatDao {

	ProductChat saveChatMessages(ProductChat productChat);

	void deleteChatMessages(String productId);

	ProductChat getChatId(String productId, String sellerId, String buyerId);

	ProductChat getChatByConversationId(String conversationId);

	List<ProductChat> getChatIdByProductId(String productId);

	List<ProductChat> getChatIdByBuyerId(String userId);

	int bannedUser(String bannedby, String bannedto);

	List<ProductChat> getChatIdBySellerId(String userId);
}
