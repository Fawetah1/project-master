package tn.esprit.arctic.project.services;

import tn.esprit.arctic.project.entity.Menu;

import java.util.List;

public interface IMenuService {
    Menu saveMenu(Menu menu);
    Menu getMenuById(Long id);
    List<Menu> getAllMenus();
    Menu updateMenu(Long id, Menu menu);
    void deleteMenu(Long id);
    List<Menu> addMenus(List<Menu> menus);
}