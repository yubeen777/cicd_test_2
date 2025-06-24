package org.example.cicdtest2.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MainControllerTest {

  @Test
  void hello() {
//    Assertions.assertThat(true).isTrue();
    throw  new RuntimeException("강제 오류 발생");
  }
}