/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.master.table;

import alluxio.grpc.table.PrincipalType;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Objects;

/**
 * The database information class.
 */
public class DatabaseInfo {
  private String mLocation;
  private String mOwnerName;
  private PrincipalType mOwnerType;
  private String mComment;
  private Map<String, String> mParameters;

  /**
   * Construct a default databaseinfo class.
   */
  public DatabaseInfo() {
    mLocation = "";
    mOwnerName = "";
    mOwnerType = PrincipalType.USER;
    mComment = "";
    mParameters = ImmutableMap.of();
  }

  /**
   * Full constructor for database info.
   * @param location location
   * @param ownerName owner name
   * @param ownerType owner type
   * @param comment comment
   * @param params parameters
   */
  public DatabaseInfo(String location, String ownerName, PrincipalType ownerType, String comment,
      Map<String, String> params) {
    mLocation = location;
    mOwnerName = ownerName;
    mOwnerType = ownerType;
    mComment = comment;
    mParameters = params;
  }

  /**
   * Set location.
   * @param location new location
   */
  public void setLocation(String location) {
    mLocation = location;
  }

  /**
   * Set owner name.
   * @param ownerName new owner name
   */
  public void setOwnerName(String ownerName) {
    mOwnerName = ownerName;
  }

  /**
   * Set owner type.
   * @param ownerType new owner type
   */
  public void setOwnerType(PrincipalType ownerType) {
    mOwnerType = ownerType;
  }

  /**
   * Set comment.
   * @param comment new comment
   */
  public void setComment(String comment) {
    mComment = comment;
  }

  /**
   * Set parameters.
   * @param param new parameters
   */
  public void setParameters(Map<String, String> param) {
    mParameters = param;
  }

  /**
   * @return the location
   */
  public String getLocation() {
    return mLocation;
  }

  /**
   * @return the owner name
   */
  public String getOwnerName() {
    return mOwnerName;
  }

  /**
   * @return the owner type
   */
  public PrincipalType getOwnerType() {
    return mOwnerType;
  }

  /**
   * @return the comment
   */
  public String getComment() {
    return mComment;
  }

  /**
   * @return the parameter
   */
  public Map<String, String> getParameters() {
    return mParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseInfo that = (DatabaseInfo) o;
    return Objects.equals(mLocation, that.mLocation)
        && Objects.equals(mOwnerName, that.mOwnerName)
        && mOwnerType == that.mOwnerType
        && Objects.equals(mComment, that.mComment)
        && Objects.equals(mParameters, that.mParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mLocation, mOwnerName, mOwnerType, mComment, mParameters);
  }

  @Override
  public String toString() {
    return "DatabaseInfo{"
        + "Location='" + mLocation + '\''
        + ", OwnerName='" + mOwnerName + '\''
        + ", OwnerType=" + mOwnerType
        + ", Comment='" + mComment + '\''
        + ", Parameters=" + mParameters
        + '}';
  }
}
