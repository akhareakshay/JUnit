package com.codewithakshayy.junit.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*@RunWith(Suite.class)
 * @SuiteClasses(TestClass1.class, TestClass2.class) 
 * or 
@Suite.SuiteClasses({ TestClass1.class, TestClass2.class })
*/
@RunWith(Suite.class)
//@Suite.SuiteClasses({ Test1.class, Test2.class })
@SuiteClasses({Test1.class,Test2.class})
public class SuitesExample {

}
