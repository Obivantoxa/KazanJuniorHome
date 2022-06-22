package lesson6.hww;

import java.util.Arrays;

public class UserWallPost {
	
	private String name;
	private String lastName;
	private String wallPost;

	private CommentPost[] userCommentPost = new CommentPost[5];
	
	public UserWallPost(String name, String lastName, String wallPost) {

		this.name = name;
		this.lastName = lastName;
		this.wallPost = wallPost;
	}

	public UserWallPost() {
	
	}

	

	public void addCommentPost(CommentPost comment1) {
		// TODO Auto-generated method stub
		for(int i = 0; i<this.userCommentPost.length;i++){
			if(this.userCommentPost[i] == null){
				this.userCommentPost[i]=comment1;
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "UserWallPost [name=" + name + ", lastName=" + lastName
				+ ", wallPost=" + wallPost + ", userCommentPost="
				+ Arrays.toString(userCommentPost) + "]";
	}

}
