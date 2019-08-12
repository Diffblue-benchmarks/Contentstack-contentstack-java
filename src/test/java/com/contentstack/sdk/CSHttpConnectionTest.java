package com.contentstack.sdk;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CSHttpConnectionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getFormParamsOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.getFormParams());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHeadersOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.getHeaders());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInfoOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.getInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRequestMethodOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.getRequestMethod());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTreatDuplicateKeysAsArrayItemsOutputFalse() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertFalse(cSHttpConnection.getTreatDuplicateKeysAsArrayItems());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFormParamsGETInputNotNullOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("A1B2C3", cSConnectionRequest);
    final HashMap<String, Object> params = new HashMap<String, Object>();

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.setFormParamsGET(params));
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFormParamsGETInputNullOutputNull() {

    // Arrange
    final CSConnectionRequest cSConnectionRequest = new CSConnectionRequest();
    final CSHttpConnection cSHttpConnection =
        new CSHttpConnection("A1B2C3", cSConnectionRequest);

    // Act and Assert result
    Assert.assertNull(cSHttpConnection.setFormParamsGET(null));
  }
}
