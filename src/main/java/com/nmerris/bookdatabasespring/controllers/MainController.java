package com.nmerris.bookdatabasespring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // not sure about get, post, request mapping for all

    @RequestMapping("/")
    public String defaultPage(Model model) {
        // below 'message' must match something in addproduct.html
        model.addAttribute("message", "Welcome to the book database");
        return "defaultpage"; // must be the name of the html file
    }

    // search by category
    @RequestMapping("/findbooks")
    public String findBooks(Model model) {
        model.addAttribute("message", "Select category");
        return "findbooks";
    }


    @RequestMapping("/findbooksbyauthor")
    public String findBooksByAuthor(Model model) {
        model.addAttribute("message", "Select author");
        return "findbooksbyauthor";
    }


    @RequestMapping("/findbooksbysku")
    public String findBooksBySku(Model model) {
        model.addAttribute("message", "Select SKU");
        return "findbooksbysku";
    }


    @RequestMapping("/addbook")
    public String addBook(Model model) {
        model.addAttribute("message", "This is where to add a book");
        return "addbook";
    }


    @RequestMapping("/deletebook")
    public String deleteBook(Model model) {
        model.addAttribute("message", "This is where to delete books");
        return "deletebook";
    }

    // postmapping here?
    @RequestMapping("/showallbooks")
    public String showAllBooks(Model model) {
        model.addAttribute("message", "This is a list of all books");
        return "showallbooks";
    }

}
