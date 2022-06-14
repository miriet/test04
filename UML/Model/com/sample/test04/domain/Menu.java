package com.sample.test04.domain;

import java.util.*;

/**
 * 
 */
public class Menu {

    /**
     * Default constructor
     */
    public Menu() {
    }

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String menuName;

    /**
     * 
     */
    private String desc;

    /**
     * 
     */
    private Boolean isDel;

    /**
     * 
     */
    private String menuPath;

    /**
     * 
     */
    private Menu parentMenu;

    /**
     * 
     */
    private List<Menu> childMenus;

}