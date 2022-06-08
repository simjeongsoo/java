package ch13source.impl.list;

public interface List {
    public void add(); // 데이터 추가

    public void update(int index, Object value); // 특정 위치의 값 수정

    public void remove(int index); // 특정 위치의 값 삭제
}
