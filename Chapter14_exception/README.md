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
    - Exception 을 바로 확장한 클래스들의 Checked 예외이며, RuntimeException 밑에 확장 되어 있는 클래스들이 RuntimeException 들이다.   
------------------------------------------------------------
### Throwable
  - Exception 과 error 의 공통 부모 클래스는 Object 클래스와 java.lang.Throwable 클래스
  - Exception 과 error 를 처리할 때 Throwable 로 처리해도 무관 
    - Throwable 의 생성자 
      - Throwable()
      - Throwable(String message, Throwable cause)
      - Throwable(Throwable cause)
    - Throwable 클래스에 서넌 되어 있고, Exception 클래스에서 Overriding 한 메소드
      - getMessage() : 예외 메시지 출력, 사용자에게 출력할때 유용 
      - toString() : 자세한 예외 메시지 출력, 예외 클래스 이름도 같이 제공 
      - printStackTrace() : 첫줄에 예외 메시지 출력, 두번쨰 줄부터는 예외가 발생하게 된 메소드들의 호출관계(스택 트레이스) 출력    
        - printStackTrace() 는 개발시에만 사용, 운영 시스템에 사용하면 많은 양의 로그가 쌓임   
------------------------------------------------------------
### Throws , Throw
  - 메소드를 선언할 때 매개 변수 소괄호 뒤에 throws 라는 예약어를 적어 준 뒤 예외를 선언하면, 해당 메소드에서 선언한 예외가 발생했을때 호출한 메소드로 예외가 전달, 만약 메소드에서 두 가지 이상의 예외를 던질 수 있다면 , implements 처럼 콤마로 구분하여 예외 클래스의 이름을 적어주면 됨  
  - try 블록 내에서 예외를 발생시킬 경우에는 throw 라는 예약어를 적어 준 뒤 예외 객체를 생성하거나, 생성 되어 있는 객체를 명시해준다, throw한 예외 클래스가 catch 블록에 선언 되어 있지 않거나, throws 선언에 포함되어 있지 않으면 컴파일 에러 발생    
  - catch 블럭에서 예외를 throw할 경우에도 메소드 선언의 throws 구문에 해당 예외가 정의되어 있어야만 한다.   
------------------------------------------------------------
### 자바 예외처리 전략 
  - 예외가 항상 발생 하지 않고, 실행시에 발생할 확률이 매우 높은 경우에는 런타임 예외로 만드는것이 나음 
    - 클래스 선언시 extends Exception 보다는 extends RuntimeException 으로 선언하면 throw 하는 메소드를 사용하더라도 호출한 메소드에서 try-catch 로 묶지 않아도 컴파일시에 예외 발생하지 않음 
  - 이 경우에 구조적인 안전장치가 필요 
    - try-catch 로 묶지 않은 메소드를 호출하는 메소드에서 예외를 처리하는 try-catch 가 되어있어야함
```java
public void methodCaller(){
  try{
    methodCallee();
  }catch(Exception e){
    // 예외처리
  }
}

public void methodCallee(){
  // RuntimeException 예외 발생 가능성 있는 부분 
}
```
  

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
