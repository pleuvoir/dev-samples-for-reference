package io.github.pleuvoir;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.github.pleuvoir.chapter02.Config2;

public class ChapterTest02 {

	@Test
	public void context() {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config2.class);
		
		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		
		// 输出容器中所有 bean name
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		
	}

}
