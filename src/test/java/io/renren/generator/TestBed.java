package io.renren.generator;

import cn.hutool.core.date.DateTime;
import io.renren.modules.generator.dao.BedDao;
import io.renren.modules.generator.dao.CustomerBedDao;
import io.renren.modules.generator.dao.CustomerDao;
import io.renren.modules.generator.entity.BedEntity;
import io.renren.modules.generator.entity.CustomerBedEntity;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBed {

    @Autowired
    BedDao bedDao;

    @Autowired
    CustomerBedDao customerBedDao;

    @Test
    public void test(){
        for (int i = 1; i < 40; i++) {
            customerBedDao.insert(new CustomerBedEntity(new Date(), 2, new Date(), 1, 1, "1"+i,"2"+i, new DateTime(), "bbb"+i,"ccc"+i,"ddd"+i,"eee"+1));
        }
    }

    @Test
    public void testBed(){
//        for (int i = 1; i < 20; i++) {
//            bedDao.insert(new BedEntity(new Date(), 2, new Date(), 1, 1, "202"+i, "1", "1", "201"+i, 0));
//        }
        BedEntity bed = new BedEntity(new Date(), 2, new Date(), 1, 1, "202", "1", "1", "2012", 0);
        int insert = bedDao.insert(bed);
        System.out.println(insert);
    }

}
