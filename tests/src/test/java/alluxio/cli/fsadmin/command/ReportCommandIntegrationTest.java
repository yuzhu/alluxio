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

package alluxio.cli.fsadmin.command;

import alluxio.cli.fsadmin.AbstractFsAdminShellTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for report command.
 */
public final class ReportCommandIntegrationTest extends AbstractFsAdminShellTest {
  @Test
  public void masterNotRunning() throws Exception {
    mLocalAlluxioCluster.stopMasters();
    mFsAdminShell.run("report");
    String expected = "The Alluxio leader master is not currently serving requests.\n"
        + "Please check your Alluxio master status\n";
    Assert.assertEquals(expected, mErrOutput.toString());
  }

  @Test
  public void reportCategoryInvalid() {
    mFsAdminShell.run("report", "invalidCategory");
    ReportCommand reportCommand = new ReportCommand();
    String expected = String.format("%s%n%s%n%s%n",
        reportCommand.getUsage(),
        reportCommand.getDescription(),
        "report category is invalid.");
    Assert.assertEquals(expected, mOutput.toString());
  }
}
