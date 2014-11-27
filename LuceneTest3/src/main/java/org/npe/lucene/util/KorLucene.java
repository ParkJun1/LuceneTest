package org.npe.lucene.util;

import java.io.IOException;
import java.util.Scanner;

import org.apache.lucene.analysis.ko.KoreanAnalyzer;
import org.apache.lucene.analysis.ko.morph.MorphException;
import org.apache.lucene.analysis.ko.morph.WordSegmentAnalyzer;

public class KorLucene {

	private static final KoreanAnalyzer analyzer = new KoreanAnalyzer();
	private static WordSegmentAnalyzer wsAnalyzer = new WordSegmentAnalyzer(); 
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		analyze(text);
		System.out.print("WordSegmentAnalyzer : ");
		System.out.println(wsAnalyzer.analyze(text));
	}
	
	private static void analyze(String text) throws IOException {
		
		System.out.print("KoreanAnalyzer : ");
		System.out.println(AnalyzerUtils.displayTokens(analyzer, text));
	}
}
