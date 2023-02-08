package com.read.cleancode._04_proxy;

import java.util.Collection;

/**
 * 계좌 목록을 가져오고 설정하는 은행 어플
 */
public interface Bank {

    Collection<Account> getAccounts();
    void setAccounts(Collection<Account> accounts);

}
