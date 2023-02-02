package com.read.cleancode._00_meaningfulname;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private Account account;

    /**
     * List라는 단어는 프로그래머에게 특수한 의미
     * 실제 List가 아니라면 쓰지 않는 것이 좋다. (실제 List는 무슨 의미?)
     */
    private List<Account> accountList = new ArrayList<>();

    /**
     * 복수명사로 끝에 s를 붙이거나 Group을 붙이는 것이 좋다.
     * (인텔리제이에선 List 자동생성 해주는데 진짜 안 좋은 것이 맞는지?)
     */
    private List<Account> accounts = new ArrayList<>();
    private List<Account> accountGroup = new ArrayList<>();
}
