package com.read.cleancode._03_exception.exnull;

import java.util.Collections;
import java.util.List;

/**
 * null을 반환하는 습관을 고치자
 * null 대신 특수 사례 객체를 반환하든, 예외를 던지자.
 */
public class Store {

    private PersistentStore persistentStore;

    /**
     * null을 체크하는 코드가 너무 많다.
     * 심지어 누락된 null 체크도 존재한다!!!!
     */
    public void registerItem(Item item) {
        if (item != null) {
            ItemRegistry itemRegistry = persistentStore.getItemRegistry();
            if (itemRegistry != null) {
                // 로직
            }
        }
    }

    /**
     * 컬렉션의 경우 자바에서 Collections.emptyList() 메서드를 제공한다.
     */
    public List<String> getStrings() {
        // if 리스트가 존재하지 않는다면
        return Collections.emptyList();
    }

}
