package com.ifeng.alw.realize;

import java.io.File;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;

public class Freemaker {
	public static Configuration cfg=config();
	private Freemaker(){
		
	}
	private static Configuration config(){
		try {
			Configuration cfg1=new Configuration();
			cfg1.setDirectoryForTemplateLoading(
					new File("WebContent/templates"));
			cfg1.setObjectWrapper(new DefaultObjectWrapper());
			return cfg1;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
