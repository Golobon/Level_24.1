package Lecture_11_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
*/

public class Solution {
public static void main(String[] args) throws IOException {
try (FileInputStream fIS = new FileInputStream(args[1]);
     FileOutputStream fOS = new FileOutputStream(args[2])) {
switch (args[0]) {
    case "-e": { while (fIS.available() > 0) { fOS.write(fIS.read() + 1); } }
    case "-d": { while (fIS.available() > 0) { fOS.write(fIS.read() - 1); } } } } } }
