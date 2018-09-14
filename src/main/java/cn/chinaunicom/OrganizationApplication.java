package cn.chinaunicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * **************************************
 * 描述: 主应用入口
 * @ClassName: cn.chinaunicom.OrganizationApplication 
 * @author zhw 
 * @version V1.0
 * **************************************
 */
@EnableScheduling
@SpringBootApplication
public class OrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
	}
}
