package com.contentstack.sdk;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SyncStackTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getJSONResponseOutputNull() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertNull(syncStack.getJSONResponse());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLimitOutputZero() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertEquals(0, syncStack.getLimit());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPaginationTokenOutputNull() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertNull(syncStack.getPaginationToken());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSkipOutputZero() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertEquals(0, syncStack.getSkip());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSyncTokenOutputNull() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertNull(syncStack.getSyncToken());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getURLOutputNull() {

    // Arrange
    final SyncStack syncStack = new SyncStack();

    // Act and Assert result
    Assert.assertNull(syncStack.getURL());
  }
}
