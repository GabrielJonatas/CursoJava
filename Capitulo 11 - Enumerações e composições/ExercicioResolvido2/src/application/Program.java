package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		for(int i = 0; i<2; i++) {
			String title = sc.nextLine();
			Date moment = sdf.parse(sc.nextLine());
			String content = sc.nextLine();
			int likes = sc.nextInt();
			Post post = new Post(moment, title, content, likes);
			sc.nextLine();
			Comment comment1 = new Comment(sc.nextLine());
			Comment comment2 = new Comment(sc.nextLine());
			post.addComments(comment1);
			post.addComments(comment2);
			System.out.println(post.toString());
		}
		sc.close();
	}

}
