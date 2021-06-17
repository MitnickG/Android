package com.example.asanandroid;

public class JniInterface {
	static {
		System.loadLibrary("test_native");
	}

	public static native int test();

}
