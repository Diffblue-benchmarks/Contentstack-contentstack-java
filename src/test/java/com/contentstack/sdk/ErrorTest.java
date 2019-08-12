package com.contentstack.sdk;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.LinkedHashMap;
import java.util.Map;

public class ErrorTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getErrorCodeOutputZero() {

    // Arrange
    final Error error = new Error();

    // Act and Assert result
    Assert.assertEquals(0, error.getErrorCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getErrorsOutput0() {

    // Arrange
    final Error error = new Error();

    // Act
    final Map<String, Object> actual = error.getErrors();

    // Assert result
    final LinkedHashMap<String, Object> linkedHashMap =
        new LinkedHashMap<String, Object>();
    Assert.assertEquals(linkedHashMap, actual);
  }
}
