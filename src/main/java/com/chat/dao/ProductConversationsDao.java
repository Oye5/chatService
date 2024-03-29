package com.chat.dao;

import java.util.List;

import com.chat.model.ProductChat;
import com.chat.model.ProductConversations;

public interface ProductConversationsDao {

	ProductConversations saveMessages(ProductConversations conv);

	List<ProductConversations> getConversationById(String chatId);

	void deleteConversations(List<ProductChat> list);

	List<ProductConversations> getConversationsByUserId(String userId);

	List<ProductConversations> getConversationsByChatId(List<String> chatId);
}
