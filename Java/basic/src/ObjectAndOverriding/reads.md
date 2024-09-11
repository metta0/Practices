1. Object 클래스
-Object와 overiding
equals, hashCode, toString



2. java.lang패키지

- java.lang패키지
:래퍼클래스란 기본 자료타입을(primitive type)을 객체로 다루기 위해서 사용하는 클래스들.

- 오토박싱/ 오토언박싱
:기본 타입(primitive type) 데이터를 객체 타입(reference type)의 데이터로 자동 형변환 시켜주는 기능

- StringBuffer 클래스, 메소드 체이닝
: String 가변 클래스
: 자신을 리턴하여, 계속해서 자신의 메소드를 호출하는 방식 
: 문자열을 더하면 StringBuffer로 반환된다.

- String 클래스
: 불변.
for(int i = 0; i < 100; i++){
    //str = str + "*"
    sb.append("*")
}

- Math
: static으로 정의.
: max,min,abs,random,sqrt

