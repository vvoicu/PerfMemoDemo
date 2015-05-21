package com.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.work.EditMyAccountTest;
import com.tests.work.SearchProductTest;
import com.tests.work.account.NewAccountPerfectTest;
import com.tests.work.account.VerifyNewAccountEmailTest;


@SuiteClasses({
	NewAccountPerfectTest.class,
	VerifyNewAccountEmailTest.class,
	EditMyAccountTest.class,
	SearchProductTest.class,
})
@RunWith(Suite.class)
public class GeneralSuite {

}
