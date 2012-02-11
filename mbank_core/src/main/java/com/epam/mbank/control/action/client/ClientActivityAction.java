package com.epam.mbank.control.action.client;

import com.epam.mbank.model.activity.Activity;
import com.epam.mbank.model.client.Client;

public interface ClientActivityAction {
	Activity getByClient(Client client);
}
