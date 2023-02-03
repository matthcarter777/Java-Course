package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date moment = sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to new Zeland";
		String content = "I´m going to visit this wonderful country!";
		int likes = 12;
	
		
		Post post1 = new Post(moment, title, content, likes);
		
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that´s awesome");
		
		
		post1.setComments(comment1);
		post1.setComments(comment2);
		
		
		Date moment2 = sdf.parse("28/07/2018 23:14:19");
		String title2 = "Good night guys";
		String content2 = "See you tomorrow!";
		int likes2 = 5;
		
		Post post2 = new Post(moment2, title2, content2, likes2);
		
		Comment comment3 = new Comment("Good nigth");
		Comment comment4 = new Comment("May the force be with you");
		
		post2.setComments(comment3);
		post2.setComments(comment4);
		
		
		System.out.println(post1.toString());
		
		System.out.println();
		
		System.out.println(post2.toString());
		
	}

}
