package com.subha.generator;

import java.util.UUID;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ItemIdGenerator implements IdentifierGenerator{
	
	private static final long serialVersionUID = 255849L;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		return  "PR_"+UUID.randomUUID().toString();
	}

}
