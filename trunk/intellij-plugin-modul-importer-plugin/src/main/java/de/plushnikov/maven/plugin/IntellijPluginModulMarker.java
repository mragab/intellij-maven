package de.plushnikov.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;

/**
 * Goal which does nothing, just a marker for IntelliJ Maven Importer
 *
 * @goal run
 * @phase process-sources
 */
public class IntellijPluginModulMarker extends AbstractMojo {

  /**
   * Path to plugin META-INF directory
   * @parameter default-value="${project.basedir}/src/main/resources"
   */
  private File pathToMetaInfDirectory;

  /**
   * Path to userManifest file
   * @parameter
   */
  private File pathToUserManifest;

  public void execute() throws MojoExecutionException {

  }
}
