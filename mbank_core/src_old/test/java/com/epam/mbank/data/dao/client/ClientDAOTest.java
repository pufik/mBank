package com.epam.mbank.data.dao.client;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.mbank.enums.ClientStatus;
import com.epam.mbank.enums.ClientType;
import com.epam.mbank.model.client.Client;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@DataSet
public class ClientDAOTest extends UnitilsJUnit4 {
	private Injector injector;
	private ClientDAO clientDao;

	@Before
	public void init() {
		injector = Guice.createInjector(new DAOModule());
		clientDao = injector.getInstance(ClientDAO.class);
	}

	@Test
	public void getByName() {

		Client client = clientDao.getByName("Iurii Parfenon");

		ReflectionAssert.assertPropertyLenientEquals("name", "Iurii Parfenon",
				client);
	}

	@Test
	public void getByEmail() {
		Client client = clientDao.getByEmail("iurii@gmail.com");
		ReflectionAssert.assertPropertyLenientEquals("email",
				"iurii@gmail.com", client);
	}

	@Test
	public void getByPhone() {
		Client client = clientDao.getByPhone("123");
		ReflectionAssert.assertPropertyLenientEquals("phone", "123", client);
	}

	@Test
	public void getByStatus() {
		List<Client> clients = clientDao.getByStatus(ClientStatus.ACTIVE);
		ReflectionAssert.assertPropertyLenientEquals("name",
				Arrays.asList("Iurii Parfenon", "Nazar Vyshna"), clients);
	}

	@Test
	public void getByType() {
		List<Client> clients = clientDao.getByType(ClientType.GOLD);
		ReflectionAssert.assertPropertyLenientEquals("name",
				Arrays.asList("Roman Kantry", "Petro Ravlyk"), clients);
	}
		
}
