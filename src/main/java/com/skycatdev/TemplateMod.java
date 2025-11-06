package com.skycatdev;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
    TODO:
     - Update package names (don't forget mixins.json)
        - client source set
        - gametest source set
        - main source set
        - test source set
     - Add an icon
        - gametest source set
        - main source set
     - Update fabric.mod.json
        - Description
        - Contact
        - License
     - Create your versions (see settings.gradle.kts and the versions folder)
     - Update gradle.properties
        - mod version
        - mod id
        - mod name
      - Check dependencies
        - Loom in gradle.properties
        - Everything else in versions/.../gradle.properties (normally no need for the template ones)
      - Change MOD_ID in TemplateMod
      - Update class names
        - client/.../datagen/TemplateModDataGenerator
        - client/.../TemplateModClient
        - gametest/.../TemplateModGameTest
        - main/.../TemplateMod
      - Update LICENSE with copyright year
 */

public class TemplateMod implements ModInitializer {
    public static final String MOD_ID = "template";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final String VERSION = /*$ mod_version*/ "0.1.0";
    public static final String MINECRAFT = /*$ minecraft*/ "1.21.9";

    @Override
    public void onInitialize() {

    }

    public static ResourceLocation locate(String path) {
        //? if <1.21 {
        /*return new ResourceLocation(MOD_ID, path);
        *///?} else
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}