package com.douzone.emaillist.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

import com.douzone.emaillist.dao.EmailListDao;

@Configuration
@ComponentScan("com.douzone.emaillist.dao")
public class RootConfig {
	

}
