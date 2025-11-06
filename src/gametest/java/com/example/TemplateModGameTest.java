package com.example;

import net.fabricmc.fabric.api.gametest.v1.CustomTestMethodInvoker;
import net.minecraft.gametest.framework.GameTestHelper;

import java.lang.reflect.Method;

public class TemplateModGameTest implements CustomTestMethodInvoker {

    @Override
    public void invokeTestMethod(GameTestHelper gameTestHelper, Method method) throws ReflectiveOperationException {

    }
}