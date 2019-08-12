package com.contentstack.sdk;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ContentstackTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNotNullNotNullNullOutputException()
      throws Exception {

    // Act
    thrown.expect(Exception.class);
    Contentstack.stack("\u0001", "", "?", null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNotNullNotNullOutputException()
      throws Exception {

    // Act
    thrown.expect(Exception.class);
    Contentstack.stack(
        "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003>\u53e3\u53e3\u53e3",
        "", "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNotNullNotNullOutputException2()
      throws Exception {

    // Act
    thrown.expect(Exception.class);
    Contentstack.stack("\u9ffd\u9ffe", "?", "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNotNullNotNullOutputException3()
      throws Exception {

    // Act
    thrown.expect(Exception.class);
    Contentstack.stack("", "?", "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNotNullNullOutputNullPointerException()
      throws Exception {

    // Act
    thrown.expect(NullPointerException.class);
    Contentstack.stack(
        "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003>\u53e3\u53e3\u0003",
        "????????", null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNotNullNullNotNullOutputNullPointerException()
      throws Exception {

    // Act
    thrown.expect(NullPointerException.class);
    Contentstack.stack(
        "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
        null, "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void stackInputNullNotNullNotNullOutputNullPointerException()
      throws Exception {

    // Act
    thrown.expect(NullPointerException.class);
    Contentstack.stack(null, "?", "?");

    // The method is not expected to return due to exception thrown
  }
}
