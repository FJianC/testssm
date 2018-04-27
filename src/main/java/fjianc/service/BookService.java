package fjianc.service;

import fjianc.dto.AppointExecution;
import fjianc.entity.Book;

import java.util.List;

/**
 * @author FJianC
 * 业务接口：站在“使用者”角度设计接口
 * 三个方面：方法定义颗粒，参数，返回类型（return 类型/异常）
 */
public interface BookService {

    /**
     * 查询一本书
     * @param bookId
     * @return
     * */
    Book getById(long bookId);

    /**
     * 查询所有图书
     * @return
     * */
    List<Book> getList();

    /**
     * 预约图书
     * @param bookId
     * @param studentId
     * @return
     * */
    AppointExecution appoint(long bookId, long studentId);
}
