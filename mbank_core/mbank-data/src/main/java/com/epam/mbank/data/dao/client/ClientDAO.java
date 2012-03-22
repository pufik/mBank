package com.epam.mbank.data.dao.client;

import java.util.List;

import com.epam.mbank.data.dao.BaseDAO;
import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;

public interface ClientDAO extends BaseDAO<Client, Long> {
	Client getByName(String name);

	Client getByEmail(String email);

	Client getByPhone(String phone);

	List<Client> getByStatus(ClientStatus status);

	List<Client> getByType(ClientType type);
}
