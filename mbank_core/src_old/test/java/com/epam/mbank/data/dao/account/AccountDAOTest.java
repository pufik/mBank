package com.epam.mbank.data.dao.account;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.mbank.model.account.Account;
import com.epam.mbank.utils.di.DAOModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

@DataSet
public class AccountDAOTest extends UnitilsJUnit4 {
	private Injector injector;
	private AccountDAO accountDao;

	@Before
	public void init() {
		injector = Guice.createInjector(new DAOModule());
		accountDao = injector.getInstance(AccountDAO.class);
	}

	@Test
	public void getAll() {
		List<Account> accounts = accountDao.getAll();
		ReflectionAssert.assertLenientEquals(4, accounts.size());
	}

}
