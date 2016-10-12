package site.luoyu.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;


import site.luoyu.dao.Books;
import site.luoyu.dao.BooksRepository;
import site.luoyu.model.User;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    //分页列出书籍
    public void getBooksByPage(){
    	
    	
    }
    //按照价格来排序
    public void listByPrice(){}
    //书籍推荐
    public void recommendBooks(){}
    //通过星级来排序
    public void listByStar(){}

    /**
     * 二手图书发布
     * @param bookParameter
     *     客户端传过来的图书参数
     * @param path
     *      用户上传的图书路径参数
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
    	  List<String> path = new ArrayList<>();  
    	  String ctxPath = request.getSession().getServletContext().getRealPath("/")+"\\"+"uploadImages\\";
          File file = new File(ctxPath);
          if(!file.exists()){
        	  file.mkdir();
          }
          String fileName = null;
          for(Map.Entry<String, MultipartFile> entity : fileMap.entrySet()){
        	  //获得上传文件名
        	  MultipartFile mf = entity.getValue();
        	  fileName = mf.getOriginalFilename();
        	  String filePath = ctxPath + "-" +user.getStuId()+"_" + System.currentTimeMillis() + fileName;
        	  File uploadFile = new File(filePath);
        	  FileCopyUtils.copy(mf.getBytes(), uploadFile);
        	  System.out.println("success");  
        	  path.add(filePath);
        	
          }
         return path; 
    }
    
    
 
}
