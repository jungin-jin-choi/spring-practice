# ๐ ์ด๊ฐ๋จ ๋ฐฉ๋ฌธ ํ์ ์กฐํ ์๋น์ค

- ํ์ ์ธ์ฌ์ ๋ช ๋ฒ์งธ ๋ฐฉ๋ฌธ์ธ์ง๋ฅผ ์๋ ค์ฃผ๋ ์ด๊ฐ๋จ ์น ์ ํ๋ฆฌ์ผ์ด์

<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/73eb46d282e5466b92224bf45e7b895f" width="70%">
</p>

## ๊ธฐ๋ฅ ๋ชฉ๋ก
- `http://localhost:8080/hello` ์์ฒญ ์ `HelloWorld` ๋ฌธ๊ตฌ๋ฅผ ์ถ๋ ฅ
- `http://localhost:8080/hello?name={user}` ์์ฒญ ์ `Hello {user} n๋ฒ์งธ ๋ฐฉ๋ฌธ์๋๋ค` ๋ฌธ๊ตฌ ์ถ๋ ฅ

## ์งํ ๊ฐ์ด๋
- ํด๋ก  ๋ฐ๊ธฐ `git clone https://github.com/next-step/spring-learning-test.git`
- ์ฒดํฌ์์ ๋ธ๋์น `git checkout simple`
- [1. HelloApplication ์คํํ๊ธฐ](https://github.com/next-step/spring-learning-test/tree/simple#1-helloapplication-%EC%8B%A4%ED%96%89%ED%95%98%EA%B8%B0) ๋ถํฐ ๊ฐ์ด๋๋ฅผ ์ฐธ๊ณ ํ์ฌ ์งํ
- ์์ฑ ๋ธ๋์น [simple-sample](https://github.com/next-step/spring-learning-test/tree/simple-sample)๋ฅผ ์ฐธ๊ณ ํด์ ์งํํด๋ ์ข์ `git checkout simple-sample`

---
## 1. HelloApplication ์คํํ๊ธฐ
- ํด๋ก  ๋ฐ์ ์ํ์์ ์๋ฒ๋ฅผ ๋ฐ๋ก ์คํ

<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/2c9ebdaef12b4d69b39d8ff549873160" width="70%">
</p>

- ๋ธ๋ผ์ฐ์ ์์ `http://localhost:8080` ์์ฒญ ํ ํ์ด์ง ํ์ธ
- ์๋์ ๊ฐ์ ํ์ด์ง๊ฐ ๋จ๋ฉด ์๋ฒ๊ฐ ์ ์์ ์ผ๋ก ์คํ๋ ๊ฒ

<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/2020-03-25T14%3A58%3A40.273image.png" width="70%">
</p>

---
## โ๏ธ ์์ฒญ / ์๋ต ํ๋ฆ๋
- ํด๋ผ์ด์ธํธ๋ก ๋ถํฐ ๋ฐ์ ์์ฒญ๊ณผ ์๋ต์ Spring MVC ๋ชจ๋์ ํตํด ์ฒ๋ฆฌ
<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/e0ba787b5b204a029566ba11b5ea9042" width="70%">
</p>

---
## 2. /hello ์์ฒญ ํ ์๋ต

- `http://localhost:8080/hello` ์์ฒญ ์ `HelloWorld` ๋ฌธ๊ตฌ๋ฅผ ์ถ๋ ฅํ๋ ๋ถ๋ถ ๊ตฌํ
- `HelloController.java` ํ์ผ์ ์์ฑํ์ฌ ์ฝ๋๋ฅผ ์์ฑ
- `@RestController`์ ํตํด ์์ฒญ์ ์ฒ๋ฆฌํ  ํด๋์ค์์ ์ง์ 
- `@GetMapping("/hello")`์ ํตํด `/hello` ์์ฒญ์ ์ฒ๋ฆฌํ  ๋ฉ์๋๋ฅผ ์ง์ 

```java
package nextstep.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "") String name) {
        return "Hello " + name;
    }
}
```

- ๋ธ๋ผ์ฐ์ ์์ `localhost:8080/hello?name=๋ธ๋ผ์ด`์ผ๋ก ์์ฒญ ํ ํ์ด์ง ํ์ธ (์ฌ์์ํด์ผ ์ฝ๋ ๋ณ๊ฒฝ์ด ๋ฐ์๋จ)

<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/2020-03-25T15%3A03%3A58.223image.png" width="70%">
</p>

---
## โ๏ธ DB ์ ๊ทผ ํ๋ฆ๋
- DB ์ ๊ทผ์ ๋ํ ๋ถ๋ถ์ Spring JDBC ๋ชจ๋์ ํตํด ์ฒ๋ฆฌ
<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/cd11ddf0ad55472ca75bbfc689004fb8" width="70%">
</p>

---
## 3. ํ์ด๋ธ ์ ์

- ์์ฒญ ์ด๋ ฅ์ ์ ์ฅํ  ํ์ด๋ธ์ ์คํค๋ง ์ ์

> resources/schema.sql
```
create table hello(
    id bigint auto_increment,
    name varchar(255) not null,
    primary key(id)
);
```

---
## 4. Dao ์์ฑ
- <span class=highlight>์ฟผ๋ฆฌ๋ฅผ ๋ฉ์๋์ ๋งคํ</span>ํ์ฌ ๋ฉ์๋๋ฅผ ํตํด DB์ ์ ๊ทผ

```java
package nextstep.helloworld;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
    private JdbcTemplate jdbcTemplate;

    public HelloDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(String name) {
        String SQL = "insert into HELLO (name) values (?)";
        jdbcTemplate.update(SQL, new Object[]{name});
    }

    public int countByName(String name) {
        String sql = "select count(1) from HELLO where name=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, name);
    }
}
```

---
## 5. Controller์์ Dao ์ฌ์ฉํ๊ธฐ
- `HelloDao` ๊ฐ์ฒด๋ฅผ ๊ฐ๋ฐ์๊ฐ ์ง์  ์์ฑํ์ง ์๊ณ  ์คํ๋ง ์ปจํ์ด๋๋ก ๊ด๋ฆฌํ๊ธฐ ์ํด `HelloController`์ `HelloDao` ์์กด์ ์ฃผ์
- ์์กด์ฑ ์ฃผ์์ ์์ฑ์ ์ฃผ์ ๋ฐฉ๋ฒ์ ์ถ์ฒ

### ์์ฑ์ ์ฃผ์
```java
...

@RestController
public class HelloController {
    private HelloDao helloDao;

    public HelloController(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    @GetMapping("/hello")
    ...
}
```

---
## 6. ์ปจํธ๋กค๋ฌ ๊ธฐ๋ฅ ์์ 
- name ๊ฐ์ด ์์ผ๋ฉด ๊ทธ๋ฅ HelloWorld๋ฅผ ํ๋ฉด์ ํ์
- name ๊ฐ์ด ์์ผ๋ฉด ๋ช๋ฒ์งธ ๋ฐฉ๋ฌธ์ธ์ง ์๋ ค์ค

```java
package nextstep.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloDao helloDao;

    public HelloController(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "") String name) {
        if (name.isEmpty()) {
            return "HelloWorld!";
        }

        helloDao.insert(name);
        int count = helloDao.countByName(name);
        return "Hello " + name + " " + count + "๋ฒ์งธ ๋ฐฉ๋ฌธ์๋๋ค.";
    }
}
```

---
## ์์ฑ!

<p align="center">
  <img src="https://techcourse-storage.s3.ap-northeast-2.amazonaws.com/2020-03-25T14%3A44%3A22.544image.png" width="70%">
</p>
