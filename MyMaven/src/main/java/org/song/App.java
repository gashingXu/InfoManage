package org.song;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);//创建SpringApplication对象调用run方法
    }
}

//http://127.0.0.1:8080/hellod