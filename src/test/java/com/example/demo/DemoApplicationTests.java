package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		List<String> listString=new ArrayList<>();
	}
    @Test
	public void test1(){
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"aa");
		map.put(1,"bb");
		System.out.println(map.get(1));
	}
	@Test
	public void test2(){
		int arr[][]=new int[7][11];
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				arr[i][j]=0;
			}
		}
		System.out.println(arr[0][1]);
	}
	@Test
	public void test4(){
		System.out.println("我是jsDemo2");
	}
	@Test
	public void test3(){
		System.out.println("我是jsDemo1");
	}
	@Test
	public void s1(){
		System.out.println("这里是s1分支");
	}

	@Test
	public void s2(){
		System.out.println("这里是s2");
	}

	@Test
	public void t1(){
		System.out.println("这里是t1分支");
	}
	@Test
	public void t2(){
		System.out.println("这里是t2分支");
	}

	@Test
	public void t3(){
		System.out.println("从t1输出一段111话");
	}

}
