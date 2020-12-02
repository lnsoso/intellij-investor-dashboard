package com.vermouthx.stocker.listeners;

import com.intellij.util.messages.Topic;

public interface StockerQuoteDeleteNotifier {
    Topic<StockerQuoteDeleteNotifier> STOCK_CN_QUOTE_DELETE_TOPIC = Topic.create("StockCNQuoteDeleteTopic", StockerQuoteDeleteNotifier.class);
    Topic<StockerQuoteDeleteNotifier> STOCK_HK_QUOTE_DELETE_TOPIC = Topic.create("StockHKQuoteDeleteTopic", StockerQuoteDeleteNotifier.class);
    Topic<StockerQuoteDeleteNotifier> STOCK_US_QUOTE_DELETE_TOPIC = Topic.create("StockUSQuoteDeleteTopic", StockerQuoteDeleteNotifier.class);

    void after(String code);
}
