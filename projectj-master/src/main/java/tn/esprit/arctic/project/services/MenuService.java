package tn.esprit.arctic.project.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.project.entity.Menu;
import tn.esprit.arctic.project.repositories.MenuRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;


    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu getMenuById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public Menu updateMenu(Long id, Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void deleteMenu(Long id) {
        menuRepository.deleteById(id);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepository.saveAll(menus);
    }
}
