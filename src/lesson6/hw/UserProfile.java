package lesson6.hw;
import java.util.Arrays;
public class UserProfile {
	private String name;
	private String lastName;
	private String status;
	private String gender;
	private int userId;
	private int age;
	private UserWallPost[] userWallPost = new UserWallPost[5];
	
	public UserProfile(String name, String lastName, String status,
			String gender, int userId, int age) {
		this.name = name;
		this.lastName = lastName;
		this.status = status;
		this.gender = gender;
		this.userId = userId;
		this.age = age;
	}
	public UserProfile() {

	}
	public void addWallPost(UserWallPost post1) {
		for(int i = 0; i<this.userWallPost.length;i++){
			if(this.userWallPost[i] == null){
				this.userWallPost[i]=post1;
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", lastName=" + lastName
				+ ", status=" + status + ", gender=" + gender + ", userId="
				+ userId + ", age=" + age + ", userWallPost="
				+ Arrays.toString(userWallPost) + "]";
	}
	
}
