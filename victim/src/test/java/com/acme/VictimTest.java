package com.acme;

import org.junit.jupiter.api.Test;


public class VictimTest {

  @Test
  public void testMessWith() {
    Pojo pojo = new Pojo();
    Victim victim = new Victim();
    victim.messWith(pojo);
  }
}
