package com.chenlb.mmseg4j;

import java.io.IOException;

import com.chenlb.mmseg4j.example.Simple;

public class HcyTest {
	public static void main(String[] args) throws IOException {
		Simple segW =  new Simple();
		String words = segW.segWords("商品和服务", "|");
		System.out.println(words);
	}
}
