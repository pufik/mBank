package com.epam.mbank.control.action.admin;

import java.util.List;

import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;

public interface AdminClientAction {

	Client getClientById(Long id);

	Client getClientByName(String name);

	Client getClientByEmail(String email);

	Client getClientByPhone(String phone);

	List<Client> getClientByStatus(ClientStatus status);

	List<Client> getClientByType(ClientType type);

	List<Client> getAllClients();

	void createClient(Client client);

	void removeClient(Client client);

	void updateClient(Client client);
}
