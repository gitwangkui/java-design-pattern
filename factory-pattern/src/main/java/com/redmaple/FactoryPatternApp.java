package com.redmaple;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 若成风
 * @description
 * @date 2020/12/27 0:36
 * @copyright (c) 2020, all rights reserved
 **/
@SpringBootApplication
public class FactoryPatternApp {
    public static void main(String[] args) {
        SpringApplication.run(FactoryPatternApp.class, args);
    }
}
