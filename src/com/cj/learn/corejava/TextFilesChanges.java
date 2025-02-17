package com.cj.learn.corejava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TextFilesChanges {

	public static void main(String[] args) throws IOException
	{
		File fle = new File("C:\\New folder\\Sample.txt");
		
		String c = FileUtils.readFileToString(fle,"UTF-8");
		System.out.println(c);
		System.out.println("------------------------");
		FileUtils.write(fle, "\nLearning is Growing","UTF-8", true);
		String c1 = FileUtils.readFileToString(fle,"UTF-8");
		System.out.println(c1);
		System.out.println("------------------------");
		FileUtils.write(fle, "\nLearning is Growing","UTF-8", false);
		String c2 = FileUtils.readFileToString(fle,"UTF-8");
		System.out.println(c2);
	}
}
