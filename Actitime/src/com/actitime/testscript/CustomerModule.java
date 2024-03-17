package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import dev.failsafe.internal.util.Assert;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer() {
	Reporter.log("CreateCustomer",true);
	org.testng.Assert.fail();
}
}
