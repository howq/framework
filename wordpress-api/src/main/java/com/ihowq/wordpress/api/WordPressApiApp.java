package com.ihowq.wordpress.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author howq
 */
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.ihowq.wordpress.api.dao")
public class WordPressApiApp {

    public static void main(String[] args) {
        SpringApplication.run(WordPressApiApp.class, args);
    }
}
