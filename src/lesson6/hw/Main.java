package lesson6.hw;

public class Main {
	
	public static void main(String[] args) {
		
		UserProfile user1 = new UserProfile("Petr","Petrov","Nice day","man",1,20);
		UserProfile user2 = new UserProfile("Dima","Dimonov","bad day","man", 2, 45);
		
		UserWallPost post1 = new UserWallPost("Maria", "Petrova","Today is a realy nice day");
		UserWallPost post2 = new UserWallPost("Lena", "Lenovo","Today is a realy bad day");
		CommentPost comment1 = new CommentPost("Alex", "Alexovich", "Hey guys day is coll");
		CommentPost comment2 = new CommentPost("Dina", "Dinovich", "Hey guys day is sad");
		user1.addWallPost(post1);
		user2.addWallPost(post2);
		post1.addCommentPost(comment1);
		post2.addCommentPost(comment2);
		System.out.println(user1);
		System.out.println(user2);
	}

}
