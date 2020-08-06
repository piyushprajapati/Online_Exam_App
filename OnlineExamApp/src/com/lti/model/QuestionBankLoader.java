package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;


public class QuestionBankLoader {
	
	public List<Question> loadQuestionOnJava() {
		String subjectName="Java";
		
		QuestionBank qb=new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q=new Question("What is Java?",Difficulty.EASY);
		List<Option> ops=new ArrayList<Option>();
		ops.add(new Option("Java is a Database",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		//qb.addNewQuestion(subjectName,q);
		
		
	    q=new Question("JRE means ?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("Java Runtime Exception",false));
		ops.add(new Option("Java Runtime Environment",true));
		ops.add(new Option("Java Runtime Error",false));
		ops.add(new Option("Java Runnable Enterprise",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		q=new Question("JDK is ?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option(" Garbage Collector",false));
		ops.add(new Option("Java Developer Kit",false));
		ops.add(new Option("Java Developement Kit",true));
		ops.add(new Option("tool for Java",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		q=new Question("What is OS?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("an Operating Sytem",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		
		q=new Question("What is OS?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("an Operating Sytem",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		
		q=new Question("What is OS?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("an Operating Sytem",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		
		q=new Question("What is OS?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("an Operating Sytem",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		
		q=new Question("What is OS?",Difficulty.EASY);
		ops=new ArrayList<Option>();
		ops.add(new Option("an Operating Sytem",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		
		
		
		
		
		
		return qb.getQuestionsFor(subjectName);
	}

}
