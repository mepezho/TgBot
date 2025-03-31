package org.example;

import java.io.IOException;
import java.util.Properties;

import org.example.bot.MyFirstBot;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        new MyFirstBot();
        sc.next();

    }
}