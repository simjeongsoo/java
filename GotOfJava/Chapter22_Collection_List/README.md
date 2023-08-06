## Chapter1
  
### 정리
##### 1. Collection 인터페이스를 구현하는 대표적인 3개의 자료구조
  - ***Collection 인터페이스를 구현한 대표적인 타입은 List, Set, Queue 이다***

##### 2. 배열과 같이 순서가 있는 목록형을 나타내는 대표 인터페이스
  - ***배열과 같은 형태는 List 인터페이스에서 선언되어 있다***

##### 3. ArrayList라는 클래스의 생성자 중 매개변수가 없는 기본 생성자를 사용하면 기본적으로 몇 개의 저장공간을 가지나요?
  - ***별도로 정하지 않을 경우 자바에서 제공하는 List 를 구현한 클래스의 데이터 개수는 10개이다.***

##### 4. 만약 ArrayList 클래스의 저장 공간 개수를 처음부터 지정하려면 어떤 생성자를 사용하면 되나요?
  - ***ArrayList(int initialCapacity) 를 사용하면 초기 데이터 개수를 생성과 동시에 지정할 수 있다.***
    
##### 5. ArrayList 객체를 생성할 때 제네릭을 사용하는 이유는 무엇인가요?
  - ***제네릭을 사용하면 컴파일 시점에 타입을 잘못 지정한 부분을 걸러낼 수가 있기 때문이다.***
    
##### 6. ArrayList에 데이터를 담는 메소드 두가지의 이름은 무엇인가요?
  -  **add()와 addAll()메소드를 사용하면 ArrayList에 데이터를 담을 수 잇다.****

##### 7. Collection 인터페이스를 구현한 클래스의 객체에서 사용할 수 있는 for 루프의 구조는 어떻게 되나요? 코드를 작성하세요.
  -  ***만약 String타입을 담는 list라는 ArrayList를 만들었다면 아래 코드와 같이 사용***
```java
for(String data:list) { 
//
}
```

##### 8. Collection 인터페이스를 구현한 클래스의 객체에 저장된 데이터의 갯수를 확인하는 메소드 이름은 무엇인가요?
  -  ***size() 메소드를 사용하면 Collection을 구현한 클래스들에 들어 있는 데이터 개수를 확인할 수 있다.***

##### 9. ArrayList에서 특정 위치에 있는 데이터를 확인하는 메소드는 무엇인가요?
  -  ***get() 메소드를 사용하면 매개변수로 넘긴 위치에 있는 값을 리턴한다.***

##### 10. ArrayList에서 특정 위치에 있는 데이터를 삭제하는 메소드는 무엇인가요?
  -  ***remove() 메소드를 사용하면 매개변수로 넘긴 위치에 있는 값을 삭제한다. 만약 매개변수로 객체를 넘기면, 동일한 첫번째 객체를 삭제한다.***

##### 11. ArrayList에서 특정 위치에 있는 데이터를 수정하는 메소드는 무엇인가요?
  -  ***set() 메소드를 사용하면 첫번째 매개변수로 넘긴 위치에 있는 값은 두번째 매개변수로 넘긴 값으로 대체한다.***

##### 12. java.util 패키지에 있는 Stack 이라는 클래스는 어떤 클래스를 확장한 것인가요?
  -  ***Stack 클래스는 List 인터페이스를 구현하였다.***

##### 13. Stack 클래스에서 데이터를 담는 메소드는 무엇인가요?
  -  ***Stack 클래스에 데이터를 담을 때에는 push() 메소드를 사용한다.***

##### 14. Stack 클래스에서 가장 위에 있는 데이터를 확인만 하는 메소드는 무엇인가요?
  -  ***Stack 클래스의 peek() 메소드는 가장 위에 있는 값을 리턴만한다.***

##### 15. Stack 클래스에서 가장 위에 있는 데이터를 삭제하고 리턴하는 메소드는 무엇인가요?
  -  ***Stack 클래스의 pop() 메소드는 가장 위에 있는 데이터를 지우고 리턴한다.***


  

  