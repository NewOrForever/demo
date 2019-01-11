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
	
	
	// 分支测试
	@Test
	public void testBranch(){
		System.out.println("解决冲突 & solve confict");
		
		System.out.println("master修改多处&修改多处a");
		
		System.out.println("no-ff master & no-ff冲突解决-dev");
	}
	
	// bug分支测试
	@Test
	public void testBug(){
		
	}
	
	@Test
	public void contextLoads() {
	}

}

