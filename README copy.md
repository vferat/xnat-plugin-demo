# XNAT BIDS Plugin #

This repository contains the source code of the BIDS XNAT plugins:

- [ ] Add new xnat datatypes to handle BIDS metadata.
- [ ] Create views to allow users to edits some of the BIDS metadata.

## Folder Structure

- ```/src/main/resources/schemas/ex/```

Contains the XML schemas (.xsd) defining new datatypes.

- ```/src/main/resources/META-INF/resources/templates/screens/```

Contains the `edit` and `report` views for the new datatypes

## Build

To build the plugin type:
```
CI=true ./gradlew clean xnatDataBuilder xnatPluginJar
```

## Import plugin in XNAT

To add the plugin to xnat, you must add ```xnat-ex-1.0.0-SNAPSHOT-xpl.jar``` to your xnat plugin folder.

```
sudo cp ./build/libs/xnat-ex-1.0.0-SNAPSHOT-xpl.jar  [PATH_TO_XNAT]/xnat/plugins/xnat-ex-1.0.0-SNAPSHOT-xpl.jar
```

## XNAT Template plugin

This repository is based on the [template plugin](https://bitbucket.org/xnatx/xnat-template-plugin/src/master) provided by the XNAT Team

It provides a basic XNAT plugin project that you can use 
as a basis for creating your own custom plugins. It includes examples of most basic XNAT plugin
functions. You should keep and expand the parts you need and remove those you don't.

> **Note:** Search throughout your new plugin project for the string "TODO:". This has been added
 in comments throughout the template project to help you find areas you may need to modify or 
 remove for your particular plugin project. Once you have created your own plugin project from
 this template, you can remove all of the "TODO:" comments. 

> **Note:** This plugin is not really meant to be built and run inside of XNAT. You _can_ build it, but
 the results may not be what you expect. Instead, this is meant as a starting point for developing a
 new plugin. Once you've implemented your own functionality in the plugin, you should replace the
 contents of this README with your own documentation. You can then build and deploy your plugin using 
 the build described above. 

### Building

To build the XNAT template plugin:

1. If you haven't already, clone this repository and cd to the newly cloned folder.
1. Build the plugin: `./gradlew xnatDataBuilder xnatPluginJar` (on Windows, you can use the batch file: `gradlew.bat jar`). This should build the plugin in the file **build/libs/xnat-template-plugin-1.0.0-SNAPSHOT-xpl.jar** (the version may differ based on updates to the code).
1. Copy the plugin jar to your plugins folder: `cp build/libs/xnat-template-plugin-1.0.0-SNAPSHOT-xpl.jar /data/xnat/home/plugins`

You'll end up repeating the second step pretty frequently. You can clean out the `build` folder with the `clean` task, which can be run on its own or with other tasks. For example, as separate tasks:

```
./gradlew clean
./gradlew xnatDataBuilder xnatPluginJar
```

You can also combine these into a single command:

```
./gradlew clean xnatDataBuilder xnatPluginJar
```

Also, [build.gradle](build.gradle) includes this statement:

```
compileJava.dependsOn project.tasks["xnatDataBuilder"]
```

That means that any task that depends on `compileJava` (which any of the `jar` tasks do) automatically triggers `xnatDataBuilder` as well, so running `xnatPluginJar` ends up running `xnatDataBuilder` automatically. You may still want to run `xnatDataBuilder` on its own sometimes, just to inspect any code that's generated from your data-type schemas.

# Additional Resources

## List of other plugins

- https://github.com/ckolbPTB/xnat-ismrmrd
- https://bitbucket.org/icrimaginginformatics/ohif-viewer-xnat-plugin/src/master/
- https://github.com/VUIIS/xnat-plugins
- https://github.com/mattsouth/xnat-plugins
