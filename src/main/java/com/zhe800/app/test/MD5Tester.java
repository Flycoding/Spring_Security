package com.zhe800.app.test;

import com.zhe800.app.util.MD5Util;
import org.junit.Test;

public class MD5Tester {
	
	@Test
	public void testEncodePassword() {
		String password = "123456";
		String salt = "luxh";
		System.out.println(MD5Util.encodePassword(password, salt));
	}
}
