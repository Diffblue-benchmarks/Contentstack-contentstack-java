package com.contentstack.sdk;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;

public class AssetTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getTagsOutputNull() {

    // Arrange
    final Asset asset = new Asset();
    asset.headerGroup_local = null;
    asset.json = null;
    asset.tagsArray = null;
    asset.stackInstance = null;
    asset.uploadUrl = null;
    asset.assetUid = null;
    asset.contentType = null;
    asset.fileSize = null;
    asset.headerGroup_app = null;
    asset.fileName = null;

    // Act and Assert result
    Assert.assertNull(asset.getTags());
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeHeaderInputNotNullOutputVoid3() {

    // Arrange
    final Asset asset = new Asset();
    final LinkedHashMap<String, Object> linkedHashMap =
        new LinkedHashMap<String, Object>();
    linkedHashMap.put("2", null);
    asset.headerGroup_local = linkedHashMap;
    asset.json = null;
    asset.tagsArray = null;
    asset.stackInstance = null;
    asset.uploadUrl = null;
    asset.assetUid = null;
    asset.contentType = null;
    asset.fileSize = null;
    asset.headerGroup_app = null;
    asset.fileName = null;

    // Act
    asset.removeHeader("2");

    // Assert side effects
    final LinkedHashMap<String, Object> linkedHashMap1 =
        new LinkedHashMap<String, Object>();
    Assert.assertEquals(linkedHashMap1, asset.headerGroup_local);
  }

  // Test written by Diffblue Cover.

  @Test
  public void setHeaderInputNotNullNotNullOutputVoid() {

    // Arrange
    final Asset asset = new Asset();
    final LinkedHashMap<String, Object> linkedHashMap =
        new LinkedHashMap<String, Object>();
    asset.headerGroup_local = linkedHashMap;
    asset.json = null;
    asset.tagsArray = null;
    asset.stackInstance = null;
    asset.uploadUrl = "foo";
    asset.assetUid = "foo";
    asset.contentType = "Bar";
    asset.fileSize = null;
    asset.headerGroup_app = null;
    asset.fileName = null;
    final String key = "a\'b\'c";
    final String value = "3";

    // Act
    asset.setHeader(key, value);

    // Assert side effects
    final LinkedHashMap<String, Object> linkedHashMap1 =
        new LinkedHashMap<String, Object>();
    linkedHashMap1.put("a\'b\'c", "3");
    Assert.assertEquals(linkedHashMap1, asset.headerGroup_local);
  }
}
