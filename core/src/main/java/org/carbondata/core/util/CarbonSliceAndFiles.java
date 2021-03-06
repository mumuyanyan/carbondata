/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.carbondata.core.util;

import org.carbondata.core.datastorage.store.filesystem.CarbonFile;
import org.carbondata.core.keygenerator.KeyGenerator;

public class CarbonSliceAndFiles {
  /**
   * slice path
   */
  private String path;

  /**
   * slice fact files
   */
  private CarbonFile[] sliceFactFilesList;

  private KeyGenerator keyGen;

  /**
   * This method will be used get the slice fact files
   *
   * @return slice fact files
   */
  public CarbonFile[] getSliceFactFilesList() {
    return sliceFactFilesList;
  }

  /**
   * This method  will be used to set the slice fact files
   *
   * @param sliceFactFilesList
   */
  public void setSliceFactFilesList(CarbonFile[] sliceFactFilesList) {
    this.sliceFactFilesList = sliceFactFilesList;
  }

  /**
   * This method will return the slice path
   *
   * @return slice path
   */
  public String getPath() {
    return path;
  }

  /**
   * This method will be used to set the slice path
   *
   * @param path
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * @return the keyGen
   */
  public KeyGenerator getKeyGen() {
    return keyGen;
  }

  /**
   * @param keyGen the keyGen to set
   */
  public void setKeyGen(KeyGenerator keyGen) {
    this.keyGen = keyGen;
  }

}
