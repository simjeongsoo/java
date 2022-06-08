package ch13source.impl.list;

import javax.security.auth.login.AccountLockedException;

// AbstractList 클래스가 List 인터페이스 구현
public abstract class AbstractList implements List{
    @Override
    public void add() {

    }

    @Override
    public void update(int index, Object value) {

    }

    @Override
    public void remove(int index) {

    }

    public abstract void clear();
}
