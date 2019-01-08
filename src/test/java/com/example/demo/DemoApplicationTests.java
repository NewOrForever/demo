package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	// 测试
	// ceshi
	@Test
	public void test(){
		System.out.println("hello git");
		System.out.println("git diff test");
		System.out.println("git diff cached");
	}
	
	@Test
	public void contextLoads() {
	}

}

