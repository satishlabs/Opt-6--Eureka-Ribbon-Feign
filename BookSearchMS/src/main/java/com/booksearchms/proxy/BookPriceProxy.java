package com.booksearchms.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.booksearchms.info.BookPriceInfo;

@FeignClient(name = "MyBookPriceMS")
public interface BookPriceProxy {
	
	@GetMapping("/bookPrice/{bookId}")
	public BookPriceInfo getBookPrice(@PathVariable Integer bookId);
}
