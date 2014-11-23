package org.npe.lucene.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.apache.lucene.analysis.tokenattributes.TypeAttribute;

public class AnalyzerUtils {
	
	public static List<String> termList;

	public static List<String> displayTokens(Analyzer analyzer, String text) throws IOException {
		
		System.out.println(text);
		TokenStream stream = analyzer.tokenStream("s", new StringReader(text));
		
		//System.out.println("1" + text);
		CharTermAttribute term = stream.addAttribute(CharTermAttribute.class); 
		//System.out.println("2" + text);
		PositionIncrementAttribute posInc = stream.addAttribute(PositionIncrementAttribute.class);
		//System.out.println("3" + text);
		OffsetAttribute offset = stream.addAttribute(OffsetAttribute.class);
		//System.out.println("4" + text);
		TypeAttribute type = stream.addAttribute(TypeAttribute.class);
		System.out.println("2" + text);
		//int position = 0;
		
		stream.reset();
		//This method is called by a consumer before it begins consumption using incrementToken().
		
		termList = new ArrayList<String>();
//		System.out.println("6" + text);
//		System.out.println("TokenStream : " + stream.toString());
//		System.out.println("incrementToken() : " + stream.incrementToken());
//		System.out.println(stream);
//		System.out.println(stream.incrementToken());
		while(stream.incrementToken()){
			//Consumers (i.e., IndexWriter) use this method to advance the stream to the next token.
			
//			int inc = posInc.getPositionIncrement();
//			
//			if(inc > 0) {
//				position += inc;
//				System.out.print(position + " : ");
//			}
//			
//			System.out.println("[ " + term + " : " + offset.startOffset() + " ~ "
//								+ offset.endOffset() + " : " + type.type() + " : " + inc + " ]");
//			System.out.println("3" + text);
			termList.add(term.toString());
			//System.out.println("8" + text);
			//System.out.println(term.toString());
			//System.out.println("9" + text);
		}
		stream.close();
//		System.out.println("4" + text);
//		for (String word : termList) {
//			System.out.println(word);
//		}
		//Releases resources associated with this stream.
		return termList;
	}
}
