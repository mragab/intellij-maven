# Provides maven build configuration and plugins for Jetbrains IntelliJ IDEA and maven to simplify work on ItelliJ IDEA plugins with maven. #

## intellij-maven ##
It can be very annoying, if you want to write a new plugin for IntelliJ and want to use maven to setup and manage all of dependencies and build life cycle., because you normlly don't have access to any maven-ready artifacs of IntelliJ.

"intellij-maven" is a maven project which can be used to create all of IntelliJ IDEA (Community version) build artifacts with maven and to install them into local maven repository.

Look here for more information: [IntelliJMaven](IntelliJMaven.md)

## intellij-maven-plugin-importer ##
You can also install Idea plugin ["IntelliJ plugin modul maven importer"](http://plugins.intellij.net/plugin/?idea&id=7054)  and add:
```xml

```
<plugin>
    <groupId>de.plushnikov.maven.plugin</groupId>
    <artifactId>intellij-plugin-modul-importer-plugin</artifactId>
    <version>0.1</version>
</plugin>
```
```
to your maven project!

Now your maven project will be imported as plugin\_modul into IntelliJ IDEA.

