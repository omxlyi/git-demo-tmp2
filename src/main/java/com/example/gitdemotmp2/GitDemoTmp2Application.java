package com.example.gitdemotmp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoTmp2Application {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoTmp2Application.class, args);

        System.out.println("第二次修改");

        System.out.println("第三次修改");

        System.out.println("第四次修改，in 2.0");

        System.out.println("第五次修改，in master");

        System.out.println("第五次修改 in 2.0");

        System.out.println("第六次修改 push test");

        System.out.println("第七次修改 in github");
    }

}
