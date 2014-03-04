package com.ifeng.alw.test;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ifeng.alw.realize.Freemaker;

import freemarker.template.Template;

public class FreemakerTest {

	@Test
	public void test() {
		Map root = new HashMap();
		root.put("user", "admin");
		Map latest = new HashMap();
		root.put("latestProduct", latest);
		latest.put("url", "/html/main.html");
		latest.put("name", "green mouse");
		System.out.println(root);
		try {
			Template temp = Freemaker.cfg.getTemplate("test.ftl");
			Writer out = new OutputStreamWriter(System.out);
			temp.process(root, out);
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("somewhere is wrong");
			e.printStackTrace();
		}
	}

}
