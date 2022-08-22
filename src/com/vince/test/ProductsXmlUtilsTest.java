package com.vince.test;

import com.vince.bean.Clothes;
import com.vince.utils.ProductsXmaUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductsXmlUtilsTest {


    @Test
    public void test(){
        List<Clothes> clothes = ProductsXmaUtils.parserProductFormXML();
        System.out.printf(Arrays.toString(clothes.toArray()));
    }
}
