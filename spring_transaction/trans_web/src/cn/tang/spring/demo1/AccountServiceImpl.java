package cn.tang.spring.demo1;

//转账案例的业务层实现类
public class AccountServiceImpl implements AccountService {
    //注入转账的DAO的类
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     *
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }
}
