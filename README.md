# spring-mybatis-basic-project 스프링 마이바티스 프로젝트

### 마이바티스(MariaDB)연동된 빈 프로젝트
**jdbc.properties**에서 **jdbc.username**, **jdbc.password** 정보만 변경해서 사용하면 된다.
**Junit**으로 **DB연결**, **dataSource** 연결, **sqlSession**이 정상적으로 생성되었는지 확인할 수 있다.

### 추가한 라이브러리
* 스프링 시큐리티(Spring Security)
* 타일즈(Tiles)
* 마이바티스(MyBatis) - MariaDB
* Log4jdbc
* 롬복(Lombok)
* 하이버네이트 밸리데이터(Hibernate Validator)
* AOP

### 버전정보
* java-version 1.8
* org.springframework-version 4.3.2.RELEASE
* org.aspectj-version 1.9.5
* org.slf4j-version 1.7.30
* log4j 1.2.15 1.2.17
* javax.servlet-api 3.1.0
* jsp-api 2.2
* junit 4.12
* maven-eclipse-plugin 2.10
* maven-compiler-plugin 3.7.0
* maven-compiler-plugin > source 1.8
* maven-compiler-plugin > target 1.8
* exec-maven-plugin 1.6.0
* web.xml파일에 dtd web-app를 3.1로 변경