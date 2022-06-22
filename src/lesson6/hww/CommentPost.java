package lesson6.hww;

public class CommentPost {

    private String name;
    private String lastName;
    private String commentPost;

    public CommentPost(String name, String lastName, String commentPost) {
        this.name = name;
        this.lastName = lastName;
        this.commentPost = commentPost;
    }

    public CommentPost() {

    }

    @Override
    public String toString() {
        return "CommentPost [name=" + name + ", lastName=" + lastName
                + ", commentPost=" + commentPost + "]";
    }


}
