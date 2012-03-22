package com.epam.mbank.control.action.admin;

import java.util.List;

import com.epam.mbank.model.account.Account;

public interface AdminAccountAction {

	Account getAccountById(Long id);

	List<Account> getAllAccounts();

	void createAccount(Account account);

	void removeAccount(Account accont);

}
