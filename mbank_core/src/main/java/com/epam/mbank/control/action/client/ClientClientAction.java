package com.epam.mbank.control.action.client;

import com.epam.mbank.model.client.Client;

public interface ClientClientAction {

	Client getClientById(Long id);

	Client getClientByEmail(String email);

	void updateClient(Client client);
}
