package com.contentstack.sdk;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ConfigTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getEnvironmentOutputNull() {

    // Arrange
    final Config config = new Config();

    // Act and Assert result
    Assert.assertNull(config.getEnvironment());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHostOutputNotNull() {

    // Arrange
    final Config config = new Config();

    // Act and Assert result
    Assert.assertEquals("cdn.contentstack.io", config.getHost());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getVersionOutputNotNull() {

    // Arrange
    final Config config = new Config();

    // Act and Assert result
    Assert.assertEquals("v3", config.getVersion());
  }
}
