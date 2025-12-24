package com.skycatdev.templatetest;

//? if fapi: >= 0.118.4 {
import net.fabricmc.fabric.api.gametest.v1.CustomTestMethodInvoker;
//?} else {
/*import net.fabricmc.fabric.api.gametest.v1.FabricGameTest;
import net.minecraft.gametest.framework.GameTest;
*///?}
import net.minecraft.gametest.framework.GameTestHelper;

import java.lang.reflect.Method;
//? if fapi: >= 0.118.4 {
public class TemplateModGameTest implements CustomTestMethodInvoker {
    @Override
    public void invokeTestMethod(GameTestHelper gameTestHelper, Method method) {

    }
//?} else {
    /*public class TemplateModGameTest implements FabricGameTest {
    @GameTest(template = FabricGameTest.EMPTY_STRUCTURE)
    public void succeed(GameTestHelper gameTestHelper) {
        gameTestHelper.succeed();
    }
*///?}
}