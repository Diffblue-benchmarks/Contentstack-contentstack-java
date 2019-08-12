package com.contentstack.sdk.utility;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CSAppUtilsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.

  @Test
  public void getMD5FromStringInputNotNullOutputNull() {

    // Arrange
    final CSAppUtils cSAppUtils = new CSAppUtils();
    final String value = "";

    // Act
    final String actual = cSAppUtils.getMD5FromString(value);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getMD5FromStringInputNullOutputNullPointerException() {

    // Arrange
    final CSAppUtils cSAppUtils = new CSAppUtils();
    final String value = null;

    // Act
    thrown.expect(NullPointerException.class);
    cSAppUtils.getMD5FromString(value);

    // The method is not expected to return due to exception thrown
  }
}
