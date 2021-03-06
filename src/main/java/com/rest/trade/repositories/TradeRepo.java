package com.rest.trade.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.trade.models.Trade;
import com.rest.trade.models.TradeState;

public interface TradeRepo extends MongoRepository<Trade, String>{
	Trade findByTradeID(String id);
	List<Trade> findByState(TradeState state);
}
