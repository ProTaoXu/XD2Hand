package site.luoyu.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*import org.hibernate.Query;
import org.hibernate.SessionFactory;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;




import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
/*import site.luoyu.dao.Pages;*/


import site.luoyu.model.User;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
/*import java.util.Iterator;*/
import java.util.List;
import java.util.Map;
import java.util.UUID;

/*import javax.annotation.Resource;*/
import javax.servlet.http.HttpServletRequest;


/**
 * Created by xd on 2016/9/24.
 */
@Service
public class BooksService {

    //日志
    private static final Logger log = LogManager.getLogger(BooksService.class);


    @Autowired
    BooksRepository booksRepository;

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    @Transactional
    public Page<Books> getBooksByPage(Pageable pageable){
    	Page<Books> page = booksRepository.findAll(pageable);
    	return page;
    }

   
    public void recommendBooks(){}

    /**
     * 二手图书发布
     * @param bookParameter
     *     客户端传过来的图书参数
     * @param user
     *     发布图书人的信息
     */
    public void publishBook(Map bookParameter,List<String> path, User user) {


        Books aBook = new Books();
        aBook.setStuId(user.getStuId());
        aBook.setPublishDate(new Date(System.currentTimeMillis()));
        // id 自增
//        book.setBookId(UUID.randomUUID().);
        aBook.setName(((String[]) bookParameter.get("name"))[0]);
        aBook.setIsbn(((String[]) bookParameter.get("isbn"))[0]);
        aBook.setLevel(Integer.parseInt(((String[]) bookParameter.get("level"))[0]));
        aBook.setPrice(Float.parseFloat(((String[]) bookParameter.get("price"))[0]));
        //todo 临时设置成1 我们需要开发后台的管理页面，动态的是实现前面用户选的类型可增改。这个类型最好也是从isbn上获得
        //存储图片
        aBook.setPictures(path.get(0));
        //  
        aBook.setBookTypeId(1);
        log.info("图书发布持久化 书名: " + aBook.getName());
        booksRepository.save(aBook);
    }
    
    /*
     *上传图书封面图片 
     */
    public List<String> uploadCover(HttpServletRequest request,User user,Map<String,MultipartFile> fileMap) throws IOException{
    	  List<String> imageURI = new ArrayList<>();
          //todo 文件路径最好是可配置的，不然将来使用静态资源服务器去加速静态资源会有麻烦
    	  String realPath = request.getSession().getServletContext().getRealPath("/")+"uploadImages"+"\\";
          File file = new File(realPath);
          //将不同用户上传的图片放到不同的目录下，目录名为用户id
          String userPath = realPath + user.getStuId()+"\\";
          File userFile = new File(userPath);
          if(!file.exists()){
        	  file.mkdir();
          }
          if (!userFile.exists()) {
			  userFile.mkdir();
          }
          String bookImageURI = null;
          for(Map.Entry<String, MultipartFile> entity : fileMap.entrySet()){
        	  MultipartFile mf = entity.getValue();
        	  bookImageURI = UUID.randomUUID().toString();
        	  String filePath = userPath + bookImageURI;
              //拼写上传图片在web服务器下的路径
              bookImageURI = "/uploadImages/"+user.getStuId()+"/"+bookImageURI;
        	  File uploadFile = new File(filePath);
              mf.transferTo(uploadFile);
        	  //FileCopyUtils.copy(mf.getBytes(), uploadFile);
        	  imageURI.add(bookImageURI);
        	
          }
         return imageURI;
    }

	public Iterable<Books> findBySort(Sort sort) {
		return (Iterable<Books>) booksRepository.findAll(sort);
	}
    
    
 
}
