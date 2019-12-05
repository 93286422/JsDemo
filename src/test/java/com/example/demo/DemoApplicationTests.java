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

}