package com.fzm;

import com.fzm.mapper.UserMapper;
import com.fzm.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setUserName("45135123");
		System.out.println(user);
		try {
			userMapper.selectIsName(user);
		}catch (Exception e){
			System.out.println("1");
		}
	}

	@Autowired
	private static MongoTemplate mongoTemplate;

	@Test
	public void saveFileTest() throws  Exception{
//		FileInputStream file = new FileInputStream("C:\\Users\\jiangyunxiong\\Desktop\\qq.jpg");

	}





}
