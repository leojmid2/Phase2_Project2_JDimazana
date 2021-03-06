package com.flyAway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flyAway.Dao.AirlinesDao;
import com.flyAway.model.Airline;

@Service
@Transactional
public class AirlinesServiceImpl implements AirlinesService{

	@Autowired
	private AirlinesDao airlinesDao;

	
	@Override
	public List<Airline> getAirlines() {
		return airlinesDao.getAirlines();
	}


	@Override
	@Transactional
	public void addAirline(Airline airline) {
		airlinesDao.addAirline(airline);
	}
	

}
