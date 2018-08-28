/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tan.controller;

/**
 *
 * @author 19016267_local
 */

import javax.annotation.Resource;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
        
import com.tan.model.Book;
import com.tan.service.BookService;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


 import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


@Controller
@RequestMapping("/book.list")
public class BookListController {
    private BookService bookService;
	@RequestMapping(params = "method=get")
	public ModelAndView get(Book book){
		System.out.println("bookname:"+book.getName());
		System.out.println("author:"+book.getAuthor());
		
                List<Book> list = new ArrayList<Book>();
                list.add(book);
		return  new  ModelAndView("booklist","booklist",list);
                
	}
}
