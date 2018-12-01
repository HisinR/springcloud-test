import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hisin.springcloud.entities.SysRole;
import com.hisin.springcloud.service.SysRoleService;

@SpringBootTest(classes=Demo.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Demo {
	
	@Autowired
	SysRoleService  roleService;
	
	@Test
	public void fun() {
		List<SysRole> findAll = roleService.findAll();
		for (int i = 0; i < findAll.size(); i++) {
			System.out.println(findAll.get(i));
		}
	}
}
