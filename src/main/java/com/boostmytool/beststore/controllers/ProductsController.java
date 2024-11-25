/**
 * 
 *@author Gustavo Jose Molina Batista
 *gusmol37@gmail.com
 *Ficha 2834929 ADSO
 *
 */

package com.boostmytool.beststore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boostmytool.beststore.models.Product;
import com.boostmytool.beststore.services.ProductsRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository repo;

    public String showProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}

