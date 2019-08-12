package com.contentstack.sdk.utility;

import com.contentstack.sdk.utility.CSAppConstants.RequestMethod;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

public class CSAppConstantsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    RequestMethod.valueOf(null);

    // The method is not expected to return due to exception thrown
  }
}
