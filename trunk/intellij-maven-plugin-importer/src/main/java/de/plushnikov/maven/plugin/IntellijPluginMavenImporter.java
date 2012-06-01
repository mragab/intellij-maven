package de.plushnikov.maven.plugin;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.startup.StartupManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.devkit.build.PluginBuildConfiguration;
import org.jetbrains.idea.devkit.module.PluginModuleType;
import org.jetbrains.idea.maven.importing.MavenImporter;
import org.jetbrains.idea.maven.importing.MavenModifiableModelsProvider;
import org.jetbrains.idea.maven.importing.MavenRootModelAdapter;
import org.jetbrains.idea.maven.project.MavenProject;
import org.jetbrains.idea.maven.project.MavenProjectChanges;
import org.jetbrains.idea.maven.project.MavenProjectsProcessorTask;
import org.jetbrains.idea.maven.project.MavenProjectsTree;

import java.util.List;
import java.util.Map;

/**
 * @author Plushnikov Michail
 */
public class IntellijPluginMavenImporter extends MavenImporter {

  public IntellijPluginMavenImporter() {
    super("de.plushnikov.maven.plugin", "intellij-plugin-modul-importer-plugin");
  }

  @NotNull
  @Override
  public ModuleType getModuleType() {
    return PluginModuleType.getInstance();
  }

  @Override
  public void preProcess(Module module, MavenProject mavenProject, MavenProjectChanges changes, MavenModifiableModelsProvider modifiableModelsProvider) {
    //module.setOption("test","test");
  }

  @Override
  public void process(MavenModifiableModelsProvider modifiableModelsProvider, final Module module, MavenRootModelAdapter rootModel, MavenProjectsTree mavenModel, MavenProject mavenProject, MavenProjectChanges changes, Map<MavenProject, String> mavenProjectToModuleName, List<MavenProjectsProcessorTask> postTasks) {
    //StartupManager.getInstance(module.getProject()).runWhenProjectIsInitialized(new Runnable() {
    //  public void run() {
    //    final PluginBuildConfiguration buildConfiguration = PluginBuildConfiguration.getInstance(module);
    //    buildConfiguration.createPluginXmlIfNotExist();
    //  }
    //});
  }
}
