package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceimpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("查询所有的方法!!!");
        return accountDao.findAll();
    }


    public void saveAccount(Account account) {
        System.out.println("保存账户...");
        accountDao.saveAccount(account);
    }
}
