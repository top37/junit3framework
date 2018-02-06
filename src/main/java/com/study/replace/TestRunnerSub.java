package com.study.replace;


import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.ResultPrinter;
import junit.textui.TestRunner;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnerSub extends TestRunner {

	/**
	 * error -> 只声明，未new，null
	 * 给一个System.out
	 */
	private ResultPrinter fPrinter = new ResultPrinter(System.out);

	public void doRun(TestSuite suite, boolean wait) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		TestResult result= createTestResult();
		result.addListener(fPrinter);
		long startTime= System.currentTimeMillis();
		for (int i = 0; i < suite.countTestCases(); i++) {
			final int index = i;
			fixedThreadPool.submit(() -> {
				System.out.println(Thread.currentThread().getName()+"---->");
				suite.testAt(index).run(result);
			});
		}
		long endTime= System.currentTimeMillis();
		long runTime= endTime-startTime;
//		fPrinter.print(result, runTime);
		invokeByMethodName("print",fPrinter,result,runTime);
		pause(wait);
		fixedThreadPool.shutdown();
	}

	@SuppressWarnings("unchecked")
	private static void invokeByMethodName(String MethodName,ResultPrinter resultPrinter,TestResult result,long runTime){
		try
		{
			Method method = ResultPrinter.class.getDeclaredMethod(MethodName,TestResult.class,long.class);
			method.setAccessible(true);
			method.invoke(resultPrinter,result,runTime);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}