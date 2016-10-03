package com.chat.service;

import java.util.List;

import com.chat.model.ProductChat;
import com.chat.model.ProductConversations;

public interface ProductConversationsService {

	ProductConversations saveMessages(ProductConversations conv);

	List<ProductConversations> getConversationById(String chatId);

	void deleteConversations(List<ProductChat> list);

	List<ProductConversations> getConversationsByUserId(String userId);
}
