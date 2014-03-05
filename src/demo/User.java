package demo;

import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User> {
	private Integer uId;
	private String uName;
	private String uPassword;
}
