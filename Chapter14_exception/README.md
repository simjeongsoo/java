## Chapter14 exception


### 예외의 종류 
  1. check exception
  2. error
  3. runtime exception 혹은 unchecked excepion  
  - 예외의 구분 : error 와 unchecked exception 을 제외한 모든 예외는 check exception
    - error  
      - 자바 프로그램에서 밖에서 발생한 예외 ex) 디스크고장, 메인보드고장 으로 인한 자바 프로그램 동작 불가 
      - error 는 프로세스에 영향 
    - runtime exception  
      - 예외가 발생할 것을 미리 감지 하지 못했을 때 발생 
      - 런타임 예외에 해당하는 모든 예외들은 RuntimeException 을 확장한 예외 
      - ex) NullPointException 을 묶어 주지 않는다고해서 컴파일 할때 예외가 발생하지 않는다, 하지만 실행시에는 예외 발생 
      - 실행시에 예외가 발생하기 때문에 런타임 예외라고 함 
      - 컴파일 시에 체크를 하지 않기 때문에 unchecked exception 이라고도 부름 
  - 예외 클래스 상관 관계도   
  ![Exception Relation](https://github.com/simjeongsoo/-GodOfJava/blob/587bff9145a4d292856a0a91a4aa0c5fd8c3e84c/Chapter14_exception/img/ExceptionRelation.png)   
    - Exception 을 바로 확장한 클래스들의 Checked 예외이며, RuntimeException 밑에 확장 되어 있는 클래스들이 RuntimeException 들이다 

------------------------------------------------------------

### 정리
##### 1. 예외를 처리하기 위한 세가지 블록
  - ***예외는 try - catch - finally 블록으로 처리한다.***

##### 2. "여기에서 예외가 발생할 것이니 조심하세요"라고 선언하는 블록
  - ***예외가 발생 가능한 부분을 try 블록으로 묶어 준다.***

##### 3.  "예외가 발생하던 안하던 얘는 반드시 실행되어야 됩니다."라는 블록
  - ***finally 블록은 예외 발생 여부와 상관 없이 무조건 실행하도록 할 때 사용한다.***

##### 4. 예외의 종류 세가지
  - ***예외는 다음의 3가지로 나뉜다.***
    - checked exception
    - error
    - runtime exception 혹은 unchecked exception
    
##### 5. 프로세스에 치명적인 영향을 주는 문제가 발생한 것
  - ***error는 치명적인 오류를 의미한다. 기본적으로는 프로그램 내에서 발생한다기 보다는 JVM 이나 시스템에서 문제가 발생했을 때 error가 발생한다.***
    
##### 6. try나 catch 블록 내에서 예외를 발생시키는 예약어
  -  ***throw를 사용하여 새로운 예외를 발생시키면, 해당 예외를 호출한 메소드로 던진다.***

##### 7. 메소드 선언시 어떤 예외를 던질 수도 있다고 선언할 때 사용하는 키워드
  -  ***throw가 메소드 내에 있다면 메소드 선언시 throws 를 사용하여 던질 예외의 종류를 명시하는 것이 좋다.***

##### 8. 직접 예외를 만들 때 어떤 클래스의 상속을 받아야 하는지
  -  ***Exception클래스를 확장하여 예외 클래스를 만들 수 있다.  
하지만, 이렇게 되면 무조건 해당 예외를 던지는 메소드에서 try-catch로 묶어야 한다는 단점이 있다.  
따라서, RuntimeException 클래스를 확장하여 선언하는 것을 권장한다.***
